import java.util.*;
abstract class Anime{
      abstract void showName(String a_name);
      void protoganistName(String p_name){
                 System.out.println("The Name of the Protoganist is " + p_name);
   }
}
public class Abstraction extends Anime{
   void showName(String a_name){
                System.out.println(" Anime Name : "+a_name);
      
       }
   public static void main(String args[]){
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter the Anime Name : ");
                String a_name=sc.nextLine();
                System.out.println("Enter the protoganist name: ");
                String  p_name=sc.nextLine();
                Abstraction a=new Abstraction();
                a.protoganistName(p_name);
                a.showName(a_name);
      
       }
}
}
        
