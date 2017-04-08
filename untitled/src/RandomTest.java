import java.util.Random;

/**
 * Created by Administrator on 2017-03-26.
 */
public class RandomTest {
    public static void main(String[] args) {
        Random random1 = new Random(4);
        System.out.println(random1.nextInt(100));
        System.out.println(random1.nextFloat());
        System.out.println(random1.nextBoolean());
        Random random2 = new Random(1);
        System.out.println(random2.nextInt(100));
        System.out.println(random2.nextFloat());
        System.out.println(random2.nextBoolean());
    }
}
