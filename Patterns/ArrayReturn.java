import java.util.Arrays;

public class ArrayReturn {

    public static void main(String[] args) {

        int[][] nums = {
            {1, 17, 3},
            {4, 5, 18},
            {45, 8, 9}
        };

        int target = 99;
        System.out.println(Arrays.toString(findIndexOfTarget(nums, target)));
    }

    static int[] findIndexOfTarget(int[][] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == target) {
                    return new int[] { i, j };
                }
            }
        }

        // if target is not found
        return new int[] {-1, -1};
    }

}
