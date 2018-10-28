package clone;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Classname NewInstanceOfCons
 * @Description TODO
 * @Date 2018/10/25 19:04
 * @Created by HP
 */
public class NewInstanceOfCons {
    String name;
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        try {
            Constructor<NewInstanceOfCons> consConstructor = NewInstanceOfCons.class.getConstructor();
            NewInstanceOfCons newInstanceOfCons = consConstructor.newInstance();
            newInstanceOfCons.setName("newInstanceofCons");
            System.out.println(newInstanceOfCons.name);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
