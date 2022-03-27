package calc;

/**
 * Created by gorchakov on 10.10.2018.
 */
public class Calculator {

    /**
     *
     * @param inputA the string to be parsed
     * @param inputB the string to be parsed
     * @return devision of inputA and inputB values
     * @throws NumberFormatException if inputA or inputB does not contain a parsable
     */
    public double division(String inputA, String inputB) {
        return Double.parseDouble(inputA) / Double.parseDouble(inputB);
    }

    /**
     *
     * @param inputA the string to be parsed
     * @param inputB the string to be parsed
     * @return sum of inputA and inputB values
     * @throws NumberFormatException if inputA or inputB does not contain a parsable
     */
    public double sum(String inputA, String inputB) {
        return Double.parseDouble(inputA) + Double.parseDouble(inputB);
    }

    /**
     *
     * @param inputA the string to be parsed
     * @param inputB the string to be parsed
     * @return difference of inputA and inputB values
     * @throws NumberFormatException if inputA or inputB does not contain a parsable
     */
    public double difference(String inputA, String inputB) {
        return Double.parseDouble(inputA) - Double.parseDouble(inputB);
    }

    /**
     *
     * @param inputA the string to be parsed
     * @param inputB the string to be parsed
     * @return multiplication of inputA and inputB values
     * @throws NumberFormatException if inputA or inputB does not contain a parsable
     */
    public double multiplication(String inputA, String inputB) {
        return Double.parseDouble(inputA) * Double.parseDouble(inputB);
    }

}
