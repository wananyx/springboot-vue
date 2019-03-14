package com.yx.adx.service;

import com.yx.adx.domian.AdvCust;

import java.util.List;

public interface AdvCustService {

    int deleteByPrimaryKey(Integer id);

    int insertSelective(AdvCust record);

    AdvCust selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdvCust record);

    List<AdvCust> getList();
}
