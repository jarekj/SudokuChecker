import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//
//        String[] input1 = "123456789".split("");
//        String[] input2 = "000402203".split("");
//        String[] input3 = "600000200".split("");
//        System.out.println(isArrayCorrect(input1));
//        System.out.println(isArrayCorrect(input2));
//        System.out.println(isArrayCorrect(input3));
//        System.out.println(FR.readFromFile("input1.txt"));
//        String[] inputInArray = FR.readFromFile("input1.txt").split("\n");
//        System.out.println("------------");
//
//        for (int i = 0; i < inputInArray.length; i++) {
//            System.out.println(inputInArray[i]);
//        }

        String input55 = "006000200";
        char[] inputChar = input55.toCharArray();
        System.out.println(isArrayCorrectChar(inputChar));


    }


    private static String readRow(String input, int column) {

        return "";
    }

    private static boolean isArrayCorrect(String[] input){
        for (int i = 0; i < 9; i++) {
            String firstNumber = input[i];
            if (!firstNumber.equals("0")) {
                for (int j = i + 1; j < 9; j++) {
                    String nextNumber = input[j];
                    if(!nextNumber.equals("0")){
                        if (firstNumber.equals(nextNumber)) {
                            return false;
                        }

                    }
                }
            }
        }
        return true;
    }

    private static boolean isArrayCorrectChar(char[] input){
        for (int i = 0; i < 9; i++) {
            char firstNumber = input[i];
            if (firstNumber != '0') {
                for (int j = i + 1; j < 9; j++) {
                    char nextNumber = input[j];
                    if(nextNumber != '0'){
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



