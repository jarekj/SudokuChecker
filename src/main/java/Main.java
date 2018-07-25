// program checks if Sudoku board is correct

public class Main {
    public static void main(String[] args) {

        System.out.println(FR.readFromFile("input2.txt"));
        System.out.println("------------");
        System.out.println(isSudokuBoardCorrect("input2.txt"));

    }

    private static boolean isSudokuBoardCorrect(String fileInput){
        String[] inputInArray = FR.readFromFile(fileInput).split("\n");
        for (int i = 0; i < 9; i++) {
            if(isArrayCorrectChar(readSquere(inputInArray, i)) &&
            isArrayCorrectChar(readColumn(inputInArray, i)) &&
            isArrayCorrectChar(readRow(inputInArray, i))) return true;
        } return false;
    }

    private static char[] readSquere(String[] input, int square){
        char[] output = new char[9];
        int startX, startY;
        switch (square+1){
            case 1:
                startX = 0;
                startY = 0;
                break;
            case 2:
                startX = 3;
                startY = 0;
                break;
            case 3:
                startX = 6;
                startY = 0;
                break;
            case 4:
                startX = 0;
                startY = 3;
                break;
            case 5:
                startX = 3;
                startY = 3;
                break;
            case 6:
                startX = 6;
                startY = 3;
                break;
            case 7:
                startX = 0;
                startY = 6;
                break;
            case 8:
                startX = 3;
                startY = 6;
                break;
            case 9:
                startX = 6;
                startY = 6;
                break;
            default:
                startX = 0;
                startY = 0;
        }
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

    private static char[] readColumn(String[] input, int column){
        char[] output = new char[9];
        for (int i = 0; i < 9; i++) {
            output[i] = input[i].charAt(column);
        }
        return output;
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



