import java.util.LinkedList;
import java.util.List;

class SimpleGen{
   private Object Ob;

   public SimpleGen(Object Ob){
       this.Ob=Ob;
   }
   public Object getOb(){

       return Ob;
   }

   public void setOb(Object Ob)
   {

       this.Ob=Ob;
   }

   public void showType()
   {
       System.out.println(Ob.getClass().getName());
   }
}
public class Main {

    public static void main(String[] args) {
    /*    System.out.println("Hello World!");
        List mylsit=new LinkedList();
        mylsit.add(new Integer(0));*/
    SimpleGen sg =new SimpleGen(new Integer(99));
    sg.showType();
    int i=(Integer) sg.getOb();
    System.out.println("Value =" +  i);
    SimpleGen sgstr =new SimpleGen("掌上洪城");
    sgstr.showType();
    String str=(String)sgstr.getOb();
    System.out.println("Value =" +  str);



    }


}
