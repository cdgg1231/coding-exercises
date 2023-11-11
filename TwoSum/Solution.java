package TwoSum;

import java.util.HashMap;

class Solution {
  public int[] TwoSum(int[] num, int target){
    HashMap <Integer, Integer> map = new HashMap<>();
    for(int i=0; i< num.length; i++){
        int comploment = target - num[i];

        if(map.containsKey(comploment)){
            return new int[]{map.get(comploment), i};  //anonymous array
        }
        map.put(num[i],i);
      }
            throw new IllegalArgumentException("No two sum solution");
    
  }

  public static void main (String[] args){
   int[]nums = {2,11,7,15};
   int target = 9;

   Solution test = new Solution();
   int [] result = test.TwoSum (nums, target);

   System.out.println("The two indices whose sum is "+target+" are "+result[0]+" and "+result[1]);



  }
}