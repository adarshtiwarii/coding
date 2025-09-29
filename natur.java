package coding;

import java.util.ArrayList;

class natur {
	// Add class members or methods here if needed
    static ArrayList<Integer>getSum(int n){

    int evenCount = n / 2; // number even terms
    int oddCount = (n + 1) / 2; // number odd terms
    // formaula based sums
    int sum_even=evenCount*(evenCount+1);
    int sum_odd=oddCount*oddCount;

    ArrayList<Integer> result = new ArrayList<>();
    result.add(sum_even);
    result.add(sum_odd);
    return result;
    }
    public static void main(String[] args) {
        int n=9;
        ArrayList<Integer>ans=getSum(n);

        System.out.println("Sum of even numbers up to "+n+"="+ans);
        System.out.println("Sum of odd numbers up to "+n+"="+ans);
        System.out.println("Result in ArrayList from "+ans);


    }

}

class Solution {
    static ArrayList<Integer> getSum(int N) {
        int sum_even = 0, sum_odd = 0;  
        int counter = 1;  

        // loop from 1 to N
        while (counter <= N) {  
            if ((counter % 2) == 0) {   // even
                sum_even += counter;  
            } else {                    // odd
                sum_odd += counter;  
            }
            counter++;  
        }

        // store results in ArrayList
        ArrayList<Integer> ans = new ArrayList<>();  
        ans.add(sum_even);  
        ans.add(sum_odd);  
        return ans;  
    }

    // main method to test
    public static void main(String[] args) {
        int N = 6;  // you can change this number
        ArrayList<Integer> result = getSum(N);

        System.out.println("Sum of even numbers up to " + N + " = " + result.get(0));
        System.out.println("Sum of odd numbers up to " + N + " = " + result.get(1));
        System.out.println("Result in ArrayList form = " + result);
    }
}
