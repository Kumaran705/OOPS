import java.util.*;
class ParentAddition{
  void add(int a,int b){
      System.out.println("Parent Class ");
      System.out.println("Addition of two integers: "+(a+b));
 }
  void add(int a,int b,int c){
       System.out.println("Parent Class  ");
       System.out.println("Addition of three integers: " + (a+b+c));
 }
}
class ChildAddition extends ParentAddition{
      void add(int a,int b,int c){
         System.out.println("Child Class ");
         System.out.println("Addition of three integers: "+(a+b+c));
  }
}
public class PolyMorphism{
      public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            ChildAddition ca=new ChildAddition();
            System.out.println("Choice the Option for your desired Operation.");
            System.out.println("1.Addition of two Integers: ");
            System.out.println("2.Addition of three Integers: ");
            System.out.println("Enter you choice :");
            int choice=sc.nextInt();
            switch(choice){
                  case 1:
                     System.out.println("Enter value for First Number: ");
                     int x=sc.nextInt();
                     System.out.println("Enter value for Second Number: ");
                     int y=sc.nextInt();
                     ca.add(x,y);
                     break;
                 case 2:
                     System.out.println("Enter value for First Number: ");
                     int h=sc.nextInt();
                     System.out.println("Enter value for Second Number: ");
                     int i=sc.nextInt();
                     System.out.println("Enter value for Third Number: ");
                     int j=sc.nextInt();
                     ca.add(h,i,j);
                      break;
                default:
                    System.out.println("You Choosed Wrong Operation");
}}
}

                      


























