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
public class Array_q7_rotate {
    static int arr[]=new int[]{1,2,3,4};
    static void rotate()
    {
        int x=arr[arr.length-1],i;
        for(i=arr.length-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=x;
    }
    public static void main(String args[])
    {
        System.out.println("Givven arrays is:");
        System.out.println(Arrays.toString(arr));
        rotate();
        System.out.println("Rotated Array is :");
        System.out.println(Arrays.toString(arr));
    }
    
}
