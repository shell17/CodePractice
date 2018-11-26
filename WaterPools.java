package com.practice;

// Water Pools
// You are given an array of n non-negative integers, where each number
// represents an elevation.
// Each point of elevation has a width of 1.
// For example, given an array [5, 2, 4, 3, 1, 4], the elevation map would
// look something like this:
//  ___
// |   |    ___         ___
// |   |   |   |___    |   |
// |   |___|       |   |   |
// |               |___|   |
// | 5   2   4   3   1   4 |

// Our goal is to compute how much water is pooled in our elevation map if it rained.
// Referring to the above example, it would look like this if it rained:
//  ___
// |   |,,, ___ ,,,,,,, ___
// |   |///|   |///////|   |
// |   |///|       |///|   |
// |               |///|   |
// | 5   2   4   3   1   4 |

// For an input of [5, 2, 4, 3, 1, 4], the total sum of pooled water is 6 units.

// Write a function that takes in an array of heights and returns the total amount of pooled water



// Test Cases:

//  ___
// |   |,,, ___ ,,,,,,, ___
// |   |///|   |///////|   |
// |   |///|       |///|   |
// |               |///|   |
// | 5   2   4   3   1   4 |

// [5,2,4,3,1,4]
// Result = 6

//  ___ ,,, ___
// |   |///|   |,,,,,,, ___
// |   |///|   |///////|   |
// |   |///|       |///|   |
// |               |///|   |
// | 5   2   5   3   1   4 |

// [5,2,5,3,1,4]
// Result = 7

//      ___ ,,,,,,,,,,, ___
//     |   |///////////|   |
//  ___|   |///|   |///|   |
// |               |///|   |
// | 2   4   2   3   1   4 |

// [2,4,2,3,1,4]
// Result = 6

//  ___ ,,, ___
// |   |///|   |,,, ___
// |   |///|   |///|   |___
// |   |///|   |///|       |
// |                       |
// | 5   2   5   2   4   3 |

// [5,2,5,2,4,3]
// Result = 5

//          ___
//  ___ ,,,|   |,,, ___
// |   |///|   |///|   |___
// |   |///|   |///|       |
// |                       |
// | 4   2   5   2   4   3 |

// [4,2,5,2,4,3]
// Result = 4

// 1,1,1,1,1,1,1,1,1,5,1,5

// waterPooled([5,2,4,3,1,4]) // 6
// waterPooled([5,2,5,3,1,4]) // 7
// waterPooled([2,4,2,3,1,4]) // 6
// waterPooled([5,2,5,2,4,3]) // 5
// waterPooled([4,2,5,2,4,3]) // 4

//https://www.geeksforgeeks.org/trapping-rain-water/

public class WaterPools {

    public static int totalPoolWater(int[] a){
        int left=0,right=a.length-1;
        int maxLeft =0, maxRight=0;
        int totalWater=0;
        int diff=0;

        while(left<right){
            maxLeft = Math.max(a[left],maxLeft);
            maxRight =  Math.max(a[right],maxRight);
            if(maxLeft<maxRight){
                diff = maxLeft - a[left];
                totalWater = totalWater + diff;
                left++;
            }
            else{
                diff = maxRight - a[right];
                totalWater = totalWater + diff;
                right--;
            }
        }
        System.out.println("Total water = " + totalWater);
        return totalWater;

    }

    public static void main(String[] args){
// waterPooled([5,2,4,3,1,4]) // 6
// waterPooled([5,2,5,3,1,4]) // 7
// waterPooled([2,4,2,3,1,4]) // 6
// waterPooled([5,2,5,2,4,3]) // 5
// waterPooled([4,2,5,2,4,3]) // 4

        int[] arr = {4,2,5,2,4,3};
        totalPoolWater(arr);
    }

}
