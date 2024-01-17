package SearchingAlgorithm;

public class SearchInRotatedArray {

    public static void main(String[] args) {
        int [] arr = {4,5,6,1,2,3};

        System.out.println(search(arr,2));
    }

    public static int search(int [] arr, int target){

        int pivot = -1;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1])
                pivot = i;
        }

        if(pivot != -1){
            int s = pivot+1;
            int e = arr.length;

            while(s <= e){
                int mid = s + (e-s)/2;
                if(arr[mid] == target)
                    return  mid;
                else if(arr[mid] < target)
                    s = mid+1;
                else
                    e = mid-1;
            }
        }
        else{
            int s = 0;
            int e = arr.length;

            while(s <= e){
                int mid = s + (e-s)/2;
                if(arr[mid] == target)
                    return  mid;
                else if(arr[mid] < target)
                    s = mid+1;
                else
                    e = mid-1;
            }
        }

        return -1;
    }

}
