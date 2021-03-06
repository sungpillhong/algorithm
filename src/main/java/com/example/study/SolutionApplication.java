package com.example.study;

import com.example.study.week10.LeetCode_closest;
import com.example.study.week10.LeetCode_subArray;
import com.example.study.week11.LeetCode_graycode;
import com.example.study.week11.LeetCode_interleaving;
import com.example.study.week12.BaekJoon_ATM;
import com.example.study.week13.Hacker_prisoner;
import com.example.study.week14.Programmers_printer;
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
        int[] priorities = {1, 1, 9, 1, 1, 1};
        int locations = 0;

        Programmers_printer programmers_printer = new Programmers_printer();
        System.out.println(programmers_printer.solution(priorities,locations));

    }
}
