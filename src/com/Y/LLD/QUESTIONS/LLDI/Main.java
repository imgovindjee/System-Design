package com.Y.LLD.QUESTIONS.LLDI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public int minTransfer(int[][] transactions) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int[] txn:transactions) {
            int from = txn[0];
            int to = txn[1];
            int amount = txn[2];

            map.put(from, map.getOrDefault(from, 0) - amount);
            map.put(to, map.getOrDefault(to, 0) + amount);
        }

        List<Integer> balanceList = new ArrayList<>();
        for(int val:map.values()) {
            if(val != 0){
                balanceList.add(val);
            }
        }
        return solveDFS(balanceList, 0);
    }

    public int solveDFS(List<Integer> balanceList, int idx) {
//        edge case
        if(balanceList.size() == 0 || idx >= balanceList.size()) {
            return 0;
        }

//        solve it
        if(balanceList.get(idx) == 0) {
            return solveDFS(balanceList, idx + 1);
        }

        int currentValue = balanceList.get(idx);
        int minTxnCount = Integer.MAX_VALUE;
        for(int i=idx+1; i<balanceList.size(); i++){
            int nextVal = balanceList.get(i);
            if(currentValue*nextVal < 0) {
                balanceList.set(i, currentValue + nextVal);
                minTxnCount = Math.min(minTxnCount, 1 + solveDFS(balanceList, idx + 1));
                balanceList.set(i, nextVal);

                if(currentValue * nextVal == 0) {
                    break;
                }
            }
        }
        return minTxnCount;
    }

//    DRIVE CODE
    public static void main(String[] args){
        int[][] arr = new int[5][3];
        for(int i=0; i<5; i++){
            int from = i+1;
            int to = i+2;
            int weight = i*10+i;
            arr[i][0] = from;
            arr[i][1] = to;
            arr[i][2] = weight;
        }

        Main main = new Main();
        System.out.println(main.minTransfer(arr));
    }
}
