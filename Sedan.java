import java.util.*;

public class Sedan extends parking {
    private int space;
    
 public   Sedan(int space ,String pinakides,String marka,String katigoria, String hroma,String  DateOfEntrance,int DaysInParking,String Name,String Addres, double PhoneNumber){

     super(pinakides,marka,katigoria,hroma,DateOfEntrance,DaysInParking,Name,Addres,PhoneNumber);
   this.space=space;
 }  
   
 public double calculation(){
 double timi=0;
     if(space>499){
 timi=6*DaysInParking*1.15;}
     else timi=6*DaysInParking;
 if (timi>80)
 {timi=timi*0.8;} 
     
 
return timi;
}
 
 public String PairnoTaStoiheia(){return super.PairnoTaStoiheia() + "To ohima ehei port baguage : " + this.space;}
 
}