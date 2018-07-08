package com.sochnev.lessons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class longestPair {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> list = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numberOfPair = 0;
        int maxcount = 0;
        for(int i = 0; i < 10; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < list.size()-1; i++) {
            if (!list.get(i).equals(list.get(i+1))) maxcount = 0;
            if (list.get(i).equals(list.get(i+1))) {
                maxcount++;
            }
            if (maxcount > numberOfPair)
                numberOfPair = maxcount;

        }

        System.out.println(numberOfPair +1);

    }









}
