package com.kodnest.BinarySearch;

public class BinarySearchwithoutSort {
	public static int findBinarySearch(int arr[],int key)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				low=mid+1;
			//	high=high;
			}
			else
			{
				high=mid-1;
				//low=low;
			}
		}
		return -1;
		}
		
	}


