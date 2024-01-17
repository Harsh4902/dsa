

public class A7 {
    public static void main(String[] args) {
        
    }

    public static int [] merge(int arr1[], int arr2[]){

        int n = arr1.length;
        int m = arr2.length;
        int res [] = new int[n+m];

        if(n<m){

            for(int i=0;i<n;i++){
                if(arr1[i] <= arr2[i])
                    res[i] = arr1[i];
                else
                    res[i] = arr2[i];
            }

        }
        else{

        }

        return res;

    }
}
