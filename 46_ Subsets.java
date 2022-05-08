class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> currList = new ArrayList<Integer>();
        
        findSubsets(res, currList, nums, -1);
            
        return res;
    }
    
    public void findSubsets(List<List<Integer>> res, List<Integer> currList, int[] nums, int index){
        res.add(new ArrayList(currList));
        
        for(int i = index + 1; i < nums.length; i++){
            int nextIndex = currList.size();
                
            currList.add(nextIndex, nums[i]);
            findSubsets(res, currList, nums, i);
            currList.remove(nextIndex);
            
        }
    }
}