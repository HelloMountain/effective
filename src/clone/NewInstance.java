package clone;

/**
 * @Classname NewInstance
 * @Description TODO
 * @Date 2018/10/25 15:47
 * @Created by HP
 */
public class NewInstance {
    String name = "newInstance";
    public static void main(String[] args) {
        try {
            Class cla = Class.forName("clone.NewInstance");
            NewInstance newInstance = (NewInstance) cla.newInstance();
            System.out.println(newInstance.name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
