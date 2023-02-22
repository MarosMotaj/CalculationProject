package sk.maros.calculation;

import java.math.BigInteger;

/**
 * This class includes two methods used to multiply large numbers.
 */
public class Calculation {

    /**
     * This method is used to multiply large numbers using BigInteger class.
     * @param firstNum This is the first parameter to multiplyBigInt method.
     * @param secondNum This is the second parameter to multiplyBigInt method.
     * @return BigInteger This returns multiply of firstNum and secondNum.
     */
    public BigInteger multiplyBigInt(String firstNum, String secondNum) {
        BigInteger first = new BigInteger(firstNum);
        BigInteger second = new BigInteger(secondNum);

        return first.multiply(second);
    }

    /**
     * This method is used to multiply large numbers using algorithm from scratch.
     * @param firstNum This is the first parameter to scratchMultiply method.
     * @param secondNum This is the second parameter to scratchMultiply method.
     * @return BigInteger This returns multiply of firstNum and secondNum.
     *                    If firstNum and secondNum is entered as 0, method returns 0.
     */
    public BigInteger scratchMultiply(String firstNum, String secondNum) {
        int firstLength = firstNum.length();
        int secondLength = secondNum.length();
        int[] result = new int[firstLength + secondLength];
        StringBuilder sb = new StringBuilder();

        for (int i = firstLength - 1; i >= 0; i--) {
            for (int j = secondLength - 1; j >= 0; j--) {
                int multiply = (firstNum.charAt(i) - '0') * (secondNum.charAt(j) - '0');
                int index1 = i + j;
                int index2 = i + j + 1;
                int sum = multiply + result[index2];
                result[index1] += sum / 10;
                result[index2] = sum % 10;
            }
        }

        for (int element : result) {
            if (!(sb.length() == 0 && element == 0)) sb.append(element);
        }

        return !sb.toString().equals("") ? new BigInteger(sb.toString()) : new BigInteger("0");
    }
}




