package com.jtjl.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LoginRecordNew implements Serializable{
	/**
	 * 登录记录
	 */
	private static final long serialVersionUID = 1L;

	public LoginRecordNew() {
		super();
	}

	/**
	 * @param type
	 * @param ip
	 * @param userId
	 * @param createTime
	 */
	public LoginRecordNew(String type, String ip, Long userId, Date createTime, String userName, Long eeId,
			String eeName, String logType, String userType) {
		super();
		this.type = type;
		this.ip = ip;
		this.userId = userId;
		this.createTime = createTime;
		this.userName = userName;
		this.eeId = eeId;
		this.eeName = eeName;
		this.logType = logType;
		this.userType = userType;
	}

	/**
	 * 主键
	 */
	private Long id;

	/**
	 * 登陆类型
	 */
	private String type;

	/**
	 * ip
	 */
	private String ip;

	/**
	 * 登陆用户
	 */
	private Long userId;

	/**
	 * 创建时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	// 用于查询
	/**
	 * 结束时间
	 */
	private String createTimeEnd;

	// 用于查询
	/**
	 * 开始时间
	 */
	private String createTimeStart;

	/**
	 * 用户明码
	 */
	private String userName;

	/**
	 * 企业id
	 */
	private Long eeId;

	/**
	 * 企业名称
	 */
	private String eeName;

	/**
	 * 日志类型 登录 /退出
	 */
	private String logType;

	/**
	 * 操作人类型 企业/运营
	 */
	private String userType;
}
