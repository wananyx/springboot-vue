package com.yx.adx.dao;

import com.yx.adx.domian.AdvCust;

import java.util.List;

public interface AdvCustMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AdvCust record);

    int insertSelective(AdvCust record);

    AdvCust selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdvCust record);

    int updateByPrimaryKey(AdvCust record);

    List<AdvCust> getList();
}