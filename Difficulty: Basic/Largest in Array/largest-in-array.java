class Solution {
    public static int largest(int[] arr) {
       int largest = arr[0];
//hji
       for (int i = 1; i < arr.length; i++) {
           if (arr[i] > largest) {
               largest = arr[i];
           }
       }

       return largest; // code here
        
    }
}
