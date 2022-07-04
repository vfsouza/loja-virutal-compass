package com.loja.controller;

import com.loja.dao.OrderDAO;
import com.loja.model.Order;
import com.loja.util.States;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ControllerServlet", value = "/registration")
public class ControllerServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        Order order = retrieveOrder(request);

        double shipping = Math.abs(States.map.get(order.getPostalCode()) - States.map.get(order.getState())) * 50;
        double deliveryTime = Math.abs(States.map.get(order.getPostalCode()) - States.map.get(order.getState())) * 4;

        OrderDAO.insert(order);

        if (action.equalsIgnoreCase("json")) {
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            PrintWriter pw = response.getWriter();
            pw.print("{\"deliveryTime\":" + deliveryTime + ",\"shippingPrice\":" + shipping + "}");
        } else if (action.equalsIgnoreCase("jsp")) {

        }
    }

    public Order retrieveOrder(HttpServletRequest r) {
        return new Order(r.getParameter("name"), r.getParameter("street"), r.getParameter("number"),
                r.getParameter("city"), r.getParameter("state"), Double.parseDouble(r.getParameter("price")),
                r.getParameter("postalCode"), Integer.parseInt(r.getParameter("productId")));
    }
}
