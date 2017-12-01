
package project2;
import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author KINGSLEY OTTO
 */
public class Project2 {
    // CREATE TWO LINKED LIST
    
     static DateList linkedList1 = new DateList();
     static DateList linkedList2 = new DateList();
    
     // MAIN PROGRAM 
     // OPEN FILE *TXT , READ, APPPEND AND INSERTED THEM IN A THE LINKEDLIST
     //INTIALIZE GUI AND APPEND BOTH LIST ON IT IN A 2 LAYOUT
    public static void main(String[] args) {  
        File file;
        Scanner filereader;
        try{
            
            file = new File("Date.txt");
            filereader = new Scanner(file);
            
            while(filereader.hasNextLine()){
                String line = filereader.nextLine();
                
             //THIS TOKENIZER HELPS SPLIT CURRENT READ LINE INTO SUBSTRINGS   
                          
                StringTokenizer token = new StringTokenizer(line,",");
                
                while(token.hasMoreTokens()){
                    String date = token.nextToken();
                    if(isValidDate(date)){ // CHECK IF DATE IN *TXT FILE IS VALID
                        
                        // CALL THE DATE212 CONSTRUCTOR SO WE CAN SEPARATE THE VALID DATES INTO 
                        //YEARS MONTHS AND DAYS
                        Date212 let = new Date212(date);
                        
                        // APPEND THEM INTO THE FIRST LINKED LIST
                        linkedList1.append(let);
                        
                        // INSERT THEM INTO THE SECOND LINKED LIST
                        linkedList2.insert(let);
                      
                    }else{
                        
                        // IF DATE NOT VALID, PRINT IT TO CONSOLE
                        
                        System.out.println(date + " is not a date");
                    }
                }  
            }
           
            //(IF YOU WISH TO PRINT BOTH LINKED LIST TO CONSOLE, REVMOVE THE //
            System.out.println("unsorted date" + "\n" + linkedList1);
            //System.out.println("sorted date" + "\n" + list2);
            
            filereader.close(); // CLOSE FILE AFTER READING 
            
            
            //CATCHES EXCEPTIONS
        } catch(Exception e){
            System.out.println("Error:" + e.getLocalizedMessage());
            
        
        }
        //FIRE UP THE DATEGUI
        DateGUI.initialize();
        
        //APPEND LINDED LIST TO JFRAME
        DateGUI.leftSide.append("APPENDED DATES (UNSORTED) " + "\n");
        DateGUI.leftSide.append("\n");
        DateGUI.leftSide.append(linkedList1.toString());
        
        DateGUI.rightSide.append("INSERTED METHOD DATES (SORTED)" + "\n");
        DateGUI.rightSide.append("\n");
        DateGUI.rightSide.append(linkedList2.toString());
        DateGUI.myFrame.setVisible(true);
          
    }
    
    
    
        private static boolean isValidDate(String date) {    //check if dates in txt is valid 
        if (date == null || date.isEmpty() || date.length() != 8)
            return false; //RETURN FALSE IF DATE IS NULL , EMPTY OR LENGTH IS NOT EQUAL TO 8

      
        for (int i = 0; i < date.length(); i++)
            if(!Character.isDigit(date.charAt(i)))
                return false;// RETURN FALSE IF DATE LIST CONTAINS NON DIGIT
       
      
        return true; //RETURN TRUE IF NO TEST FAILS.

    }
}
    

