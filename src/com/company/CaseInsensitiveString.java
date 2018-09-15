package com.company;

public class CaseInsensitiveString {
    private String myString;

    public CaseInsensitiveString(String myString) {
        this.myString = myString;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseInsensitiveString){
            return myString.equalsIgnoreCase(((CaseInsensitiveString)obj).myString);
        }
        if(obj instanceof String ){
//            return myString.equalsIgnoreCase(((String)obj).myString);
        }
        return false;
    }
}
