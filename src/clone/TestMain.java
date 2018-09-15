package clone;

import java.util.Date;

public class TestMain {
    public static void main(String [] args){
        Clone clone1 = new Clone();
        clone1.setBirth(new Date());

        Clone clone2 = clone1.clone();
        System.out.println(clone1.getBirth());
        System.out.println(clone2.getBirth());
    }
}
