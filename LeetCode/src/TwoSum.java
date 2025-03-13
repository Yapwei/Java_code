public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println();
    }

    //  遍历整个数组
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            result[0] = i;
            int res = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == res) {
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
