public class A3{

    public static void main(String [] args){
        
        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("Original Array: ");
        for(int a:arr){
            System.out.print(a+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        System.out.println("Reversed Array: ");
        for(int a:arr){
            System.out.print(a+" ");
        }


    }

}