package com.yx.adx.dao;

import com.yx.adx.domian.AdvCust;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdvCustMapper {

    int deleteByPrimaryKey(Integer id);

    int insert(AdvCust record);

    int insertSelective(AdvCust record);

    AdvCust selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdvCust record);

    int updateByPrimaryKey(AdvCust record);

    List<AdvCust> getList(@Param("offset") Integer offset, @Param("limit") Integer pageRow);

    List<AdvCust> getByCusName(@Param("cusName") String cusName, @Param("offset") Integer offset, @Param("limit") Integer pageRow);

    List<AdvCust> getByLinkman(@Param("linkman") String linkman, @Param("offset") Integer offset, @Param("limit") Integer pageRow);

    List<AdvCust> getByEmail(@Param("email") String email, @Param("offset") Integer offset, @Param("limit") Integer pageRow);

    int count();

    int cusNameCount(@Param("cusName") String cusName);

    int linkmanCount(@Param("linkman") String linkman);

    int emailCount(@Param("email") String email);

}