package main;

public class BinarySearch {
    static int array[] = {2, 5, 7, 10, 12, 14, 15, 19};


    static int binary(int[] array, int lost) {

         int left = 0;
         int right = array.length;
        while (right >= left) {
            int mediumIndex = (right + left) / 2;

            if (array[mediumIndex] == lost){
                return mediumIndex;
            }

            if (lost < array[mediumIndex]) {
                right = mediumIndex - 1;


            } else if (lost > array[mediumIndex]) {

                left = mediumIndex + 1;
            }
        }
        return  -(left+1);

    }

    public static void main(String[] args) {

       System.out.println( binary(array, 6));
    }
}

