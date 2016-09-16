$(document).ready(function(){
	
	
	//隐藏Loading/注册失败 DIV
	$(".loading").hide();
	$(".login-error").hide();
	registError = $("<label class='error repeated'></label>");
	
	//输入框激活焦点、移除焦点
	jQuery.focusblur = function(focusid) {
		var focusblurid = $(focusid);
		var defval = focusblurid.val();
		focusblurid.focus(function(){
			var thisval = $(this).val();
			if(thisval==defval){
				$(this).val("");
			}
		});
		focusblurid.blur(function(){
			var thisval = $(this).val();
			if(thisval==""){
				$(this).val(defval);
			}
		});
	 
	};
	/*下面是调用方法*/
	$.focusblur("#email");
	
	//获取表单验证对象[填写验证规则]
	var validate = $("#signupForm").validate({
		rules: {
			email: {
				required: true,
				email: true
			},
			password: {
				required: true,
				minlength: 6,
				maxlength: 32
			},
			passwordAgain: {
				required: true,
				minlength: 6,
				maxlength: 32,
				equalTo: "#password"
			},
			name: {
				required: true
			}
		},
		messages: {
			email: {
				required: $.i18n.prop("请输入邮箱"),
				email: $.i18n.prop("请输入正确的邮箱格式")
			},
			name: {
				required: $.i18n.prop("请输入用户名")
			},
			password: {
				required: $.i18n.prop("请输入密码"),
				minlength: jQuery.format($.i18n.prop("密码过短(>=6)")),
				maxlength: jQuery.format($.i18n.prop("密码太长(<=32)"))
			},
			passwordAgain: {
				required: $.i18n.prop("请输入密码"),
				minlength: jQuery.format($.i18n.prop("密码过短(>=6)")),
				maxlength: jQuery.format($.i18n.prop("密码太长(<=32)")),
				equalTo: jQuery.format($.i18n.prop("两次密码不一致"))
			}
		}
	});
	
	
	//输入框激活焦点、溢出焦点的渐变特效
	if($("#email").val()){
		$("#email").prev().fadeOut();
	};
	$("#email").focus(function(){
		$(this).prev().fadeOut();
	});
	$("#email").blur(function(){
		if(!$("#email").val()){
			$(this).prev().fadeIn();
		};		
	});
	if($("#password").val()){
		$("#password").prev().fadeOut();
	};
	$("#password").focus(function(){
		$(this).prev().fadeOut();
	});
	$("#password").blur(function(){
		if(!$("#password").val()){
			$(this).prev().fadeIn();
		};		
	});
	if($("#passwordAgain").val()){
		$("#passwordAgain").prev().fadeOut();
	};
	$("#passwordAgain").focus(function(){
		$(this).prev().fadeOut();
	});
	$("#passwordAgain").blur(function(){
		if(!$("#passwordAgain").val()){
			$(this).prev().fadeIn();
		};		
	});
	if($("#name").val()){
		$("#name").prev().fadeOut();
	};
	$("#name").focus(function(){
		$(this).prev().fadeOut();
	});
	$("#name").blur(function(){
		if(!$("#name").val()){
			$(this).prev().fadeIn();
		};		
	});
	
	//ajax提交注册信息
	$("#submit").bind("click", function(){
		regist(validate);
	});
	
	$("body").each(function(){
		$(this).keydown(function(){
			if(event.keyCode == 13){
				regist(validate);
			}
		});
	});
	
});

function regist(validate){	
	//校验Email, password，校验如果失败的话不提交
	if(validate.form()){
		if($("#checkBox").attr("checked")){
			$.ajax({
                cache: true,
                type: "POST",
                url:path+"/RegisterServlet",
                data:$('#signupForm').serialize(),// form表单的id
                async: false,
                error: function(request) {
                    alert("连接错误！");
                },
                success: function(data) {
                	alert("data:"+data);
                	$('.loading').hide();
					if(data.hasOwnProperty("msg")){//hasOwnProperty方法,用来判断一个属性是否存在于某对象的键中
						if(data.msg == '0'){
							//注册成功
							window.location.href = "succ.jsp?email="+$('#email').val();
						}else if(data.msg == '1'){
							//数据库链接失败
							$(".login-error").html("数据库链接失败");
						}else if(data.msg == '2'){
							//参数传递失败
							alert("参数传递失败");
							$(".login-error").show();
							$(".login-error").html("参数传递失败");
						}else if(data.msg == '3'){
							//系统错误
							$(".login-error").html("系统错误");
						}
					}
                }
            });
			/*
			$.ajax({
				url: path+"/RegisterServlet", //注册请求的Servlet
				type: "post",//请求方式
				data: {
					userID: $("#email").val(),
					password: $("#password").val(),
					name: $("#name").val(),
				},
				dataType: "json",
				beforeSend: function(){
					$('.loading').show();
				},
				success: function(data){
					$('.loading').hide();
					if(data.hasOwnProperty("code")){
						if(data.code == 0){
							//注册成功
							window.location.href = "succ.jsp?email="+$('#email').val();
						}else if(data.code == 1){
							//数据库链接失败
							$(".login-error").html($.i18n.prop("数据库链接失败"));
						}else if(data.code == 2){
							//参数传递失败
							$(".login-error").show();
							$(".login-error").html($.i18n.prop("参数传递失败"));
							
						}else{
							//系统错误
							$(".login-error").html($.i18n.prop("系统错误"));
						}
					}
				}
			});*/
		}else{
			//勾选隐私政策和服务条款
			$(".login-error").show();
			$(".login-error").html($.i18n.prop("需同意本网站隐私政策和服务条款"));
		}
	}
}
