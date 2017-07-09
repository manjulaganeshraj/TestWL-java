package com.sharma.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFromOneToAnother {

	public static void main(String[] args) throws IOException {
		     
		          FileReader fr = null;
		          FileWriter fw = null;
		          try {
		        	  fr=new FileReader("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles\\input1.txt");
		        	  fw=new FileWriter("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles\\input.txt");
		        	  int c = fr.read();
		              while(c!=-1) {
		                  fw.write(c);
		                  c = fr.read();
		              }
		          } catch(IOException e) {
		              e.printStackTrace();
		          }
		      } 
}
