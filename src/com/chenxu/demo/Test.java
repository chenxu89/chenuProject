package com.chenxu.demo;

import java.util.ArrayList;
import java.util.List;

import static net.mindview.util.Print.*;

/**
 * Created by chenxu on 16/11/13.
 */
public class Test {
    public static void main(String[] args) {
        int[] a = {1,1};
        int[] b = {1,2};
        double d = findMedianSortedArrays(a,b);
        System.out.print(d);
    }

    public static double findMedianSortedArrays(int[] a, int[] b) {
        List<Integer> arr = new ArrayList();
        int n = a.length;
        int m = b.length;
        for(int i=0,j=0,k=0; k<n+m; k++){
            if(i >= n) {
                arr.add(b[j]);
                j++;
            }else if(j >= m){
                arr.add(a[i]);
                i++;
            }else {
                if(a[i] <= b[j]){
                    arr.add(a[i]);
                    i++;
                }else {
                    arr.add(b[j]);
                    j++;
                }
            }
        }
        int len = arr.size();
        if(len % 2 == 1){
            int mid = (len -1) / 2;
            return arr.get(mid) * 1.0;
        }else{
            int mid1 = len / 2;
            int mid2 = mid1 - 1;
            return (arr.get(mid1) + arr.get(mid2))/2.0;
        }
    }
}

