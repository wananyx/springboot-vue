package com.yx.adx.service.impl;

import com.yx.adx.dao.AdvCustMapper;
import com.yx.adx.domian.AdvCust;
import com.yx.adx.service.AdvCustService;
import io.swagger.models.auth.In;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class AdvCustServiceImpl  implements AdvCustService {

    @Autowired
    private AdvCustMapper advCustMapper;

    @Override
    public List<AdvCust> getList(Integer selectBy, String name, Integer pageNum, Integer pageRow) {
        Integer offset = (pageNum - 1) * pageRow;
        if(selectBy==null || selectBy.equals("")){
            return advCustMapper.getList(offset,pageRow);
        }
        List<AdvCust> list = new ArrayList<>();
        switch (selectBy){
            case 1:
                list = advCustMapper.getByCusName(name,offset,pageRow);
                break;
            case 2:
                list = advCustMapper.getByLinkman(name,offset,pageRow);
                break;
            case 3:
                list = advCustMapper.getByEmail(name,offset,pageRow);
                break;
            default:
                list = advCustMapper.getList(offset,pageRow);
        }
        return list;
    }

    @Override
    public int count(Integer selectBy, String name) {
        if(selectBy==null || selectBy.equals("")){
            return advCustMapper.count();
        }
        int count = 0;
        switch (selectBy){
            case 1:
                count = advCustMapper.cusNameCount(name);
                break;
            case 2:
                count = advCustMapper.linkmanCount(name);
                break;
            case 3:
                count = advCustMapper.emailCount(name);
                break;
            default:
                count = advCustMapper.count();
        }
        return count;
    }

    @Override
    public int save(AdvCust advCust) {
        return advCustMapper.insertSelective(advCust);
    }

    @Override
    public int update(AdvCust advCust) {
        return advCustMapper.updateByPrimaryKeySelective(advCust);
    }

    @Override
    public int remove(Integer id) {
        return advCustMapper.deleteByPrimaryKey(id);
    }


}
