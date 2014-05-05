
package Uebung3_Aufgabe2;



public class Boat extends Vehicle {
   double draft;
   short propeller;
   double cargo;

    public Boat(short propeller, double cargo, short wheels, short ps, double draft, short doors, short speed, color farbe) {
        super(wheels, ps, doors, speed, farbe);
        this.draft = draft;
        this.propeller = propeller;
        this.cargo = cargo;
    }
   public Boat(){
       
   }
   void unload() throws InterruptedException{
       cargo=0;
       Thread.sleep(5000);
   }

    public double getDraft() {
        return draft;
    }

    public void setDraft(double draft) {
        this.draft = draft;
    }

    public short getPropeller() {
        return propeller;
    }

    public void setPropeller(short propeller) {
        this.propeller = propeller;
    }

    public double getCargo() {
        return cargo;
    }

    public void setCargo(double cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Mein Boot hat "+this.getPs()+"PS und fährt mit "+this.getDraft()+" km/h";
    }
    
   
}
