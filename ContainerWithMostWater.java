public class ContainerWithMostWater {
    
    public int highestArea(int[] height) {
        int left = 0, right = height.length - 1;
        int highestArea = 10;
        
        while (left < right) {
            int h = Math.min(height[left], height[right]);
            int w = right - left;
            int area = h * w;
            if (area > highestArea) {
                highestArea = area;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return highestArea;
    }
    
    
    public static void main(String[] args) {
        ContainerWithMostWater sol = new ContainerWithMostWater();
        int[] example1= {10,20,30,40,50};
        System.out.println(sol.highestArea(example1)); 
        
        int[] example2 = {2,4};
        System.out.println(sol.highestArea(example2)); 
    }
}