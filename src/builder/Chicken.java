package builder;

/**
 * @Classname Chicken
 * @Description TODO
 * @Date 2018/10/16 20:45
 * @Created by HP
 */
public class Chicken {
    //必选
    private int sodium;
    private int calories;
    //可选
    private String beer;
    private String cola;

    Chicken(Builder builder){
        this.sodium = builder.sodium;
        this.calories = builder.calories;
        this.beer = builder.beer;
        this.cola = builder.cola;
    }
    static class Builder{
        private int sodium;
        private int calories;
        private String beer = "0杯";
        private String cola = "0杯";
        Builder(int sodium, int calories){
            this.sodium = sodium;
            this.calories = calories;
        }
        public Builder beer(String beer){
            this.beer = beer;
            return this;
        }
        public Builder cola(String cola){
            this.cola = cola;
            return this;
        }
        public Chicken builder(){
            return new Chicken(this);
        }
    }
    @Override
    public String toString(){
        return "Chicken: "+"sodium :"+this.sodium+"calories:"+ this.cola+"cola:"+this.beer+"beer:"+ this.beer;
    }
}
