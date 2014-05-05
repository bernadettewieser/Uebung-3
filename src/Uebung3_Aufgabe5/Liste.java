
package Uebung3_Aufgabe5;

import Uebung3_Aufgabe3.Benennbar;



public class Liste<T extends Benennbar> {

    Benennbar[] array;
    

    public Liste(int size) {
        array = new Benennbar[size];
    }

    public void save(T param) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = param;
                System.out.println("Der Wert wurde gespeichert");
                break;
            }
        }
    }

    @Override
    public String toString() {
        String Inhalt="";
        for (Benennbar a : array)
        {
            Inhalt += a+" ";
        }
        return Inhalt; 
       }
    }
    

