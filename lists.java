 /**
     * So I have to sort ids first from highest to lowest and then sort arrays incrementally
     * @param twoDList
     */
    public void sortBasedOnHighestElementInnerList(List<List<PracticeEmployee>> twoDList){
  // this is to sort internal elements of internal lists
            for (int i = 0; i < twoDList.size(); i++) {
                for(int k = 0; k < twoDList.get(i).size(); k++) {
                    for (int j = 1; j < twoDList.get(i).size() - k; j++) {
                        if (twoDList.get(i).get(j - 1).getId() < twoDList.get(i).get(j).getId()) {
                            int temp = twoDList.get(i).get(j).getId();
                            twoDList.get(i).get(j).setId(twoDList.get(i).get(j - 1).getId());
                            twoDList.get(i).get(j - 1).setId(temp);
                        }
                    }
                }
            }
            // this is to sort incrementally internal lists based on first element of it
        for(int l = 1; l < twoDList.size(); l++){
            if(twoDList.get(l - 1).get(0).getId() > twoDList.get(l).get(0).getId()){
                List<PracticeEmployee> temp1 = new ArrayList<>(twoDList.get(l));
                List<PracticeEmployee> temp2 = new ArrayList<>(twoDList.get(l - 1));
                twoDList.set(l - 1, temp1);
                twoDList.set(l, temp2);
            }
        }

        for(int k = 0; k < twoDList.size(); k++) {
           System.out.println(twoDList.get(k).toString());
       }
    }

 /**
     * so first we will have list of employees
     * so I create list of list of employees
     * {{list1}, {list2},,,,,,}
     * sort based up on the highest value of the inner array
     * @param twoDlist
     */
    public void sortListOfList(List<List<PracticeEmployee>> twoDlist) {
        for(int i = 1; i < twoDlist.size(); i++){
            for(int j = 0 ; j < twoDlist.get(i).size(); j++){
                if(twoDlist.get(i - 1).get(j).getId() > twoDlist.get(i).get(j).getId()){
                    List<PracticeEmployee> temp1 = new ArrayList<>(twoDlist.get(i));
                    List<PracticeEmployee> temp2 = new ArrayList<>(twoDlist.get(i - 1));
                    twoDlist.set(i - 1, temp1);
                    twoDlist.set(i, temp2);
                }
        }}
        for(int k = 0; k < twoDlist.size(); k++) {
            System.out.println(twoDlist.get(k).toString() + "\n");
        }
    }

public static void main(String[] args) {
        PracticeEmployee emp1 = new PracticeEmployee(1003, "java1", "Hyderabad");
        PracticeEmployee emp2 = new PracticeEmployee(1002, "java2", "Pune");
        PracticeEmployee emp3 = new PracticeEmployee(1001, "java3", "Delhi");
        PracticeEmployee emp4 = new PracticeEmployee(1002, "java2", "Pune");

        PracticeEmployee[] emps = {emp1, emp2, emp3, emp4};
        List<PracticeEmployee> list1 = new ArrayList<>(Arrays.asList(emps));

        // creating list2

        PracticeEmployee emp5 = new PracticeEmployee(1009, "java4", "Benguluru");
        PracticeEmployee emp6 = new PracticeEmployee(1007, "Java5", "Bombay");
        PracticeEmployee emp7 = new PracticeEmployee(1008, "java6", "Chennai");

        PracticeEmployee[] emps1 = {emp5, emp6, emp7};
        List<PracticeEmployee> list2 = new ArrayList<>(Arrays.asList(emps1));

        //creating list3
        PracticeEmployee emp8 = new PracticeEmployee(1005, "java7", "Kolkata");
        PracticeEmployee emp9 = new PracticeEmployee(1004, "Java8", "Amaravati");
        PracticeEmployee emp10 = new PracticeEmployee(1006, "java9", "Chennai");

        PracticeEmployee[] emps3 = {emp8, emp9, emp10};
        List<PracticeEmployee> list3 = new ArrayList<>(Arrays.asList(emps3));


        PracticeEmployee emp11 = new PracticeEmployee(1001, "Java12", "Hyderabad");
        PracticeEmployee emp12 = new PracticeEmployee(1002, "Java11", "Pune");
        PracticeEmployee emp13 = new PracticeEmployee(1007,  " Java10", "Chennai");

        PracticeEmployee[] emps4 = {emp11, emp12, emp13};
        List<PracticeEmployee> list4 = new ArrayList<>(Arrays.asList(emps4));
        List<List<PracticeEmployee>> listOfList = new ArrayList<>();
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);
        listOfList.add(list4);
