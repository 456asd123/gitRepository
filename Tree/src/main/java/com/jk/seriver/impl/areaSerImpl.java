package com.jk.seriver.impl;

import com.jk.Dao.areaDao;
import com.jk.Dao.impl.areaDaoImpl;
import com.jk.pojo.area;
import com.jk.seriver.areaSer;

import java.sql.SQLException;
import java.util.List;

/**
 * Author:chaoshuhui
 * Date:2023/3/26
 */
public class areaSerImpl implements areaSer {
    areaDao areaDao = new areaDaoImpl();
    @Override
    public List<area> getProvince() throws SQLException, ClassNotFoundException {
        return areaDao.getProvince();
    }

    @Override
    public List<area> getCity(Integer pid) throws SQLException, ClassNotFoundException {
        return areaDao.getCity(pid);
    }

}
