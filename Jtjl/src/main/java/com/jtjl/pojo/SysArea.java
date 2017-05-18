package com.jtjl.pojo;

import java.io.Serializable;

public class SysArea implements Serializable {
	/**
	 * 城市
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @column ID
	 *
	 */
	private Long id;

	/**
	 * @column CODE
	 *
	 */
	private String code;

	/**
	 * @column PARENT_CODE
	 *
	 */
	private String parentCode;

	/**
	 * @column AREA_NAME
	 *
	 */
	private String areaName;

	/**
	 * @column SORT
	 *
	 */
	private Long sort;

	/**
	 */
	private int children;
    
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getParentCode() {
		return parentCode;
	}


	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}


	public String getAreaName() {
		return areaName;
	}


	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}


	public Long getSort() {
		return sort;
	}


	public void setSort(Long sort) {
		this.sort = sort;
	}


	public int getChildren() {
		return children;
	}


	public void setChildren(int children) {
		this.children = children;
	}


	@Override
	public String toString() {
		return "SysArea [id=" + id + ", code=" + code + ", parentCode=" + parentCode + ", areaName=" + areaName
				+ ", sort=" + sort + ", children=" + children + "]";
	}
	
}
