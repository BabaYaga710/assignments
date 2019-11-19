import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSort {
   public static void main(String[] args) throws FileNotFoundException {
	   
	   sortArray();
   }
/*       ArrayList<Integer>array=new ArrayList<Integer>();
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
*/
	
   public static void sortArray(SinglyLinkedList testList) { //TAKE OUT PARAMETER TO MAKE IT WORK WTH BUILT IN LIST, OTHERWISE DELETE THE TESTLIST IN CODE
	   
	   SinglyLinkedList testList = new SinglyLinkedList();
	   testList.addNode(5);
	   testList.addNode(4);
	   testList.addNode(3);
	   testList.addNode(2);
	   testList.addNode(1);
	   int size = 5;
    	   
    	for(Node node1 = testList.head; node1 != null; node1 = node1.next) {
    		Node min = node1;
    		for(Node node2 = node1; node2 != null; node2 = node2.next) {
    			if(min.data > node2.data) {
    				min = node2;
    			}
    		}
    		Node temp = new Node(node1.data);
    		node1.data = min.data;
    		min.data = temp.data;
    	}
    	
    	testList.display();
       
           
   }
}
}