class BallPen{
     void show(){ 
              System.out.println("This is Ball Pen class");
  }
}

class InkPen extends BallPen{
     void display(){
             System.out.println("This is InkPen class");
     }
}

class GelPen extends InkPen{
     void print(){
             System.out.println("This is GelPen class");
             show();
             display();
     }
}

public class MultiLevelInheritance{
   public static void main(String args[]){
           GelPen g=new GelPen();
           g.show();
}
}
           
          
