package array;

/**
 *
 * @author Sahil Garg
 */
import java.util.*;
import java.io.*;
public class pactic01 {
    Stack<Character> stack=new Stack<Character>();
    Queue<Character> queue=new LinkedList<Character>();
    void pushCharacter(char ch)
    {
        stack.push(ch);
    }
    void enqueCharacter(char ch)
    {
        queue.add(ch);
    }
    char popCharacter()
    {
        return stack.pop();
    }
    char dequeyeCharacter()
    {
        return queue.remove();
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        char[] s=input.toCharArray();
        pactic01 p=new pactic01();
        for(char c:s)
        {
            p.pushCharacter(c);
            p.enqueCharacter(c);
        }
        boolean isPlaindrome=true;
        for(int i=0;i<s.length/2;i++)
        {
            if(p.popCharacter()!=p.dequeyeCharacter())
            {
                isPlaindrome=false;
                break;
            }
        }
        System.out.println("The word is a palindrome");
    }
    
}
