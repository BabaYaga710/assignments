import java.util.Arrays;

class DistributionCountingSort {
    /**
     * This method implements the Counting Sort algorithm as desribed in the
     * Knuth book. This sorts data elements in an ascending order. It should be
     * noted that in pseudo code, array starts from 1.
     *
     * for i = 1 to A.length
     *   COUNT[i] = 0
     *
     * for j = A.length to 2
     *   for i = j - 1 to 1
     *     if (A[i] < A[j])
     *       COUNT[j] = COUNT[j] + 1
     *     else
     *       COUNT[i] = COUNT[i] + 1
     *
     **/

    public int[] sort(int[] array) {
        int[] COUNT = new int[inLength];

        for (int i = 0; i < COUNT.length; i++) {
          COUNT[i] = 0;
        }
        for (int j = inLength - 1; j > 0; j--) {
            for (int i = j - 1; i >= 0; i--) {
              if (unsorted[1] < unsorted[j]) {
                COUNT[j]++;
              } else {
                COUNT[i]++;
              }
            }
        }
        return COUNT;
    }

    public static void main(String[] args) {

        int inLength = args[0];
        String path = args[1];
        String inFile =  scan.nextLine();
        int inMin = sc.nextInt();
        int inMax = sc.nextInt();
        System.out.println(toString(DistributionCounting(inLength, inFile, inMin, inMax)));
    }


    public int[] DistributionCounting(int inLength, String inFile, int minValue, int maxValue) {
      File file = new File(inFile);
      Scanner sc = new Scanner (file);
      int[] sorted = new int[inLength];
      int[] unsorted = new int[inLength];
      int[] COUNT = new int[inLength];

      //populates unsorted using the given file
      for(int i = 0; i < unsorted.length; i++){
        unsorted[i] = sc.nextInt();
       }

       //sets all the COUNT values to 0
       for (int i = 0; i < COUNT.length; i++) {
        COUNT[i] = 0;
      }

      //sorting algorithim
      for (int i = inLength - 1; i > 1; i--) {
          for (int j = i - 1; j >= 0; j--) {
            if (unsorted[1] < unsorted[j]) {
              COUNT[j]++;
            }
            else {
              COUNT[i]++;
            }
          }
      }

      return COUNT;

    }
}
