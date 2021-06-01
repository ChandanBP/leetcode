package leetcode;

import java.rmi.dgc.VMID;
import java.util.Arrays;

public class _875KokoBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int total = 0;
        for(int i=0;i<piles.length;i++){
            min = Math.min(min,piles[i]);
            max = Math.max(max,piles[i]);
            total+=piles[i];
        }

        if(min==max)return min;

        int start = min;
        int end = max;
        int mid = 0;
        while(start<=end){
            mid = (start+end)/2;
            if(mid*h==total)return mid;
            else if((mid*h)<total){
                start = mid+1;
            }else if((mid*h)>total){
                end = mid-1;
            }
        }

        return mid;
    }

    public static void main(String[] args) {
        System.out.println(new _875KokoBananas().minEatingSpeed(new int[]{30,11,23,4,20},5));
    }
}
