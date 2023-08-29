package com.design.prototype;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Creating object using prototype design");
		
		NetworkConnection networkConnection = new NetworkConnection();
		
		networkConnection.setIp("192.168.3.3");
		networkConnection.loadVeryImportantData();
		
		System.out.println(networkConnection);
	}
}
