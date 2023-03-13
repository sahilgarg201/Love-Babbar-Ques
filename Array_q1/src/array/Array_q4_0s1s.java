/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
public class Array_q4_0s1s {
    static void printArr(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
    static void sort(int arr[],int n)
    {
        int i,cnt0=0,cnt1=0,cnt2=0;
        for(i=0;i<n;i++)
        {
            switch(arr[i])
            {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;                    
            }
        }
        i=0;
        while(cnt0>0)
        {
            arr[i++]=0;
            cnt0--;
        }
        while(cnt1>0)
        {
            arr[i++]=1;
            cnt1--;
        }
        while(cnt2>0)
        {
            arr[i++]=2;
            cnt2--;
            
        }
        printArr(arr,n);
    }
    public static void main(String args[])
    {
        int arr[]={0,1,1,0,1,2,0,2,2,1};
        int n=arr.length;
        sort(arr,n);
       
    }
    
}
