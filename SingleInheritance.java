import java.util.Scanner;
class Bus{
     void display(){
          System.out.println("This is Bus class");
    }

}
class Bike extends Bus{
      void show(){
           System.out.println("This is Bike class");
      }
}

public class SingleInheritance{
  public static void main(String args[]){
            Bike b=new Bike();
            b.show();
            b.display();
}
}
