import java.util.ArrayList;

public class RECURSION_ARRAYLIST {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,5,6,78,};
        int x = 3;
        System.out.println(ReturnArraylist(arr,0,x,new ArrayList<>()));
        System.out.println(ReturnArraylist2(arr,0,4));

    }
    static ArrayList<Integer> ReturnArraylist(int [] arr, int index, int target, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return ReturnArraylist(arr,index+1,target,list);
    }
    static ArrayList<Integer> ReturnArraylist2(int [] arr, int index, int target){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ans = ReturnArraylist2(arr,index+1,target);
        list.addAll(ans);
        return list;
    }
}
