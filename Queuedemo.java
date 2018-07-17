/* LOGIC : inserting values(elements) in Queue when Queue is full QueueFullException should call
aftre removing all values from Queue ,QueueEmptyException should should call
------------

# make class which will have 3 methods , insert and remove method will throws Exception 
1. insert (void) -- trows Queue is full
2.display
3.remove -- throws Queue is empty

main class
Insetr trough for loop and display same time . using try and catch for Queue is full
Remove trough for loop using try and catch  for  Queue is empty

Two Exception classes 
1.QueueFullException - prints Queue is full
2.QueueEmptyException - prints Queue is empty






 
 */
package six;


public class Queuedemo {
    public static void main(String[] args){
        Queue obj = new Queue(5);
        try{
             System.out.println("------Inserting- size is 5--------");
            for(int i=1; i<=6;i++){
                obj.insert(i);
                obj.display();
               
            }
             
        }
        catch(Exception e){
               }
        System.out.println("\n -----Removoing-------");
        
        //=================== removing ================================
        try{
            for(int i=1; i<=6; i++){
                System.out.println(  obj.remove() + "\n"); //method call
                
            }
            
        }
        catch(Exception e){
            System.out.println("Queue is empty" + e + "\n");
        }
        
    }
}

class Queue{ 
    int a[]; // inserting no. of elements . lets use array [put r,f]
    int tail,head; // r-insert, f-remove
    
   Queue(int size){ // assign size array to array a
       a= new int[size]; // size is 5 
       head=0;
       tail=-1; // r1.t2/r2.t3/r3.t4/r4.t5/r5.t6
      }
   
   void insert (int element) throws QueueFullException {
       
       if(tail==a.length-1){
           throw (new QueueFullException()); //exception thrown
       }else{
           tail++;
           a[tail]=element;
       }
       
   }
   
   void display() { // fuck me logic 
       System.out.println(a[tail] + "\n" );
       
       
   }
    
    
   int remove() throws QueueEmptyException { // logic: check that Queue is full or not 
       
       if (head>tail || tail==-1){
           throw (new QueueEmptyException()); //exception thrown
           } else
           return a[head++]; // f "remove"
           
       
   }
    
    
}

class QueueFullException extends Exception {
    QueueFullException(){
        System.out.println("Queue is full  its exception class");
    }
    
    
}