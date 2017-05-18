package com.jtjl.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class SysDept implements Serializable {
	/**
	 *部门表
	 */
	private static final long serialVersionUID = -5654211116763306385L;

	private Long id;

	private Long parentId;

	private Integer bySort;

	private String name;

	private String memo;

	/**
	 * 部门编号
	 */
	private String obj1;

	/**
	 * 租户ID
	 */
	private String obj2;

	private String obj3;
	
	/**
	 * 组类型0机构1部门
	 */
	private Long groupType;

	// 查询使用
	private String parentCode;
	
	//部门ID集合
	private Long[] ids;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getBySort() {
		return bySort;
	}

	public void setBySort(Integer bySort) {
		this.bySort = bySort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getObj1() {
		return obj1;
	}

	public void setObj1(String obj1) {
		this.obj1 = obj1;
	}

	public String getObj2() {
		return obj2;
	}

	public void setObj2(String obj2) {
		this.obj2 = obj2;
	}

	public String getObj3() {
		return obj3;
	}

	public void setObj3(String obj3) {
		this.obj3 = obj3;
	}

	public String getParentCode() {
		return parentCode;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public Long getGroupType() {
		return groupType;
	}

	public void setGroupType(Long groupType) {
		this.groupType = groupType;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long[] getIds() {
		return ids;
	}

	public void setIds(Long[] ids) {
		this.ids = ids;
	}

	@Override
	public String toString() {
		return "SysDept [id=" + id + ", parentId=" + parentId + ", bySort=" + bySort + ", name=" + name + ", memo="
				+ memo + ", obj1=" + obj1 + ", obj2=" + obj2 + ", obj3=" + obj3 + ", groupType=" + groupType
				+ ", parentCode=" + parentCode + ", ids=" + Arrays.toString(ids) + "]";
	}
	
}
