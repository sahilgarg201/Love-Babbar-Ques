
//Finding maximum and minimum elements in an arrya

//Step-1 Comparing the whole array in a single go

package array;
import java.util.*;
public class Array_q2__maxmin_m1 {
    
    static class Pair{
        int min;
        int max;
    }
    static Pair getMinMax(int arr[],int n)
    {
        Pair minmax=new Pair();
        int i;
        if (n==1)
        {
            minmax.min=arr[0];
            minmax.max=arr[0];
        }
        if(arr[0]>arr[1])
        {
            minmax.min=arr[1];
            minmax.max=arr[0];
        }
        else{
            minmax.min=arr[0];
            minmax.max=arr[1];
        }
        for(i=2;i<n;i++)
        {
            if(arr[i]>minmax.max)
            {
                minmax.max=arr[i];
            }
            if(arr[i]<minmax.min)
            {
                minmax.min=arr[i];
            }
        }
        return minmax;    
    }
    public static void main(String args[])
    {
        int arr[]={1000,11,23,45,12};
        int size=arr.length;
        Pair minmax=getMinMax(arr,size);
        System.out.println("The minimum element is"+minmax.min);
        System.out.println("The maximum element is"+minmax.max);
    }
    
}
