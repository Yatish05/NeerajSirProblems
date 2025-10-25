class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer>current = new ArrayList<>();
        List<List<Integer>>ans = new ArrayList<>();
        
          findcomb(0,candidates,target,current,ans);
          return ans;
    }
    public void findcomb(int index,int [] arr,int target,List<Integer>current,List<List<Integer>>ans){
        if (target==0){
            ans.add(new ArrayList<>(current));
            return;
        }
        if(index==arr.length || target<0){
            return;
        }
        if(arr[index]<=target){
            current.add(arr[index]);
            findcomb(index,arr,target-arr[index],current,ans);

            current.remove(current.size()-1);
        }
        findcomb(index+1,arr,target,current,ans);
    }
}