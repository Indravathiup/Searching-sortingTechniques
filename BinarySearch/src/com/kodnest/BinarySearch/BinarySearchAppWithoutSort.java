package com.kodnest.BinarySearch;

import java.util.Scanner;

public class BinarySearchAppWithoutSort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elemnts in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the key value");
		int key=scan.nextInt();
		
		BinarySearchwithoutSort b=new BinarySearchwithoutSort ();
		int result=b.findBinarySearch(arr,key);
		if(result!=-1)
		{
			System.out.println("key found");
		}
		else
		{
			System.out.println("key not found");
		}
	}
}
		

