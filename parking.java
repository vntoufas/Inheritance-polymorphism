import java.util.*;
public abstract class parking {
    
    protected String pinakides;
    protected String marka;
    protected String katigoria;
    protected String hroma;
    protected String DateOfEntrance;
    protected int DaysInParking;
    protected Owner stoiheia;
    
    
    public parking(String pinakides,String marka,String katigoria, String hroma,String DateOfEntrance,int DaysInParking,String Name,String Addres, double PhoneNumber )
    {this.pinakides=pinakides;
    this.marka=marka;
    this.katigoria=katigoria;
    this.hroma=hroma;
    this.DaysInParking=DaysInParking;
    this.DateOfEntrance=DateOfEntrance;
    this.stoiheia=new Owner(Name,Addres,PhoneNumber);
    }
    
    
    public abstract double calculation();
    
    
    public String PairnoTaStoiheia(){ return this.pinakides+" "+this.marka+" "+this.katigoria+" "+this.hroma+" "+this.DateOfEntrance+" "+this.DaysInParking +" " ;}
    
    public String GetKatigoria(){
    return katigoria;}
    
    
    
}
