
// Reversing the array

package array;

/**
 *
 * @author Sahil Garg
 */
public class Array_q1_reversearr {

    /**
     * @param args the command line arguments
     */
    static void reverseArray(int arr[],int start, int end)
    {
        int temp;
        while(start<end)
        {
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static void printArray(int arr[],int size)
    {
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]+" ");
            
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        
        int arr[]={1,2,3,4,5};
        printArray(arr,5);
        reverseArray(arr,0,4);
        
        printArray(arr,5);
    }
    
}
