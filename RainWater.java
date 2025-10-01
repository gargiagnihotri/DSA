public class RainWater {

    public static int waterstore(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }

        int left = 0, right = height.length - 1;
        int lefthighest = 0, righthighest = 0;
        int water = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= lefthighest) {
                    lefthighest = height[left];
                } else {
                    water += lefthighest - height[left];
                }
                left++;
            } else {
                if (height[right] >= righthighest) {
                    righthighest = height[right];
                } else {
                    water += righthighest - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] height = {6,8,9,5,3,10};
        System.out.println("rain Water: " + waterstore(height));
    }
}