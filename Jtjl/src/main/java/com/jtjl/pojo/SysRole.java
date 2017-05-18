package com.jtjl.pojo;

import java.io.Serializable;

public class SysRole implements Serializable {

	/**
	 * 角色
	 */
	private static final long serialVersionUID = 1L;
	// 主键ID
	private Integer Id;
	// 角色名
	private String RoleName;
	// 描述
	private String Ramark;
	// 是否删除：0删除1正常
	private Integer IsDelete;
	// 1:系统管理员
	private String Obj1;
	// 是否显示公共菜单
	private String Obj2;
	private String Obj3;
	// 用户是否允许一个账户多个pc登录 1为允许，0为不允许
	private Integer IsmultipleLogin;
	private Integer TtId;
	// 组ID
	private Integer GroupId;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getRoleName() {
		return RoleName;
	}

	public void setRoleName(String roleName) {
		RoleName = roleName;
	}

	public String getRamark() {
		return Ramark;
	}

	public void setRamark(String ramark) {
		Ramark = ramark;
	}

	public Integer getIsDelete() {
		return IsDelete;
	}

	public void setIsDelete(Integer isDelete) {
		IsDelete = isDelete;
	}

	public String getObj1() {
		return Obj1;
	}

	public void setObj1(String obj1) {
		Obj1 = obj1;
	}

	public String getObj2() {
		return Obj2;
	}

	public void setObj2(String obj2) {
		Obj2 = obj2;
	}

	public String getObj3() {
		return Obj3;
	}

	public void setObj3(String obj3) {
		Obj3 = obj3;
	}

	public Integer getIsmultipleLogin() {
		return IsmultipleLogin;
	}

	public void setIsmultipleLogin(Integer ismultipleLogin) {
		IsmultipleLogin = ismultipleLogin;
	}

	public Integer getTtId() {
		return TtId;
	}

	public void setTtId(Integer ttId) {
		TtId = ttId;
	}

	public Integer getGroupId() {
		return GroupId;
	}

	public void setGroupId(Integer groupId) {
		GroupId = groupId;
	}

}
