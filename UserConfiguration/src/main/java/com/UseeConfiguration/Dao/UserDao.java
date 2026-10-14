
package com.UseeConfiguration.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.UseeConfiguration.model.User;
import com.UseeConfiguration.util.DBConnection;

public class UserDao {

    public boolean registerUser(User user)
            throws SQLException {

        String sql =
            "INSERT INTO users (uname, email) VALUES (?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps =
                 con.prepareStatement(sql)) {

            ps.setString(1, user.getUname());
            ps.setString(2, user.getEmail());

            return ps.executeUpdate() == 1;
        }
    }
}
