public class MostWater {
    public static int highestArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int highestArea = 0;

        while (left < right) {
            int width = right - left;
            int lowHeight = Math.min(height[left], height[right]);
            int area = width * lowHeight;
            highestArea = Math.max(highestArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return highestArea;
    }

    public static void main(String[] args) {
        int[] height = {12,17,1,3,15,8};
        System.out.println("highest water area" + highestArea(height));
    }
}