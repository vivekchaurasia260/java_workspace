package com.design.prototype;

public class NetworkConnection {
	
	private String ip;
	private String importantData;
	
	public String getIp() {
		return ip;
	}
	
	public void setIp(String ip) {
		this.ip = ip;
	}
	
	public String getImportantData() {
		return importantData;
	}
	
	public void setImportantData(String importantData) {
		this.importantData = importantData;
	}
	
	public void loadVeryImportantData() {
		this.importantData = "Very very important data";
	}

	@Override
	public String toString() {
		return "NetworkConnection [ip=" + ip + ", importantData=" + importantData + "]";
	}
	
}
