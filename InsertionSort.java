import java.util.Arrays;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.*;

class InsertionSort {
    /**
     * This method implements the Insertion Sort algorithm as desribed in the
     * CLRS book. This sorts data elements in an ascending order. It should be
     * noted that in pseudo code, array starts from 1.
     *
     * for j = 2 to A.length
     *   key = A[j]
     *   i = j - 1
     *   while i > 0 and A[i] > key
     *     A[i+ 1] = A[i]
     *     i = i - 1
     *   A[i + 1] = key
     *
     **/



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
     Node tail = null;
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

     current = head;
     while(current!=null && tail!=head) {
       Node next = current;
       for( ; next.next != tail;  next = next.next) {
         if(next.data <= next.next.data) {
           int temp = next.data;
           next.data = next.next.data;
           next.next.data = temp;
         }
       }
       tail = next;
       current = head;
    }

/*
     for (current = head; current != null; current = current.next) {
         Node key = current;
         Node tmp = current.next;
         while (tmp/*i >= 0 && inString[i] > key*) {
           if (key.data > tmp.data) {
             key = tmp;
           }

         }
         inStrings[i + 1] = key;
         System.out.println(Arrays.toString(inStrings));
     }
     public int[] sort(int[] inString) {
         for (int j = 1; j < inString.length; j++) {
             int key = inString[j];
             int i = j - 1;
             while (i >= 0 && inString[i] > key) {
                 inString[i + 1] = inString[i];
                 i--;
             }
             inString[i + 1] = key;
         }
         return inString;
     }
     * for j = 2 to A.length
     *   key = A[j]
     *   i = j - 1
     *   while i > 0 and A[i] > key
     *     A[i+ 1] = A[i]
     *     i = i - 1
     *   A[i + 1] = key
     *
     *


     for (int i = 0; i < inStrings.length; i++) {
       System.out.println(inStrings[i]);
     }
     System.out.println(Arrays.toString(inStrings));
   }
*/
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
      /*


//for(int i = 0; i < inStrings.length; i ++){
//  inString[i] = sc.nextInt();

//String[] printString = insertionSort(inStrings);
//for (int i = 0; i < inStrLength; i++){
//  System.out.println(Arrays.toString(printString));
//}


    //public static String[] insertionSort(String[] inStrings) {


      //String[] inString = new String[inStrings.length];


      /*Node sorted = null;
      current = head;

      while (current != null) {

        Node next = current.next;

        if (sorted == null || sorted.data >= current.data) {
          current.next = sorted;
          sorted = current;
        }
        else {
          Node current2 = sorted;
          while (current2.next!=null && current2.next.data < current.data) {
            current = current.next;
          }
          current2.next = current.next;
          current.next = current2;
        }
        current = next;
      }
      head=sorted;
      */
