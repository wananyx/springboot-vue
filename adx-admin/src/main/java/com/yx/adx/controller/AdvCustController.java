package com.yx.adx.controller;

import com.yx.adx.config.exception.AdxException;
import com.yx.adx.domian.AdvCust;
import com.yx.adx.service.AdvCustService;
import com.yx.adx.util.constants.ErrorEnum;
import com.yx.adx.util.vo.PageUtils;
import com.yx.adx.util.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;
import java.util.List;

@Api(value = "广告管理的客户管理模块API文档")
@EnableSwagger2
@RestController
@RequestMapping("/adv")
public class AdvCustController {

    @Autowired
    private AdvCustService advCustService;

    /**
     * 按条件查询广告主信息
     * @param selectBy 1：按广告主名称查询 2：按联系人查询 3：按邮箱查询
     * @param name 查询内容
     * @param pageNum 当前页码
     * @param pageRow 每页展示条数
     * @return 广告主信息集合
     */
    @ApiOperation(value = "按条件查询广告主信息" ,notes = "条件查询广告主信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "selectBy",value = "1：按广告主名称查询 2：按联系人查询 3：按邮箱查询",dataType = "Integer"),
            @ApiImplicitParam(name = "name",value = "查询内容",dataType = "String"),
            @ApiImplicitParam(name = "pageNum",value = "当前页码",required = true,dataType = "Integer"),
            @ApiImplicitParam(name = "pageRow",value = "每页展示条数",required = true,dataType = "Integer"),
    })
    @GetMapping("/getList")
    public Result getList(Integer selectBy, String name, Integer pageNum, Integer pageRow){
        try{
            List<AdvCust> list = advCustService.getList(selectBy, name, pageNum, pageRow);
            int size = advCustService.count(selectBy,name);
            return Result.oK(new PageUtils(list,size));
        }catch (Exception e){
            e.printStackTrace();
            throw new AdxException(ErrorEnum.E_400);
        }
    }

    /**
     * 新增广告主信息
     * @param advCust advCust对象
     * @return 插入条数(成功则返回1)
     */
    @ApiOperation(value = "新增广告主信息" ,notes = "新增广告主信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "advCust",value = "advCust对象",dataType = "AdvCust"),
    })
    @PostMapping("/save")
    public Result save(AdvCust advCust){
        try {
            advCust.setCreateDate(new Date());
            if(advCustService.save(advCust)>0){
                return Result.oK("新增成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new AdxException(ErrorEnum.INSERT_ERROR);
        }
        return Result.error(400,"新增失败");
    }

    /**
     * 更新广告主信息
     * @param advCust advCust对象
     * @return 更新条数(成功则返回1)
     */
    @ApiOperation(value = "更新广告主信息" ,notes = "更新广告主信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "advCust",value = "advCust对象",dataType = "AdvCust"),
    })
    @PostMapping("/update")
    public Result update(AdvCust advCust){
        try {
            if(advCustService.update(advCust)>0){
                return Result.oK("更新成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new AdxException(ErrorEnum.UPDATE_ERROR);
        }
        return Result.error(400,"更新失败");
    }

    /**
     * 删除广告主信息
     * @param id 该条信息的id
     * @return 删除行数
     */
    @ApiOperation(value = "删除广告主信息" ,notes = "删除广告主信息")
    @ApiImplicitParam(name = "id",value = "对象id",dataType = "Integer")
    @DeleteMapping("/remove")
    public Result remove(Integer id){
        try {
            if(advCustService.remove(id)>0){
                return Result.oK("删除成功");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new AdxException(ErrorEnum.UPDATE_ERROR);
        }
        return Result.error(400,"删除失败");
    }
}
