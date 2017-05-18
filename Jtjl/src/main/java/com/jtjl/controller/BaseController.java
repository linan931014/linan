package com.jtjl.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jtjl.pojo.Constants;
import com.jtjl.pojo.SysUser;

@Controller 
public abstract class BaseController {
	protected HttpServletRequest request;
	protected HttpServletResponse response;
	protected HttpSession session;
	
    /**
	 * 获取当前登陆用户
	 * @return
	 */
	public SysUser getLoginUser() {
		// 根据权限显示菜单按钮
		return  (SysUser)session.getAttribute(Constants.System.SYS_LOGIN_USER);
	}
	
	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
	}
	


	public  HttpServletRequest getRequest() {
		return request;
	}

	

	
	public  HttpServletResponse getResponse() {
		return response;
	}

	

	
	/**
	 * get string value from request
	 * @param name
	 * @return
	 */
	public  String getStrPameter(String name) {
		String value =request.getParameter(name);
		value = "".equals(value) ? null : value;
		return value;
	}

	/**
	 * set value to request
	 * @param name
	 * @param value
	 */
	public  void setObjPameter(String name,Object value) {
		request.setAttribute(name, value);
	}


	/**
	 * get Integer value from request
	 * @param name
	 * @return
	 */
	public  Integer getIntPameter(String name) {
		String value = getStrPameter(name);
		if(value == null) {
			return null;
		}else {
			return Integer.valueOf(value);
		}
	}

	/**
	 * get Long value from request
	 * @param name
	 * @return
	 */
	public  Long getLongPameter(String name) {
		String value = getStrPameter(name);
		if(value == null) {
			return null;
		}else {
			return Long.valueOf(value);
		}
	}

	/**
	 * get session from request
	 * @param name
	 * @return
	 */
	public  HttpSession getSession() {
		return request.getSession();
	}

	/**
	 * get attribute from session
	 * @param name
	 * @return
	 */
	public  Object getAttr(String name) {
		return getSession().getAttribute(name);
	}

	/**
	 * remove attribute from session
	 * @param name
	 */
	public  void removeAttr(String name) {
		getSession().removeAttribute(name);
	}

	/**
	 * update session
	 * @param name
	 */
	public  void setAttr(String name,Object value) {
		getSession().setAttribute(name, value);
	}
}
