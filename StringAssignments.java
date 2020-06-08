package test.stringPractice;

public class StringPracticeA {
    private String name = "Anand";
    private String instructor = "Bharathi";

    public void stringComparison () {
        // Regex
        // Using split and replace
        // Reverse and replace
        // using loop
        // StringUtils - apache lib
        System.out.println(instructor.compareTo(name));
        String newName = new StringBuilder(new StringBuilder(name).reverse().toString().replaceFirst("n" ,"")).reverse().toString();
        System.out.println(newName);
        String name=new StringBuilder(new StringBuilder(instructor).reverse().toString().replaceFirst("h","t")).reverse().toString();
        System.out.println(name);
    }
/**
*This method is to print no of times character has repeated in the string
*value = string want to provide 
*charc = want to know char that has repeated for no of times 
*/
   public int stringLiteral (String value, char charc) {
        int count = 0;
        char[] arrayChars = value.toCharArray();
          for (int i = 0; i < arrayChars.length; i++) {
              if (arrayChars[i] == charc) {
                  count++;
              }
        }
          return count;
    }

    public boolean stringComparisonWithoutUsingEquals (String string1, String string2) {
        boolean result = false;
        char[] arrayString1 = string1.toCharArray();
        char[] arrayString2 = string2.toCharArray();
        if (arrayString1.length != arrayString2.length) {
            return false;
        }
        if (string1.isEmpty() && string2.isEmpty()) {
            return true;
        }
        for (int i = 0; i < arrayString1.length; i++) {
            result = false;
            if (arrayString1[i] == arrayString2[i]) {
                result = true;
            }
        }
        return result;
    }
    /*
     this prints the reverse of provided string 
     */
    public void stringOperations (String name) {
        String reverseName = "";
        for (int i = name.length()-1; i >= 0; i--) { // i=6; true;
            char letter = name.charAt(i);// i=7,letter = i,h
            reverseName = reverseName + letter ;//ih
        }
        System.out.println(reverseName);
    }

    /**
     * remove repeating char
     * @param name
     */
    public void stringReplaceLetter(String name, char letter) {
        String nameAfterRemoving = "";
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            char letters = name.charAt(i);
            nameAfterRemoving = nameAfterRemoving + letters;
            if (name.charAt(i) == letter) {
                count = count + 1;
            }
            if (count == 2) {
                nameAfterRemoving = nameAfterRemoving.substring(0, i );
            }
        }
        System.out.println(name + " after replacing repeating alphabet " + "'" + letter + "' " + nameAfterRemoving);
    }

    /**
     * This will print substring starting from index provided
     * @param name
     * @param startIndex
     */
    public void subString (String name, int startIndex) {
        System.out.println(name.substring(startIndex));
    }

    /**
     * This will print substring for the given index range starts with start index and end with end index-1
     * @param name
     * @param startIndex
     * @param endIndex
     */
    public void subString (String name, int startIndex, int endIndex) {
        System.out.println(name.substring(startIndex, endIndex));
    }

    /**
     * This will split string with the given symbol as shown in the method to array of strings
     * @param name
     * @param del
     */
   public void stringSplit(String name, String del) {
        String[] strs = name.split(del);
       System.out.println("String length is " + strs.length);
       System.out.println("Values are " + strs[0] + " " + strs[1] + " " + strs[2]);
   }
    
    /**
     * This methods gives word provided if that is existed in the provided link
     * @param link - url provided
     * @param word - string looking in the link
     */
    public void stringLink(String link, String word) {
        // splitting givcen link in the given regex
        String[] texts = link.split("/");
        // create a list to store split string array using for loop
        List<String> text = new ArrayList<String>();
        for (int i = 0; i < texts.length; i++) {
            text.add(texts[i]);
        }
        //checking if list contains word using contains method
        if (text.contains(word)) {
            System.out.println(word);
        } else {
            System.out.println("There is no such word" + word + " exist in the given " + link);
        }
    }



    /**
     * this splits string into two equal halves
     * @param name - string
     */
   public void stringSplitIntoHalf (String name) {
       int length = name.length();
       String firstHalf = name.substring(0, (length/2));
       String secondHalf = name.substring(length/2, length);
       System.out.println( name + " is split into halves : " + firstHalf + " and " + secondHalf);
   }

    /**
     * This gives length of string after removing given letter in the string
     * @param name - give string
     * @param letter - give letter wants to remove from the string
     */
   public void stringCharOccurrence (String name, String letter) {
       // here creating another string by replacing letter char with empty string spaces
       String afterRemoving = name.toUpperCase().replace(letter.toUpperCase(), "");
       //then subtracting name length with after removing letter string to get length of the string after removing letter
       int length = name.length() - afterRemoving.length();
       System.out.println(" no of " + letter + "'s" + " removed :" + length);
   }

    /**
     * This program removes second occurrence of replace char and place new char in that place,
     * this will not work for names like repeating letters one after another like aayush
     * @param name = given string
     * @param newLetter - replaces old second occurrence of char with newLetter
     * @param replace - char that has to be replaced second time with newLetter
     */
   public void stringLastIndexLetterReplace (String name, char newLetter, char replace) {
       String newName = "";
       int count = 0;
       for (int i = 0; i < name.length(); i++) {
           //checking if string has replacing letter if yes incrementing count by 1
           if (name.charAt(i) == replace) {
               count++;
           }
           // if count replace letters in the string is 2 and new string end element is replacing letter then removing that last element by using sub string
           // then adding new letter to it
           if (count == 2 && newName.charAt(i-1) == replace) {
               newName =newName.substring(0, i-1);
               newName = newName + newLetter;
           }
          newName = newName + name.charAt(i);
       }
       System.out.println(name + " after replacing "+ replace + " with " + newLetter + " is : " + newName);
   }

    /**
     * this is to remove second occurrence of given char and replace with new one
     * @param name - string
     * @param wantToRemove - char that you want to remove if occurred second time
     * @param wantToAdd - char that you want to add after removing wantToRemove
     */
   public void stringLastIndexCharWithNew (String name, char wantToRemove, char wantToAdd) {
       // getting index of second occurrence of gie=ven wantToRemove char
       int index = name.lastIndexOf(wantToRemove);
       // here getting remaining string after that second occurrence
       String tail = "";
       tail = tail + name.substring(index+1, name.length());
       // here removing last element by using sub string method
       String newName = "";
       newName = newName+name.substring(0,index);
       // adding new char to the end of the substringed newName
       newName = newName + wantToAdd;
       // now adding tail of the given string after replacing wantToRemove with wantToAdd
       newName = newName + tail;
       System.out.println("New name after replacing " + wantToRemove + " with " + wantToAdd + " in the last index of " + wantToRemove + " is : " + newName);

   }

    public static void main(String[] args) {
        StringPracticeA compareStrings = new StringPracticeA();
        compareStrings.stringReplaceLetter("Bharathi", 'h');
    }
}
