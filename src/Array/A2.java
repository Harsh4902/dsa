
public class A2{

    public static void main(String [] arg){
        int [] arr1 = {1,45,232,14,7,83,5};
        int max = Integer.MIN_VALUE;

        for(int a: arr1){
            if(a > max)
                max = a;
        }

        System.out.println(max);
    }

}