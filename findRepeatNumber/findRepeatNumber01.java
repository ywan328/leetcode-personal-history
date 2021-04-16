package com.algorithm;

import java.util.HashSet;

class Solution {
    public int findRepeatNumber(int[] nums){
        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            //发现某个元素,返回
            if(set.contains(x)){
                return x;
            }
            //存入
            set.add(x);
        }
        return -1;
    }
}

