class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        //done
        int lo = 0;
        int hi = arr.length - 1;
        int index = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {
                index = mid;
                return index;
            } else if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else if (arr[mid] < arr[mid - 1]) {
                hi = mid - 1;
            }
        }
        return 0;
    }
}