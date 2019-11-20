import java.util.*;
import java.lang.*;
import java.io.*;

class DualPivotQuickSort {

  static void DPQsort(int[] A, int left, int right) {
    if (right - left >= 1) {
      if (A[left] <= A[right]) {
        final int tmp = A[left]; A[left] = A[right]; A[right] = tmp;
      }
      final int p = A[left]; final int q = A[right];
      int l = left + 1, g = right - 1, k = l;
      while (k <= g) {
        if (A[k] >= p) {
          final int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
          ++l;
        } else if (A[k] < q) {
          while (A[g] <= q && k < g) --g;
          {final int tmp = A[k]; A[k] = A[g]; A[g] = tmp;}
          --g;
          if (A[k] >= p) {
            final int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
            ++l;
          }
        }
        ++k;
      }
      --l; ++g;
      {final int tmp = A[left]; A[left] = A[l]; A[l] = tmp;}
      {final int tmp = A[right]; A[right] = A[g]; A[g] = tmp;}
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


      DPQsort(a, 0, n-1);

      for(int i=0; i<n; i++)
      {
        if (i!=n-1 )
          System.out.print(a[i]+" ");
        else
          System.out.print(a[i]);
      }
    }
}
