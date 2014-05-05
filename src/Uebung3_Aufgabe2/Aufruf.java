

package Uebung3_Aufgabe2;



public class Aufruf {
   

    public static void main(String[] args) {
       
        Car bmw = new Car((short)4,(short)220,(short)5,(short)4,Vehicle.color.black);
        System.out.println(bmw.toString());
        Car audi=new Car((short)4,(short)180,(short)5,(short)4, Vehicle.color.black);
        System.out.println(audi.toString());
        Boat titanic = new Boat((short) 0, (short)100000, (short)0, (short)51000,10.54,(short)3,(short)0,Vehicle.color.blue);
        System.out.println(titanic.toString());
        
        Benennbar namedCar = new Car();
        namedCar.setName("ABC");
        System.out.println("Es heißt "+namedCar.getName());
        
        
    }
    
}


