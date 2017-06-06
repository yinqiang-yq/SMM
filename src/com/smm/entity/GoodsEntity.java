package com.smm.entity;

import java.math.BigDecimal;

/**
 * 商品实体
 * @author yin
 */
public class GoodsEntity {
	
	/**
	 * ID 自增主键
	 */
	private int ID =0;
	
	/**
	 * 商品名称
	 */
	private String Name = "";
	
	/**
	 * 商品编码
	 */
	private String Code = "";
	
	/**
	 * 商品价钱
	 */
	private BigDecimal Price = BigDecimal.ZERO;
	
	/**
	 * 商品图片
	 */
	private Byte[] Img = null;
	
	/**
	 * 商品状态
	 */
	private int Status = 0;
	
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public BigDecimal getPrice() {
		return Price;
	}
	public void setPrice(BigDecimal price) {
		Price = price;
	}
	public Byte[] getImg() {
		return Img;
	}
	public void setImg(Byte[] img) {
		Img = img;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
}
