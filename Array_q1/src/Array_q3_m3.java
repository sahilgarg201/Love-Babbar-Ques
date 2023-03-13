//kth minimum and maximum element in an unsorted array

import java.util.*;
public class Array_q3_m3 {
    public void sort(int arr[])
    {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public int kthmin(int arr[],int n)
    {
        sort(arr);
        return arr[n-1];
    }   
    public static void main(String args[])
    {
        int arr[]={35,2,4,10,98,1};
        int size=arr.length;
        int k=3;
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        Array_q3_m3 obj=new Array_q3_m3();
        int ele=obj.kthmin(arr,k);
        System.out.println(ele);
        
        
        
    }
    
}
