
//Dividing the array into two parts and then sorting

package array;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
public class Array_q2_m2 {
    
    static class Pair
        {
            int min;
            int max;
        }
    static Pair getMinMax(int arr[],int low, int high)
    {
        Pair minmax=new Pair();
        Pair mml=new Pair();
        Pair mmr=new Pair();
        int mid;
        if(low==high)
        {
            minmax.min=arr[low];
            minmax.max=arr[high];
            return minmax;
        }
        if(high==low+1)
        {
            if(arr[low]>arr[high])
            {
               minmax.max=arr[low];
               minmax.min=arr[high];
            }
            else
            {
                minmax.max=arr[high];
                minmax.min=arr[low];
            }
            return minmax;
           
        }
        mid=(low+high)/2;
        mml=getMinMax(arr,low,mid);
        mmr=getMinMax(arr,mid+1,high);
        if(mml.min<mmr.min)
        {
            minmax.min=mml.min;
        }
        else
        {
            minmax.min=mmr.min;
        }
        
        if(mml.max>mmr.max)
        {
            minmax.max=mml.max;
        }
        else
        {
            minmax.max=mmr.max;
        }
        return minmax;  
    }
    
    public static void main(String args[])
    {
        int arr[]={1000,11,22,10,23};
        int size=arr.length;
        Pair minmax=getMinMax(arr,0,size-1);
        System.out.printf("The minimum element is: %d", minmax.min);
        System.out.printf("The max element is:%d ", minmax.max);
                
        
    }
    
}
