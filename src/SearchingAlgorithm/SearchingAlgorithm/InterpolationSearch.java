package SearchingAlgorithm.SearchingAlgorithm;

public class InterpolationSearch {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(search(arr,6,0,arr.length-1));

    }

    public static int search(int [] arr,int target,int s, int e){

        int pos =0;

        while (s<=e && target >= arr[s] && target <= arr[e]){

            pos = s + ((e-s)/(arr[e] - arr[s]))*(target - arr[s]);

            if(arr[pos] == target)
                return pos;

            if(arr[pos] < target)
                return  search(arr,target,pos+1,e);

            if(arr[pos] > target)
                return  search(arr, target, s,pos-1);

        }

        return -1;
    }

}
