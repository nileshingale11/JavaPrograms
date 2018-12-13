//Nilesh Ingale.

import java.io.*;
import java.util.*;

public class StrCount{
	private int count = 0;
	public void setCount(int c){
		count = c;
	}
	public static void main(String[] args){
		StrCount[] word;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your string:");
		String str = scan.nextLine();
		String[] words = str.split("[ \t\n\f\r]");
		word = new StrCount[words.length];
		int i;
		for (i = 0; i < words.length; i++){
			int j, count1 = 0;
			for (j = 0; j < words[i].length(); j++){
				/*if(words[i].charAt(j) != ',' && words[i].charAt(j) != '.' && words[i].charAt(j) != '-')
					count1++;*/
				switch(words[i].charAt(j)){
					case ',':
					case '.':
					case '-':
					case '=':
					case '<':
					case '>':
					case '/':
					case ':':
					case ';':
					case '(':
					case ')':
					case '[':
					case ']':
					case '{':
					case '}':
					case '	':
					case '!':
					case '?':
					case '"':
						break;
					default:
						count1++;
						break;
				}
			}
			System.out.println("The count of letters in the word " + (i + 1) + " is " + count1 + ".");
		}
	}
}

/* Strings for Testing:
	1. I started learning JAVA earlier.
	2. I completed my course almost 70% till today of C#.
	3. Ourcourseissouseful
	4. we should start crypto like say $@#@ means 4232.
	5. 154 196 5 2.35 1525 245
	6. select * from Student[] where student.id = id
	7. Nilesh's laptop is of Dell company.
	8. StrCount.java:31: error: unclosed character literal
	9. 				Nilesh is going.
*/
