import java.util.*;
import java.io.*;


public class BubleSort
{
   public static void bubbleSort(int arr[], int n)
{
   while(true)
   {
        int t = 0;
        for(int j=0; j<n-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
                t = j+1;
            }
        }
        if(t==0) break;
   }
}

//main method
public static void main(String args[]) throws IOException
{
   File file = new File(args[0]);

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
       }

bubbleSort(a, n);

for(int i=0; i<n; i++)
{
  if (i!=n-1 )
    System.out.print(a[i]+" ");
  else
    System.out.print(a[i]);
}

}
}
