//rev string

//Remove Special Character
import java.util.Scanner;

class ReverseString{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Name : ");
		String name=sc.nextLine();
		String rev=" ";
		for(int i=name.length()-1;i>=0;i--) {
			
			rev=rev+name.charAt(i);
		}
		System.out.println("Reverse String : "+rev);
	}
}
//pallandrom String
import java.util.Scanner;
class Test
{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter a Number : ");
	//int num=sc.nextInt();
	String name=sc.nextLine();
	String rev="";
		for(int i=name.length()-1;i>=0;i--){
		
			rev=rev+name.charAt(i);
		
		}
		System.out.println(rev);

			if(name.equals(rev)){
				System.out.println("Pallaindrom Number : "+name+"      "+rev);
			}
			else{
				System.out.println("Not a Pallaindrom Number: "+name+"    "+rev);
			}
	}
}

//even or odd

import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int no=sc.nextInt();
		
		if(no%2==0)
			System.out.println("Numeber is Even "+no);
		else
			System.out.println("Number is Odd "+no);
	}

}

//prime numeber

package com.nt.test;

import java.util.Scanner;

class PrimeNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int no=sc.nextInt();
		int temp=0;
		for(int i=2;i<=no-1;i++) {
			
			if(no%i==0) {
				temp=temp+1;
			}
					
		}
		if(temp>0)
			System.out.println("It is Not Prime Number "+no);
		else
			System.out.println("It is a Prime Number "+no);
	}
}

//prime no between 1 to 100

package com.nt.test;

import java.util.Scanner;

class PrimeNoBetween{
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.print("Enter a Number : ");
		//int no=sc.nextInt();
		int temp=0;
		for(int i=1;i<=100;i++) {
			for(int j=2;j<=i-1;j++) {
			
			if(i%j==0) {
				temp=temp+1;
			}
					
		}
		if(temp==0)
			System.out.println("It is  Prime Number "+i);
		else
			temp=0;
		}
	}
}

//fibbonacci Series

package com.nt.test;

class Fibonacci{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=0;
		
		for(int i=1;i<=10;i++) {
			
			c=a+b;
			a=b;
			b=c;
			
			System.out.println(" "+c);
		}
		
	}
}

//swap to integer

package com.nt.test;

class Swapping{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp=0;
		
		System.out.println("Old Value A : "+a);
		System.out.println("Old Value B : "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("New Value A : "+a);
		System.out.println("New Value B : "+b);
	}
}

//swap without temp value

package com.nt.test;

class Swapping{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Old Value A : "+a);
		System.out.println("Old Value B : "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("New Value A : "+a);
		System.out.println("New Value B : "+b);
	}
}

//Reverse Integer

package com.nt.test;

class ReverseInteger{
	public static void main(String[] args) {
		int num=1524;
		int rev=0,rem=0;
		
		while(num!=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		System.out.println("Reverse Integer : "+rev);
		
		
	}
}

//Pallandrom Number

package com.nt.test;

class PallandromNumber{
	public static void main(String[] args) {
		int num=121;
		int rev=0,rem=0;
		int temp=num;
		
		while(num!=0) {
			
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			
		}
		//System.out.println("Reverse Integer : "+rev);
		
		if(rev==temp)
			System.out.println("This is a Pallandrom Number : "+temp);
		else
			System.out.println("This is Not a Pallandrom Number : "+temp);
		
	}
}

//Armstrong Number

package com.nt.test;

import java.util.Scanner;

class ArmstrongNumber{
	public static void main(String[] args) {
		//Armstrong Number
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Digit : ");
		int num=sc.nextInt();		
		//int length=Integer.toString(num).length();
		//System.out.println("Length of Integer value : "+length);
		int temp1=num;
		int length=0;
		int temp2=num;
		int rem=0;
		
		int arm=0;
		while(temp1!=0) {
			
			temp1=temp1/10;
			length=length+1;
		}
		System.out.println("Length of Integer value : "+length);
		
		while(temp2!=0) {
			rem=temp2%10;
			int mul=1;
			for(int i=1;i<=length;i++) {
				
				mul=mul*rem;
			}
			arm=arm+mul;
			temp2=temp2/10;
		}
		if(num==arm)
			System.out.println("This is Armstrong Number : "+num+"......."+arm);
		else
			System.out.println("This is Not a Armstrong Number : "+num+"......."+arm);
	}
}

//Find Maximum Integer From Array

package com.nt.test;

import java.util.Scanner;

class maximum{
	public static void main(String[] args) {

		int a[] = {4,5,9,7,2,5,6,8};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
}

//Minimum Integer From Array

package com.nt.test;

import java.util.Scanner;

class PallandromNumber{
	public static void main(String[] args) {

		int a[] = {4,5,9,7,2,5,6,8};
		
		int min=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		System.out.println(min);
	}
}

// Secound Largest Number

import java.util.Scanner;
class Test
{
	public static void main(String[] args){

		int []a={10,20,30,40,50,60,70};
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			
				if(a[i]<a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				for(int c:a){
					System.out.print(c+" ");
				}
				System.out.println();
				
			}
			System.out.println("Rournd Trip");
			for(int b:a){
					System.out.print(b+" ");
					
				}
				System.out.println();
		}
		System.out.println();
		System.out.println("Secound Largest Number: "+a[1]);
	}
}

//Dupplicate Element
import java.util.Scanner;
class Test
{
	public static void main(String[] args){
		int []a={10,20,10,40,50,40,70};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
			
				if((a[i]==a[j]) && (i!=j)){
					System.out.println(a[j]+" ");
				}			
			 }
		}
	}
}

