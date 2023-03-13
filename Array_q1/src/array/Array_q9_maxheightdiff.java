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
public class Array_q9_maxheightdiff {
    public static void main(String args[])
    {
        int arr[]={ 7, 4, 8, 8, 8, 9};
        int k=6;
        int ans=min(arr,arr.length,k);
        System.out.println(ans);
    }
    public static int min(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int ans=arr[n-1]-arr[0];
        int tempmin,tempmax;
        tempmin=arr[0];
        tempmax=arr[n-1];
        for(int i=1;i<n;i++)
        {
            if(arr[i]-k<0)
            {
                continue;
            }
            tempmin=Math.min(arr[0]+k,arr[i]-k);
            tempmax=Math.max(arr[i-1]+k,arr[n-1]-k);
            ans=Math.min(ans,tempmax-tempmin);
        }
        return ans;
    }
    
}
