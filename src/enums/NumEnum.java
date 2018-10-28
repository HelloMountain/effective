package enums;

/**
 * @Classname NumEnum
 * @Description TODO
 * @Date 2018/10/10 16:15
 * @Created by HP
 */
public enum NumEnum {
    ONE("1"), TWO("2"), THREE("3"), FORE("4");
    private String description;
    NumEnum(String description){
        this.description = description;
    }
    @Override
    public String toString() {
        return name();
    }

    public static void main(String[] args) {
        System.out.println(NumEnum.ONE.description);
        System.out.println(NumEnum.ONE.toString());
        NumEnum numEnum = NumEnum.valueOf(NumEnum.class, "ONE");
        System.out.println(numEnum.description);
        System.out.println(NumEnum.FORE.ordinal());
        NumEnum[] numEnums = NumEnum.values();
        for (NumEnum num:numEnums
             ) {
            System.out.println(num.name());
        }
    }
}
