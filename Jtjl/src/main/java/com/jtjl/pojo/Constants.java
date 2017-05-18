package com.jtjl.pojo;

import java.io.Serializable;

//常量类
public class Constants implements Serializable {
	/**
	 * 年月日
	 */
	public static String SYS_FORMAT_DATE = "yyyy-MM-dd";

	/**
	 * 年月日 时分秒
	 */
	public static String SYS_FORMAT_DATETIME = "yyyy-MM-dd HH:mm:ss";

	public static class System {

		/**
		 * 项目context
		 */
		public static String SYS_PROJECT_PATH = "projectPath";

		/**
		 * 当期登陆用户
		 */
		public static String SYS_LOGIN_USER = "SysUser";

		/**
		 * 当前用户Session
		 */
		public static String SYS_USER_SESSION_MAP = "sessionMap";

		/**
		 * 是否禁止登陆
		 */
		public static String SYS_USER_LOADINGTIME_MAP = "loadingtimeMap";

		/**
		 * 配置文件地址
		 */
		public static String SYS_PROPERTY_PATH = "classpath:properties/*.properties";

		/**
		 * 默认初始密码
		 */
		public static String SYS_INIT_PASSWORD = "initPassword";

		/**
		 * 默认加密初始密码
		 */
		public static final String SYS_INIT_PASSWORD_ENCRYPT = "initPasswordEncypt";

		/**
		 * 登陆心情管理模式
		 */
		public static final String INFORMATION_MAP = "informationMap";

		/**
		 * 公司名称
		 */
		public static String SYS_COMPANY_NAME = "companyName";

		/**
		 * 主页面地步显示
		 */
		public static String SYS_FOOT_SHOW = "footShow";

		/**
		 * 公司logo
		 */
		public static String SYS_COMPANY_LOGO = "companyLogo";

		/**
		 * 方法缓存缓存名
		 */
		public static String SYS_CACHE = "com.ziquan.sys.cache";

		/**
		 * 遮罩层显示
		 */
		public static String OPEN_MASK = "openMask";
		/**
		 * 遮盖层显示模式：maskInfo;loading;loadWord
		 */
		public static String MASK_CHOICE = "maskChoice";
		/**
		 * 遮罩层显示内容
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
	 * 系统事件执行顺序，值越小越先执行
	 *
	 * @author qiukb 41112732@qq.com
	 *
	 *         2014年11月26日
	 */
	public static class SystemEventOrder {

		/**
		 * 用户登陆
		 */
		public static int USER_LOGIN_ORDER = 0;

		/**
		 * 用户登出
		 */
		public static int USER_OUT_ORDER = 99;

		/**
		 * 紧急事件
		 */
		public static int EVENT_EMERGENCY = 0;

		/**
		 * 一般时间
		 */
		public static int EVENT_COMMON = 99;

		/**
		 * 事件序列，用户某些事件顺序执行
		 */
		public static int EVENT_ORDER_ONE = 1;

		public static int EVENT_ORDER_TWO = 2;

		public static int EVENT_ORDER_THREE = 3;

	}
}
