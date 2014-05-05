

package Uebung3_Aufgabe3;


public class Car extends Vehicle {
    private boolean aircondition;
    private short airbag;

    public Car(short wheels, short ps, short doors, short speed, color farbe) {
        super(wheels, ps, doors, speed,farbe);
        this.aircondition = false;
        
    }
    public Car(){
        
    }
   
    void startAircondition(){
        if(!aircondition){
        aircondition=true;
    }else{
            System.out.println("Läuft bereits");
        }
    }
    void stopAircondition(){
        if(aircondition){
            aircondition=false;
        }else{
            System.out.println("Ist bereits aus");
        }
    }

    public boolean isAircondition() {
        return aircondition;
    }

    public void setAircondition(boolean aircondition) {
        this.aircondition = aircondition;
    }

    public short getAirbag() {
        return airbag;
    }

    public void setAirbag(short airbag) {
        this.airbag = airbag;
    }

    @Override
    public String toString() {
        return "Mein Auto hat "+this.getPs()+" PS und fährt mit "+this.getSpeed()+" km/h";
    }
    
    
}
