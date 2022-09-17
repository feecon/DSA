//Hard - LEETCODE
package ARRAYS;

public class RainWaterTrapping {
    public int trap(int[] height) {
        int N = height.length;

        // creating the prefixMax
        int prefixMax[] = new int[N];
        prefixMax[0] = height[0];

        for (int i = 1; i < N; i++) {
            prefixMax[i] = Math.max(prefixMax[i - 1], height[i]);
        }

        // creating the suffixMax
        int suffixMax[] = new int[N];
        suffixMax[N - 1] = height[N - 1];

        for (int i = N - 2; i >= 0; i--) {
            suffixMax[i] = Math.max(suffixMax[i + 1], height[i]);
        }

        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            // left maximum height
            int LMax = prefixMax[i - 1];

            // right maximum height
            int RMax = suffixMax[i + 1];

            // water level
            int level = Math.min(LMax, RMax);

            // water on top of building
            int onTop = level - height[i];

            // total trapped water
            ans += Math.max(0, onTop);

        }

        return ans;

    }
}
