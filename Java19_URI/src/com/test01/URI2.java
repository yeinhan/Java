package com.test01;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URI2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] b =new byte[1];
		URL url = new URL("https://perfectacle.github.io/images/Java-study-006day/thumb.png");
		
		URLConnection urlConnection = url.openConnection();
		urlConnection.connect();
		DataInputStream di = new DataInputStream(urlConnection.getInputStream());
		
		FileOutputStream fo = new FileOutputStream("a.jpg");
		
		while(di.read(b,0,1)!=1) {
			fo.write(b,0,1);
		}
		System.out.println("완료");
		di.close();
		fo.close();
	}

}
