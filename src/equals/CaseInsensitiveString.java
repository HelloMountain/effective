package equals;

import java.util.ArrayList;
import java.util.List;

public class CaseInsensitiveString {
    private final String s;
    CaseInsensitiveString(String s){
        this.s = s;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof CaseInsensitiveString){
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        if(o instanceof String){
            return s.equalsIgnoreCase((String)o);
        }
        return false;
    }

    public static void main(String [] args){
        CaseInsensitiveString caseInsensitiveString = new CaseInsensitiveString("A");
        String s = "a";
        System.out.println(caseInsensitiveString.equals(s));
        System.out.println(s.equals(caseInsensitiveString));

        List<CaseInsensitiveString> list = new ArrayList<CaseInsensitiveString>();
        list.add(caseInsensitiveString);
        System.out.println(list.contains("a"));
    }
}
