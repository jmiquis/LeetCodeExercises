package com.example.leetcodeexercises.solutions.medium;

/*
https://leetcode.com/problems/container-with-most-water/
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints
of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
*/

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {

       int left    = 0;
       int right   = height.length-1;
       int maxArea = 0;
       while (left<right){

           int distance  = (left==0)? right : right-left;
           int area      = 0;

           int shorterSide = (height[left]<=height[right]) ?  height[left]:height[right];

           area = distance*shorterSide;
           if(area>maxArea) maxArea=area;

           if(shorterSide==height[left]){
               left++;
           }
           else {
               right--;
           }
       }

        return maxArea;
    }
}
