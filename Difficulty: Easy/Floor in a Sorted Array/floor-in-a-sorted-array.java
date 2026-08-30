class Solution {
	static int findFloor(int[] arr, int tar) {
		int lo = 0;
		int hi = arr.length - 1;
		int index = -1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			if (arr[mid]>tar) {
				hi = mid - 1;
			}
			else if (arr[mid] <= tar) {
				lo = mid + 1;
				index = mid;
			}
		}
		return index;
		
	}
}
