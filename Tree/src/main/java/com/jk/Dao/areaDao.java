package com.jk.Dao;

import com.jk.pojo.area;

import java.sql.SQLException;
import java.util.List;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
public interface areaDao {
    //获取省的信息
    public List<area> getProvince() throws ClassNotFoundException, SQLException;

    //获取市区信息
    public List<area> getCity(Integer pid) throws ClassNotFoundException, SQLException;

}
