package com.yx.adx.util.vo;

import java.io.Serializable;


public class Result implements Serializable{
	
	private static final long serialVersionUID = 1L;
	 // 响应业务状态
    /*
     * 200	成功
     * 500	错误
     * 400	参数错误
     */
	private Integer code;
    private String msg;
    private Object data;
    
    public Result() {
    	this.code = 200;
    	this.msg = "操作成功";
    }
    
    public Result(Integer status, String msg, Object data) {
        this.code = status;
        this.msg = msg;
        this.data = data;
    }
    
    public Result(Object data) {
        this.code = 200;
        this.msg = "操作成功";
        this.data = data;
    }
    
    public static Result oK(Object data) {   	
		return new Result(data);
	}
    
    public static Result oK() {
        return new Result(null);
    }

     
    public static Result error(Integer status, String msg, Object data) {
        return new Result(status, msg, data);
    }
    
    public static Result error(Integer status, String msg) {
        return new Result(status, msg, null);
    }
           
    
    
    public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object  getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
