package com.smm.entity;

import java.math.BigDecimal;

/**
 * ��Ʒʵ��
 * @author yin
 */
public class GoodsEntity {
	
	/**
	 * ID ��������
	 */
	private int ID =0;
	
	/**
	 * ��Ʒ����
	 */
	private String Name = "";
	
	/**
	 * ��Ʒ����
	 */
	private String Code = "";
	
	/**
	 * ��Ʒ��Ǯ
	 */
	private BigDecimal Price = BigDecimal.ZERO;
	
	/**
	 * ��ƷͼƬ
	 */
	private Byte[] Img = null;
	
	/**
	 * ��Ʒ״̬
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
