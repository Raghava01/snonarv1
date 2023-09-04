package com.achive.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Demo {
	public static void main(String[] args) {
		try {
			Studentinfo si = new Studentinfo("Abhi", 104, "110044");
			FileOutputStream fos = new FileOutputStream("student.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(si);
			oos.flush();
			oos.close();
		} catch (Exception e) {
		}
		Studentinfo si = null;
		try {
			FileInputStream fis = new FileInputStream("student.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			si = (Studentinfo) ois.readObject();
		} catch (Exception e) {
		}
		
	}
}
