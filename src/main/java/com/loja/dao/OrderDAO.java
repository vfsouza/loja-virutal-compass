package com.loja.dao;

import com.loja.factory.ConnectionFactory;
import com.loja.model.Order;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderDAO {
    private static final Connection con = ConnectionFactory.conectar();

    public static void insert(Order o, double shipping, int deliveryTime) {
        try {
            Statement st = con.createStatement();
            st.executeUpdate("INSERT INTO `order` (`name`, street, `number`, city, state, price, postalCode, productId, deliveryTime, shippingPrice) VALUES (" +
                    "'" + o.getName() +
                    "', '" + o.getStreet() +
                    "', '" + o.getNumber() +
                    "', '" + o.getCity() +
                    "', '" + o.getState() +
                    "', " + o.getPrice() +
                    ", '" + o.getPostalCode() +
                    "', " + o.getProductId() +
                    ", " + deliveryTime +
                    ", " + shipping + ");");
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
