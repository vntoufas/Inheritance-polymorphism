import java.util.*;

public class Jeep extends parking {
    private int etos;
    
 public Jeep(int etos ,String pinakides,String marka,String katigoria, String hroma,String  DateOfEntrance,int DaysInParking,String Name,String Addres, double PhoneNumber){

     super(pinakides,marka,katigoria,hroma,DateOfEntrance,DaysInParking,Name,Addres,PhoneNumber);
   this.etos=etos;
 }  
   
 public double calculation(){
 double timi=0;
     if(this.etos>2012){
 timi=6*DaysInParking*1.2;}
     else timi=6*DaysInParking;
 if (timi>80)
 {timi=timi*0.8;} 
     
 
return timi;
}
 
 public String PairnoTaStoiheia(){return super.PairnoTaStoiheia() + "To ohima ehei proti imerominia : " + this.etos;}
 
}