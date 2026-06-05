public class Main {

    public static int[] plusOne(int[] digits) {

        for(int i = digits.length - 1; i >= 0; i--) {

            int num = digits[i];
            if(num != 9) {
                digits[i] = num + 1;
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }

    public static void main(String[] args) {

        plusOne(new int[] {9,9});

    }

}