package com.tdskx.business.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "b_exchange")
public class Exchange {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String createDate;
	private String wangwang;
	private String shopName;
	private String product;
	private Integer number;
	private String reason;
	private String requirement;
	private String expressIn;
	private String expressCmp;
	private String recProduct;
	private String recNumber;
	private Boolean isComplete;
	private Boolean isNormal;
	private Boolean isAgree;
	private Boolean resAgree;
	private String result;
	private String address;
	private String expressNo;
	private String remark;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public String getWangwang() {
		return wangwang;
	}
	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public String getExpressIn() {
		return expressIn;
	}
	public void setExpressIn(String expressIn) {
		this.expressIn = expressIn;
	}
	public String getExpressCmp() {
		return expressCmp;
	}
	public void setExpressCmp(String expressCmp) {
		this.expressCmp = expressCmp;
	}
	public String getRecProduct() {
		return recProduct;
	}
	public void setRecProduct(String recProduct) {
		this.recProduct = recProduct;
	}
	public String getRecNumber() {
		return recNumber;
	}
	public void setRecNumber(String recNumber) {
		this.recNumber = recNumber;
	}
	public Boolean getIsComplete() {
		return isComplete;
	}
	public void setIsComplete(Boolean isComplete) {
		this.isComplete = isComplete;
	}
	public Boolean getIsNormal() {
		return isNormal;
	}
	public void setIsNormal(Boolean isNormal) {
		this.isNormal = isNormal;
	}
	public Boolean getIsAgree() {
		return isAgree;
	}
	public void setIsAgree(Boolean isAgree) {
		this.isAgree = isAgree;
	}
	public Boolean getResAgree() {
		return resAgree;
	}
	public void setResAgree(Boolean resAgree) {
		this.resAgree = resAgree;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getExpressNo() {
		return expressNo;
	}
	public void setExpressNo(String expressNo) {
		this.expressNo = expressNo;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
