package four_menudriwen;

/* class Acount will creat a/c's  with min bal=500;
and having 2 methods clalled withdraw-deposite
withdraw thows exception if bal < 500;
so another claas for lessbalexcep extends Exception
which says withdraw not possible ;
In main creat obj of Account which are called a/c's
and  withdraw using tray{ which will cath exception;
 */



import java.util.*;
public class Demobank {
    public static void main(String[] args) throws LessBalanceException{
    Account a1 = new Account();
    
    while(true){
        System.out.println("Enter 1 for account   , 2 for exit");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
         if(num==2)
             System.exit(0);
         
   // write case for keep track
        switch(num){
            case 1 : while(true){
                System.out.println("1:deposit..2 check bal.3 withdraw. 4.exit");
                int ch = sn.nextInt();
                // main case
                switch(ch){
                case 1:  a1.deposit();
                    break;
                case 2: System.out.println("ur current bal is :" + a1.bal);
                    break;
                case 3: a1.withdraw();
                case 4:
                    System.exit(0);
                    
            }
                
            }
            
        }
        
        
    }
    
    }    
}

class Account{
    double bal;
    Account(){
        bal = 500;
        
    }
    public void deposit(){
        System.out.println("entter amt");
        Scanner sna = new Scanner(System.in);
         Double damount;
        damount = sna.nextDouble();
         
        
        bal = bal+damount;
        System.out.println("Amount " + damount  + " Deposited");
        System.out.println("bal after amt depo :" + bal);
        
    }
    void withdraw() throws LessBalanceException {
        System.out.println("enter amt to withdraw");
                Scanner sna = new Scanner(System.in);
                Double wamount;
                wamount=sna.nextDouble();
                
        if ((bal-wamount)<=500)
          throw (new LessBalanceException(wamount));
        else{
             bal = bal-wamount;
             System.out.println("Amount " + wamount + " withdrawn");
             System.out.println("Remaining bal is :" + bal);

           } 
            
        }
     }
class LessBalanceException extends Exception{
    double amt;
    LessBalanceException(double wamount){ //constructor
        amt = wamount;
        System.out.println("withdraw not possible :" + amt);
        
    }
    
}