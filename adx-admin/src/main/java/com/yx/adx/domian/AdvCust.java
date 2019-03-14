package com.yx.adx.domian;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class AdvCust {
    private Integer id;

    private String cusName;

    private String cusProperty;

    private String linkman;

    private String email;

    private String phone;

    private String bank;

    private String accountName;

    private String bankNum;

    private String busLicense;

    private String busImg;

    private String openBack;

    private String salesman;
    //将String转换成Date，一般前台给后台传值时用
    //@DateTimeFormat(pattern = "yyyy-MM-dd")
    //将Date转换成String 一般后台传值给前台时
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Date createDate;


}