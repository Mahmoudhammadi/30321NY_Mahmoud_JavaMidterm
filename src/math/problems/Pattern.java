package math.problems;

public class Pattern {

    public static void main(String[] args) {
        /*
        Read the numbers below, find the pattern, then implement the logic from this pattern.
            Once done, you should test to see if you get the same output as below:

        100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32...

        */
        for (int i = 100; i >= 1; i--) {
            if (i >= 90) {
                System.out.print(i + ",");
            } else {
                if ((i >= 70) && (i <= 80)) {
                    for (i = 90; i >= 70; i -= 2) {
                        System.out.print(i + ",");
                    }
                    if ((i >= 30) && (i < 70)) {
                        for (i = 70; i > 40; i -= 3) {
                            System.out.print(i + ",");

                        }
                        if ((i >= 1) && (i <= 40)) {
                            for (i = 40; i >= 1; i -= 4)
                                System.out.print(i + ",");
                        }
                    }
                }

            }
        }
    }
}
