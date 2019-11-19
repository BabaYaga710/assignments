import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class SelectionSort {

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


public static void main(String[] args) throws FileNotFoundException {

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

   // while(head != null) {
   //   System.out.print(head.data + " ");
   //   head = head.next;
   // }



    for(current = head; current != null; current = current.next) {
      Node max = current;
      for(Node current2 = current; current2 != null; current2 = current2.next) {
        if(max.data < current2.data) {
        max = current2;
        }
      }
        Node temp = new Node(current.data);
        current.data = max.data;
        max.data = temp.data;
      }
      current=head;
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
   /*public static void sortArray(ArrayList<Integer>array) {
       for(int j=array.size()-1;j>=1;j--) {
           int max=array.get(j);
           int index=j;
           for(int i=j;i>=0;i--) {
               if(max<array.get(i)) {
                   max=array.get(i);
                   index=i;
               }
           }
           array.set(index,array.get(j));
           array.set(j,max);
       }
       for(int i=0;i<array.size();i++) {
           System.out.println(array.get(i));
       }
   }


   public static void sortArray(LinkedList<Node>linked) {
       for(int j=linked.size()-1;j>=1;j--) {
         Node max=linked.get(j);
         int index=j;
         for(int i=j;i>=0;i--) {
           if(max.val<linked.get(i).val) {
              max=linked.get(i);
              index=i;
            }
         }
           linked.set(index,linked.get(j));
           linked.set(j,max);
       }
       for(int i=0;i<array.size();i++) {
           System.out.println(array.get(i));
       }
   }*/
   //public static void sortLinked(Node head) {
