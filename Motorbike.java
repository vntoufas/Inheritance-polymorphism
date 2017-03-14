public class Motorbike extends parking {
    private int HP;
    
 public Motorbike(String pinakides,String marka,String katigoria, String hroma,String  DateOfEntrance,int DaysInParking,String Name,String Addres, double PhoneNumber){

     super(pinakides,marka,katigoria,hroma,DateOfEntrance,DaysInParking,Name,Addres,PhoneNumber);
   
 }  
   
 public double calculation(){
 double timi=0;
     timi=3*DaysInParking;
 if (timi>80)
 {timi=timi*0.8;} 
     
 
return timi;
}
 
 public String PairnoTaStoiheia(){return super.PairnoTaStoiheia();}
 
}