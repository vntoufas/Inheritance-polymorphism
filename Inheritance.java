import java.util.*;
import java.util.ArrayList;
public class Inheritance {
   
    public static void main(String[] args){
    
        //Date DateSuzuki=new Date(2013-1900,1,19);
        
        Sedan sedanaki=new Sedan(90,"ABC-600","Suzuki","Sedan","Blue","15/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Jeep jeepaki=new Jeep(2015,"DER-456","Suzuki","Jeep","Blue","10/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Coupe Couperaki=new Coupe(160,"FEW-252","Suzuki","Coupe","Blue","10/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Motorbike mihanaki=new Motorbike("SFA-114","Suzuki","Motorbike","Blue","10/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);

        Sedan sedanaki2=new Sedan(90,"XYZ-663","Suzuki","Sedan","Blue","15/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Jeep jeepaki2=new Jeep(2015,"XYB-664","Suzuki","Jeep","Blue","10/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Coupe Couperaki2=new Coupe(160,"XYB-664","Suzuki","Coupe","Blue","10/1/2015",3 ,"Ntoufas Vasilis","Omirou 5",2108080800);
        Motorbike mihanaki2=new Motorbike("XYB-664","Suzuki","Motorbike","Blue","10/1/2015",3 ,"Ntoufas vasilis","Omirou 5",2108080800);

        
        ArrayList <parking> list1=new ArrayList <parking>(); 
        
 
        
        list1.add(sedanaki);
        list1.add(sedanaki2);
        list1.add(jeepaki);
        list1.add(jeepaki2);
        list1.add(Couperaki);
        list1.add(Couperaki2);
        list1.add(mihanaki);
        list1.add(mihanaki2);
        
       System.out.println("Emfanisi ana katigoria :");
       
       int i;
      double CategorySum=0;
      double Total=0;
       System.out.println("We have these Sedans :");
    for (i=0;i<list1.size();i++){
        if (list1.get(i).GetKatigoria().equals("Sedan"))
        {System.out.println(list1.get(i).PairnoTaStoiheia());
        CategorySum=CategorySum+list1.get(i).calculation();
        }    }
    System.out.println("The Category sum for Sedans is : "+CategorySum );
        Total=Total+CategorySum;
     
        CategorySum=0;
        System.out.println("We have these Coupes :");
    for (i=0;i<list1.size();i++){
        if (list1.get(i).GetKatigoria().equals("Coupe"))
        {System.out.println(list1.get(i).PairnoTaStoiheia());
        CategorySum=CategorySum+list1.get(i).calculation();
        }    }
    System.out.println("The Category sum for Coupes is : "+CategorySum );
        Total=Total+CategorySum;
        
    CategorySum=0;
     System.out.println("We have these Jeeps :");
    for (i=0;i<list1.size();i++){
        if (list1.get(i).GetKatigoria().equals("Jeep"))
        {System.out.println(list1.get(i).PairnoTaStoiheia());
        CategorySum=CategorySum+list1.get(i).calculation();
        }    }
    System.out.println("The Category sum for Jeeps is : "+CategorySum );
        Total=Total+CategorySum;
        
        CategorySum=0;
    
     System.out.println("We have these Motorbike :");
    for (i=0;i<list1.size();i++){
        if (list1.get(i).GetKatigoria().equals("Motorbike"))
        {System.out.println(list1.get(i).PairnoTaStoiheia());
        CategorySum=CategorySum+list1.get(i).calculation();
        }    }
    System.out.println("The Category sum for Motorbikes is : "+CategorySum );
        Total=Total+CategorySum;
      System.out.println("The sum of all categories is : "+Total);
    
    }
    
    
    
    
}
 