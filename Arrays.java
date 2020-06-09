// to find duplicate elements in an given array
    public void duplicateElements(int[] array) {
        int dup = array[0];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (dup == array[i]) {
                dup = array[i];
                count++;
            }
        }
        if(count > 1){
            System.out.println(dup + " is a duplicate num" + " repeated for " + count + " times");
        }
    }
// This method is to find wheather the given arraya are identical
 public void identicalArrays(int[] array1, int[] array2) {
        int count = 0;
        if (array1.length != array2.length) {
            System.out.println(" These are not identical after observing length");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    count++;
                }
            }
            if (count == array1.length) {
                System.out.println("These two arrays are identical");
            } else {
                System.out.println("These two are not identical after checking each element");
            }
        }
    }
 /**
     * Delete particular element in an array
     *
     * @param array
     */
    public void deleteElement(int[] array, int element) {
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != element) {
                System.out.println(array[i]);
            } else {
                array[i] = 0;
                temp = array[i];
            }
        }
        System.out.println(temp);
    }
// find dupliacte elements in given arrays 
 public void duplicateElements(int[] array1, int[] array2, int[] array3) {
        int[] duplicate = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]){
                    duplicate[i] = array1[i];
                }
            }
        }
        for(int k = 0; k < array3.length; k++) {
            for (int l = 0; l < duplicate.length; l++) {
                if (duplicate[l] == array3[k]){
                    if(duplicate[l] != 0){
                        System.out.println(duplicate[l]);
                    }
                }
            }
        }
    }
//Write a program to sort given array of time {12:30, 2:15, 11:05}

    /**
     * hint: take string of times and split each element at index 1 using split regex":", then sort min to max
     * @param array - string array of time
     */
    public void sortArrayOfTimes(String array[]){
        for(int i = 1; i < array.length; i++){
            int min0 = Integer.parseInt(array[i-1].split(":")[1]);
            int min1 =Integer.parseInt(array[i].split(":")[1]);
            if(min0 > min1){
               String temp = array[i];
               array[i] = array[i-1];
               array[i-1] = temp;
            }
        }
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
    }
//array of integers {2, -1, 3, 5, -3} separate both positive and negative array
    public void separateNegativeArray(int[] array){
        int[] positiveArray;
        int[] negativeArray;
        int nCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] < 0) {
             nCount++;
            }
        }
        positiveArray = new int[array.length - nCount];
        negativeArray = new int[nCount];
        int nIndex = 0;
        int pIndex = 0;
        for(int j = 0; j < array.length; j++){
            if(array[j] < 0){
             negativeArray[nIndex] = array[j];
             nIndex++;
            } else {
                positiveArray[pIndex] = array[j];
                pIndex++;
            }
        }
        System.out.println("Lengths of array : " + positiveArray.length + " ," + negativeArray.length);
        System.out.println(positiveArray[0] + ", " + positiveArray[1] + ", " + positiveArray[2]);
        System.out.println(negativeArray[0] + ", " + negativeArray[1]);
    }
 // finding the numbers from email id
    public void findNumbersInEmail(String email) {
        String integers = "0123456789";
        int nums = 0;
        for (int i = 0; i < integers.length(); i++) {
            if (email.contains(integers.charAt(i) + "")){
              nums = (nums * 10) + Integer.parseInt(integers.charAt(i) + "");
            }
        }
        System.out.println(nums);
    }
 //if array has two digit numbers then swamp them ans sort them 
    public void swampTwoDigitArray(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] > 10){
                int num = array[i];
                int onesPlace = array[i] % 10;
                int tensPlace =  num / 10;
                int swampNum = (onesPlace * 10) + tensPlace;
                array[i] = swampNum;
            }
        }
        System.out.println("After swamping :");
        for(int j = 0; j < array.length; j++){
            System.out.println(array[j]);
        }
        for(int k = 0; k < array.length; k++){
            for(int m = 1; m < array.length - k; m++) {
                if (array[m - 1] < array[m]) {
                    int temp = array[m - 1];
                    array[m - 1] = array[m];
                    array[m] = temp;
                }
            }
        }
        System.out.println("Descending order :");
        for(int l = 0; l < array.length; l++){
            System.out.println(array[l]);
        }
           //in an array there are positive and negative numbers, sum of those should be sorted like {2, 4, 5 , -1 , -5}
//{-66, 11}, sort and print {11, 66} by noit considering sign of the number
    public void sortSumOfPositiveAndNegativeElements(int[] array){
        int[] sort = new int[2];
        int pSum = 0;
        int nSum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                pSum = pSum + array[i];
                sort[0] = pSum;
            } else {
                nSum = nSum + array[i];
                sort[1] = nSum;
            }
        }
        for(int k = 0; k < sort.length; k++){
            if(sort[k] < 0)
                sort[k] = -(sort[k]);
        }
        for(int l = 0; l < sort.length - 1; l++){
            if(sort[l] > sort[l+1]){
                int temp = sort[l+1];
                sort[l+1] = sort[l];
                sort[l] = temp;
            }
            System.out.println(sort[l] +", "+ sort[l+1]);
        }
    }
    }

