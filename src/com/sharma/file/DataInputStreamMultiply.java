package com.sharma.file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

//DatainputStream: Use this class to input 2 integer numbers and multiply them

public class DataInputStreamMultiply {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("Test.data");
		DataOutputStream out = new DataOutputStream(fout);
		out.writeInt(5);
		out.writeInt(6);
		out.close();
		
		FileInputStream fin = new FileInputStream("Test.data");
		DataInputStream in = new DataInputStream(fin);
		int a = in.readInt();
		int b = in.readInt();
		int c = a*b;
		System.out.println("Multiplied result is "+c);
		
		
		
	}
	}