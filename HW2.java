/*Ishaan Gupta
 * HW2 class is a class containing different methods which makes you have fun with arrays and strings
 using loops*/

public class HW2 {

  
  /*This method tests whether the input String is in alphabetical order or not
   * Returns true if String is alphabetical
   * Returns false if String is not alphabetical*/
  public static boolean isAlphabeticalOrder( String s){ 
    
    /* s is the name of the String 
     * i is the index to loop in the String*/
    
    /*Local variable to check if the string is not alphabetical order
     * Pre-assumption string isn't in alphabetical order*/
    int temp = 0;
    
    /*This loop chooses one character from the String*/
    for(int i=0; i<s.length(); i++){      
      /*ch is the name of the variable storing a single character*/
      char ch = s.charAt(i); 
      /*j is another index for moving in loop after choosing one element on index i*/
      
      /*This loop compares the characters of the string with the characters after the
       * choosen character 
       * The if statement checks the conditions whether there is any character whose value
       * is less than the character stored in ch. 
       * Returns false if there is one 
       * Otherwise loop completes successfully*/
      for(int j = i + 1; j < s.length(); j++)
      { 
        /* Condition being checked:
         * Firstly, is the character at index j a letter
         * Secondly, comparing the two letters 
         * Return false if the letters are not in alphabetical order*/
        if(Character.isLetter(s.charAt(j)) && Character.toUpperCase(s.charAt(j)) < Character.toUpperCase(s.charAt(i)))
         return false; } 
       }
    return true;   // The Default return statement of the method
    
  }
  
  
  
  
  /*This method remove the given number of character from the input String*/
  public static String removeNchars (String s, int n, char c){ 
    
    /*Declaring of new String to append*/
    StringBuilder abc = new StringBuilder();
    /*Local Variable to check the number of character to be removed */
    int temp =0;
    
    /*Loop to traverse through the input string
     * if statement checks the number of character removed so far
     * then it compares the character in the input string with the input character*/    
    for( int i=0; i < s.length(); i++)
    { 
      if(temp < n)
      {
        if(s.charAt(i) != c)
          abc.append(s.charAt(i));
        
        else 
          temp++;
      }
      else
        abc.append (s.charAt(i));
      
    }
    return abc.toString();       // The default return statement of the method
  }
  
  
  
  
  /*This method removes the second string from the larger first string*/
  public static String removeString( String a, String b){  
    /*Declaring of new String*/
    StringBuilder sen = new StringBuilder();
    
    /*Loop to Traverse through the Larger first String
     * Searches the shorter string in the larger string
     * if the shorter string is found, then skips it in appending
     * Otherwise keeps on appending the characters of Larger String into new String
     * The Goal of the loop is to have a new String with the content of larger string from which the shorter string has been removed*/
    for(int i=0; i<a.length(); i++)
    {  
      if(a.charAt(i) != b.charAt(0))
        sen.append(a.charAt(i));
      
      else
      { 
        /*Counter to traverse in the loop*/
        int j=0;  
        /*Flag to stop the loop on condition being false*/
        int temp =0;
        
        /*Loop to find the exact shorter string in the larger string
         * if successful temp is set equal to 1
         * else temp remain equal to 0*/
        while(temp != 1 && j < b.length())
        {
          if( (i + j) != a.length() && a.charAt(i + j) == b.charAt(j))
            j++;
          else 
            temp = 1;}
        
        /*Shorter string not found,appending the characters*/
        if(temp == 1)
          sen.append(a.charAt(i));
        
        /*Shorter string found, skip those characters in appending*/
        else 
          i+=b.length()-1;
      }  
      
    }
    return sen.toString();   // The default return statement of the method
  }
  
  
  
  
  /*This method moves all given character one right*/
  public static String moveAllXsRight(char ch, String sen){    
    
    /*Declaration of new String*/
    StringBuilder newSen = new StringBuilder();
    
    /*Loop to traverse in the given string*/
    for(int i=0; i<sen.length(); i++)
    { 
      /*Comparing the character of string with the given character
       * Also checking the condition for counter to remain within the length of string*/  
      if(sen.charAt(i) == ch && i+1 != sen.length())
      { 
        newSen.append(sen.charAt(i+1));
        
        newSen.append( sen.charAt(i));
        
        i++;
      }
      
      else 
        newSen.append(sen.charAt(i));
    }
    return newSen.toString();   // The default return statement of the method
  }
  
  
  
