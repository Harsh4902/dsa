package c.c;

public class ConversionOfUnits {

    //Taking example of weight conversion

    public static void main(String[] args) {

        float kg = 1.2f;
        System.out.println(kgToGram(kg));
        System.out.println(kgToTon(kg));
    }

    public static float kgToGram(float kg){
        return kg*1000f;
    }

    public static float kgToTon(float kg){
        return kg/1000f;
    }
}
