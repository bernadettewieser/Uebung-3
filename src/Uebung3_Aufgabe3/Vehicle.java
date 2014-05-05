

package Uebung3_Aufgabe3;


public class Vehicle extends Benennbar{
    private short wheels;
    private short ps;
    private short doors;
    private boolean started;
    private short speed;
    private color farbe;
    //private String name;
    
    public Vehicle(short wheels, short ps, short doors, short speed, color farbe) {
        this.wheels = wheels;
        this.ps = ps;
        this.doors = doors;
        this.started = false;
        this.speed = 0;
        this.farbe = farbe;
    }
    public Vehicle(){
        
    }


    public enum color{
        black, silver, red, grey, yellow,blue
    }

    void start(){
        started = true;
    }
    
    void stop(){
        started = false;
    }
    
    void accelerate(short new_speed){
        if(started && speed<=250){
            speed = (short) (speed+new_speed);
        }
    }
    void bremsen(short n_speed){
        if(started && speed>0){
        } else {
            speed = (short) (speed - n_speed);
        }
    }

    public short getWheels() {
        return wheels;
    }

    public void setWheels(short wheels) {
        this.wheels = wheels;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getDoors() {
        return doors;
    }

    public void setDoors(short doors) {
        this.doors = doors;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }

    public color getFarbe() {
        return farbe;
    }

    public void setFarbe(color farbe) {
        this.farbe = farbe;
    }
    
    
}
   
