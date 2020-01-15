import java.util.*;


public class MasterMind {

    public int[][] codeBoard = new int[10][4];
    public int[][] hintBoard =  new int[10][4];
    public int[] secretCode = new int[4];
    public int[] tryCode = new int[4];
    public int currentRound;

    
    public void generateCode() {
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            secretCode[i] = rand.nextInt(8) + 1;    
        }
    }

    public void createBoard() {
        currentRound = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) 
            {
                codeBoard[i][j] = 0;        //0 - puste pole; 1 - 8 cyfry odpowiadające kolorkom
                hintBoard[i][j] = 0;    //0 - brak bolca; 1 - biały bolec; 2 - czerwony bolec
            }
        }
    }

    public void enterCode() {
        for (int i = 0; i < 5; i++) {
            tryCode[i] = in.nextInt();
            codeBoard[currentRound][i] = tryCode[i];
        }
    }

    public void checkCode() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (secretCode[i] == tryCode[j]) {
                    if (i == j)
                        hintBoard[currentRound][i] = 2;
                    else
                        hintBoard[currentRound][i] = 1;
                }
            }
        }
        Arrays.sort(hintBoard);
    }

    public void printBoard() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 4; j++)
            {
                System.out.printf("------------------------------------\n");
                System.out.printf("| %d ", hintBoard[i][j]);
                if (j == 1)
                    System.out.println();
            }
            System.out.print("| Code:| ");
            for  (int k = 0; k < 5; k++) {
                System.out.printf("%d | ", codeBoard[i][k]);
            }
        }
        currentRound++;
    }

    
}
