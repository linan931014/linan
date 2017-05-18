package com.jtjl.pojo;

import java.io.Serializable;

public class SysDict implements Serializable{
	 /**
	 * 字典表
	 */
	private static final long serialVersionUID = 1L;
	//编号
    private String code; 
    //名称
    private String name; 
    //系统级字典
    private Long issystem; 
    //是否启用:启用:1:不启用:0
    private Long isactive; 
    //排序号
    private Long bysort; 
    //备注
    private String remark; 
    //对应相关表
    private String tablename; 
    //对应表字段
    private String fldname; 
    //参考代码
    private String refname; 
    //打印名称
    private String printname;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getIssystem() {
		return issystem;
	}
	public void setIssystem(Long issystem) {
		this.issystem = issystem;
	}
	public Long getIsactive() {
		return isactive;
	}
	public void setIsactive(Long isactive) {
		this.isactive = isactive;
	}
	public Long getBysort() {
		return bysort;
	}
	public void setBysort(Long bysort) {
		this.bysort = bysort;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	public String getFldname() {
		return fldname;
	}
	public void setFldname(String fldname) {
		this.fldname = fldname;
	}
	public String getRefname() {
		return refname;
	}
	public void setRefname(String refname) {
		this.refname = refname;
	}
	public String getPrintname() {
		return printname;
	}
	public void setPrintname(String printname) {
		this.printname = printname;
	}
	@Override
	public String toString() {
		return "SysDict [code=" + code + ", name=" + name + ", issystem=" + issystem + ", isactive=" + isactive
				+ ", bysort=" + bysort + ", remark=" + remark + ", tablename=" + tablename + ", fldname=" + fldname
				+ ", refname=" + refname + ", printname=" + printname + "]";
	} 
    
}
