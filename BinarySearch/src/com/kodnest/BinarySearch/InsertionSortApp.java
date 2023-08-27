package com.kodnest.BinarySearch;

import java.util.Scanner;

public class InsertionSortApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("print elements  before sort");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		InsertionSort sort=new InsertionSort();
		sort.insertionSort(arr);
		System.out.println("print elements after sort");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		
	}
	
}
