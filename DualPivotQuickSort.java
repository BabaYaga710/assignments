import java.util.*;
import java.lang.*;
import java.io.*;

static void Qsort(int[] A, int left, int right) {
  if (right - left >= 1) {
    if (A[left] > A[right]) {
      final int tmp = A[left]; A[left] = A[right]; A[right] = tmp;
    }
    final int p = A[left]; final int q = A[right];
    int l = left + 1, g = right - 1, k = l;
    while (k <= g) {
      if (A[k] < p) {
        final int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
        ++l;
      } else if (A[k] >= q) {
        while (A[g] > q && k < g) --g;
        {final int tmp = A[k]; A[k] = A[g]; A[g] = tmp;}
        --g;
        if (A[k] < p) {
          final int tmp = A[k]; A[k] = A[l]; A[l] = tmp;
          ++l;
        }
      }
      ++k;
    }
    --l; ++g;
    {final int tmp = A[left]; A[left] = A[l]; A[l] = tmp;}
    {final int tmp = A[right]; A[right] = A[g]; A[g] = tmp;}
    Qsort(A, left, l - 1);
    Qsort(A, l + 1, g - 1);
    Qsort(A, g + 1, right);
  }
 }
