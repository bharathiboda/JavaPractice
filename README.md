# JavaPractice
Practice
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
