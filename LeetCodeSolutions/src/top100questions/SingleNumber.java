package top100questions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by gaoyingbo on 2018/8/10.
 */
public class SingleNumber {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        SingleNumber solution = new SingleNumber();
        System.out.println(solution.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        int result = 0;

        if(nums.length == 1)
            return nums[0];
        else{
            Arrays.sort(nums);
            int i = 0;
            while (i < nums.length){
                //System.out.println(nums[i]);
                if(i == nums.length - 1){
                    return nums[nums.length - 1];
                }else{
                    if(nums[i] == nums[i + 1])
                        i += 2;
                    else{
                        result = nums[i];
                        break;
                    }
                }
            }
        }
        return result;
    }

}
