package com.yx.adx.domian;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ApiModel
public class AdvCust {

    @ApiModelProperty(value = "用户id",dataType = "Integer", name = "id", example = "123")
    private Integer id;

    @ApiModelProperty(value = "广告主名称",dataType = "String", name = "cusName", example = "张三")
    private String cusName;

    @ApiModelProperty(value = "广告主属性",dataType = "String", name = "cusProperty", example = "company")
    private String cusProperty;

    @ApiModelProperty(value = "联系人",dataType = "String", name = "linkman", example = "张三")
    private String linkman;

    @ApiModelProperty(value = "邮箱",dataType = "String", name = "email", example = "412828823@qq.com")
    private String email;
    @ApiModelProperty(value = "联系电话",dataType = "String", name = "phone", example = "13888888888")
    private String phone;
    @ApiModelProperty(value = "开户行",dataType = "String", name = "bank", example = "中国工商银行")
    private String bank;
    @ApiModelProperty(value = "开户名",dataType = "String", name = "accountName", example = "adx")
    private String accountName;
    @ApiModelProperty(value = "开户行账号",dataType = "String", name = "bankNum", example = "62222222222222222")
    private String bankNum;
    @ApiModelProperty(value = "营业执照",dataType = "String", name = "busLicense", example = "123564611561")
    private String busLicense;
    @ApiModelProperty(value = "营业执照路径",dataType = "String", name = "busImg", example = "192.168.1.1:9000/adx/img/1.jpg")
    private String busImg;
    @ApiModelProperty(value = "是否开始后台",dataType = "String", name = "openBack", example = "false")
    private String openBack;
    @ApiModelProperty(value = "销售员",dataType = "String", name = "salesman", example = "张三")
    private String salesman;
    //将String转换成Date，一般前台给后台传值时用
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //将Date转换成String 一般后台传值给前台时
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    @ApiModelProperty(value = "创建日期",dataType = "Date", name = "createDate", example = "2019-03-15")
    private Date createDate;


}