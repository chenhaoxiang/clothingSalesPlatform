package cn.hncu.utils;

import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.taobao.api.ApiException;
import com.taobao.api.DefaultTaobaoClient;
import com.taobao.api.TaobaoClient;
import com.taobao.api.request.AlibabaAliqinFcSmsNumSendRequest;
import com.taobao.api.response.AlibabaAliqinFcSmsNumSendResponse;

/**
 * 短信验证---阿里大于工具--发送需要￥
 */
@Controller
@RequestMapping("/message")
public class MessageController {
	private final Integer NUM=6; 
	private Logger log = Logger.getLogger(MessageController.class);
	
	@RequestMapping(value = { "/send" })
	public void sendMessage2(String mobile,HttpServletRequest request) {
		//官网的URL  
		String url="http://gw.api.taobao.com/router/rest";  
		//成为开发者，创建应用后系统自动生成  
		String appkey="23457668";  
		String secret="93805f7f0dde6f66c8c216996815112e";
		
		//随机生成 num 位验证码
		String code="";
		Random r = new Random(new Date().getTime());
		for(int i=0;i<NUM;i++){
			code = code+r.nextInt(10);
		}
		log.info("手机号为:"+mobile+",验证码为:"+code);
		
		//将验证码加入容器中
		request.getSession().setAttribute("messageCode", code);
		
		//短信模板的内容
		String json="{\"code\":\""+code+"\",\"sitename\":\"唯依网\"}";
		
		TaobaoClient client = new DefaultTaobaoClient(url, appkey, secret);
		AlibabaAliqinFcSmsNumSendRequest req = new AlibabaAliqinFcSmsNumSendRequest();
		req.setExtend("");  
		req.setSmsType("normal");
		req.setSmsFreeSignName("陈浩翔");
		req.setSmsParamString(json);
		req.setRecNum(mobile);
		req.setSmsTemplateCode("SMS_14970456");
		AlibabaAliqinFcSmsNumSendResponse rsp = null;
		try {
			rsp = client.execute(req);
		} catch (ApiException e) {
			e.printStackTrace();
		}
		
		log.debug(rsp.getBody());
		
	}

}
