class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set=new ArrayList<>();
        backtracking(nums,0,set,new ArrayList<>());
        return set;
    }
    public void backtracking(int[] nums,int ind,List<List<Integer>> set,List<Integer> set1){
        set.add(new ArrayList<>(set1));

        for(int i=ind;i<nums.length;i++){

            set1.add(nums[i]);
            backtracking(nums,i+1,set,set1);
            set1.remove(set1.size()-1);
        }
    }
}
