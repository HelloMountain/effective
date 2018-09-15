package builder;

public class Main {
    public static void main(String[] args){
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1,2).calories(3).fat(4).builder();
        System.out.println(nutritionFacts.toString());
    }
}
