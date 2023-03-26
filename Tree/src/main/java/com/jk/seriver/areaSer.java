package com.jk.seriver;

import com.jk.pojo.area;

import java.sql.SQLException;
import java.util.List;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
public interface areaSer {
    //获取省的信息
    public List<area> getProvince() throws SQLException, ClassNotFoundException;

    //获取市区信息
    public List<area> getCity(Integer pid) throws SQLException, ClassNotFoundException;

}
