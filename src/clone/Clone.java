package clone;

import java.util.Date;

public class Clone implements Cloneable{
    private Date birth = new Date();

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    protected Clone clone(){
        Clone c = null;
        try{
            c = (Clone)super.clone();//浅复制
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
//        //深复制
//        c.birth = (Date) this.getBirth().clone();
        return c;
    }
}
//如果成员变量不包含非基本变量，则浅复制就好了，否则确保类中的成员变量都实现了深复制
