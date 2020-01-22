package app;
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
            this.secretCode[i] = rand.nextInt(8) + 1;    
        }
    }

    public void createBoard() {
        this.currentRound = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) 
            {
                this.codeBoard[i][j] = 0;        //0 - puste pole; 1 - 8 cyfry odpowiadające kolorkom
                this.hintBoard[i][j] = 0;    //0 - brak bolca; 1 - biały bolec; 2 - czerwony bolec
            }
        }
    }

    public void enterCode() {
        for (int i = 0; i < 5; i++) {
            //tryCode[i] = in.nextInt();
            this.codeBoard[this.currentRound][i] = tryCode[i];
        }
    }

    public void checkCode() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (this.secretCode[i] == this.tryCode[j]) {
                    if (i == j)
                        this.hintBoard[this.currentRound][i] = 2;
                    else
                        this.hintBoard[this.currentRound][i] = 1;
                }
            }
        }
        Arrays.sort(this.hintBoard);
    }

    public void printBoard() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 4; j++)
            {
                System.out.printf("------------------------------------\n");
                System.out.printf("| %d ", this.hintBoard[i][j]);
                if (j == 1)
                    System.out.println();
            }
            System.out.print("| Code:| ");
            for  (int k = 0; k < 5; k++) {
                System.out.printf("%d | ", this.codeBoard[i][k]);
            }
        }
        this.currentRound++;
    }

    
}
