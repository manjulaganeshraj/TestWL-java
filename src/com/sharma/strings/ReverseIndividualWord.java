package com.sharma.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Write a program to reverse each individual word in a sentence.

public class ReverseIndividualWord {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter string: ");

        String input = br.readLine();
        String[] words = input.split(" ");
        String reverse = "";
        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reverse += words[i].charAt(j);
            }
            System.out.print(reverse + " ");
            reverse = "";
		
	}

}

}