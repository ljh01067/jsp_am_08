package com.KoreaIT.java.jsp_AM;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/home/main2")
public class HomeMainServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("hello World!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!").append(request.getContextPath());
	}
}