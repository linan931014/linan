package com.jtjl.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class LoginRecordNew implements Serializable{
	/**
	 * ��¼��¼
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
	 * ����
	 */
	private Long id;

	/**
	 * ��½����
	 */
	private String type;

	/**
	 * ip
	 */
	private String ip;

	/**
	 * ��½�û�
	 */
	private Long userId;

	/**
	 * ����ʱ��
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	// ���ڲ�ѯ
	/**
	 * ����ʱ��
	 */
	private String createTimeEnd;

	// ���ڲ�ѯ
	/**
	 * ��ʼʱ��
	 */
	private String createTimeStart;

	/**
	 * �û�����
	 */
	private String userName;

	/**
	 * ��ҵid
	 */
	private Long eeId;

	/**
	 * ��ҵ����
	 */
	private String eeName;

	/**
	 * ��־���� ��¼ /�˳�
	 */
	private String logType;

	/**
	 * ���������� ��ҵ/��Ӫ
	 */
	private String userType;
}
