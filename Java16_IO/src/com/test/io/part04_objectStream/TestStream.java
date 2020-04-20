package com.test.io.part04_objectStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStream {
	public void fileSave() {
		Member[] mar = {
				new Member("user01","pass01","한예인","han@kh.or",19,'여'),
				new Member("user02","pass02","둘예인","han2@kh.or",20,'여'),
				new Member("user03","pass03","삼예인","han3@kh.or",23,'여')
		};
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.dat"));){
			
			for(int i=0; i<mar.length; i++) {
				objOut.writeObject(mar[i]);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void fileOpen() {
		Member[] mar = new Member[3];
		try (ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.dat"));){
			
			for(int i=0; i<mar.length; i++) {
				mar[i] = (Member)objIn.readObject();
			}
			for(Member m: mar) {
				System.out.println(m);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
