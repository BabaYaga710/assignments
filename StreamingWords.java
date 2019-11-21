import java.util.*;

//Queue class
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

//StreamingWords class
public class StreamingWords
{
   //main method
   public static void main (String[] args)
   {
       //create instance of Scanner class
       Scanner sc = new Scanner(System.in);

       //create instance of Queue class
       Queue q = new Queue();

       //System.out.println("Enter input: ");
       //read multiple inputs
       while(true)
       {
           //read a line
           String str = sc.nextLine();

           //stop inputting data, user will enter END
           if(str.equals("END")) break;

           //inputs store into a queue data structure
           q.enqueue(str);
       }

       //printing out the data elements in the queue
       while(!q.isEmpty())
       {
           //remove the queue from the front
           String str = q.dequeue();

           //printing out the data elements
           System.out.println(str);
       }

   }
}
