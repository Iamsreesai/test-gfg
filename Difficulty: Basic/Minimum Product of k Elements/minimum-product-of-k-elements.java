class Solution {

    int minProduct(int arr[], int k) {
        // code here
        Arrays.sort(arr);
        long mod = 1000000007;
        long product = 1;
        for(int i=0;i<k && i < arr.length ;i++){
            product = (product*arr[i]) % mod;
        }
        return (int) product;
    }
}