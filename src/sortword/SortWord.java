package sortword;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname SortWord
 * @Description TODO
 * @Date 2018/10/26 10:52
 * @Created by HP
 */
public class SortWord {
    public static void sortWord(){
        File file = new File("C:\\Users\\HP\\Desktop\\a.txt");
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String tempString = null;
        char[] tempChar = null;
        int line = 0;
        List<String> arraylist = new ArrayList<>();
        try {
            while ((tempString = bufferedReader.readLine()) != null) {
                arraylist.add(tempString);
                line++;
//                System.out.println(tempString);
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        String[] string = arraylist.toArray(new String[arraylist.size()]);
        Arrays.sort(string, String.CASE_INSENSITIVE_ORDER);
        for (String word: string
             ) {
            System.out.println(word);
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\a.txt");
            for (String temp:string
                 ) {
                fileOutputStream.write(temp.getBytes());
                fileOutputStream.write("\r\n".getBytes());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

//        String[] temp = {"z", "g", "h"};
//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\a.txt");
//            for (String s:temp
//                 ) {
//                try {
//                    fileOutputStream.write(s.getBytes());
//                    fileOutputStream.write("\r\n".getBytes());
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
                sortWord();
//        System.out.println();
//        String[] temp = {"omitted", "generate", "mutable", "individual", "concatenation"};
//        Arrays.sort(temp, String.CASE_INSENSITIVE_ORDER);
//        for (String t:temp
//             ) {
//            System.out.println(t);
//        }
    }
}
