// User function Template for Java

class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length-1;
        ArrayList<Integer> res = new ArrayList<>();
        while(left <= right){
            if(left != right){
                  res.add(arr[right--]);
                  res.add(arr[left++]);
            }
            else{
                res.add(arr[left++]);
            }
        }
        return res;       
    }
}