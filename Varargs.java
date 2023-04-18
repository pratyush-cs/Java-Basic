import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Varargs {

    public static void main(String[] args) throws InterruptedException {
        //System.out.println(Arrays.toString(getArray(1,2,3,4,5,6)));
        BigDecimal a = new BigDecimal(0.1);
        BigDecimal b = new BigDecimal(0.2);

        System.out.println(b);

        System.out.println("Hello");
        Thread.sleep(10000);
        System.out.println("hi");
    }

    static int[] getArray(int... values){
        System.out.println(values.getClass());
        return values;
    }

}
