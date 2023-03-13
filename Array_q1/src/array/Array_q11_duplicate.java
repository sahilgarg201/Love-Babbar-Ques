package array;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
import java.lang.Math;
public class Array_q11_duplicate {
    static void repete(int arr[],int size)
    {
        int i;
        System.out.println("Repeating elements are:");
        for(i=0;i<size;i++)
        {
            if(arr[Math.abs(arr[i])]>0)
            {
                arr[Math.abs(arr[i])]=-arr[Math.abs(arr[i])];
            }
            else
            {
                System.out.println(Math.abs(arr[i]));
        }
    }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,1,3,6,6};
        int arr_size=arr.length;
        repete(arr,arr_size);
        
        
        
    }
    
}
