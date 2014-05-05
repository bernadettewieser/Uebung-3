
package Uebung3_Aufgabe4;

public class Liste<T> {

    T[] array;

    public Liste(int size) {
        array = (T[]) (new Object[size]);
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
        for (T a : array)
        {
            Inhalt += a+"\n";
        }
        return Inhalt; 
       }
    }
    

