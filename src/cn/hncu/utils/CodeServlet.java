package cn.hncu.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 生成验证码的Servlet
 * @author 陈浩翔
 * 2016-9-9
 */
public class CodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jpeg");
		int width = 60;
		int height = 30;
		int number =4;//验证码的数字个数
		BufferedImage bimg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = bimg.getGraphics();
		g.setColor(Color.white);//背景色
		g.fillRect(0, 0, width, height);
		String code = "";
		g.setFont(new Font("黑体", Font.BOLD, 18));
		Random r = new Random();
		for(int i=0;i<number;i++){
			int a =r.nextInt(10);
			Color c = new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255));
			g.setColor(c);
			g.drawString(a+"", i*12, height-6);
			//干扰线
			g.drawLine(r.nextInt(60), r.nextInt(30), r.nextInt(60), r.nextInt(30));
			code+=a;
		}
		request.getSession().setAttribute("code", code);
		//System.out.println(request.getSession().getAttribute("code"));
		g.dispose();
		//将bimg写入response输出流中
		ImageIO.write(bimg, "jpeg", response.getOutputStream());
	}
}
