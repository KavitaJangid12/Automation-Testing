package com.example.servlet.OneAlpha;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	private static ArrayList<Student> slist = new ArrayList<>();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id1 = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String dept = request.getParameter("dept");
		
		Student st = new Student(id1,name,dept);
		slist.add(st);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Details added successfully...");
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Student details");
		for(Student st:slist) {
			out.println("Id= "+st.getId());
			out.println("Name= "+st.getName());
			out.println("Department= "+st.getDept());
		}
	}
protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		out.println("Student details");
		boolean found = false;
		for(Student st:slist) {
			if(id==st.getId()) {
				st.setName("kavita");
				st.setDept("cse");
				found = true;
				break;
			}
		}
		if(found) {
			out.println("details updated!!!");
		} else {
			out.println("Details not updated!!!");
		}
	}
}
