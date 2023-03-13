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
public class Array_q3_m2 {
    public static void main(String args[]){
        int arr[]={12,3,5,7,9,1};
        int n=arr.length;
        int k=4;
        k--;
        Set<Integer> s=new TreeSet<Integer>();
        
        for(int i=0;i<n;i++)
            s.add(arr[i]);
        Iterator<Integer> itr =s.iterator();
        
        while(k>0)
        {
            itr.next();
            k--;
        }
        System.out.println(itr.next());
    }
    
}
