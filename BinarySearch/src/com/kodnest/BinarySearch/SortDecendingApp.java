package com.kodnest.BinarySearch;

import java.util.Scanner;

public class SortDecendingApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the array length");
		int arr[]=new int[scan.nextInt()];
		System.out.println("enter the elements");
		for(int i=0;i<=arr.length-1;i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println("enter the elements before sort");
		for(int x:arr)
		{
			System.out.println(x+" ");
		}
		System.out.println();
		SortDecending sort=new SortDecending();
		sort.bubleSort(arr);
		System.out.println("enter the elements after sort");
		for(int x: arr)
		{
			System.out.print(x+" ");
		}
		System.out.println();
	}

}
