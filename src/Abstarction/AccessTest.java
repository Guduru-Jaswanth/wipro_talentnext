package Abstarction;
import Test.Foundation;

public class AccessTest {
    public static void main(String[] args) {
        Foundation obj = new Foundation();

        // System.out.println(obj.var1); // ❌ private - not accessible
        // System.out.println(obj.var2); // ❌ default - not accessible from different package
        //System.out.println(obj.var3); // ❌ protected - not accessible without inheritance
        System.out.println(obj.var4);    // ✅ public - accessible everywhere
    }
}

