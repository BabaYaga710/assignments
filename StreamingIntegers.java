import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

//Queue class
/*
class Queue
{
   //member variables
   int front, rear;
   String q[];

   //constructor
   public Queue()
   {
       front = -1;
       rear = -1;
       q = new String[10];
   }

   //method to count number of words
   private int numWords(String str)
   {
       int c = 1;

       for(int i=0; i<str.length()-1; i++)
       {
           if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
               c++;
       }

       return c;
   }

   //enqueue method
   public void enqueue(String word)
   {
       //when queue is empty
       if(isEmpty())
       {
           rear++;
           q[rear] = word;
           return;
       }
       int i;
       rear++;
       //insert into the queue according to the number of words
       //in such a way that after insert the queue remains sorted
       for(i = rear-1; i>front && numWords(word) < numWords(q[i]); i--)
       {
           q[i+1] = q[i];
       }

       q[i+1] = word;
   }

   //dequeue method
   public String dequeue()
   {
       front++;
       return q[front];
   }

   //isEmpty method
   public boolean isEmpty()
   {
       return front==rear;
   }
}
*/
//StreamingWords class
public class StreamingIntegers
{
   //main method
   public static void main (String[] args)
   {
       //create instance of Scanner class
       Scanner sc = new Scanner(System.in);

       //create instance of Queue class
       PriorityQueue<Integer> q = new PriorityQueue<>();

       //read multiple inputs
       outerloop:
       while(true)
       {
           //read a line
           //String str = sc.nextLine();
           String[] tmp=sc.nextLine().split(" ");

           //stop inputting data, user will enter END
           //if(str.equals("END")) break;
           if (tmp.length>1) {
             for(int i=0; i<tmp.length; i++) {
                   q.add(Integer.parseInt(tmp[i]));
                   //if (tmp[i].equals("END")) break outerloop;
             }
           } else {
              if (tmp[0].equals("END")) break outerloop;
              q.add(Integer.parseInt(tmp[0]));
           }
       }

           //inputs store into a queue data structure



       //printing out the data elements in the queue
       while(!q.isEmpty())
       {
           if(q.size() == 1)
              System.out.print(q.remove());
           else
              System.out.print(q.remove()+" ");
       }

   }
   // while (!q.isEmpty()) {
   //  Integer i = q.poll();
   //  System.out.println(i);
}
