package codingGames;

import java.util.ArrayList;
import java.util.List;

public class MainSec {

    public static void main(String args[]) {
        int arrayA[] = {2, 0, 5, 1, 6, 8};  // 3
        int arrayB[] = {1, 3, 6, 4, 1, 2};  // 5
        int arrayC[] = {-1, -3};            // 1
        int arrayD[] = {1, 2, 3};           // 4
        Solutionn solution = new Solutionn();
        int res = solution.solution(arrayA);
        int resB = solution.solution(arrayB);
        int resC = solution.solution(arrayC);
        int resD = solution.solution(arrayD);
        System.out.println(res);
        System.out.println(resB);
        System.out.println(resC);
        System.out.println(resD);
    }
}

class Solutionn {
    public int solution(int[] A) {
        int wynik = 1;
        List<Integer> listaInt = new ArrayList<>();

        for (int i : A) {
            listaInt.add(i);
        }

        for (int i = 1; i < 1000; i++) {
            if (!listaInt.contains(i)) {
                wynik = i;
                break;
            }
        }
        return wynik;
    }
}





/*

Write a function:

    class Solution { public int solution(int[] A); }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
Given A = [1, 2, 3], the function should return 4.
Given A = [−1, −3], the function should return 1.
Assume that:
        N is an integer within the range [1..100,000];
        each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

        expected worst-case time complexity is O(N);
        expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
 */