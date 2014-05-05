
package Uebung3_Aufgabe4;


public class Aufruf {
    public static void main(String[]args){
    Liste x = new Liste(2);
    x.save(2.5);
    x.save(5.0);
    x.save(200.0);
    
        System.out.println(x.toString());
    }
}