package io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @Classname DirList
 * @Description list all file name under the dir
 * @Date 2018/10/27 10:59
 * @Created by HP
 */
class DirListFilter implements FilenameFilter {
    Pattern pattern = null;
    DirListFilter(String regex){
        pattern = Pattern.compile(regex);
    }
    @Override
    public boolean accept(File dir, String name) {
//        return pattern.matcher(name).matches();
        return true;
    }
}
public class DirList {
    public static void dirList(String fileDir){
        File file = new File(fileDir);
        String[] fileList = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir, name).isFile()&&name.endsWith(".doc");
            }
        });
//        String[] fileList = file.list(new DirListFilter(".doc"));
//        for (String filename:fileList
//             ) {
//            System.out.println(filename);
//        }
        Arrays.sort(fileList, String.CASE_INSENSITIVE_ORDER);
                for (String filename:fileList
                     ) {
                    System.out.println(filename);
                }
    }

    public static void main(String[] args) {
//        Pattern pattern = Pattern.compile("\\*\\.doc");
//        System.out.println(pattern.matcher("C:\\Users\\HP\\Desktop\\学校.qings.doc").matches());
        dirList("C:\\Users\\HP\\Desktop\\学校");
    }
}
