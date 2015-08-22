package com.etek.bean;


import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;


/**电器品牌,对应表tb_brand*/
@JSONType(orders={"id","brand","brand_tra","sortLetters","py"})
public class Brand implements Cloneable
{
	/**特殊品牌id -> “全部”*/
	public static final long BRAND_ID_ALL = 0x00000000;
	/**特殊品牌id -> “其他”*/
	public static final long BRAND_ID_OTHER= 0xffffffff;
	
	@JSONField(name="id")
	private int id;//id
	
	@JSONField(name="brand")
	private String brand;//品牌名
	
	@JSONField(name="brand_tra")
	private String brand_tra;//品牌繁体名
	
	
	@JSONField(name="sortLetters")
	private String sortLetters;//品牌全拼
	
	@JSONField(name="py")
	private String py;//品牌首字母拼音
	
	@JSONField(name="remarks")
	private String remarks; //可以用于筛选指定电器类型的品牌集合
	
	

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	

	
	public String getPy()
	{
		return py;
	}
	public void setPy(String py)
	{
		this.py = py;
	}
	
	public String getRemarks()
	{
		return remarks;
	}
	public void setRemarks(String remarks)
	{
		this.remarks = remarks;
	}
	
	public String getSortLetters() {
		
		return sortLetters;
	}
	public void setSortLetters(String sortLetters) {
		this.sortLetters = sortLetters;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getBrand_tra() {
		return brand_tra;
	}
	public void setBrand_tra(String brand_tra) {
		this.brand_tra = brand_tra;
	}
	/**
	 * @return the brand copy
	 */
	@Override
	public Brand clone()
	{
		// TODO Auto-generated method stub
		Brand brand = new Brand();
		brand.setId(id);
//		brand.set
//		brand.setPy(py);
		return brand;
	}
	@Override
	public String toString() {
		return "Brand [id=" + id + ", brand=" + brand + ", brand_tra="
				+ brand_tra + ", sortLetters=" + sortLetters + ", py=" + py
				+ ", remarks=" + remarks + "]";
	}
	
}
