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
