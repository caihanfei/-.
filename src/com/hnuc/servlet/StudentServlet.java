package com.hnuc.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hnuc.pojo.student;
import com.hnuc.service.studentService;
import com.hnuc.serviceImp.ServiceImp;

@WebServlet("/show")
public class StudentServlet extends HttpServlet{
	
	studentService service = (studentService) new ServiceImp();
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		List<student> list = service.show();
		req.setAttribute("list", list);
		req.getRequestDispatcher("/index.jsp").forward(req, res);
		
	}
}

