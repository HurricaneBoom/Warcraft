package com.warcraft.common.vo;

import java.util.Date;

public class IndentPageSurface {
	private String buyerName;
	private String dietName;
	private String storeName;
	private Date indentSingletime;
	private Date indentEndtime;
	private String delivererName;
	private String delivererPhone;
	private String indentStatus;
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getDietName() {
		return dietName;
	}
	public void setDietName(String dietName) {
		this.dietName = dietName;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public Date getIndentSingletime() {
		return indentSingletime;
	}
	public void setIndentSingletime(Date indentSingletime) {
		this.indentSingletime = indentSingletime;
	}
	public Date getIndentEndtime() {
		return indentEndtime;
	}
	@Override
	public String toString() {
		return "IndentPageSurface [buyerName=" + buyerName + ", dietName=" + dietName + ", storeName=" + storeName
				+ ", indentSingletime=" + indentSingletime + ", indentEndtime=" + indentEndtime + ", delivererName="
				+ delivererName + ", delivererPhone=" + delivererPhone + ", indentStatus=" + indentStatus + "]";
	}
	public void setIndentEndtime(Date indentEndtime) {
		this.indentEndtime = indentEndtime;
	}
	public String getDelivererName() {
		return delivererName;
	}
	public void setDelivererName(String delivererName) {
		this.delivererName = delivererName;
	}
	public String getDelivererPhone() {
		return delivererPhone;
	}
	public void setDelivererPhone(String delivererPhone) {
		this.delivererPhone = delivererPhone;
	}
	public String getIndentStatus() {
		return indentStatus;
	}
	public void setIndentStatus(String indentStatus) {
		this.indentStatus = indentStatus;
	}
	
	
}
