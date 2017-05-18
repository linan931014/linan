package com.jtjl.pojo;

import java.io.Serializable;

//������
public class Constants implements Serializable {
	/**
	 * ������
	 */
	public static String SYS_FORMAT_DATE = "yyyy-MM-dd";

	/**
	 * ������ ʱ����
	 */
	public static String SYS_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

	public static class System {

		/**
		 * ��Ŀcontext
		 */
		public static String SYS_PROJECT_PATH = "projectPath";

		/**
		 * ���ڵ�½�û�
		 */
		public static String SYS_LOGIN_USER = "SysUser";

		/**
		 * ��ǰ�û�Session
		 */
		public static String SYS_USER_SESSION_MAP = "sessionMap";

		/**
		 * �Ƿ��ֹ��½
		 */
		public static String SYS_USER_LOADINGTIME_MAP = "loadingtimeMap";

		/**
		 * �����ļ���ַ
		 */
		public static String SYS_PROPERTY_PATH = "classpath:properties/*.properties";

		/**
		 * Ĭ�ϳ�ʼ����
		 */
		public static String SYS_INIT_PASSWORD = "initPassword";

		/**
		 * Ĭ�ϼ��ܳ�ʼ����
		 */
		public static final String SYS_INIT_PASSWORD_ENCRYPT = "initPasswordEncypt";

		/**
		 * ��½�������ģʽ
		 */
		public static final String INFORMATION_MAP = "informationMap";

		/**
		 * ��˾����
		 */
		public static String SYS_COMPANY_NAME = "companyName";

		/**
		 * ��ҳ��ز���ʾ
		 */
		public static String SYS_FOOT_SHOW = "footShow";

		/**
		 * ��˾logo
		 */
		public static String SYS_COMPANY_LOGO = "companyLogo";

		/**
		 * �������滺����
		 */
		public static String SYS_CACHE = "com.ziquan.sys.cache";

		/**
		 * ���ֲ���ʾ
		 */
		public static String OPEN_MASK = "openMask";
		/**
		 * �ڸǲ���ʾģʽ��maskInfo;loading;loadWord
		 */
		public static String MASK_CHOICE = "maskChoice";
		/**
		 * ���ֲ���ʾ����
		 */
		public static String MASK_INFO = "maskInfo";

		/**
		 * all system power
		 */
		public static String SYS_POWER = "systemPower";

		/**
		 * pre user power
		 */
		public static String PRE_USER_POWER = "userPower_";

		/**
		 * all menu
		 */
		public static String SYS_All_MENU = "allMenus";

		/**
		 * all menu exp
		 */
		public static String SYS_All_MENU_EXP = "allMenuExps";

		/**
		 * fastdfs file service
		 */
		public static String SYS_PROJECT_IMAGE_PATH = "imagePath";

	}

	/**
	 * ϵͳ�¼�ִ��˳��ֵԽСԽ��ִ��
	 *
	 * @author qiukb 41112732@qq.com
	 *
	 *         2014��11��26��
	 */
	public static class SystemEventOrder {

		/**
		 * �û���½
		 */
		public static int USER_LOGIN_ORDER = 0;

		/**
		 * �û��ǳ�
		 */
		public static int USER_OUT_ORDER = 99;

		/**
		 * �����¼�
		 */
		public static int EVENT_EMERGENCY = 0;

		/**
		 * һ��ʱ��
		 */
		public static int EVENT_COMMON = 99;

		/**
		 * �¼����У��û�ĳЩ�¼�˳��ִ��
		 */
		public static int EVENT_ORDER_ONE = 1;

		public static int EVENT_ORDER_TWO = 2;

		public static int EVENT_ORDER_THREE = 3;

	}
}
