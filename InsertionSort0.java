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

    /*public int[] sort(int[] inString) {
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
    }*/

    public static void main(String[] args) throws IOException , FileNotFoundException {

      String path = args[1];
      File inFile = new File(path);
      Scanner sc = new Scanner(inFile);
      List<String> lines = new ArrayList<String>();

      while (sc.hasNextLine()) {
        lines.add(sc.nextLine());
      }
      sc.close();

      int inStrLength = Integer.parseInt(args[0]);


      String[] inStrings = lines.toArray(new String[inStrLength]);


      //for(int i = 0; i < inStrings.length; i ++){
      //  inString[i] = sc.nextInt();

      //String[] printString = insertionSort(inStrings);
      //for (int i = 0; i < inStrLength; i++){
      //  System.out.println(Arrays.toString(printString));
      //}






    //public static String[] insertionSort(String[] inStrings) {


      //String[] inString = new String[inStrings.length];

      for (int j = 1; j < inStrings.length; j++) {
          String key = inStrings[j];
          int i = j - 1;
          while (i >= 0 /*&& inString[i] > key*/) {
            if (key.compareTo(inStrings[i]) > 0) {
              break;
            }
              inStrings[i + 1] = inStrings[i];
              i--;
          }
          inStrings[i + 1] = key;
          //System.out.println(Arrays.toString(inStrings));
      }
      for (int i = 0; i < inStrings.length; i++) {
        System.out.println(inStrings[i]);
      }
      //System.out.println(Arrays.toString(inStrings));
    }
}
