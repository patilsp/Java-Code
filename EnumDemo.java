package eight;
import java.util.Scanner;

public class EnumDemo {
    
     
   
    public static void main(String[] args) {
         week day;
         
         while(true){
        System.out.println("Enter Day :");
        Scanner s = new Scanner(System.in);
        String d = s.next();
        day = week.valueOf(d);
        System.out.println("Is the Day work Day ? Ans : " + day.workDay());
                
         }
       }
   }

enum week{
    SUNDAY,MONDAY,TUESDAY,WENESDAY,THURSDAY,FRIDAY,SATURDAY;
    boolean workDay(){
        if(ordinal()==0 || ordinal()==6) // ordinal is method , initial position = 0;
            return false;
        else
            return true;
        
    }
    
}