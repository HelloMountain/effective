package offer;

/**
 * @Classname ReplaceSpace
 * @Description
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后
 * 的字符串为We%20Are%20Happy。
 * @Date 2018/9/23 17:09
 * @Created by HP
 */
public class ReplaceSpace {
    public static String replaceSpace(StringBuffer stringBuffer){
        if (stringBuffer == null || stringBuffer.length() == 0){
            return null;
        }
        String result = stringBuffer.toString();
        return result.replaceAll("[ ]+", "%20");
    }

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("We  Are Happy");
        System.out.println(replaceSpace(stringBuffer));
    }
}
