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
public class Array_q6_union {
    static void getuni(int a[], int n, int b[], int m)
    {
        int min=(n<m)?n:m;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<min;i++)
        {
            set.add(a[i]);
            set.add(b[i]);
            
        }
        if (n>m)
        {
            for(int i=m;i<n;i++)
            {
                set.add(a[i]);
            }
        }
        else if(n<m)
        {
            for(int i=n;i<m;i++)
            {
                set.add(b[i]);
            }
        }
        System.out.println("The number of elements after union:"+set.size());
        System.out.println("Union set of both the arrays is:");
        System.out.println(set.toString());
        
    }
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7,9};
        int b[]={1,2,3,4,5,67,8,9,10,11};
        getuni(a,9,b,10);
    }
}
