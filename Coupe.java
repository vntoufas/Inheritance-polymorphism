public class Coupe extends parking {
    private int HP;
    
 public Coupe(int HP ,String pinakides,String marka,String katigoria, String hroma,String  DateOfEntrance,int DaysInParking,String Name,String Addres, double PhoneNumber){

     super(pinakides,marka,katigoria,hroma,DateOfEntrance,DaysInParking,Name,Addres,PhoneNumber);
   this.HP=HP;
 }  
 public double calculation(){
 double timi=0;
     if(this.HP>159){
 timi=6*DaysInParking*1.1;}
     else timi=6*DaysInParking;
 if (timi>80)
 {timi=timi*0.8;} 
     
return timi;
}
 
 public String PairnoTaStoiheia(){return super.PairnoTaStoiheia() + "To ohima ehei ipodinami : " + this.HP;}


 
}