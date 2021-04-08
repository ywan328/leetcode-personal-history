package com.algorithm;

public class movezeros01 {
    public static void main(String[] args){
        //给定一个数组 nums,编写一个函数将所有0移动到数组的末尾,同时保持非零元素的相对顺序
        //输入:[0,1,0,3,12]
        //输出:[1,3,12,0,0]
        //双指针操作 i:遍历 j:记录0元素的位置
        int[] nums={1,0,3,4,0,5,0,0,2};
        int j=0;
        for (int i=0; i<nums.length;i++){
            if(nums[i]!= 0){
                //如果i和j相等,那么i和j重复赋值了,需要做一下优化
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
        }
    }
}
