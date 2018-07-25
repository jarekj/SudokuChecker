import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//
//        String[] input1 = "123456789".split("");
//        String[] input2 = "000402203".split("");
//        String[] input3 = "600000200".split("");
//        System.out.println(isArrayCorrectString(input1));
//        System.out.println(isArrayCorrectString(input2));
//        System.out.println(isArrayCorrectString(input3));

        System.out.println(FR.readFromFile("input4.txt"));
        String[] inputInArray = FR.readFromFile("input4.txt").split("\n");
        System.out.println("------------");
        System.out.println(readSquere(inputInArray, 1));


    }

    private static char[] readSquere(String[] input, int sq){
        char[] output = new char[9];
        int startX, startY;
        startX = 3;
        startY = 0;
        for (int i = 0; i < 3; i++) {
            output[i] = input[startY].charAt(startX+i);
            output[i+3] = input[startY+1].charAt(startX+i);
            output[i+6] = input[startY+2].charAt(startX+i);
        }
        return output;
    }
    
    private static char[] readRow(String[] input, int row) {
        return input[row].toCharArray();
    }
    
    
    private static char[] readCollumn(String[] input, int collumn){
        char[] output = new char[9];
        for (int i = 0; i < 9; i++) {
            output[i] = input[i].charAt(collumn);
        }
        return output;
    }

    private static boolean isArrayCorrectString(String[] input) {
        for (int i = 0; i < 9; i++) {
            String firstNumber = input[i];
            if (!firstNumber.equals("0")) {
                for (int j = i + 1; j < 9; j++) {
                    String nextNumber = input[j];
                    if (!nextNumber.equals("0")) {
                        if (firstNumber.equals(nextNumber)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private static boolean isArrayCorrectChar(char[] input) {
        for (int i = 0; i < 9; i++) {
            char firstNumber = input[i];
            if (firstNumber != '0') {
                for (int j = i + 1; j < 9; j++) {
                    char nextNumber = input[j];
                    if (nextNumber != '0') {
                        if (firstNumber == nextNumber) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

}



