package sk.maros.calculation;

/**
 * This is a Main class of Calculation application.
 * The application multiply two large integers.
 * Integers are entered as command line arguments.
 * cmd: <implementation> <first number> <second number>
 *
 * @author Maros Docekal
 * @version 1.0
 * @since 2023-02-21
 */
public class Main {

    /**
     * This is a main method which makes use of multiply methods.
     * @param args args[0] Enter bigint to multiply using BigInteger class or scratch to use algorithm from scratch method.
     *             args[1] First number
     *             args[2] Second number
     */
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Enter to command line <bigint or scratch> <first number> <second number>");
            return;
        }
        Calculation calculation = new Calculation();
        String implType = args[0];
        String firstNum = args[1];
        String secondNum = args[2];

        if (implType.equals("bigint")) {
            System.out.println(calculation.multiplyBigInt(firstNum, secondNum));
        } else if (implType.equals("scratch")) {
            System.out.println(calculation.scratchMultiply(firstNum, secondNum));
        } else {
            System.out.println("Enter valid implementation type: bigint or scratch");
        }
    }
}
