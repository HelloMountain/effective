package factory.simplefac;

public class Odi implements Car {
    private String name;
    public Odi(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("car:" + name);
    }
}
