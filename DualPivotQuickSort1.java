import java.util.*;
import java.lang.*;
import java.io.*;

class DualPivotQuickSort {

  static void DPQsort(int[] A, int left, int right) {
    if (right - left >= 1) {
      if (A[left] > A[right]) {
        int tmp = A[left]; A[left] = A[right]; A[right] = tmp;
      }
      int p = A[left]; final int q = A[right];
      int l = left + 1, g = right - 1, k = l;
      while (k <= g) {
        if (A[k] < p) {
          int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
          ++l;
        } else if (A[k] >= q) {
          while (A[g] > q && k < g) --g;
          {int tmp = A[k]; A[k] = A[g]; A[g] = tmp;}
          --g;
          if (A[k] < p) {
            int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
            ++l;
          }
        }
        ++k;
      }
      --l; ++g;
      int tmp = A[left]; A[left] = A[l]; A[l] = tmp;
      int tmp = A[right]; A[right] = A[g]; A[g] = tmp;
      DPQsort(A, left, l - 1);
      DPQsort(A, l + 1, g - 1);
      DPQsort(A, g + 1, right);
    }
  }

  public static void main(String args[]) throws IOException
  {
     File file = new File(args[0]);

         Scanner in = new Scanner(file);


         int a[] = new int[1000];
         int n = 0;
         while(in.hasNext())
         {
             a[n] = in.nextInt();
             n++;
         }
      //int min = getMinValue(a);
      //int max = getMaxValue(a);
      int left = a[0];
      int right = a[n];
      DPQsort(a, left, right);

      for(int i=0; i<n; i++)
      {
        if (i!=n-1 )
          System.out.print(a[i]+" ");
        else
          System.out.print(a[i]);
      }
    }
    public static int getMaxValue(int[] numbers) {
      int maxValue = numbers[0];
      for(int i=1;i < numbers.length;i++){
        if(numbers[i] > maxValue){
	         maxValue = numbers[i];
	        }
        }
        return maxValue;
    }
    public static int getMinValue(int[] numbers){
      int minValue = numbers[0];
      for(int i=1;i<numbers.length;i++){
        if(numbers[i] < minValue) {
	         minValue = numbers[i];
	      }
      }
      return minValue;
    }
}
