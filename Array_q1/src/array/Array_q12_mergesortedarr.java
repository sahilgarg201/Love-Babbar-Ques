package array;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
public class Array_q12_mergesortedarr {
    public static void main(String args[])
    {
        int arr1[]={1,3,5,7};
        int n1=arr1.length;
        int arr2[]={2,4,6,8};
        int n2=arr2.length;
        int arr3[]=new int[n1+n2];
        merge(arr1,arr2,n1,n2,arr3);
        System.out.println("Array after merging");
        for(int i=0;i<arr3.length;i++)
        {
            System.out.println(arr3[i]);
        }
   
        
        
        
    }
    public static void merge(int[]arr1, int []arr2,int n1, int n2, int arr3[])
    {
        int i=0,j=0,k=0;
        while(i<n1)
        {
            arr3[k++]=arr1[i++];
        }
        while(j<n2)
        {
            arr3[k++]=arr3[j++];
        }
        Arrays.sort(arr3);
    }
    
}
