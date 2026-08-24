class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        combination(nums,target,0,new ArrayList<>(),result);
        return result;
    }
    private void combination(int[] nums,int target,int index,List<Integer> current,List<List<Integer>> result){
        //Base Case
        if(target==0){
            result.add(new ArrayList<>(current));
            return;
        }
        if(index==nums.length){
            return;
        }
        //take
        if(nums[index]<=target){
        current.add(nums[index]);
        combination(nums,target-nums[index],index,current,result);
        current.remove(current.size()-1);
        }
        //dont take
        combination(nums,target,index+1,current,result);
    }
}
