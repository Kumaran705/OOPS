import java.util.*;
class Laptop{
   private String Brand;
    private int ram;
    public void setBrand(String Brand){
        this.Brand=Brand;
     }
    public String getBrand(){
         return Brand;
    }
    public void setRam(int ram){
     this.ram=ram;
   }
    public int getRam(){
        return ram;
}
}
public class Encapsulation{
  public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Laptop Brand: ");
       String b=sc.nextLine();
       Laptop l=new Laptop();
       l.setBrand(b);
       System.out.println("Laptop Brand is "+l.getBrand());
       System.out.println("Enter the Ram Specification: ");
       int r=sc.nextInt();
       l.setRam(r);
       System.out.println("The ram is "+l.getRam()+" gb");
}
}
