package com.jtjl.pojo;

import java.io.Serializable;

public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * 主键Id
	 */
	private Integer Id;
	/**
	 * 上级用户
	 */
	private String UpperUser;
	/**
	 * 登录用户名
	 */
	private String Code;
	/**
	 * 用户名
	 */
	private String Name;
	/**
	 * 主部门Id
	 */
	private Integer Maindeptid;
	/**
	 * 密码
	 */
	private String Password;
	/**
	 * 座机号
	 */
	private String Tel;
	/**
	 * 是否冻结 0:冻结 1:解冻
	 */
	private Integer Isactive;
	/**
	 * 登录状态 0:在线 1:不在线
	 */
	private Integer LoginStatus;

	/**
	 * 备注
	 */
	private String Notes;
	/**
	 * 真实姓名
	 */
	private String UserrealName;
	/**
	 * 头像地址
	 */
	private String UserPhoneoUrl;
	/**
	 * 注册时间
	 */
	private String registerTime;
	/**
	 * 是否是管理员
	 */
	private Integer isAdministrators;

	private String userEmail; // 用户邮箱
	
	private String userAddress; // 用户住址
	
	private Integer userSex; // 用户性别
	
	private Integer isDelete; // 是否删除
	
	private Integer groupId;  //组ID
	
	private Integer UserType; //用户类型
	
	private String Token; //用户识别码

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUpperUser() {
		return UpperUser;
	}

	public void setUpperUser(String upperUser) {
		UpperUser = upperUser;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Integer getMaindeptid() {
		return Maindeptid;
	}

	public void setMaindeptid(Integer maindeptid) {
		Maindeptid = maindeptid;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getTel() {
		return Tel;
	}

	public void setTel(String tel) {
		Tel = tel;
	}

	public Integer getIsactive() {
		return Isactive;
	}

	public void setIsactive(Integer isactive) {
		Isactive = isactive;
	}

	public Integer getLoginStatus() {
		return LoginStatus;
	}

	public void setLoginStatus(Integer loginStatus) {
		LoginStatus = loginStatus;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}

	public String getUserrealName() {
		return UserrealName;
	}

	public void setUserrealName(String userrealName) {
		UserrealName = userrealName;
	}

	public String getUserPhoneoUrl() {
		return UserPhoneoUrl;
	}

	public void setUserPhoneoUrl(String userPhoneoUrl) {
		UserPhoneoUrl = userPhoneoUrl;
	}

	public String getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(String registerTime) {
		this.registerTime = registerTime;
	}

	public Integer getIsAdministrators() {
		return isAdministrators;
	}

	public void setIsAdministrators(Integer isAdministrators) {
		this.isAdministrators = isAdministrators;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public Integer getUserSex() {
		return userSex;
	}

	public void setUserSex(Integer userSex) {
		this.userSex = userSex;
	}

	public Integer getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(Integer isDelete) {
		this.isDelete = isDelete;
	}

	public Integer getGroupId() {
		return groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public Integer getUserType() {
		return UserType;
	}

	public void setUserType(Integer userType) {
		UserType = userType;
	}

	public String getToken() {
		return Token;
	}

	public void setToken(String token) {
		Token = token;
	}

	@Override
	public String toString() {
		return "SysUser [Id=" + Id + ", UpperUser=" + UpperUser + ", Code=" + Code + ", Name=" + Name + ", Maindeptid="
				+ Maindeptid + ", Password=" + Password + ", Tel=" + Tel + ", Isactive=" + Isactive + ", LoginStatus="
				+ LoginStatus + ", Notes=" + Notes + ", UserrealName=" + UserrealName + ", UserPhoneoUrl="
				+ UserPhoneoUrl + ", registerTime=" + registerTime + ", isAdministrators=" + isAdministrators
				+ ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userSex=" + userSex + ", isDelete="
				+ isDelete + ", groupId=" + groupId + ", UserType=" + UserType + ", Token=" + Token + "]";
	}
	
}
