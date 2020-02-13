package Sorting_algorithms.selection_sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,2,5,1,7,9,2,9};

        for (int x = 0 ; x<nums.length ; x ++){
            for (int y = 0 ; y<nums.length ; y++){
                if(nums[x]>nums[y]){           //adjust the greater than sign to change ASC/DESC
                    int tempx = nums[x];
                    int tempy = nums[y];
                    nums[x] = tempy;
                    nums[y] = tempx;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
