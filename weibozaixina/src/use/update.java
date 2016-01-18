package use;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import weibo4j.Oauth;
import weibo4j.Timeline;
import weibo4j.examples.oauth2.Log;
import weibo4j.model.Status;
import weibo4j.model.WeiboException;
import weibo4j.util.BareBonesBrowserLaunch;

public class update extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public update() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Oauth oauth = new Oauth();
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
		request.getParameter("code");
		PrintWriter out = response.getWriter();
		out.println("code:"+request.getParameter("code"));
		try {
			//out.println("token json:"+oauth.getAccessTokenByCode(request.getParameter("code")));
		//	String access_token = args[0];
		//	String statuses = args[1];
			Timeline tm = new Timeline(oauth.getAccessTokenByCode(request.getParameter("code")).getAccessToken());
			try {
				Status status = tm.updateStatus(request.getParameter("status"));
				//Log.logInfo(status.toString());
			} catch (WeiboException e) {
				e.printStackTrace();
			}	
		} catch (WeiboException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//明天再写，睡了睡了
		
		
		//Timeline tm = new Timeline(oauth.getAccessTokenByCode(request.getParameter("code"))[0]);
	
			//Status status = tm.updateStatus(statuses);
			
			
			
			
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
