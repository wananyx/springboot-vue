package com.yx.adx.service.impl;

import com.yx.adx.dao.AdvCustMapper;
import com.yx.adx.domian.AdvCust;
import com.yx.adx.service.AdvCustService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdvCustServiceImpl  implements AdvCustService {

    @Autowired
    private AdvCustMapper advCustMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return advCustMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insertSelective(AdvCust record) {
        return advCustMapper.insertSelective(record);
    }

    @Override
    public AdvCust selectByPrimaryKey(Integer id) {
        return advCustMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(AdvCust record) {
        return advCustMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public List<AdvCust> getList() {
        return advCustMapper.getList();
    }
}
