public class LinearSearch {
    public int linearSearch(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }
     public int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * Binary search is to find element by dividing array into halves
     * @param array
     * @param element
     * @return
     */
    public int binarySearch(int[] array, int element) {
        int[] sortedArray = sortArray(array);
        int length = array.length;
        int index = -1;
        while (length > 0) {
            length = length/2;
            int[] leftHalfArray = new int[length];
            int[] rightHalfArray = new int[length];
            if (element == sortedArray[length]) {
                index = length;
            } else {
            //if element is greater than element in the middle of the array then take right hand side of the array 
                if (element > sortedArray[length]) {
                    for (int i = 0; i < length; i++) {
                        rightHalfArray[i] = sortedArray[(length) + i];
                    }
                    sortedArray = rightHalfArray;
                } else {
                    for (int j = 0; j < length; j++) {
                        leftHalfArray[j] = sortedArray[j];
                    }
                    sortedArray = leftHalfArray;
                }
            }
        }
        return index;
    }
