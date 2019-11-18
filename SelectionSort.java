import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
   public static void main(String[] args) throws FileNotFoundException {
       ArrayList<Integer>array=new ArrayList<Integer>();
       if(args.length>=1) {
           Scanner sc=new Scanner(new File(args[0]));
           while(sc.hasNextLine()) {
               String[] tmp=sc.nextLine().split(" ");
               for(int i=0;i<tmp.length;i++) {
                   array.add(Integer.parseInt(tmp[i]));
               }
           }
           sortArray(array);
       }
       else {
           System.out.println("Argument not found");
       }
   }
   public static void sortArray(ArrayList<Integer>array) {
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
}
