package test.stringPractice;

public class TwoDArray {
    //create a two dimension array
    //insert values, print all the values
    public void twoDArrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != (array[i].length - 1))
                    System.out.print(", ");
            }
            System.out.println("]");
        }

    }

    // integer of 2d array
    //sort internal arrays , then sort external array based up on the last element of internal array
    public void sortTwoDArrayBasedOnLastElement(int[][] array) {
        // this for loop is to sort internal array elements
        for (int i = 0; i < array.length; i++) {
            for (int k = 0; k < array[i].length; k++) {
                for (int j = 0; j < array[i].length - k - 1; j++) {
                    if (array[i][j] > array[i][(j + 1)]) {
                        int temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
                    }
                }
            }
        }
        // this loop is to sort internal arrays based on last element of each internal array
        // if 0th place array got bigger element at last index than 1st place array then swamp them
        for (int k = 0; k < array.length - 1; k++) {
            for (int n = 0; n < array[k].length; n++) {
                int l = array[k].length - 1;
                if (array[k][l] > array[k + 1][l]) {
                    int[][] temp = new int[array[k].length][array[k].length];
                    for (int m = 0; m < array[k].length; m++) {
                        temp[k][m] = array[k][m];
                        array[k][m] = array[k + 1][m];
                        array[k + 1][m] = temp[k][m];
                    }
                }
            }
        }
        // This loop is to print element of 2 d array after sorting
        System.out.print("{");
        for (int m = 0; m < array.length; m++) {
            System.out.print("{");
            for (int n = 0; n < array[m].length; n++){
                System.out.print(array[m][n]);
                if (n != (array[m].length - 1)) {
                    System.out.print(", ");
                }
            }
            System.out.print("}");
            if (m != array.length - 1)
                System.out.print(",");
        }
        System.out.println("}");
    }

    /**
     * //sort internal arrays {{2, 4}, {3, 8}}
     * {{2, 3}, {4, 8}}
     *
     * @param array
     */
    public void nestedSortingTwoDArrays(int[][] array) {
        // This loop is to check if the last element of 0 th array and first element of 1st array and sort them
        for (int q = 0; q < array.length; q++) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    int lastElementIndex = array[i].length - 1;
                    if (array[i][lastElementIndex] > array[i + 1][j]) {
                        int temp = array[i + 1][j];
                        array[i + 1][j] = array[i][lastElementIndex];
                        array[i][lastElementIndex] = temp;
                        //after replacing with small number in an internal array, sort elements of an internal array
                        for (int k = 0; k < array.length; k++) {
                            for (int m = 0; m < array[k].length; m++) {
                                for (int l = 0; l < array[k].length - m - 1; l++) {
                                    if (array[k][l] > array[k][l + 1]) {
                                        int temp1 = array[k][l + 1];
                                        array[k][l + 1] = array[k][l];
                                        array[k][l] = temp1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        // this for loops is to print 2 d array
        System.out.print("{");
        for (int a = 0; a < array.length; a++) {
            System.out.print("{");
            for (int b = 0; b < array[a].length; b++) {
                System.out.print(array[a][b]);
                if (b != array[a].length - 1) {
                    System.out.print(",");
                }
            }
            System.out.print("}");
            if (a != array.length - 1)
                System.out.print(",");
        }
        System.out.println("}");
    }

    /**
     *sort the array based on sum of the numbers in descending order
     */
    public void sortBasedOnSum(int[][] array) {
        int[] temp = new int[array.length];
        //this for loop is to find sum of the internal arrays and assigning to temp array
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            temp[i] = sum;
        }
        // here we are sorting temp array in descending order and sorting internal arrays in descending order
        for (int q = 0; q < array.length; q++) {
            for (int l = 0; l < array.length - 1 - q; l++) {
                if (temp[l] < temp[l + 1]) {
                    int swampTemp = temp[l + 1];
                    temp[l + 1] = temp[l];
                    temp[l] = swampTemp;
                    for (int m = 0; m < array.length; m++) {
                        int[][] swamp = new int[array.length][array.length];
                        swamp[l][m] = array[l + 1][m];
                        array[l + 1][m] = array[l][m];
                        array[l][m] = swamp[l][m];
                    }
                }
            }
        }
        // this is to print 2 d
        System.out.print("{");
        for (int l = 0; l < array.length; l++) {
            System.out.print("{");
            for (int m = 0; m < array[l].length; m++) {
                System.out.print(array[l][m]);
                if (m != array.length - 1)
                    System.out.print(",");
            }
            System.out.print("}");
            if (l != array[l].length - 1)
                System.out.print(",");
        }
        System.out.println("}");

    }
    
      /**
     * two d array sort based up on the last element of the internal array
     * {{2, 3, 4}, {4, 6, 1}, {8, 6, 2}}
     * output: {{4, 6, 1}, {8, 6, 2}, {2, 3, 4}}
     * @param array
     */
    public void sortBasedOnLastElement(int[][] array){
       for(int i = 0; i < array.length - 1; i++){
           int length = array[i].length - 1;
           if(array[i][length] > array[i+1][length]){
               int[][] temp = new int[array.length][array[i].length];
               for(int k = 0; k < array[i].length; k++){
                   temp[i+1][k] = array[i][k];
                   array[i][k] = array[i + 1][k];
                   array[i + 1][k] = temp[i+1][k];
               }
           }
       }
       for(int k = 0; k < array.length; k++) {
           System.out.println(Arrays.toString(array[k]));
       }
    }

     /**
     * This is to find the numbers in the given email id, remove duplicate elements and print sorted way
     * @param email
     */
    public void numbersInEmail(String email) {
        String[] afterEmail = email.split("@");
        String nums = "";
        for (int i = 0; i < afterEmail[0].length(); i++) {
            if (48 <= afterEmail[0].charAt(i)) {
                if (57 >= afterEmail[0].charAt(i)) {
                    nums = nums + afterEmail[0].charAt(i);
                }
            }
        }
        //inserting unique elements into the array
        int[] intArray = new int[uniqueLengthOfArray(nums)];
        for (int k = 0, m = 0; k < nums.length(); k++) {
            int count = 0;
            int element = Integer.parseInt(nums.charAt(k) + "");
            for (int l = k; l < nums.length(); l++) {
                int nextElement = Integer.parseInt(nums.charAt(l) + "");
                if (element == nextElement) {
                    count++;
                }
            }
            if (count == 1)
                intArray[m++] = element;
        }
        System.out.println(Arrays.toString(sortArray(intArray)));
        }


    public static void main(String[] args) {
        int[][] array = {{1, 9, 4}, {2, 7, 3}, {8, 5, 2}};
        //output 1, 4, 9 2, 3 ,7
        // {2, 3, 7 } { 1, 4 ,9}
        TwoDArray obj = new TwoDArray();
        // obj.twoDArrayPrint(array);
       obj.sortTwoDArrayBasedOnLastElement(array);
       // obj.nestedSortingTwoDArrays(array);
        obj.sortBasedOnSum(array);
    }
}
