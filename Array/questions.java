public class questions {

    // 34
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1, -1};
        if(nums.length == 0) {
            return ans;
        }

        if(nums.length == 1 && nums[0] == target) {
            return new int[]{0, 0};
        }

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                ans[0] = i;
                break;
            } 
        }

        for(int j = nums.length - 1; j >= 0; j--) {
            if(nums[j] == target) {
                ans[1] = j;
                break;
            } 
        }
        return ans;
    }

    // 1480. Running Sum of 1d Array
    public int[] runningSum(int[] nums) {
        int rSum = 0;
        for(int i = 0; i < nums.length; i++) {
            rSum += nums[i];
            nums[i] = rSum;
        }  
        return nums;
    }


    public static void main(String[] args) {

    }
}