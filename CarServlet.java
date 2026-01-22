package com.example.servlet.OneAlpha;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CarServlet")
public class CarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CarServlet() {
        super();
    }
    public void init() {
 	   ServletContext context = getServletContext();
 	   ArrayList<Car> carlist = new ArrayList<>();
 	   Car c = new Car(1,"Hyundai","120k");
 	   carlist.add(c);
 	   context.setAttribute("data", carlist);
 	   
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletContext context = getServletContext();
	 	   ArrayList<Car> carlist=(ArrayList<Car>)context.getAttribute("data");
	  	  PrintWriter out = response.getWriter();
	  	  for(Car c1:carlist) {
	  		  out.println(c1.getId()+"\t"+c1.getName()+"\t"+c1.getPrice());
	  	  }
	 	  context.setAttribute("data", carlist);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ServletContext context = getServletContext();
	 	   ArrayList<Car> carlist=(ArrayList<Car>)context.getAttribute("data");
	 	  int id =Integer.parseInt(request.getParameter("id"));
	 	  String name = request.getParameter("name");
	 	  String price=request.getParameter("price");
	 	  Car c = new Car(id,name,price);
	 	  carlist.add(c);
	 	  context.setAttribute("data", carlist);
	 	  PrintWriter out = response.getWriter();
	 	  out.println("Car details added successfully!!");
	}

	
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext context = getServletContext();
        ArrayList<Car> carlist = (ArrayList<Car>) context.getAttribute("data");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String price = request.getParameter("price");

        PrintWriter out = response.getWriter();
        boolean found = false;

        for (Car c : carlist) {
            if (c.getId() == id) {
                c.setName(name);
                c.setPrice(price);
                found = true;
                break;
            }
        }
        if (found) {
            out.println("Car details updated successfully!!");
        } else {
            out.println("Car not found!!");
        }
    }

	
	
	protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
