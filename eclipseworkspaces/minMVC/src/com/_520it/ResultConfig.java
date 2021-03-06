package com._520it;
//封装了result元素的信息
public class ResultConfig {
	private String name;
	private String type;
	private String path;
	public ResultConfig(String name, String type, String path) {
		this.name = name;
		this.type = type;
		this.path = path;
	}
	@Override
	public String toString() {
		return "ResultConfig [name=" + name + ", type=" + type + ", path=" + path + "]";
	}
	public String getName() {
		return name;
	}
	public String getType() {
		return type;
	}
	public String getPath() {
		return path;
	}
}
