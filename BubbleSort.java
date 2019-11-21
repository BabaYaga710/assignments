import java.util.*;
import java.io.*;


public class BubbleSort
{

  static class Node {
    int data;
    Node next;

    Node(){}

    Node (int data, Node n) {
      this.data = data;
      this.next = n;
    }
    Node (int data) {
      this.data = data;
      this.next = null;
    }
  }


  //public static void bubbleSort(Node head) {

   //while(true)
   // {
   //      Node current=null;
        //int t = 0;
        //for(int j=0; j<n-1; j++)
        // Node current;
        // for(current = head; current != null; current = current.next)
        // {
        //     //if(arr[j]>arr[j+1])
        //     if (current.data>current.next.data && current.next!=null)
        //     {
        //         //int tmp = arr[j];
        //         int tmp = current.data;
        //         //arr[j] = arr[j+1];
        //         current.data = current.next.data;
        //         //arr[j+1] = tmp;
        //         current.next.data = tmp;
        //         //t = j+1;
        //
        //   } else if (current.data<current.next.data && current.next!=null) {
        //         current = current.next;
        //   } else break;
        // }
   //      //if(t==0) break;
   //      if(current==null) break;
   // }
//}

//main method
public static void main(String args[]) throws IOException
{
  if(args.length<1)  {
    System.out.println("Argument not found");
    return;
  }

  Node head = null;
  Node current = head;

  Scanner sc=new Scanner(new File(args[0]));
  while(sc.hasNextLine()) {
    String[] tmp=sc.nextLine().split(" ");

    for (int i = 0; i < tmp.length; i++) {
      if(head == null) {
        head = new Node(Integer.parseInt(tmp[i]));
        current = head;
      } else {
        current.next = new Node(Integer.parseInt(tmp[i]));
        current = current.next;
      }
    }
  }
outerloop:while(current!=null) {

  for(current = head; current != null; current = current.next)
  {
      //if(arr[j]>arr[j+1])
      if (current.data>current.next.data)
      {
          //int tmp = arr[j];
          int tmp = current.data;
          //arr[j] = arr[j+1];
          current.data = current.next.data;
          //arr[j+1] = tmp;
          current.next.data = tmp;
          //t = j+1;

    // } else if (current.data<current.next.data && current.next!=null) {
    //       current = current.next;
      } else current=current.next;
      //if (current.next==null) break;
  }
  //current=current.next;
}

  current = head;
  while (current != null) {
    if (current.next != null) {
     System.out.print(current.data + " ");
    }
    else {
     System.out.print(current.data);
    }
    current=current.next;
  }

}
}
