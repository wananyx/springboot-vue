package com.yx.adx.service;

import com.yx.adx.domian.AdvCust;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvCustService {

    List<AdvCust> getList(Integer selectBy, String name, Integer pageNum, Integer pageRow);

    int count(Integer selectBy, String name);

    int save(AdvCust advCust);

    int update(AdvCust advCust);

    int remove(Integer id);
}
