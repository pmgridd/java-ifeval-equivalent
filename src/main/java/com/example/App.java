package com.example;

public class App {

    public static void main(String[] args) {
        System.out.println("Starting Java equivalent of IFEVAL.CBL");
        System.out.println("---------------------------------------");

        example1();
        example2();
        example3();
        example4();
        example5();
        example6();
        example7();

        System.out.println("---------------------------------------");
        System.out.println("Processing complete.");
    }

    /**
     * Example 1: IF statement, 2 alphanumeric items.
     */
    public static void example1() {
        System.out.println("\n--- Example 1: Comparing two alphanumeric items ---");
        String alpha1 = "cucumber";
        String alpha2 = "radish";
        String resultOfCompare;

        // Compare two alphanumeric items
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
        System.out.println("'" + alpha1 + "' and '" + alpha2 + "' are " + resultOfCompare);

        alpha2 = "cucumber";
        if (alpha1.equals(alpha2)) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
        System.out.println("'" + alpha1 + "' and '" + alpha2 + "' are " + resultOfCompare);
    }

    /**
     * Example 2: IF statement, alphanumeric field vs literal.
     */
    public static void example2() {
        System.out.println("\n--- Example 2: Comparing alphanumeric field vs literal ---");
        String alpha1 = "foobar";
        String resultOfCompare;

        if (alpha1.equals("foobar")) {
            resultOfCompare = "equal";
        } else {
            resultOfCompare = "different";
        }
        System.out.println("'" + alpha1 + "' and 'foobar' are " + resultOfCompare);
    }

    /**
     * Example 3: Verify a numeric item contains numeric data.
     */
    public static void example3() {
        System.out.println("\n--- Example 3: Verifying numeric data ---");
        String numericInput = "garbage";
        long numeric2;

        try {
            numeric2 = Long.parseLong(numericInput);
            numeric2++;
        } catch (NumberFormatException e) {
            System.out.println("'" + numericInput + "' is not numeric. Initializing to 1.");
            numeric2 = 1L;
        }
        System.out.println("Value of numeric2: " + numeric2);

        numericInput = "123";
         try {
            numeric2 = Long.parseLong(numericInput);
            numeric2++;
             System.out.println("'" + numericInput + "' is numeric. Incremented value: " + numeric2);
        } catch (NumberFormatException e) {
            // This part will not be executed for "123"
        }
    }

    /**
     * Example 4: Verify a numeric item is greater than zero.
     */
    public static void example4() {
        System.out.println("\n--- Example 4: Verifying a numeric item is greater than zero ---");
        int numeric1 = 0;
        int numeric2 = 100;

        if (numeric1 > 0) {
            numeric2 = numeric2 / numeric1;
        } else {
            System.out.println("numeric1 is not greater than zero. Avoiding division by zero.");
            numeric2 = numeric2 - 1;
        }
        System.out.println("Result of numeric2: " + numeric2);
    }

    /**
     * Example 5: IF statement, two numeric fields.
     */
    public static void example5() {
        System.out.println("\n--- Example 5: Comparing two numeric fields ---");
        int numeric1 = 7;
        long numeric2 = 36;
        String resultOfCompare;

        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else {
            resultOfCompare = "numeric-2";
        }
        System.out.println("Between " + numeric1 + " and " + numeric2 + ", the greater is: " + resultOfCompare);
    }

    /**
     * Example 6: EVALUATE statement.
     */
    public static void example6() {
        System.out.println("\n--- Example 6: EVALUATE statement (like switch/if-else-if) ---");
        int numeric1 = 8;
        long numeric2 = 13;
        String resultOfCompare;

        if (numeric1 > numeric2) {
            resultOfCompare = "numeric-1";
        } else if (numeric1 < numeric2) {
            resultOfCompare = "numeric-2";
        } else {
            resultOfCompare = "equal";
        }
        System.out.println("Evaluation of " + numeric1 + " and " + numeric2 + ": " + resultOfCompare);
    }

    /**
     * Example 7: EVALUATE statement, two conditions.
     */
    public static void example7() {
        System.out.println("\n--- Example 7: EVALUATE statement with two conditions ---");
        int numeric1 = 8;
        long numeric2 = 13;
        String alpha1 = "THX-1138";
        String alpha2 = "Terminator";
        String resultOfCompare;

        if (numeric1 > numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-1";
        } else if (numeric1 < numeric2 && alpha1.substring(0, 3).equals("THX")) {
            resultOfCompare = "THX and numeric-2";
        } else if (numeric1 == numeric1 && alpha2.equals("Terminator")) { // This condition is always true in the COBOL example
            resultOfCompare = "Terminator and equal numbers";
        } else {
            resultOfCompare = "undefined";
        }
        System.out.println("Result of complex evaluation: " + resultOfCompare);
    }
}
