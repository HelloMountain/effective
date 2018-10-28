package clone;

public class Clone implements Cloneable{
    String name = "clone";
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        Clone clone1 = new Clone();
        try {
            Clone clone2 = (Clone) clone1.clone();
            System.out.println(clone2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
//如果成员变量不包含非基本变量，则浅复制就好了，否则确保类中的成员变量都实现了深复制
//private Date birth = new Date();
//
//    public Date getBirth() {
//        return birth;
//    }
//
//    public void setBirth(Date birth) {
//        this.birth = birth;
//    }
//
//    protected Clone clone(){
//        Clone c = null;
//        try{
//            c = (Clone) super.clone(); //浅复制
//        }catch (CloneNotSupportedException e){
//            e.printStackTrace();
//        }
////        //深复制
////        c.birth = (Date) this.getBirth().clone();
//        return c;
