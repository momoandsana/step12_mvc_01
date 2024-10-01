package web.mvc.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/test")
public class ServletTest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 응답의 콘텐츠 타입 설정
        response.setContentType("text/html");

        // 응답을 위한 PrintWriter 객체 가져오기
        PrintWriter out = response.getWriter();

        // HTML 출력
        out.println("<html>");
        out.println("<head><title>Servlet Test</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, this is a simple servlet test!</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
