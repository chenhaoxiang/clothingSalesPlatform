package cn.hncu.utils.tx;

import java.lang.reflect.Method;
import java.sql.Connection;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodProxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CloseAdvice implements MethodInterceptor{
	private ThreadLocal<Object> t = new ThreadLocal<Object>();
	
	@Override
	public Object invoke(MethodInvocation inv) throws Throwable {
		Object obj = t.get();
		if(obj==null){
			final Object con = inv.proceed();//原型
			
			Callback callback = new net.sf.cglib.proxy.MethodInterceptor(){
				@Override
				public Object intercept(Object proxiedObj, Method method,
						Object[] args, MethodProxy proxy) throws Throwable {
					if(method.getName().equals("close")){
						return null;
					}
					//con位原型对象
					return method.invoke(con, args);
				}
			};
			
			//obj为代理后的对象
			obj = Enhancer.create(Connection.class, callback);
			t.set(obj);
		}
		return obj;
	}
}
