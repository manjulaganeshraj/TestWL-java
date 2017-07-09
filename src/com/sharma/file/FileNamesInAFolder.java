package com.sharma.file;
//Write a program to show list of all file names in a folder.
import java.io.File;

public class FileNamesInAFolder {

	public static void main(String[] args) {

		File folder = new File("C:\\Users\\manju\\Desktop\\WBLInnovapath\\IOFiles");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		        System.out.println("File " + listOfFiles[i].getName());
		      } else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
	}

}

/*output:
	File input1.txt
	File input2.txt
	File inputdata.txt
	File MyProp.properties
	File output1.txt
	File output2.txt
	File output3.txt
	File outputdata.txt
	File prop.properties*/