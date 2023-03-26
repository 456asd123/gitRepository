package com.jk.Dao.impl;

import com.jk.Dao.areaDao;
import com.jk.pojo.area;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
public class areaDaoImpl implements areaDao {
    String driver = "com.mysql.cj.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/mytest?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    String user = "root";
    String password = "root";
    public List<area> getProvince() throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from area where parentid = 0";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<area> us = new ArrayList<>();
        while (resultSet.next()){
            int areaid = resultSet.getInt("areaid");
            String rename = resultSet.getString("areaname");
            int parentid = resultSet.getInt("parentid");
            us.add(new area(areaid,rename,parentid));
        }
        return us;
    }

    @Override
    public List<area> getCity(Integer pid) throws ClassNotFoundException, SQLException {
        Class.forName(driver);
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from area where parentid = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1,pid);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<area> us = new ArrayList<>();
        while (resultSet.next()){
            int areaid = resultSet.getInt("areaid");
            String rename = resultSet.getString("areaname");
            int parentid = resultSet.getInt("parentid");
            us.add(new area(areaid,rename,parentid));
        }
        return us;
    }

}