  /*This method shifts the given char in 2-D array to the bottom most possible*/ 
  public static void moveAllXsDown(char ch, char array[][]){
    
    /*Loop to redo the the shifting of character*/
    for(int rework =0; rework <array.length; rework++)
    {
      /*Nested Loop to traverse in the 2 D array
       * Loop to traverse through row of array*/
      for(int i=0; i<array.length; i++)
        
        /*Loop to traverse through column of the array*/
        for(int j=0; j<array[i].length; j++)
        
        /*To compare the character in the string with the given character*/
      { 
        if(array[i][j] == ch)
        {
         /*Moving thess character down*/
         if( i+1 < array.length && j < array[i+1].length)
        {
         /*A local variable for swapping the characters*/
          char temp = array[i][j];
          
          array[i][j] = array[i+1][j];
          
          array[i+1][j] = temp;
        }
       }
      }
     }
   }
/*This method shifts the first occurence of the given character and moves it down and right*/
  public static void moveXDownLeft (char inputChar, char[][] inputArray) {
    
    /*variable to store row index  where character is found*/
    int r = 0; 
    
    /*variable to store column index where character is found*/
    int c = 0;
    
    /*variable to store row number if moved down left*/
    int rXists = 0; 
    
    /*variable to store column number if moved down left*/
    int cXists = 0; 
    
    //Loop traverse along rows in array
    for (int i = 0; i < inputArray.length; i++) {
      
      // Loop traverse along columns in above row
      for (int j = 0; j < inputArray[i].length; j++) {
        
        //Compares character at array position with input character and stores position
        if (inputArray[i][j] == inputChar) {
          r = i;
          c = j;
        }
      }
    }
    //Loop that traverses from the array until the rows in array
    for (; r < inputArray.length && c >= 0; r++, c --) {
      
      //Checks if can be moved down
      if (c < inputArray[r].length) 
      {
        rXists = r;
        cXists = c;
      }
      //if can be moved down, switches the two characters
      if ((c-1)< inputArray[r+1].length && (c-1)>=0) 
      {
        inputArray[rXists][cXists] = inputArray[r+1][c-1];
        inputArray[r+1][c-1] = inputChar;
      }
    }
  }
  
  
  
  /*This method shifts the first occurence of the given character and moves it down and right in a string*/
  public static String moveXDownRight(char ch, String s){
    
    /*Declaration of new String*/
    StringBuilder sen = new StringBuilder(); 
    
    /*Declaration and Initialization of Variables for traversing through String
     * temp variable stores the index where the character is found
     * i variable to find the character ch*/     
    int temp = 0, i=0; 
    
    /*Variable to count the number of '\n'*/
    int count = 1;
    
    /*Loop to search the character in the string 
     * and store its index*/     
    while(s.charAt(i) != ch && i < s.length())
    { 
      sen.append (s.charAt(i));
      i++;
      temp = i;
    } 
    
    /*Loop to move the character down and right and append everything in a new String*/
    
    for(int j = temp; j < s.length(); j++)
    { 
      char chFinal;
      /*Finding the '\n' in the string*/
      if(s.charAt(j) == '\n')
      {
        count++;
        
        /*Checking the following conditions
         * The counter is within the string length
         * The character at that index is a letter*/
        if(j + count < s.length() && Character.isLetter(s.charAt(j+count)))
        {
          /*Storing the letter and appending it to the string*/
          chFinal = s.charAt(j+count);
          sen.append(chFinal);
          
          /*Loop to append all other characters*/
          for(int k = temp; k < j+count; k++)
            if(s.charAt(k) != ch)
          {
            sen.append(s.charAt(k));
            
            /*Change the value in the temp*/
            temp = j + count;
          }
          
          
        }
        
      }
    }
    
    sen.append(ch);
    return sen.toString();   // The default return statement of the method
  }
  
  
} // End of the class