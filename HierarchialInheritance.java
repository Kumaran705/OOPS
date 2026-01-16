class First{
    void show(){
        System.out.println(" This is Class First");
   }
}
class Second extends First{
   void display(){
       System.out.println("This is class Second \n Now calling the Method of class First");
       show();
  }
}
class Third extends First{
     void disp(){
        System.out.println("This is Third class ");
        System.out.println("Now calling the Method of class First ");
        show();
 }
}
public class HierarchialInheritance{
   public static void main(String args[]){
            Third t=new Third();
            t.disp();
            Second s=new Second();
           s.display();
  }
}
