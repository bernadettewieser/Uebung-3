

package Uebung3_Aufgabe5;

import Uebung3_Aufgabe4.Liste;



public class Aufruf {
   

    public static void main(String[] args) {
       
        Liste<Benennbar> l = new Liste(3);
        Benennbar audi = new Car();
        Benennbar segelschiff = new Boat();
        Benennbar fahrzeug = new Vehicle();
        l.save(audi);
        l.save(segelschiff);
        l.save(fahrzeug);
        
                
                
      System.out.println(audi.toString());
      System.out.println(segelschiff.toString());
      System.out.println(fahrzeug.toString());
    }
    
}


