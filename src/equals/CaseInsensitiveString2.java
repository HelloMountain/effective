package equals;

import java.util.ArrayList;
import java.util.List;

public class CaseInsensitiveString2 {
    private final String s;
    CaseInsensitiveString2(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object o){
     if(o instanceof CaseInsensitiveString2){
         return s.equalsIgnoreCase(((CaseInsensitiveString2) o).s);
     }
     return false;
    }

    public static void main(String [] args){
        CaseInsensitiveString2 caseInsensitiveString2 = new CaseInsensitiveString2("A");
        String s = "a";
        System.out.println(caseInsensitiveString2.equals(s));
        System.out.println(s.equals(caseInsensitiveString2));

        List<CaseInsensitiveString2> list = new ArrayList<>();
        list.add(caseInsensitiveString2);
        System.out.println(list.contains("a"));
    }
}
