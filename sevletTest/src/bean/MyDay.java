package bean;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/day.do")
public class MyDay extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public MyDay() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  {
		String date = request.getParameter("date");
		String subject = request.getParameter("subject");
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<font color='blue'>================</font><br>");
		out.println("오늘은 <font color='red'>" + date + "</font>입니다.<br>");
		out.println("오늘 나는 <font color='red'>" + subject + "</font>배우는 중입니다<br>");
		out.println("<font color='blue'>================</font>");
		
	}

}
