package com.jk.colltroller;

import com.google.gson.Gson;
import com.jk.pojo.area;
import com.jk.seriver.impl.areaSerImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
@WebServlet("/xi")
public class Xi extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String city = req.getParameter("district");
        areaSerImpl areaSer = new areaSerImpl();
        List<area> province=null;
        try {
            province = areaSer.getCity(Integer.valueOf(city));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        Gson gson = new Gson();
        String s = gson.toJson(province);
        resp.getWriter().write(s);

    }
    
}
