package com.io.silsub2.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NoteDao {
	BufferedWriter bw = null;
	
	public void fileSave(StringBuilder sb, String fileName) {
		try {
			bw = new BufferedWriter(new FileWriter(fileName));
			
			bw.write(sb.toString());
			System.out.println(fileName+" 파일에 성공적으로 저장하였습니다.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public StringBuilder fileOpen(String fileName) {
		StringBuilder sb = new StringBuilder();
		BufferedReader br =null;	//입력 스트림
		
		try {
			br = new BufferedReader(new FileReader(fileName));
			while(true) {
				try {
					String line = br.readLine();
					if(line==null) {
						break;
					}
					sb.append(line+"\n");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return sb;
	}
}
