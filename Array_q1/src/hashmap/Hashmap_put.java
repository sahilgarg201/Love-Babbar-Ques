/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashmap;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
public class Hashmap_put {
    public static void main(String args[])
            {
                HashMap<Integer,String> hashmap=new HashMap<Integer,String>();
                hashmap.put(1,"sahil");
                hashmap.put(2,"rohan");
                hashmap.put(3,"noway");
                System.out.println("Initial Mapping are: "+hashmap);
                String val=(String)hashmap.put(2, "All");
                System.out.println("Returned array is "+val);
                System.out.println("New map:"+hashmap);
                
                
            }
    
    
}
