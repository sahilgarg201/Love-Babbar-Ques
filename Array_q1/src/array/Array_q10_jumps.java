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
public class Array_q10_jumps {
    static int minjump(int arr[])
    {
        if(arr.length<=1)
            return 0;
        if(arr[0]==0)
        {
            return -1;
        }
        int maxReach=arr[0];
        int step=arr[0];
        int jump=1;
        for(int i=1;i<arr.length;i++)            
        {
            if(i==arr.length-1)
            {
                return jump;
            }
            maxReach=Math.max(maxReach,i+arr[i]);
            step--;
            if(step==0)
            {
                jump++;
            
                if(i>=maxReach)
                {
                    return -1;
                }
                step=maxReach-i;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        int arr[]=new int[]{1,3,5,8,9,2,6,7,6,8,9};
        System.out.println(minjump(arr));
    }
}
