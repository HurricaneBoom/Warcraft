package com.warcraft.common.vo;

import java.io.Serializable;
/**
 * VO:通过此对象实现控制层数据的封装操作
 * 规定:
 * 控制层返回的所有数据只要不是页面,必须通过此对象进行封装.
 */
public class JsonResult implements Serializable{
	private static final long serialVersionUID = -2040132524942880840L;
	/**状态码:1表示正确,0表示错误*/
	private int state=1;
	/**状态码对应的消息*/
	private String message="ok";
	/**要呈现的正确数据*/
	private Object data;//必须为data
	public JsonResult() {}
	public JsonResult(String message) {
		this.message=message;
	}
	public JsonResult(Object data){
		this.data=data;
	}
	public JsonResult(Throwable e){
		this.state=0;//error
		this.message=e.getMessage();
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
