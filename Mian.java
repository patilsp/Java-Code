/*
 
 */
package nine;


 interface StackDsFs {
    
    public void push(int item);
    public int pop();
 }

class FixedStack implements StackDsFs {

    
    private int stack[];
    private int tos;
     FixedStack(int size) {
        
        stack = new int[size]; // now stack[] can  perform
        tos = -1;
        
     }
    
    

    @Override
    public void push(int item) { // add 0 ,1 ,2 ..,7
        stack[++tos] = item; //fixed
        
    }

    @Override
    public int pop() { // remove 7, 6,...,0
        
        if(tos < 0){ //second time call "after removing 0"
            System.out.println("stack underflow");
          return 0;
    }
        
      
        
        return stack[tos--]; // gives value  for print & [reduce tos "waiting for underflow"]
        
        
        
        
       
    }
    
    
}

class DynamicStack implements StackDsFs{ // keep in mind its dynamic

    
    private int stack[];
    private int top;

    public DynamicStack(int size) {
        stack = new int[size];
        top = -1;
    }
    
    @Override
    public void push(int item) { // addd dynamicaly
        if (top == stack.length -1){
            System.out.println("underflow \n");
            int temp[] = new int [stack.length*2];
            for(int i=0; i<stack.length; i++)
                temp[i]=stack[i];
                stack = temp;
                stack[++top]=item;
            
            
        }
        else
            
            stack[++top]=item;
        
            
        
        
        
        
        
        
    }

    @Override
    public int pop() {  //remove , print
        if (top <0){
            System.out.println("underflow "); //second time call "after removing 0"
            return 0;
        }else
        
        return stack[top--]; // gives value  for print & [reduce tos "waiting for underflow"]
        
    }
    
    
}

public  class Mian{
    
    public static void main(String[] args) {
        
        StackDsFs interfaceref;
        int i;
        FixedStack fs = new FixedStack(8);
         interfaceref = fs;
         
        System.out.println("adding values to fixed stack");
        for( i=0; i < 8; i++ ){
            interfaceref.push(i);//
            
        }
       // printing values 
        for( i=0; i< 8; i++){
            System.out.println("fixed stack pops :" + interfaceref.pop());
        }
        interfaceref.pop(); //second time calling  for "underflow"
        
        
        
        DynamicStack ds = new DynamicStack(5); //keep in mind its dynamic :)
        interfaceref = ds;
        System.out.println("adding values to ds  \n");
        for(i=0; i< 12; i++){
            interfaceref.push(i);
            
        }
        // print values
        for ( i = 0; i < 12; i++) {
            System.out.println("ds pops :" + interfaceref.pop());
            
        }
        interfaceref.pop(); // second time call
    }
}