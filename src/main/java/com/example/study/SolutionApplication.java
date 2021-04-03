package com.example.study;

import com.example.study.week10.LeetCode_closest;
import com.example.study.week10.LeetCode_subArray;
import com.example.study.week4.LeetCode_maximumcoin;
import com.example.study.week4.LeetCode_removeoutermost;
import com.example.study.week5.Programmers_42747;
import com.example.study.week5.Programmers_42891;
import com.example.study.week6.Programmers_43164;
import com.example.study.week7.LeetCode_binarysearch;
import com.example.study.week7.LeetCode_subsequence;
import com.example.study.week8.LeetCode_stack;
import com.example.study.week8.Programmers_42628;
import com.example.study.week9.LeetCode_verically;
import com.example.study.week9.Programmers_12927;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ForkJoinPool;

@SpringBootApplication
public class SolutionApplication {

    public static void main(String[] args) {
        int answer = 0;
        LeetCode_closest leetCode_closest = new LeetCode_closest();
        int[] nums = {0,1,2};
        int target = 3;
        answer = leetCode_closest.threeSumClosest(nums,target);
        System.out.println(answer);


    }
}
