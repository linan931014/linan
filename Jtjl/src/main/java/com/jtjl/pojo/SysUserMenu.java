package com.jtjl.pojo;

import java.io.Serializable;

public class SysUserMenu implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userId;
	private Long menuId;
	private Integer isPermit;
	private String menus;

	// 当前登录用户ID
	private Long loginSysUserId;
	// 当前登录用户能够授权的菜单ID集
	private String menuIds;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getMenuId() {
		return menuId;
	}
	public void setMenuId(Long menuId) {
		this.menuId = menuId;
	}
	public Integer getIsPermit() {
		return isPermit;
	}
	public void setIsPermit(Integer isPermit) {
		this.isPermit = isPermit;
	}
	public String getMenus() {
		return menus;
	}
	public void setMenus(String menus) {
		this.menus = menus;
	}
	public Long getLoginSysUserId() {
		return loginSysUserId;
	}
	public void setLoginSysUserId(Long loginSysUserId) {
		this.loginSysUserId = loginSysUserId;
	}
	public String getMenuIds() {
		return menuIds;
	}
	public void setMenuIds(String menuIds) {
		this.menuIds = menuIds;
	}
	
} 
