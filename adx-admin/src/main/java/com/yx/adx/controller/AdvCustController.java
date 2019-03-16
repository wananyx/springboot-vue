package com.yx.adx.controller;

import com.yx.adx.domian.AdvCust;
import com.yx.adx.service.AdvCustService;
import com.yx.adx.util.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Api(value = "广告管理的客户管理模块API文档")
@EnableSwagger2
@RestController
@RequestMapping("/adv")
public class AdvCustController {

    @Autowired
    private AdvCustService advCustService;

    /**
     * 查询所有广告主信息
     * @param id 用户id
     * @return 所有广告主信息集合
     */
    @ApiOperation(value = "查询所有广告主信息1" ,notes = "查询所有广告主信息2")
    @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Long")
    @GetMapping("/getList")
    public Result getList(Long id){
        return Result.oK(advCustService.getList());
    }

    /**
     * 保存用户信息
     * @param id 用户id
     * @param name 用户名
     * @return 返回成功信息
     */
    @ApiOperation(value = "查询所有广告主信息1" ,notes = "查询所有广告主信息2")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "用户id",required = true,dataType = "Integer"),
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String")
    })
    @PostMapping("/save")
    public Result save(Long id,String name){
        return Result.oK();
    }

    /**
     * 保存用户信息
     * @param advCust 广告主信息
     * @return 返回成功信息
     */
    @PostMapping("/save1")
    public Result save1(AdvCust advCust){
        return Result.oK();
    }

}
