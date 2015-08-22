/**
 * 
 */
package com.etek.bean;

import java.util.Arrays;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;

/**
 * @author jiangs
 */
@JSONType(ignores={"id","remote_id"},orders={"name","type","protocol","infrareds"})
public class IRKey {
	
	@JSONField(name="id")
	private long id;
	
	@JSONField(name="name")
	private String name; //按键名称，普通键可能无值，自定义键name一般都有名称，比如用户自定义了一个键“丽音”
	
	@JSONField(name="type")
	private int type; //按键类型
	
	@JSONField(name="remote_id")
	private String remote_id ;//所属遥控器id
	
	@JSONField(name="infrareds")
	private List<Infrared> infrareds;
	
	@JSONField(name="protocol")
	private int protocol;//按键协议，协议空调的协议，一般情况一个遥控器的按键协议都一样
	
	
	@JSONField(name="state")
	private int[] state;//按键协议，空调状态
	
	public long getId()
	{
		return id;
	}
	public void setId(long id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public int getType()
	{
		return type;
	}
	public void setType(int type)
	{
		this.type = type;
	}
	public String getRemote_id()
	{
		return remote_id;
	}
	public void setRemote_id(String remote_id)
	{
		this.remote_id = remote_id;
	}
	public List<Infrared> getInfrareds()
	{
		return infrareds;
	}
	public void setInfrareds(List<Infrared> infrareds)
	{
		this.infrareds = infrareds;
	}
	public int getProtocol()
	{
		return protocol;
	}
	public void setProtocol(int protocol)
	{
		this.protocol = protocol;
	}
	public int[] getState() {
		return state;
	}
	public void setState(int[] state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "IRKey [id=" + id + ", name=" + name + ", type=" + type
				+ ", remote_id=" + remote_id + ", infrareds=" + infrareds
				+ ", protocol=" + protocol + ", state="
				+ Arrays.toString(state) + "]";
	}
	
	
	
}
