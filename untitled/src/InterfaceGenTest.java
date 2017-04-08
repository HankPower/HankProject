import java.util.Random;

/**
 * Created by Administrator on 2017-03-26.
 */
interface Generator<T>{
  public T Next();

}
class Coffee{

   public String ToString(){
       return  getClass().getSimpleName();
   }
}
class Mocha extends Coffee{}
class Cappuccino extends Coffee{}
class Brave extends  Coffee{}
class Latte extends Coffee{}
class CoffeeGenerator implements Generator<Coffee>{
    private static Random rad=new Random(100);
    private Class[] types ={Latte.class, Mocha.class, Cappuccino.class, Brave.class};
    public Coffee Next()
    {
        try {
            return (Coffee)
                     types[rad.nextInt(types.length)].newInstance();
        }catch (Exception e)
        {
            throw new RuntimeException(e);

        }

    }
}




public class InterfaceGenTest {
    public static void main(String[] args)
    {
        CoffeeGenerator coffg=new CoffeeGenerator();

        for (int i = 0; i <4 ; i++) {
            System.out.println(coffg.Next());
        }


    }
}
