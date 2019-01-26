package com.template.tools;

import java.util.HashMap;
import java.util.Map;

/**
 * 带有状态码，状态信息的通用返回类
 * 
 * @author Frank
 *
 */
public class Jsons {
	// 2000即成功，4000即失败
	private int code;
	// 提示信息
	private String msg;
	// 服务端要返回到客户端的数据
	private Map<String, Object> ReturnData = new HashMap<String, Object>();

	/**
	 * 自定义一个简单的成功方法
	 * @return
	 */
	public static Jsons success(String message){
		Jsons msg = new Jsons();
		msg.setCode(2000);
		msg.setMsg(message);
		return msg;
	}
	/**
	 * 自定义一个简单的失败方法
	 * @return
	 */
	public static Jsons fail(String message){
		Jsons msg = new Jsons();
		msg.setCode(4000);
		msg.setMsg(message);
		return msg;
	}
	/**
	 * 自定义一个添加返回数据的方法
	 * @return
	 */
	public Jsons add(String arg0,Object arg1){
		this.getReturnData().put(arg0, arg1);
		return this;
	}
	public int getCode() {
		return code;
	}
	public Map<String, Object> getReturnData() {
		return ReturnData;
	}
	public void setReturnData(Map<String, Object> returnData) {
		ReturnData = returnData;
	}
	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}
