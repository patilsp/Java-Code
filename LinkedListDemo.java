
package twelve;

import java.util.*;
 public  class LinkedListDemo {
    public static void main(String[] args) {
        
        LinkedList<String> llist = new LinkedList<String>();
        
        llist.addFirst("A"); 
        llist.add("B"); 
        llist.add("C"); 
        llist.add("D"); 
        llist.add("k");
        llist.addLast("z");  
        System.out.println("original contents in list : " + llist);
        
        llist.remove("B");
        System.out.println("after removing 'B' elements:" + llist);
        
        llist.removeFirst();
        System.out.println("after deleting first  :" + llist);
        
        llist.removeLast();
        System.out.println("after removing last :" + llist);
        
        llist.set(1, llist + "changed"); // removing upto items and displaying nothng else :O
        System.out.println("llist after changing :" + llist);
        
        
    }
    
}
