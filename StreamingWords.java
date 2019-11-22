import java.util.*;


class Queue {

   int front, rear;
   String q[];


   public Queue() {
       front = -1;
       rear = -1;
       q = new String[1000];
   }


   private int numWords(String str) {
       int c = 1;
       for(int i=0; i<str.length()-1; i++) {
           if(str.charAt(i)==' ' && str.charAt(i+1)!=' ')
               c++;
       }

       return c;
   }


   public void enqueue(String word) {
       if(isEmpty()) {
           rear++;
           q[rear] = word;
           return;
       }
       int i;
       rear++;
       for(i = rear-1; i>front && numWords(word) < numWords(q[i]); i--) {
           q[i+1] = q[i];
       }

       q[i+1] = word;
   }
   public String dequeue() {
       front++;
       return q[front];
   }


   public boolean isEmpty() {
       return front==rear;
   }
}


public class StreamingWords {
   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

       Queue q = new Queue();

       while(true) {
           String str = sc.nextLine();
           if(str.equals("END")) break;
           q.enqueue(str);
       }

       while(!q.isEmpty()) {
           String str = q.dequeue();
           System.out.println(str);
       }

   }
}
