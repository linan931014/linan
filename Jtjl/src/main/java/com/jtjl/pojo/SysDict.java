package com.jtjl.pojo;

import java.io.Serializable;

public class SysDict implements Serializable{
	 /**
	 * �ֵ��
	 */
	private static final long serialVersionUID = 1L;
	//���
    private String code; 
    //����
    private String name; 
    //ϵͳ���ֵ�
    private Long issystem; 
    //�Ƿ�����:����:1:������:0
    private Long isactive; 
    //�����
    private Long bysort; 
    //��ע
    private String remark; 
    //��Ӧ��ر�
    private String tablename; 
    //��Ӧ���ֶ�
    private String fldname; 
    //�ο�����
    private String refname; 
    //��ӡ����
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
