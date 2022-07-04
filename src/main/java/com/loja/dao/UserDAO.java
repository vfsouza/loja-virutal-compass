package com.loja.dao;

import com.loja.factory.ConnectionFactory;
import com.loja.model.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDAO {
    private static final Connection con = ConnectionFactory.conectar();
    public static User readByUsername(String username) {
        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM user WHERE username = " + username);
            rs.beforeFirst();
            if (rs.next()) {
                return new User(rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }
        return null;
    }
}
