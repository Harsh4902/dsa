
public class Linear {
    
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5,6,7,8,9};
        
        System.out.println(search(arr, 4));
        System.out.println(search(arr, 23));

    }

    public static int search(int [] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target)
                return i;
        }

        return -1;
    }

}
