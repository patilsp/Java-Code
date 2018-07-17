/** LOGIC : producer puts some new value || consumer get that value and display's same
 * 
 * one class called Q which is having 2 synchronized methods
 * 1) void put() 2) int get()
 * before we need some value to perform, int n;
 * Both methods having 2 other methods wait() and notify()
 * wait() runs in try block so use ctach too (InterruptedException :O
 * for controlling both of this method we need, boolean busy=false;
 * put always busy so while(busy) do work of put
 * get always not busy so while(!busy) do work of get
 * 
 */
package five;

/**
 *
 * @author sharelock
 */
public class TreadsSynchronized {
    public static void main(String[] args){
        Q q =new Q(); //object
        new Producer(q);
        new Consumer(q);
       
    }
    
    
    
}
class Q{
    int n;
    boolean busy=false;
    
    synchronized void put(int n){
        while(busy)
            try{
                wait();
            }
            catch(InterruptedException e){
               
            }
            this.n=n; // put current item
            System.out.println("Put :" + n);
            busy=true;
            notify(); // to get
        
        
    }
    synchronized int get(){ // get is never busy, so busy=false;
        while(!busy)
            
            try{
              Thread.sleep(2000);
              wait();
              
            }
        catch(InterruptedException e){
            
                    
        }
        
        System.out.println("Got :" + n + "\n");
        System.out.println("click red[stop] button to stop");
        busy=false;
        notify(); // to get ., i am done
        return n;
            
        
    }
    
}

class Producer implements Runnable{ // hace one method "run" for putting always
    
    
    Q q; // make reference 
    Producer(Q q){ // constructor
        this.q=q;
        new Thread(this,"Producer").start(); // started
        
    }
    
    public void run(){ // always run loop with i increment
        int i=0;
        while(true)
            
        q.put(i++);
        
    }
}


class Consumer implements Runnable { // have run method for getting always
    
    Q q;

    public Consumer(Q q) { //constructor
        this.q=q; // getting the current item
        new Thread(this,"Consumer").start();
        
    }
    
    
    public void run(){ // always run loop with geeting items
        while(true)
            q.get();
           
        
    }
}

