package factory.simplefac;

public class BaoMa implements Car {
    private String name;

    @Override
    public void run(){
        System.out.println("car:" + name);
    }
}
