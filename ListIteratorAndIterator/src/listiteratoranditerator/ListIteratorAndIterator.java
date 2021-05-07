
package listiteratoranditerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;


public class ListIteratorAndIterator {
    //ListIterator vs Iterator
    
    /*
    ListIterator
    
    Sadece List interfac'ı implemente eden classlarda kullanılır.
    next() ve previous() metodu vardır, ekstra dan add() methodu bulunur.
    
    Iterator 
    
    Set, Queue, ve List interfac'ı implemente eden classlar da kullanılabilir.
    previous metodu yoktur.
    */
    
    public static void main(String[] args) {
      //  Set<String> set = new HashSet<>();
        List<String> list = new ArrayList<>();
        
       /* set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("Go");
        
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
        Iterator<String> iterator1 = set.iterator();
        Iterator<String> iterator2 = list.iterator();
        
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
        
        System.out.println("**************************");
        
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        
        System.out.println("*****************************");
        
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next());
        }
        
        */
       
        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("Go");
        
       ListIterator<String> iterator3 = list.listIterator();
       
     /*  while (iterator3.hasNext()) {
           System.out.println(iterator3.next());
       }
       
        System.out.println("****************************");
        
        while (iterator3.hasPrevious()) {
            System.out.println(iterator3.previous());
        }

        */
     
     while (iterator3.hasNext()) {
         String value = iterator3.next();
         
         if (value.equals("Go")) {
             iterator3.remove();
         }
         
     }
     
     
     for (String s : list) {
         System.out.println(s);
     }
     
     
        
    }
    
}
