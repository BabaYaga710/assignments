import java.util.*;
import java.io.*;


public class BubleSort
{
   public static void bubbleSort(int[] array)
   {
   while(true)
   {
        int t = 0;
        for(int j=0; j<array.length-1; j++)
        {
            if(array[j]>array[j+1])
            {
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                t = j+1;
            }
        }
        if(t==0) break;
   }
  }

//main method
public static void main(String args[]) throws IOException
{

  ArrayList<Integer>array=new ArrayList<Integer>();
         if(args.length>=1) {
             Scanner sc=new Scanner(new File(args[0]));
             while(sc.hasNextLine()) {
                 String[] tmp=sc.nextLine().split(" ");
                 for(int i=0;i<tmp.length;i++) {
                     array.add(Integer.parseInt(tmp[i]));
                 }
             }
             int[] arr = array.toArray();
             //sortArray(array);
             bubbleSort(arr);

             for(int i=0; i<array.length; i++)
             {
               if (i!=array.length-1 )
                 System.out.print(array[i]+" ");
               else
                 System.out.print(array[i]);
             }
         }
         else {
             System.out.println("Argument not found");
         }

   /*File file = new File(args[0]);

   //create object of Scanner class
       Scanner in = new Scanner(file);

       //declare the array
       int a[] = new int[1000];
//read data from file
       int n = 0;
       while(in.hasNext())
       {
           a[n] = in.nextInt();
           n++;
       }*/






}
}
