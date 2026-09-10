class Solution {
    public int maximumCount(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] >= 0) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        int neg = lo;
        lo = 0;
        hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] <= 0) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        int pos = arr.length - lo;
        if (neg > pos) {
          return neg;
        } else return pos;
    }
}