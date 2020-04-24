package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class MyClient {
	public static void main(String[] args) throws IOException {
		//소켓 생성
		DatagramSocket ds = new DatagramSocket();
		System.out.println("클라이언트");
		
		byte[] buff = "연습입니다." .getBytes();
		
		//packet으로 감싼다.
		DatagramPacket sendP = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"),9999);
		
		//서버로 전송
		ds.send(sendP);
		
		//종료
		ds.close();
		ds.disconnect();
	}
}
