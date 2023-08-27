package com.kodnest.BinarySearch;

import java.util.Scanner;

public class BinarySearchSortingApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements in array");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the elements before sort");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		BinarySearchSort sort=new BinarySearchSort();
		sort.bubleSort(arr);
		System.out.println("print the elements after sort");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();

	}

}
