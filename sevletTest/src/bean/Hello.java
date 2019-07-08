package bean;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*@WebServlet("/hi") // 작성된 곳으로 연결 시켜주는 역할
*/
public class Hello extends HttpServlet { // service()는 HttpServlet에 존재
	private static final long serialVersionUID = 1L;
       

    public Hello() {
    	
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	public void process(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		System.out.println("클라이언트의 요청");
	}
}
