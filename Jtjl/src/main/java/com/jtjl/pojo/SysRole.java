package com.jtjl.pojo;

import java.io.Serializable;

public class SysRole implements Serializable {

	/**
	 * ��ɫ
	 */
	private static final long serialVersionUID = 1L;
	// ����ID
	private Integer Id;
	// ��ɫ��
	private String RoleName;
	// ����
	private String Ramark;
	// �Ƿ�ɾ����0ɾ��1����
	private Integer IsDelete;
	// 1:ϵͳ����Ա
	private String Obj1;
	// �Ƿ���ʾ�����˵�
	private String Obj2;
	private String Obj3;
	// �û��Ƿ�����һ���˻����pc��¼ 1Ϊ����0Ϊ������
	private Integer IsmultipleLogin;
	private Integer TtId;
	// ��ID
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
