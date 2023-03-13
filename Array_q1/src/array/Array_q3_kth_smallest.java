package array;

//kth max and min element
import java.util.*;
public class Array_q3_kth_smallest {
    
    public static int kthSmallest(Integer[] arr,int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
    
    public static void main(String args[])
    {
        Integer arr[]=new Integer[]{12,3,4,7,9};
        int k=2;
        System.out.println("K'th element is "+kthSmallest(arr,k));
    }
    
}
