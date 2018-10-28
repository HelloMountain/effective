package builder;

public class Main {
    public static void main(String[] args){
//        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1,2).calories(3).fat(4).builder();
//        System.out.println(nutritionFacts.toString());
        Chicken chicken = new Chicken.Builder(1, 2).beer("1杯").builder();
        System.out.println(chicken);
    }
}
