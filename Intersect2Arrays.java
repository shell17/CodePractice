package com.PracticeAgain;

import java.util.*;

public class Intersect2Arrays {

        public int[] intersection(int[] nums1, int[] nums2) {
            //find common nums
            ///approaches -use hashset - or sort arraya and then compare - or do bin search


            Set<Integer> set1 = new HashSet<>();
            Set<Integer> intersect = new HashSet<>();
            for(int i=0;i<nums1.length; i++){
                set1.add(nums1[i]);
            }

            for(int i: nums2){
                if(set1.contains(i)){
                    intersect.add(i);
                }
            }

            int[] res = new int[intersect.size()];
            int k=0;

            int i=0;
            for(Integer num : intersect){
                res[i++] = num;
            }

            return res;


        }
    }
