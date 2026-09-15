import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        int n=arr.length;
        
        for(int i=0; i<n; i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        ans.add(smallest);
        ans.add(largest);
        
        return ans;
    }
}
