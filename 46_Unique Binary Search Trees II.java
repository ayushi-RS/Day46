class Solution {
    public List<TreeNode> generateTrees(int n) {
            return helper(1,n);
    }
    public List<TreeNode> helper(int left,int right){
        List<TreeNode>ans=new ArrayList<>();
        if(left>right){
            ans.add(null);
            return ans;
        }
        if(left==right){
            ans.add(new TreeNode(left));
            return ans;
        }
        for(int i=left;i<=right;i++){
            List<TreeNode>lft=helper(left,i-1);
            List<TreeNode>rgt=helper(i+1,right);
            
            for(TreeNode l:lft){
                for(TreeNode r:rgt){
                    ans.add(new TreeNode(i,l,r));
                }
            }
        }
        return ans;
    }
}