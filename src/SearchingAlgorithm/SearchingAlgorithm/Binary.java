
public class Binary {
    
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(search(arr,14));

    }

    public static int search(int [] arr, int target){

        int s = 0;
        int e = arr.length-1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == target)
                return  mid;
            else if(arr[mid] < target)
                s = mid+1;
            else
                e = mid-1;
        }

        return  -1;
    }

}
