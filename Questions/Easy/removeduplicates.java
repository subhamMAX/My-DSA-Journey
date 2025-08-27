package com.subham.inheritence;
class removeduplicates{
    public int duplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // pointer for the unique elements
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // place the next unique element
            }
        }
        return i + 1; // length of unique elements
    }
}


