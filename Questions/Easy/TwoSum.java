public class twosum {
        public static void main(String[] args) {
            int arr[]={1,3,4,5};
            int target = 8;
            int[] result = Towosum.twosum(arr,target);
            System.out.println(result);
        }
        class Towosum{
            public static int[] twosum(int nums[], int target){
                for (int i = 0; i < nums.length; i++) {
                    for(int j  = i+1; j< nums.length;j++){
                        if(nums[i]+nums[j]==target){
                            return new int[]{i, j};
                        }
                    }
                }
                return new int[]{-1,-1};
            }
        }
    }



