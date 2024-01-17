package c.c;

public class LCMofArray {

    public static void main(String args[]) {
        int[] myArray = {25, 50, 125, 625};
        int min, max, x, lcm = 0;

        for(int i = 0; i<myArray.length; i++) {
            for(int j = i+1; j<myArray.length-1; j++) {
                if(myArray[i] > myArray[j]) {
                    min = myArray[j];
                    max = myArray[i];
                } else {
                    min = myArray[i];
                    max = myArray[j];
                }
                for(int k =0; k<myArray.length; k++) {
                    x = k * max;
                    if(x % min == 0) {
                        lcm = x ;
                    }
                }
            }
        }
        System.out.println("LCM of the given array of numbers : " + lcm);

        int result = gcd(myArray[0],myArray[1]);
        for(int i = 2; i < myArray.length; i++){
            result = gcd(result, myArray[i]);
        }
        System.out.println("Gcd of n numbers is: "+result);
    }

    public static int gcd(int a,int b){
        int res = 0;
        while (b > 0){
            int temp = b;
            b = a % b;
            a = temp;
            res = a;
        }
        return res;
    }

}
