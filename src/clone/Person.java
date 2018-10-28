package clone;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;

/**
 * @Classname Person
 * @Description 通过clone创建对象
 * @Date 2018/10/27 15:16
 * @Created by HP
 */
class Address implements Cloneable{
    private String city;
    private String street;
    Address(String city, String street){
        this.city = city;
        this.street = street;
    }
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "city:"+city+",street:"+street;
    }
}
public class Person implements Cloneable{
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        Person object = (Person) super.clone();
//        object.address = (Address) this.address.clone();
//        return object;
//    }
    public static void main(String[] args) {
        Address addressA = new Address("环翠", "文化西路");
        Person personA = new Person("小明", addressA);
        Person personB = null;
        try {
            personB = (Person) personA.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        if (personB!=null){
            System.out.println("personA:"+"name:"+personA.name+personA.address);
            System.out.println("personB:"+"name:"+personB.name+personB.address);
            //personB修改了自己的名字，并且搬到了北京
            personB.name = "小刚";
            personB.address.setCity("北京");
            personB.address.setStreet("天安门");
            System.out.println("modify-------------------");
            System.out.println("personA:"+"name:"+personA.name+personA.address);
            System.out.println("personB:"+"name:"+personB.name+personB.address);
        }
    }
}
