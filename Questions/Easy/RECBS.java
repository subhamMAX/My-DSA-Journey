import com.sun.jdi.PathSearchingVirtualMachine;

public class RECBS {
    public static void main(String[] args) {
        int [] arr ={6,7,8,9,1,2,3,4,5};
        int target = 7;
        int s =0;
        int e = arr.length-1;
        System.out.println(search(arr,target,s,e));

    }

    static int  search(int [] arr, int target,int s, int e){
        if(e<s) {
            return  -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid]== target){
            return mid;
        }
        if (arr[s]<= arr[mid]){
            if(target >= arr[s] && target<= arr[mid]){
               return search(arr,target,s,mid-1);
            }
            else{
                return search(arr,target,mid+1,e);
            }

        }
        if(target > arr[mid] && target< arr[e]){
            return search(arr,target,mid+1,e);

        }
        else{
            return search(arr,target,s,mid-1);
        }

    }
}
