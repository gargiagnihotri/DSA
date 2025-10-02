public class MedianArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];
        
        int y = 0, g = 0, m = 0;
        
        
        while (y < n1 && g < n2) {
            if (nums1[y] < nums2[g]) {
                merged[m++] = nums1[y++];
            } else {
                merged[m++] = nums2[g++];
            }
        }
        
        
        while (y < n1) merged[m++] = nums1[y++];
        while (g < n2) merged[m++] = nums2[g++];
        
        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2]; 
        } else {
            return (merged[(n / 2) - 1] + merged[n / 2]) / 2.0; 
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {4,5};
        int[] arr2 = {3};
        System.out.println("Median: " + findMedianSortedArrays(arr1, arr2)); 

        int[] arr3 = {4,5};
        int[] arr4 = {3, 4};
        System.out.println("Median: " + findMedianSortedArrays(arr3, arr4)); 
    }
}