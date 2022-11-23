package package4;
import java.util.Arrays;
import java.util.Objects;
public class Main {
    public static void main(String[] args){
        ArrayInterface array1 = new BooleanArray();
        ArrayInterface array2 = new IntArray();
        array1.setTrue(3);
        array1.setTrue(4);
        array1.setTrue(5);


        array1.setFalse(3);
        System.out.println(array1.getByIndex(3));
        System.out.println(array1);
        System.out.println(array1.hasTrue());
        array2.setTrue(1);
        array2.setTrue(2);
        array2.setTrue(3);
        array2.setTrue(0);
        array2.setTrue(4);
        System.out.println(array2.getByIndex(4));

        //array2.setFalse(1);
        System.out.println(array2);
        System.out.println(array2.hasTrue());
    }
}
