package relu02;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * @program: effective_java
 * @description:
 * @author: chazdada
 * @create: 2020-07-05 11:04
 **/
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calorize;
    private final int fat;
    private final int sodium;
    private final int carbodhydrate;

   public static class Builder{
       private final int servingSize;
       private final int servings;
       private  int calorize = 0;
       private  int fat = 0;
       private  int sodium = 0;
       private  int carbodhydrate = 0;

       public Builder(int servingSize,int servings){
           this.servingSize = servingSize;
           this.servings = servings;
       }

       public Builder calories(int val){
           calorize = val;
           return this;
       }
       public Builder fat(int val){
           fat = val;
           return this;
       }
       public Builder sodium(int val){
           sodium = val;
           return this;
       }
       public Builder carbodhydrate(int val){
           carbodhydrate = val;
           return this;
       }

       public NutritionFacts build(){
           return new NutritionFacts(this);
       }

   }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

   private NutritionFacts(Builder builder){
       servingSize = builder.servingSize;
       servings = builder.servings;
       calorize = builder.calorize;
       fat = builder.fat;
       sodium = builder.sodium;
       carbodhydrate = builder.carbodhydrate;
   }

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new Builder(10,20).calories(10).fat(200).build();
        System.out.println(nutritionFacts);
    }
}
