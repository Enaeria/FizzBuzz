package fr.epsi.kata;

import com.google.common.collect.Lists;

import javax.swing.event.ListSelectionEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: Louis Marle
 */
public class FizzBuzz {

     public List<String> genererLesFizzBuzz() {
         final ArrayList<String> resultat = Lists.newArrayList();
         for(int i = 0; i < 101; i++) {
             if(i % 15 == 0) {
                 resultat.add("FizzBuzz");
             } else if(i % 3 == 0) {
                 resultat.add("Fizz");
             } else if(i % 5 == 0) {
                 resultat.add("Buzz");
             } else {
                 resultat.add("" + i);
             }
         }
         return resultat;
     }
    
}
