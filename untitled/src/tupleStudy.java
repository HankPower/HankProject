/**
 * Created by Administrator on 2017-03-26.
 */
import java.util.Date;

class TwoTuple<A,B>
        {
          public final A first;
          public final B Second;
          public TwoTuple(A a,B b){
           first=a;
           Second=b;


          }
          @Override
          public String toString()
          {
            return "("+ first+","+Second+")";

          }

        }
class ThreeTuple<A,B,C> extends TwoTuple<A,B>{
    private final C Three;
    public ThreeTuple(A a,B b,C c)
    {
       super(a, b);
       Three=c;
    }
    @Override
    public String toString()
    {
        return "("+ first+","+Second+","+Three+")";
    }

}
public class tupleStudy {
    public static void main(String [] args)
    {
        TwoTuple<Integer,String> tw=new TwoTuple<Integer,String>(99,"掌上洪城");
        System.out.println(tw);
        System.out.println("======扩展元组类库后======");
        ThreeTuple<Integer,String,Date> threeTuple=new ThreeTuple<Integer,String,Date>(99,"掌上洪城",new Date());
        System.out.println(threeTuple);

    }

}
