package com.tdskx.business.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_repair")
public class Repair {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imooc_id")
	private Integer id;
	private String createDate;
	private String shopName;
	private String product;
	private Integer number;
	private String requirement;
	private Boolean isPay;
	private String expressIn;
	private String expressCmp;
	private String recProduct;
	private Integer recNumber;
	private String status; 
	private Boolean isOther;
	private Double price;
	private Boolean isSend;
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
	public String getRequirement() {
		return requirement;
	}
	public void setRequirement(String requirement) {
		this.requirement = requirement;
	}
	public Boolean getIsPay() {
		return isPay;
	}
	public void setIsPay(Boolean isPay) {
		this.isPay = isPay;
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
	public Integer getRecNumber() {
		return recNumber;
	}
	public void setRecNumber(Integer recNumber) {
		this.recNumber = recNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Boolean getIsOther() {
		return isOther;
	}
	public void setIsOther(Boolean isOther) {
		this.isOther = isOther;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Boolean getIsSend() {
		return isSend;
	}
	public void setIsSend(Boolean isSend) {
		this.isSend = isSend;
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
