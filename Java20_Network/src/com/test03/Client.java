package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Client());
		t1.start();
	}

	@Override	//Runnable상속받으면 무조건 해줘야함
	public void run() {
		// TODO Auto-generated method stub

		
		try {
			Socket clientSocket;
			PrintWriter out;
			BufferedReader in= null;
			BufferedReader stdIn = null;
			
			System.out.println("server에 접속합니다...");
			//연결요청 보냄
			clientSocket = new Socket("localhost",8888);
			
			//데이터 내보냄
			out = new PrintWriter(clientSocket.getOutputStream(), true);
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			
			//키보드로 입력받음
			stdIn = new BufferedReader(new InputStreamReader(System.in));
			
			String inputLine;
			
			while((inputLine = stdIn.readLine())!=null) {
				out.println(inputLine);
				System.out.println("server로부터"+"다시 받은 메시지:"+in.readLine());
				
			}
			
			stdIn.close();
			in.close();
			out.close();
			clientSocket.close();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
