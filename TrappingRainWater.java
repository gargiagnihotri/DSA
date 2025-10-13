public class TrappingRainWater {
    
    public static int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0;

        int[] lefthighest = new int[n];
        int[] righthighest= new int[n];

        
        lefthighest[0] = height[0];
        for (int m = 1; m < n; m++) {
            lefthighest[m] = Math.max(lefthighest[m - 1], height[m]);
        }

        
        righthighest[n - 1] = height[n - 1];
        for (int m = n - 2; m >= 0; m--) {
            righthighest[m] = Math.max(righthighest[m + 1], height[m]);
        }



        int trappedWater = 0;
        for (int m = 0; m < n; m++) {
            trappedWater += Math.min(lefthighest[m], righthighest[m]) - height[m];
        }

        return trappedWater;
    }

    public static void main(String[] args) {
        int[] height1 = {1,0,10,2,4,20,3,7,5};
        System.out.println("Output: " + trap(height1)); 

        int[] height2 = {1,9,10,6,4,3,30,45,38};
        System.out.println("Output: " + trap(height2)); 
    }
}