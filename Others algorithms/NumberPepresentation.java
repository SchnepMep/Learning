public class NumberPepresentation {

    public static void main(String[] args) {
        System.out.println(add(210, 11, 2));
        System.out.println(add(773, 0, 8));
    }

    /**
     * Adds two numbers if they are in the same number system.
     * 
     * @param value  First value to add
     * @param value1 Second value to add
     * @param basis  The basis from the values
     * @return The new value
     */

    public static long add(long value, long value1, int basis) {
        return (hasSameBasis(value, basis) & hasSameBasis(value1, basis))
                ? getValueToBasis(getValueFromBasis(value, basis) + getValueFromBasis(value1, basis), basis)
                : -1;
    }

    /**
     * Transforms a value from a number system into the dezimal system
     * 
     * @param value The value to transform
     * @param basis The basis from the value
     * @return The transformed value
     */

    public static long getValueFromBasis(long value, int basis) {
        return value < basis
                ? value
                : basis * getValueFromBasis(value / 10, basis) + value % 10;
    }

    /**
     * Transform a value into a another number representation.
     * 
     * @param value The value to transform
     * @param basis The number system
     * @return The transformed value
     */

    public static long getValueToBasis(long value, int basis) {
        return value < basis
                ? value
                : getValueToBasis(value / basis, basis) * 10 + value % basis;
    }

    /**
     * Check if the value is in the same number representation.
     * 
     * @param value The value to check
     * @param basis The number representation
     * @return True if the value is in the representation otherwise false
     */

    public static boolean hasSameBasis(long value, int basis) {
        return value < 10
                ? value < basis
                : value % 10 < basis && hasSameBasis(value / 10, basis);
    }

}
