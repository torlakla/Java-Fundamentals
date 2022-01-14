package Exercise.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KaminoFactory_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int dnaLength = Integer.parseInt(scan.nextLine());
        int[] bestDNASequence = new int[dnaLength];
        int bestLengthInSequence = 1;
        int bestStartingIndex = dnaLength;
        int bestSum = 0;

        String input = scan.nextLine();
        while (!input.equals("Clone them!")) {
            int[] DNASequence = Arrays.stream(input.split("!+")).mapToInt(e -> Integer.parseInt(e)).toArray();
            int length = 1;
            int startIndex = 0;
            int sum = 0;

            for (int i = 0; i < DNASequence.length - 1; i++) {
                if (DNASequence[i] == 1) {
                    sum += 1;

                    if (DNASequence[i] == DNASequence[i + 1]) {
                        length++;
                    } else {
                        length = 1;
                        startIndex = i;
                    }
                    if (length > bestLengthInSequence) {
                        bestLengthInSequence = length;
                        bestStartingIndex = startIndex;
                        sum += DNASequence[DNASequence.length - 1];
                        bestSum = sum;
                        bestDNASequence = DNASequence;
                    }
                    if (length == bestLengthInSequence) {
                        if (startIndex < bestStartingIndex) {
                            bestStartingIndex = startIndex;
                            sum += DNASequence[DNASequence.length - 1];
                            bestSum = sum;
                            bestDNASequence = DNASequence;
                        }
                        if (startIndex == bestStartingIndex) {
                            if (sum > bestSum) {
                                sum += DNASequence[DNASequence.length - 1];
                                bestSum = sum;
                                bestDNASequence = DNASequence;
                            }
                        }
                    }

                }
            }


            input = scan.nextLine();
        }
        for (int i = 0; i < dnaLength; i++) {
            System.out.print(bestDNASequence[i] + " ");

        }
        System.out.println();
        System.out.printf("BestSUm=%d; BestStartIndex=%d", bestSum, bestStartingIndex);
    }
}
