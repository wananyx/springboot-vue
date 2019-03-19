package com.yx.adx.util.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.List;

@ApiModel(value="分页查询对象",description="分页查询对象")
public class PageUtils implements Serializable {
	private static final long serialVersionUID = 1L;
	@ApiModelProperty(value="总记录数",name="total")
	private int total;
	@ApiModelProperty(value="行对象",name="rows")
	private List<?> rows;

	public PageUtils(List<?> list, int total) {
		this.rows = list;
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
