// Implement a BST and print the path from root to a searched node.

import java.util.ArrayList;
import java.util.Scanner;
class Node {
    int left;
    int data;
    int right;

    Node(int l, int d, int r) {
        left = l;
        data = d;
        right = r;
    }
}

public class BSTPathFinder {
    public static void main(String[] args) {
        int[] arr = { 23, 43, 12, 10, 66 };
        Node[] table = new Node[arr.length];
        for (int i = 0; i < table.length; i++) {
            table[i] = new Node(-1, arr[i], -1);
        }
        for (int i = 1; i < table.length; i++) {
            int cur = 0;
            while (true) {
                if (table[cur].data > table[i].data) {
                    if (table[cur].left == -1) {
                        table[cur].left = i;
                        break;
                    } else {
                        cur = table[cur].left;
                    }
                } else {
                    if (table[cur].right == -1) {
                        table[cur].right = i;
                        break;
                    } else {
                        cur = table[cur].right;
                    }
                }
            }
        }
        // for(int i=0;i<table.length;i++){
        // System.out.println(table[i].left +", "+ table[i].data +", "+ table[i].right);
        // }
        printPathToSearchNode(table);

    }
    public static void printPathToSearchNode(Node[] table) {
        System.out.println("Enter a no: ");
        int inp = new Scanner(System.in).nextInt();
        int noAt = 0;
        ArrayList<Integer> path = new ArrayList<>(); 

        for (int i = 0; i < table.length; i++) {
            if (table[i].data == inp) {
                noAt = i;
            }
        }
        while (true) {
            boolean parentFound = false;
            for (int i = 0; i < table.length; i++) {
                if (table[i].left == noAt || table[i].right == noAt) {
                    noAt = i;
                    parentFound = true;
                    path.add(table[i].data);
                    break;
                }
            }
            if(!parentFound) break;
        }
        for(int i=path.size()-1 ; i>=0 ; i--){
            System.out.println(path.get(i));
        }
    }
}
