//package com.example.gitubaction.controller;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class Test {
//    public static void main(String[] args) {
//        List<Integer> nums= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//
//        //Filter even and odd numbers from a given list
//        Map<Boolean, List<Integer>> response = nums.stream()
//                .collect(Collectors.partitioningBy(n -> n%2 == 0));
//        System.out.println(response);
//        System.out.println("Even:"+response.get(true));
//        System.out.println("Odd:"+response.get(false));
//    }
//}