//Count word from a string and sentense
import java.util.Scanner;
class Test
{
	public static void main(String[] args){
		System.out.println("Enter a String");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		int count=1;
		for(int i=0;i<=name.length()-1;i++){
			if(name.charAt(i)==' '){
				count++;
			}
		}
		System.out.println("Total String Of World "+count);
	}
}

//How to Copy Array element to another array by Manul
class Test
{
	public static void main(String[] args){
		int[] a={11,22,33,44,55,66};
		int[] b=new int[a.length];

		for(int i=0;i<=5;i++){
		
			b[i]=a[i];
		}
		for(int j:a){
			System.out.println(j);
		}
		for(int k:b){
			System.out.println(k);
		}
	}
}

////How to Copy Array element to another array by ArrayCopy Method

class Test
{
	public static void main(String[] args){
		int[] a={11,22,33,44,55,66};
		int[] b=new int[a.length];

	  //System.arraycopy(src,srcPos,dest,destPos,length);
		System.arraycopy(a,0,b,0,6);
		
		for(int j:a){
			System.out.println("A Variable : :"+j);
		}
		System.out.println();
		for(int k:b){
			System.out.println("B Variable : :"+k);
		}
	}
}

//First word capital from String

class Test
{
	public static void main(String[] args){
		String s="happy birthday";
		String result=s.substring(0,1).toUpperCase()+s.substring(1);

		System.out.println(result);
	}
}

//WAJP to check whether user entered alphabet is a vowel or consonant.

import java.util.Scanner;
class Test
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a alphabate");
		char ch=sc.next().charAt(0);
		System.out.println("");

		if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'||
			ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U')

		System.out.println("Character is Vowel :: "+ch);

		else
			System.out.println("Character is Consonant :: "+ch);
 
	}
}

//capital each word

 class StringFormatter {  
public static String capitalizeWord(String str){  
    String words[]=str.split("\\s");  
    String capitalizeWord="";  
    for(String w:words){  
        String first=w.substring(0,1);  
        String afterfirst=w.substring(1);  
        capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
    }  
    return capitalizeWord.trim();  
}  
}  
public class Test{  
public static void main(String[] args) {  
    System.out.println(StringFormatter.capitalizeWord("shashi kumar thakur"));  
    System.out.println(StringFormatter.capitalizeWord("swagatika barik"));  
    }  
}  

//frequency of String

import java.util.Scanner;
class Test
{
	public static void main(String[] args){
	
		int a[]=new int[26];
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>=65&& str.charAt(i)<=90){
			a[str.charAt(i)-65]++;
			}
		else if(str.charAt(i)>=97 && str.charAt(i)<=122){
			a[str.charAt(i)-97]++;
		}
	  }
	  for(int i=0;i<26;i++){
		  if(a[i]>0){
		System.out.println((char)(i+65)+" "+a[i]);
		  }
		  }
	  }
	}

//frequency of string

import java.util.Scanner;
class Test
{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		str=str.toLowerCase();
		

		for(char ch='a'; ch<='z'; ch++){
		
			int c=0;//counter variable

			for(int i=0; i<str.length();i++){
			
				if(ch ==str.charAt(i))
					c++;
			}
			if(c!=0)
				System.out.println(ch +"\t\t"+c);
		
		}
	
	  }
	}

//Duplicate Character in a String

import java.util.Scanner;
class Test
{
	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		int count=0;
		char string[]=s.toCharArray();
		System.out.println("Duplicate Character in a String:: ");

		for(int i=0;i<string.length;i++){
			count=1;
			for(int j=i+1;j<string.length;j++){
				if(string[i]==string[j] && string[i] !=' '){
					count++;
					string[j]='0';
				}
			
			}
			if(count>1 && string[i]!='0'){
				System.out.println(string[i]);
			}
		}
	  }
	}


//duplicate alfabet print
package com.nt.Logical;

import java.util.Scanner;

public class DupplicateAlphabate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String string1 = sc.nextLine();
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

}

//reverse string without disturbing possition of words

public static void main(String[] args) {
    String str= "shashi kumar thakur";
    String arr[]=str.split(" ");
    for(int i=0;i<arr.length;i++)
    {

        for(int j=arr[i].length()-1;j>=0;j--)
        {   
        System.out.print(arr[i].charAt(j));
        }
        System.out.print(" ");
    }
   
 }
}

//reverse word by word

public static void main(String[] args) {
    String str= "shashi kumar thakur";
    String arr[]=str.split(" ");
    String frstltr="";
    String remainltr="";
    for(int i=arr.length-1;i>=0;i--)
    {
  	 
       // System.out.print(arr[i]+" ");
       // System.out.println();
         frstltr=arr[i].substring(0,1).toUpperCase();
         remainltr=arr[i].substring(1);
         System.out.print(frstltr+remainltr+" ");
       
    }
  }

package com.nt.Logical;

import java.util.Scanner;

public class TestPOC {
	public static void main(String[] args) {
		String str="shashi!kuma@rtha%$&*ur";
		str=str.replaceAll("!@%$&*", " ");
		System.out.println(str);
	}
}

//Copy Duplicate Array Element
package com.nt.Logical;

import java.util.Scanner;

public class TestPOC {
	public static void main(String[] args) {
		int a[] = { 111, 222, 333, 444, 555 };
		int b[] = new int[a.length];

		/*
		 * for(int i=0;i<a.length;i++) { b[i]=a[i]; } for(int j=0;j<a.length;j++) {
		 * 
		 * System.out.println(a[j]+".........."+b[j]); }
		 */
		System.arraycopy(a, 0, b, 0, 5);
		for (int j = 0; j < a.length; j++) {

			System.out.println(a[j] + ".........." + b[j]);
		}
	}
}