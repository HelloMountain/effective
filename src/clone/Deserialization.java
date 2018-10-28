package clone;

import java.io.*;

/**
 * @Classname Deserialization
 * @Description TODO
 * @Date 2018/10/25 16:45
 * @Created by HP
 */
public class Deserialization implements Serializable {
    String name;
    Deserialization(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        //序列化
        try {
            Deserialization deserialization = new Deserialization("deserialization");
            FileOutputStream fileOutputStream = new FileOutputStream("file.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(deserialization);
            fileOutputStream.close();
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

        //反序列化
        try {
            Deserialization deserialization1;
            FileInputStream fileInputStream = new FileInputStream("file.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            deserialization1 = (Deserialization) objectInputStream.readObject();
            System.out.println(deserialization1.name);
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}

