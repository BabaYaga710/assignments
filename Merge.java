import java.util.*;
import java.io.*;


class Merge
{

   public static void main (String[] args) throws FileNotFoundException
   {

       File fileOne = new File(args[0]);
       File fileTwo = new File(args[1]);

       int i;
       int j;
       int k;

       int arrayAsc[] = new int[100];
       int arrayDes[] = new int[100];
       int arrayMerge[] = new int[100];

       Scanner sc = new Scanner(fileOne);

       //read from first file
       for(i=0; sc.hasNextInt() ; i++)
       {
           arrayAsc[i] = sc.nextInt();
       }
       int n = i;
       sc.close();

       sc = new Scanner(fileTwo);

       //read from second file
       for(i = 0; sc.hasNextInt(); i++)
       {
           arrayDes[i] = sc.nextInt();
       }
       int m = i;
       sc.close();

       //sort the first array
       for(i = 1; i < n; i++)
       {
           int tmp = arrayAsc[i];
           for(j = i - 1; j >= 0 && tmp < arrayAsc[j] ; j--)
               arrayAsc[j + 1] = arrayAsc[j];
           arrayAsc[j + 1] = tmp;
       }

       //sort the second array
       for(i = 1; i < m; i++)
       {
           int tmp = arrayDes[i];
           for(j = i - 1; j >= 0 && tmp > arrayDes[j] ; j--)
               arrayDes[j + 1] = arrayDes[j];
           arrayDes[j + 1] = tmp;
       }

       //merge two sub-arrays

       i = n - 1;
       j = 0;
       k = 0;

       while(i >= 0 && j < m)
       {
           if(arrayAsc[i]>arrayDes[j])
               arrayMerge[k++] = arrayAsc[i--];
           else
               arrayMerge[k++] = arrayDes[j++];
       }

       while(i >= 0)
       {
           arrayMerge[k++] = arrayAsc[i--];
       }

       while(j < m)
       {
           arrayMerge[k++] = arrayDes[j++];
       }

       //display the arrays

       for(i = 0; i < n; i++) {
           System.out.print(arrayAsc[i]);
           if (i < n - 1)
              System.out.print(" ");
         }
         System.out.println();
       for(i = 0; i < m; i++) {
           System.out.print(arrayDes[i]);
           if (i < m - 1)
              System.out.print(" ");
         }
         System.out.println();
       for(i = 0; i < k; i++) {
           System.out.print(arrayMerge[i]);
           if (i < k - 1)
              System.out.print(" ");
         }

   }
}
