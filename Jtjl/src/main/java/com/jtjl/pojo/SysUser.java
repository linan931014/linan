package com.jtjl.pojo;

import java.io.Serializable;

public class SysUser implements Serializable {
	private static final long serialVersionUID = 1L;
	/**
	 * ����Id
	 */
	private Integer Id;
	/**
	 * �ϼ��û�
	 */
	private String UpperUser;
	/**
	 * ��¼�û���
	 */
	private String Code;
	/**
	 * �û���
	 */
	private String Name;
	/**
	 * ������Id
	 */
	private Integer Maindeptid;
	/**
	 * ����
	 */
	private String Password;
	/**
	 * ������
	 */
	private String Tel;
	/**
	 * �Ƿ񶳽� 0:���� 1:�ⶳ
	 */
	private Integer Isactive;
	/**
	 * ��¼״̬ 0:���� 1:������
	 */
	private Integer LoginStatus;

	/**
	 * ��ע
	 */
	private String Notes;
	/**
	 * ��ʵ����
	 */
	private String UserrealName;
	/**
	 * ͷ���ַ
	 */
	private String UserPhoneoUrl;
	/**
	 * ע��ʱ��
	 */
	private String registerTime;
	/**
	 * �Ƿ��ǹ���Ա
	 */
	private Integer isAdministrators;

	private String userEmail; // �û�����
	
	private String userAddress; // �û�סַ
	
	private Integer userSex; // �û��Ա�
	
	private Integer isDelete; // �Ƿ�ɾ��
	
	private Integer groupId;  //��ID
	
	private Integer UserType; //�û�����
	
	private String Token; //�û�ʶ����

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
