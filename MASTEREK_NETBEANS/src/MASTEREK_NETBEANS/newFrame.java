
package MASTEREK_NETBEANS;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;



/**
 *
 * @author Sonia
 */
public class newFrame extends javax.swing.JDialog{

    /**
     * Creates new form newFrame
     */
    private int currentRound;
    private int[] tryCode = new int[4];                                         
    private int[] secretCode = new int[4];  
    private int[][] codeBoard = new int[10][4];                                 
    private javax.swing.JLabel hints[][] = new javax.swing.JLabel[10][4];       //tablica podpowiedzi 
    private javax.swing.JButton slotBoard[][] = new javax.swing.JButton[10][4]; //wyświetlane miejsca z żarówkami
    private javax.swing.Icon bulbIcons[] = new javax.swing.Icon[9];             
    private javax.swing.Icon hintIcons[] = new javax.swing.Icon[2];             
    private javax.swing.Icon roundIcons[] = new javax.swing.Icon[10];
    /*
                COLOURS
    --------------------------------
    red=1
    yellow=2
    purple=3
    blue=4
    cyan=5
    orange=6
    green=7
    pink=8
    --------------------------------
    */
    
    public newFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        
        try{
        File file = new File("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\background.png");
        java.awt.image.BufferedImage myImage = javax.imageio.ImageIO.read(file);
        this.setContentPane(new ImagePanel(myImage));
        }
        catch(IOException e){
             javax.swing.JOptionPane.showMessageDialog(this,"Błąd odczytu z pliku!"+e.getMessage());
        }
        
        initComponents();
        
    }
    
    public void generateHintTable(){
        this.hints[0][0] = hint1;
        this.hints[0][1] = hint2;
        this.hints[0][2] = hint3;
        this.hints[0][3] = hint4;
        this.hints[1][0] = hint5;
        this.hints[1][1] = hint6;
        this.hints[1][2] = hint7;
        this.hints[1][3] = hint8;
        this.hints[2][0] = hint9;
        this.hints[2][1] = hint10;
        this.hints[2][2] = hint11;
        this.hints[2][3] = hint12;
        this.hints[3][0] = hint13;
        this.hints[3][1] = hint14;
        this.hints[3][2] = hint15;
        this.hints[3][3] = hint16;
        this.hints[4][0] = hint17;
        this.hints[4][1] = hint18;
        this.hints[4][2] = hint19;
        this.hints[4][3] = hint20;
        this.hints[5][0] = hint21;
        this.hints[5][1] = hint22;
        this.hints[5][2] = hint23;
        this.hints[5][3] = hint24;
        this.hints[6][0] = hint25;
        this.hints[6][1] = hint26;
        this.hints[6][2] = hint27;
        this.hints[6][3] = hint28;
        this.hints[7][0] = hint29;
        this.hints[7][1] = hint30;
        this.hints[7][2] = hint31;
        this.hints[7][3] = hint32;
        this.hints[8][0] = hint33;
        this.hints[8][1] = hint34;
        this.hints[8][2] = hint35;
        this.hints[8][3] = hint36;
        this.hints[9][0] = hint37;
        this.hints[9][1] = hint38;
        this.hints[9][2] = hint39;
        this.hints[9][3] = hint40;
        
        
        
        
    }
    public void generateSlotTable(){
        this.slotBoard[0][0] = slot1;
        this.slotBoard[0][1] = slot2;
        this.slotBoard[0][2] = slot3;
        this.slotBoard[0][3] = slot4;
        this.slotBoard[1][0] = slot5;
        this.slotBoard[1][1] = slot6;
        this.slotBoard[1][2] = slot7;
        this.slotBoard[1][3] = slot8;
        this.slotBoard[2][0] = slot9;
        this.slotBoard[2][1] = slot10;
        this.slotBoard[2][2] = slot11;
        this.slotBoard[2][3] = slot12;
        this.slotBoard[3][0] = slot13;
        this.slotBoard[3][1] = slot14;
        this.slotBoard[3][2] = slot15;
        this.slotBoard[3][3] = slot16;
        this.slotBoard[4][0] = slot17;
        this.slotBoard[4][1] = slot18;
        this.slotBoard[4][2] = slot19;
        this.slotBoard[4][3] = slot20;
        this.slotBoard[5][0] = slot21;
        this.slotBoard[5][1] = slot22;
        this.slotBoard[5][2] = slot23;
        this.slotBoard[5][3] = slot24;
        this.slotBoard[6][0] = slot25;
        this.slotBoard[6][1] = slot26;
        this.slotBoard[6][2] = slot27;
        this.slotBoard[6][3] = slot28;
        this.slotBoard[7][0] = slot29;
        this.slotBoard[7][1] = slot30;
        this.slotBoard[7][2] = slot31;
        this.slotBoard[7][3] = slot32;
        this.slotBoard[8][0] = slot33;
        this.slotBoard[8][1] = slot34;
        this.slotBoard[8][2] = slot35;
        this.slotBoard[8][3] = slot36;
        this.slotBoard[9][0] = slot37;
        this.slotBoard[9][1] = slot38;
        this.slotBoard[9][2] = slot39;
        this.slotBoard[9][3] = slot40;
        
        
    }
    public void loadIcons(){
        this.bulbIcons[0] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_red.png");
        this.bulbIcons[1] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_yellow.png");
        this.bulbIcons[2] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_purple.png");
        this.bulbIcons[3] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_blue.png");
        this.bulbIcons[4] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_cyan.png");
        this.bulbIcons[5] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_orange.png");
        this.bulbIcons[6] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_green.png");
        this.bulbIcons[7] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_pink.png");
        this.bulbIcons[8] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png");
        
        this.hintIcons[0] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\very_good.png");
        this.hintIcons[1] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\good.png");
        
        this.roundIcons[0] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\1.png");
        this.roundIcons[1] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\2.png");
        this.roundIcons[2] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\3.png");
        this.roundIcons[3] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\4.png");
        this.roundIcons[4] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\5.png");
        this.roundIcons[5] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\6.png");
        this.roundIcons[6] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\7.png");
        this.roundIcons[7] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\8.png");
        this.roundIcons[8] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\9.png");
        this.roundIcons[9] = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\10.png");
        
    }
    
    public void generateCode(){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            this.secretCode[i]=rand.nextInt(8)+1;
        }
    }
    
    public void createBoard(){
        this.generateCode();
        this.currentRound=0;
        this.loadIcons();
        this.generateSlotTable();
        this.generateHintTable();
          
            
        for(int i = 0; i < 10; i++){
            for(int j=0; j < 4; j++){
                this.codeBoard[i][j] = 0;   //0 - puste pole; 1 - 8 cyfry odpowiadające kolorom
            }
        }
        
    }
    
    public void checkCode() {
    
        int green = 0;
        int yellow = 0;
        boolean[] checked = {false,false,false,false};
        for(int i = 0; i < 4; i++){
            if(this.secretCode[i] == this.tryCode[i]){                      //zliczenie zielonych
                green++;
                checked[i] = true;
            }
        }
        for(int i = 0; i < 4; i++){
            if(secretCode[i] != tryCode[i]){
                for(int j = 0; j < 4; j++){
                    if(!checked[j] && j != i && this.tryCode[i] == this.secretCode[j]){    //zliczenie żółtych
                        yellow++;
                        checked[j] = true;
                    }
                }
            }
        }
        for(int i = 0; i < green; i++){                                     //kolorowanie zielonych na początku
            this.hints[this.currentRound][i].setIcon(this.hintIcons[0]);
        }
        for(int i = green; i < green+yellow; i++){
            this.hints[this.currentRound][i].setIcon(this.hintIcons[1]);      //kolorowanie żółtych po zielonych
        }
        if(green == 4) this.winnerWinnerChickenDinner();
       
    }
    public void winnerWinnerChickenDinner() {
        
        javax.swing.ImageIcon icon = new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\winner.png");
        int bestScore=10;
        try{
            Scanner file = new Scanner(new File("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\Best_score\\bestscore.txt"));
            bestScore = Integer.parseInt(file.nextLine());
            file.close();
            PrintWriter saveScore = new PrintWriter("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\Best_score\\bestscore.txt");
            if((this.currentRound+1) < bestScore){
                saveScore.println(this.currentRound+1);
                bestScore = currentRound + 1;
            }
            else{
                saveScore.println(bestScore);
            }
            saveScore.close();
            
        }
        catch(Exception e){ 
            javax.swing.JOptionPane.showMessageDialog(this,"Błąd odczytu z pliku!"+e.getMessage());
        }
        
        javax.swing.JOptionPane.showMessageDialog(this, "CONGRATULATIONS, YOU WON!\nYour score: "+(this.currentRound+1)+"\nBest score: "+bestScore,"Victory",JOptionPane.INFORMATION_MESSAGE,icon);   
        
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 4; j++){
                this.slotBoard[i][j].setEnabled(false);
            }
        }
        this.checkButton.setEnabled(false);
        
        
        
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        colorChoice = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        slot1 = new javax.swing.JButton();
        redChoice = new javax.swing.JRadioButton();
        yellowChoice = new javax.swing.JRadioButton();
        purpleChoice = new javax.swing.JRadioButton();
        blueChoice = new javax.swing.JRadioButton();
        greenChoice = new javax.swing.JRadioButton();
        slot2 = new javax.swing.JButton();
        slot3 = new javax.swing.JButton();
        slot4 = new javax.swing.JButton();
        orangeChoice = new javax.swing.JRadioButton();
        pinkChoice = new javax.swing.JRadioButton();
        whiteChoice = new javax.swing.JRadioButton();
        checkButton = new javax.swing.JButton();
        slot5 = new javax.swing.JButton();
        slot6 = new javax.swing.JButton();
        slot7 = new javax.swing.JButton();
        slot8 = new javax.swing.JButton();
        hint1 = new javax.swing.JLabel();
        hint2 = new javax.swing.JLabel();
        hint3 = new javax.swing.JLabel();
        hint4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        slot9 = new javax.swing.JButton();
        slot10 = new javax.swing.JButton();
        slot11 = new javax.swing.JButton();
        slot12 = new javax.swing.JButton();
        slot13 = new javax.swing.JButton();
        slot14 = new javax.swing.JButton();
        slot15 = new javax.swing.JButton();
        slot16 = new javax.swing.JButton();
        slot17 = new javax.swing.JButton();
        slot18 = new javax.swing.JButton();
        slot19 = new javax.swing.JButton();
        slot20 = new javax.swing.JButton();
        slot21 = new javax.swing.JButton();
        slot22 = new javax.swing.JButton();
        slot23 = new javax.swing.JButton();
        slot24 = new javax.swing.JButton();
        slot25 = new javax.swing.JButton();
        slot26 = new javax.swing.JButton();
        slot27 = new javax.swing.JButton();
        slot28 = new javax.swing.JButton();
        slot29 = new javax.swing.JButton();
        slot30 = new javax.swing.JButton();
        slot31 = new javax.swing.JButton();
        slot32 = new javax.swing.JButton();
        slot33 = new javax.swing.JButton();
        slot34 = new javax.swing.JButton();
        slot35 = new javax.swing.JButton();
        slot36 = new javax.swing.JButton();
        slot37 = new javax.swing.JButton();
        slot38 = new javax.swing.JButton();
        slot39 = new javax.swing.JButton();
        slot40 = new javax.swing.JButton();
        hint5 = new javax.swing.JLabel();
        hint6 = new javax.swing.JLabel();
        hint7 = new javax.swing.JLabel();
        hint8 = new javax.swing.JLabel();
        hint9 = new javax.swing.JLabel();
        hint10 = new javax.swing.JLabel();
        hint11 = new javax.swing.JLabel();
        hint12 = new javax.swing.JLabel();
        hint13 = new javax.swing.JLabel();
        hint14 = new javax.swing.JLabel();
        hint15 = new javax.swing.JLabel();
        hint16 = new javax.swing.JLabel();
        hint17 = new javax.swing.JLabel();
        hint18 = new javax.swing.JLabel();
        hint19 = new javax.swing.JLabel();
        hint20 = new javax.swing.JLabel();
        hint21 = new javax.swing.JLabel();
        hint22 = new javax.swing.JLabel();
        hint23 = new javax.swing.JLabel();
        hint24 = new javax.swing.JLabel();
        hint25 = new javax.swing.JLabel();
        hint26 = new javax.swing.JLabel();
        hint27 = new javax.swing.JLabel();
        hint28 = new javax.swing.JLabel();
        hint29 = new javax.swing.JLabel();
        hint30 = new javax.swing.JLabel();
        hint31 = new javax.swing.JLabel();
        hint32 = new javax.swing.JLabel();
        hint33 = new javax.swing.JLabel();
        hint34 = new javax.swing.JLabel();
        hint35 = new javax.swing.JLabel();
        hint36 = new javax.swing.JLabel();
        hint37 = new javax.swing.JLabel();
        hint38 = new javax.swing.JLabel();
        hint39 = new javax.swing.JLabel();
        hint40 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MasterMind");
        setBackground(null);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        setLocation(new java.awt.Point(350, 50));
        setMaximumSize(new java.awt.Dimension(550, 580));
        setMinimumSize(new java.awt.Dimension(505, 580));
        setPreferredSize(new java.awt.Dimension(400, 610));
        setResizable(false);
        setSize(new java.awt.Dimension(400, 610));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        slot1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot1.setAlignmentY(0.0F);
        slot1.setBorder(null);
        slot1.setContentAreaFilled(false);
        slot1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot1.setIconTextGap(0);
        slot1.setPreferredSize(new java.awt.Dimension(42, 42));
        slot1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot1MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot1MouseReleased(evt);
            }
        });

        colorChoice.add(redChoice);
        redChoice.setToolTipText("");
        redChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        redChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\red_not_pressed.png")); // NOI18N
        redChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        redChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\red_pressed.png")); // NOI18N
        redChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redChoiceActionPerformed(evt);
            }
        });

        colorChoice.add(yellowChoice);
        yellowChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\yellow_not_pressed.png")); // NOI18N
        yellowChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        yellowChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\yellow_pressed.png")); // NOI18N

        colorChoice.add(purpleChoice);
        purpleChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purpleChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\purple_not_pressed.png")); // NOI18N
        purpleChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        purpleChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\purple_pressed.png")); // NOI18N
        purpleChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleChoiceActionPerformed(evt);
            }
        });

        colorChoice.add(blueChoice);
        blueChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blueChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\blue_not_pressed.png")); // NOI18N
        blueChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        blueChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\blue_pressed.png")); // NOI18N

        colorChoice.add(greenChoice);
        greenChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        greenChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\green_not_pressed.png")); // NOI18N
        greenChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        greenChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\green_pressed.png")); // NOI18N
        greenChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                greenChoiceActionPerformed(evt);
            }
        });

        slot2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot2.setAlignmentY(0.0F);
        slot2.setBorder(null);
        slot2.setContentAreaFilled(false);
        slot2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot2.setIconTextGap(0);
        slot2.setPreferredSize(new java.awt.Dimension(42, 42));
        slot2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot2MouseReleased(evt);
            }
        });

        slot3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot3.setAlignmentY(0.0F);
        slot3.setBorder(null);
        slot3.setContentAreaFilled(false);
        slot3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot3.setIconTextGap(0);
        slot3.setPreferredSize(new java.awt.Dimension(42, 42));
        slot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot3MouseReleased(evt);
            }
        });

        slot4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot4.setAlignmentY(0.0F);
        slot4.setBorder(null);
        slot4.setContentAreaFilled(false);
        slot4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot4.setIconTextGap(0);
        slot4.setPreferredSize(new java.awt.Dimension(42, 42));
        slot4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot4MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot4MouseReleased(evt);
            }
        });

        colorChoice.add(orangeChoice);
        orangeChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        orangeChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\orange_not_pressed.png")); // NOI18N
        orangeChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        orangeChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\orange_pressed.png")); // NOI18N

        colorChoice.add(pinkChoice);
        pinkChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinkChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\pink_not_pressed.png")); // NOI18N
        pinkChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        pinkChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\pink_pressed.png")); // NOI18N

        colorChoice.add(whiteChoice);
        whiteChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\cyan_not_pressed.png")); // NOI18N
        whiteChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        whiteChoice.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\cyan_pressed.png")); // NOI18N

        checkButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\check_not_pressed.png")); // NOI18N
        checkButton.setBorder(null);
        checkButton.setContentAreaFilled(false);
        checkButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkButton.setPressedIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\check_pressed.png")); // NOI18N
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });
        checkButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkButtonActionPerformed(evt);
            }
        });

        slot5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot5.setAlignmentY(0.0F);
        slot5.setBorder(null);
        slot5.setContentAreaFilled(false);
        slot5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot5.setIconTextGap(0);
        slot5.setPreferredSize(new java.awt.Dimension(42, 42));
        slot5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot5MouseReleased(evt);
            }
        });

        slot6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot6.setAlignmentY(0.0F);
        slot6.setBorder(null);
        slot6.setContentAreaFilled(false);
        slot6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot6.setIconTextGap(0);
        slot6.setPreferredSize(new java.awt.Dimension(42, 42));
        slot6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot6MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot6MouseReleased(evt);
            }
        });

        slot7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot7.setAlignmentY(0.0F);
        slot7.setBorder(null);
        slot7.setContentAreaFilled(false);
        slot7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot7.setIconTextGap(0);
        slot7.setPreferredSize(new java.awt.Dimension(42, 42));
        slot7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot7MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot7MouseReleased(evt);
            }
        });

        slot8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot8.setAlignmentY(0.0F);
        slot8.setBorder(null);
        slot8.setContentAreaFilled(false);
        slot8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot8.setIconTextGap(0);
        slot8.setPreferredSize(new java.awt.Dimension(42, 42));
        slot8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot8MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot8MouseReleased(evt);
            }
        });

        hint1.setForeground(new java.awt.Color(255, 255, 255));
        hint1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint1.setPreferredSize(new java.awt.Dimension(14, 25));

        hint2.setForeground(new java.awt.Color(255, 255, 255));
        hint2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint2.setPreferredSize(new java.awt.Dimension(14, 25));

        hint3.setForeground(new java.awt.Color(255, 255, 255));
        hint3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint3.setPreferredSize(new java.awt.Dimension(14, 25));

        hint4.setForeground(new java.awt.Color(255, 255, 255));
        hint4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint4.setPreferredSize(new java.awt.Dimension(14, 25));

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        slot9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot9.setAlignmentY(0.0F);
        slot9.setBorder(null);
        slot9.setContentAreaFilled(false);
        slot9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot9.setIconTextGap(0);
        slot9.setPreferredSize(new java.awt.Dimension(42, 42));
        slot9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot9MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot9MouseReleased(evt);
            }
        });

        slot10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot10.setAlignmentY(0.0F);
        slot10.setBorder(null);
        slot10.setContentAreaFilled(false);
        slot10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot10.setIconTextGap(0);
        slot10.setPreferredSize(new java.awt.Dimension(42, 42));
        slot10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot10MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot10MouseReleased(evt);
            }
        });

        slot11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot11.setAlignmentY(0.0F);
        slot11.setBorder(null);
        slot11.setContentAreaFilled(false);
        slot11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot11.setIconTextGap(0);
        slot11.setPreferredSize(new java.awt.Dimension(42, 42));
        slot11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot11MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot11MouseReleased(evt);
            }
        });

        slot12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot12.setAlignmentY(0.0F);
        slot12.setBorder(null);
        slot12.setContentAreaFilled(false);
        slot12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot12.setIconTextGap(0);
        slot12.setPreferredSize(new java.awt.Dimension(42, 42));
        slot12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot12MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot12MouseReleased(evt);
            }
        });

        slot13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot13.setAlignmentY(0.0F);
        slot13.setBorder(null);
        slot13.setContentAreaFilled(false);
        slot13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot13.setIconTextGap(0);
        slot13.setPreferredSize(new java.awt.Dimension(42, 42));
        slot13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot13MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot13MouseReleased(evt);
            }
        });

        slot14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot14.setAlignmentY(0.0F);
        slot14.setBorder(null);
        slot14.setContentAreaFilled(false);
        slot14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot14.setIconTextGap(0);
        slot14.setPreferredSize(new java.awt.Dimension(42, 42));
        slot14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot14MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot14MouseReleased(evt);
            }
        });
        slot14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot14ActionPerformed(evt);
            }
        });

        slot15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot15.setAlignmentY(0.0F);
        slot15.setBorder(null);
        slot15.setContentAreaFilled(false);
        slot15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot15.setIconTextGap(0);
        slot15.setPreferredSize(new java.awt.Dimension(42, 42));
        slot15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot15MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot15MouseReleased(evt);
            }
        });
        slot15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot15ActionPerformed(evt);
            }
        });

        slot16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot16.setAlignmentY(0.0F);
        slot16.setBorder(null);
        slot16.setContentAreaFilled(false);
        slot16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot16.setIconTextGap(0);
        slot16.setPreferredSize(new java.awt.Dimension(42, 42));
        slot16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot16MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot16MouseReleased(evt);
            }
        });
        slot16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot16ActionPerformed(evt);
            }
        });

        slot17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot17.setAlignmentY(0.0F);
        slot17.setBorder(null);
        slot17.setContentAreaFilled(false);
        slot17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot17.setIconTextGap(0);
        slot17.setPreferredSize(new java.awt.Dimension(42, 42));
        slot17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot17MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot17MouseReleased(evt);
            }
        });

        slot18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot18.setAlignmentY(0.0F);
        slot18.setBorder(null);
        slot18.setContentAreaFilled(false);
        slot18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot18.setIconTextGap(0);
        slot18.setPreferredSize(new java.awt.Dimension(42, 42));
        slot18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot18MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot18MouseReleased(evt);
            }
        });

        slot19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot19.setAlignmentY(0.0F);
        slot19.setBorder(null);
        slot19.setContentAreaFilled(false);
        slot19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot19.setIconTextGap(0);
        slot19.setPreferredSize(new java.awt.Dimension(42, 42));
        slot19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot19MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot19MouseReleased(evt);
            }
        });

        slot20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot20.setAlignmentY(0.0F);
        slot20.setBorder(null);
        slot20.setContentAreaFilled(false);
        slot20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot20.setIconTextGap(0);
        slot20.setPreferredSize(new java.awt.Dimension(42, 42));
        slot20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot20MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot20MouseReleased(evt);
            }
        });

        slot21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot21.setAlignmentY(0.0F);
        slot21.setBorder(null);
        slot21.setContentAreaFilled(false);
        slot21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot21.setIconTextGap(0);
        slot21.setPreferredSize(new java.awt.Dimension(42, 42));
        slot21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot21MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot21MouseReleased(evt);
            }
        });

        slot22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot22.setAlignmentY(0.0F);
        slot22.setBorder(null);
        slot22.setContentAreaFilled(false);
        slot22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot22.setIconTextGap(0);
        slot22.setPreferredSize(new java.awt.Dimension(42, 42));
        slot22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot22MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot22MouseReleased(evt);
            }
        });

        slot23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot23.setAlignmentY(0.0F);
        slot23.setBorder(null);
        slot23.setContentAreaFilled(false);
        slot23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot23.setIconTextGap(0);
        slot23.setPreferredSize(new java.awt.Dimension(42, 42));
        slot23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot23MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot23MouseReleased(evt);
            }
        });

        slot24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot24.setAlignmentY(0.0F);
        slot24.setBorder(null);
        slot24.setContentAreaFilled(false);
        slot24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot24.setIconTextGap(0);
        slot24.setPreferredSize(new java.awt.Dimension(42, 42));
        slot24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot24MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot24MouseReleased(evt);
            }
        });

        slot25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot25.setAlignmentY(0.0F);
        slot25.setBorder(null);
        slot25.setContentAreaFilled(false);
        slot25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot25.setIconTextGap(0);
        slot25.setPreferredSize(new java.awt.Dimension(42, 42));
        slot25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot25MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot25MouseReleased(evt);
            }
        });
        slot25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot25ActionPerformed(evt);
            }
        });

        slot26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot26.setAlignmentY(0.0F);
        slot26.setBorder(null);
        slot26.setContentAreaFilled(false);
        slot26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot26.setIconTextGap(0);
        slot26.setPreferredSize(new java.awt.Dimension(42, 42));
        slot26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot26MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot26MouseReleased(evt);
            }
        });

        slot27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot27.setAlignmentY(0.0F);
        slot27.setBorder(null);
        slot27.setContentAreaFilled(false);
        slot27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot27.setIconTextGap(0);
        slot27.setPreferredSize(new java.awt.Dimension(42, 42));
        slot27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot27MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot27MouseReleased(evt);
            }
        });

        slot28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot28.setAlignmentY(0.0F);
        slot28.setBorder(null);
        slot28.setContentAreaFilled(false);
        slot28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot28.setIconTextGap(0);
        slot28.setPreferredSize(new java.awt.Dimension(42, 42));
        slot28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot28MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot28MouseReleased(evt);
            }
        });

        slot29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot29.setAlignmentY(0.0F);
        slot29.setBorder(null);
        slot29.setContentAreaFilled(false);
        slot29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot29.setIconTextGap(0);
        slot29.setPreferredSize(new java.awt.Dimension(42, 42));
        slot29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot29MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot29MouseReleased(evt);
            }
        });

        slot30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot30.setAlignmentY(0.0F);
        slot30.setBorder(null);
        slot30.setContentAreaFilled(false);
        slot30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot30.setIconTextGap(0);
        slot30.setPreferredSize(new java.awt.Dimension(42, 42));
        slot30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot30MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot30MouseReleased(evt);
            }
        });
        slot30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                slot30ActionPerformed(evt);
            }
        });

        slot31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot31.setAlignmentY(0.0F);
        slot31.setBorder(null);
        slot31.setContentAreaFilled(false);
        slot31.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot31.setIconTextGap(0);
        slot31.setPreferredSize(new java.awt.Dimension(42, 42));
        slot31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot31MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot31MouseReleased(evt);
            }
        });

        slot32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot32.setAlignmentY(0.0F);
        slot32.setBorder(null);
        slot32.setContentAreaFilled(false);
        slot32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot32.setIconTextGap(0);
        slot32.setPreferredSize(new java.awt.Dimension(42, 42));
        slot32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot32MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot32MouseReleased(evt);
            }
        });

        slot33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot33.setAlignmentY(0.0F);
        slot33.setBorder(null);
        slot33.setContentAreaFilled(false);
        slot33.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot33.setIconTextGap(0);
        slot33.setPreferredSize(new java.awt.Dimension(42, 42));
        slot33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot33MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot33MouseReleased(evt);
            }
        });

        slot34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot34.setAlignmentY(0.0F);
        slot34.setBorder(null);
        slot34.setContentAreaFilled(false);
        slot34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot34.setIconTextGap(0);
        slot34.setPreferredSize(new java.awt.Dimension(42, 42));
        slot34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot34MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot34MouseReleased(evt);
            }
        });

        slot35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot35.setAlignmentY(0.0F);
        slot35.setBorder(null);
        slot35.setContentAreaFilled(false);
        slot35.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot35.setIconTextGap(0);
        slot35.setPreferredSize(new java.awt.Dimension(42, 42));
        slot35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot35MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot35MouseReleased(evt);
            }
        });

        slot36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot36.setAlignmentY(0.0F);
        slot36.setBorder(null);
        slot36.setContentAreaFilled(false);
        slot36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot36.setIconTextGap(0);
        slot36.setPreferredSize(new java.awt.Dimension(42, 42));
        slot36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot36MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot36MouseReleased(evt);
            }
        });

        slot37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot37.setAlignmentY(0.0F);
        slot37.setBorder(null);
        slot37.setContentAreaFilled(false);
        slot37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot37.setIconTextGap(0);
        slot37.setPreferredSize(new java.awt.Dimension(42, 42));
        slot37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot37MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot37MouseReleased(evt);
            }
        });

        slot38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot38.setAlignmentY(0.0F);
        slot38.setBorder(null);
        slot38.setContentAreaFilled(false);
        slot38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot38.setIconTextGap(0);
        slot38.setPreferredSize(new java.awt.Dimension(42, 42));
        slot38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot38MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot38MouseReleased(evt);
            }
        });

        slot39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot39.setAlignmentY(0.0F);
        slot39.setBorder(null);
        slot39.setContentAreaFilled(false);
        slot39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot39.setIconTextGap(0);
        slot39.setPreferredSize(new java.awt.Dimension(42, 42));
        slot39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot39MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot39MouseReleased(evt);
            }
        });

        slot40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\bulb_off.png")); // NOI18N
        slot40.setAlignmentY(0.0F);
        slot40.setBorder(null);
        slot40.setContentAreaFilled(false);
        slot40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        slot40.setIconTextGap(0);
        slot40.setPreferredSize(new java.awt.Dimension(42, 42));
        slot40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot40MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot40MouseReleased(evt);
            }
        });

        hint5.setForeground(new java.awt.Color(255, 255, 255));
        hint5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint5.setPreferredSize(new java.awt.Dimension(14, 25));

        hint6.setForeground(new java.awt.Color(255, 255, 255));
        hint6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint6.setPreferredSize(new java.awt.Dimension(14, 25));

        hint7.setForeground(new java.awt.Color(255, 255, 255));
        hint7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint7.setPreferredSize(new java.awt.Dimension(14, 25));

        hint8.setForeground(new java.awt.Color(255, 255, 255));
        hint8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint8.setPreferredSize(new java.awt.Dimension(14, 25));

        hint9.setForeground(new java.awt.Color(255, 255, 255));
        hint9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint9.setPreferredSize(new java.awt.Dimension(14, 25));

        hint10.setForeground(new java.awt.Color(255, 255, 255));
        hint10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint10.setPreferredSize(new java.awt.Dimension(14, 25));

        hint11.setForeground(new java.awt.Color(255, 255, 255));
        hint11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint11.setPreferredSize(new java.awt.Dimension(14, 25));

        hint12.setForeground(new java.awt.Color(255, 255, 255));
        hint12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint12.setPreferredSize(new java.awt.Dimension(14, 25));

        hint13.setForeground(new java.awt.Color(255, 255, 255));
        hint13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint13.setPreferredSize(new java.awt.Dimension(14, 25));

        hint14.setForeground(new java.awt.Color(255, 255, 255));
        hint14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint14.setPreferredSize(new java.awt.Dimension(14, 25));

        hint15.setForeground(new java.awt.Color(255, 255, 255));
        hint15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint15.setPreferredSize(new java.awt.Dimension(14, 25));

        hint16.setForeground(new java.awt.Color(255, 255, 255));
        hint16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint16.setPreferredSize(new java.awt.Dimension(14, 25));

        hint17.setForeground(new java.awt.Color(255, 255, 255));
        hint17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint17.setPreferredSize(new java.awt.Dimension(14, 25));

        hint18.setForeground(new java.awt.Color(255, 255, 255));
        hint18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint18.setPreferredSize(new java.awt.Dimension(14, 25));

        hint19.setForeground(new java.awt.Color(255, 255, 255));
        hint19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint19.setPreferredSize(new java.awt.Dimension(14, 25));

        hint20.setForeground(new java.awt.Color(255, 255, 255));
        hint20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint20.setPreferredSize(new java.awt.Dimension(14, 25));

        hint21.setForeground(new java.awt.Color(255, 255, 255));
        hint21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint21.setPreferredSize(new java.awt.Dimension(14, 25));

        hint22.setForeground(new java.awt.Color(255, 255, 255));
        hint22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint22.setPreferredSize(new java.awt.Dimension(14, 25));

        hint23.setForeground(new java.awt.Color(255, 255, 255));
        hint23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint23.setPreferredSize(new java.awt.Dimension(14, 25));

        hint24.setForeground(new java.awt.Color(255, 255, 255));
        hint24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint24.setPreferredSize(new java.awt.Dimension(14, 25));

        hint25.setForeground(new java.awt.Color(255, 255, 255));
        hint25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint25.setPreferredSize(new java.awt.Dimension(14, 25));

        hint26.setForeground(new java.awt.Color(255, 255, 255));
        hint26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint26.setPreferredSize(new java.awt.Dimension(14, 25));

        hint27.setForeground(new java.awt.Color(255, 255, 255));
        hint27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint27.setPreferredSize(new java.awt.Dimension(14, 25));

        hint28.setForeground(new java.awt.Color(255, 255, 255));
        hint28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint28.setPreferredSize(new java.awt.Dimension(14, 25));

        hint29.setForeground(new java.awt.Color(255, 255, 255));
        hint29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint29.setPreferredSize(new java.awt.Dimension(14, 25));

        hint30.setForeground(new java.awt.Color(255, 255, 255));
        hint30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint30.setPreferredSize(new java.awt.Dimension(14, 25));

        hint31.setForeground(new java.awt.Color(255, 255, 255));
        hint31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint31.setPreferredSize(new java.awt.Dimension(14, 25));

        hint32.setForeground(new java.awt.Color(255, 255, 255));
        hint32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint32.setPreferredSize(new java.awt.Dimension(14, 25));

        hint33.setForeground(new java.awt.Color(255, 255, 255));
        hint33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint33.setPreferredSize(new java.awt.Dimension(14, 25));

        hint34.setForeground(new java.awt.Color(255, 255, 255));
        hint34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint34.setPreferredSize(new java.awt.Dimension(14, 25));

        hint35.setForeground(new java.awt.Color(255, 255, 255));
        hint35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint35.setPreferredSize(new java.awt.Dimension(14, 25));

        hint36.setForeground(new java.awt.Color(255, 255, 255));
        hint36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint36.setPreferredSize(new java.awt.Dimension(14, 25));

        hint37.setForeground(new java.awt.Color(255, 255, 255));
        hint37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint37.setPreferredSize(new java.awt.Dimension(14, 25));

        hint38.setForeground(new java.awt.Color(255, 255, 255));
        hint38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint38.setPreferredSize(new java.awt.Dimension(14, 25));

        hint39.setForeground(new java.awt.Color(255, 255, 255));
        hint39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint39.setPreferredSize(new java.awt.Dimension(14, 25));

        hint40.setForeground(new java.awt.Color(255, 255, 255));
        hint40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\not_good.png")); // NOI18N
        hint40.setPreferredSize(new java.awt.Dimension(14, 25));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Desktop\\programowanie\\mastermind2\\project_mastermind\\MASTEREK_NETBEANS\\Graphics\\1.png")); // NOI18N
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(hint37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(hint38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(hint39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(hint40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hint17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(hint18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(hint33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hint27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(hint28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hint23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(1, 1, 1)
                                                .addComponent(hint24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(1, 1, 1)
                                            .addComponent(hint12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(hint8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hint3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(hint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hint31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(hint32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(hint35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(hint36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(17, 17, 17)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slot37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slot33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(slot36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10)
                                                .addComponent(slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot24, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(slot28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(59, 59, 59)
                                        .addComponent(checkButton))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(redChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(yellowChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(purpleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(blueChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(whiteChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(orangeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(greenChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(pinkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(hint39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint21, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(hint3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hint4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot39, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot40, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot38, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot37, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot34, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot35, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot36, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot29, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot31, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot32, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot30, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot28, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot25, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot26, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot27, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(slot24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(0, 0, 0)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(checkButton)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel3)))))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(redChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yellowChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pinkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purpleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whiteChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orangeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(greenChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("label1");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        this.checkButton.setBackground(Color.red);
    }//GEN-LAST:event_formMouseClicked

    private void slot1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot1MouseReleased

    }//GEN-LAST:event_slot1MouseReleased

    private void redChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_redChoiceActionPerformed

    private void slot1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot1MouseClicked
      //for(newFrame choice: colorChoice){
      if(redChoice.isSelected()){
          this.tryCode[0]=1;
          this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[0]);
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[0]=2;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[1]);
        }
       if(purpleChoice.isSelected()){
            this.tryCode[0]=3;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[2]);
        }
       if(blueChoice.isSelected()){
            this.tryCode[0]=4;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[3]);
        }
       if(whiteChoice.isSelected()){
            this.tryCode[0]=5;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[4]);
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[0]=6;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[5]);
        }
        if(greenChoice.isSelected()){
            this.tryCode[0]=7;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[6]);
        }
        if(pinkChoice.isSelected()){
            this.tryCode[0]=8;
            this.slotBoard[this.currentRound][0].setIcon(this.bulbIcons[7]);
        }
      //}
    }//GEN-LAST:event_slot1MouseClicked

    private void slot2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[1]=1;
          this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[0]);
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[1]=2;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[1]);
        }
       if(purpleChoice.isSelected()){
            this.tryCode[1]=3;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[2]);
        }
       if(blueChoice.isSelected()){
            this.tryCode[1]=4;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[3]);
        }
       if(whiteChoice.isSelected()){
            this.tryCode[1]=5;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[4]);
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[1]=6;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[5]);
        }
        if(greenChoice.isSelected()){
            this.tryCode[1]=7;
           this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[6]);
        }
        if(pinkChoice.isSelected()){
            this.tryCode[1]=8;
            this.slotBoard[this.currentRound][1].setIcon(this.bulbIcons[7]);
        }
    }//GEN-LAST:event_slot2MouseClicked

    private void slot2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot2MouseReleased

    private void slot3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[2]=1;
          this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[0]);
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[2]=2;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[1]);
        }
       if(purpleChoice.isSelected()){
            this.tryCode[2]=3;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[2]);
        }
       if(blueChoice.isSelected()){
            this.tryCode[2]=4;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[3]);
        }
       if(whiteChoice.isSelected()){
            this.tryCode[2]=5;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[4]);
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[2]=6;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[5]);
        }
        if(greenChoice.isSelected()){
            this.tryCode[2]=7;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[6]);
        }
        if(pinkChoice.isSelected()){
            this.tryCode[2]=8;
            this.slotBoard[this.currentRound][2].setIcon(this.bulbIcons[7]);
        }
    }//GEN-LAST:event_slot3MouseClicked

    private void slot3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot3MouseReleased

    private void slot4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[3]=1;
          this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[0]);
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[3]=2;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[1]);
        }
       if(purpleChoice.isSelected()){
            this.tryCode[3]=3;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[2]);
        }
       if(blueChoice.isSelected()){
            this.tryCode[3]=4;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[3]);
        }
       if(whiteChoice.isSelected()){
            this.tryCode[3]=5;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[4]);
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[3]=6;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[5]);
        }
        if(greenChoice.isSelected()){
            this.tryCode[3]=7;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[6]);
        }
        if(pinkChoice.isSelected()){
            this.tryCode[3]=8;
            this.slotBoard[this.currentRound][3].setIcon(this.bulbIcons[7]);
        }
    }//GEN-LAST:event_slot4MouseClicked

    private void slot4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot4MouseReleased

    private void purpleChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purpleChoiceActionPerformed

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked
 
        boolean okay = true;
        for(int i = 0; i < 4; i++){
            if(this.slotBoard[this.currentRound][i].getIcon().toString() == this.bulbIcons[8].toString()){
                okay = false;
            }
        }
        
        if(okay == true){
            for(int i = 0; i < 4; i++){
            this.slotBoard[this.currentRound][i].setDisabledIcon(this.slotBoard[this.currentRound][i].getIcon());
            this.slotBoard[this.currentRound][i].setEnabled(false);
        
            if(this.currentRound < 9){
                this.slotBoard[this.currentRound+1][i].setEnabled(true);
                this.jLabel3.setIcon(this.roundIcons[this.currentRound+1]);
                }
            else{
                javax.swing.JOptionPane.showMessageDialog(this, "You loose!"); 
                this.checkButton.setEnabled(false);
                break;
            }
            }
            this.checkCode();  
            this.currentRound++;
        }
        else{
            javax.swing.JOptionPane.showMessageDialog(this, "Please light up all four bulbs!");   
        }

        
    }//GEN-LAST:event_checkButtonMouseClicked

    private void slot5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot5MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot5MouseClicked

    private void slot5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot5MouseReleased

    private void slot6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot6MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot6MouseClicked

    private void slot6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot6MouseReleased

    private void slot7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot7MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot7MouseClicked

    private void slot7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot7MouseReleased

    private void slot8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot8MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot8MouseClicked

    private void slot8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot8MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot8MouseReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       String kod="";
       for(int i=0;i<4;i++){
           kod+=this.secretCode[i]+" ";
       }
        jLabel2.setText(kod);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void slot9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot9MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot9MouseClicked

    private void slot9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot9MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot9MouseReleased

    private void slot10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot10MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot10MouseClicked

    private void slot10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot10MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot10MouseReleased

    private void slot11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot11MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot11MouseClicked

    private void slot11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot11MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot11MouseReleased

    private void slot12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot12MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot12MouseClicked

    private void slot12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot12MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot12MouseReleased

    private void slot13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot13MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot13MouseClicked

    private void slot13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot13MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot13MouseReleased

    private void slot14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot14MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot14MouseClicked

    private void slot14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot14MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot14MouseReleased

    private void slot15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot15MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot15MouseClicked

    private void slot15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot15MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot15MouseReleased

    private void slot16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot16MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot16MouseClicked

    private void slot16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot16MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot16MouseReleased

    private void slot17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot17MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot17MouseClicked

    private void slot17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot17MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot17MouseReleased

    private void slot18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot18MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot18MouseClicked

    private void slot18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot18MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot18MouseReleased

    private void slot19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot19MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot19MouseClicked

    private void slot19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot19MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot19MouseReleased

    private void slot20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot20MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot20MouseClicked

    private void slot20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot20MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot20MouseReleased

    private void slot21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot21MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot21MouseClicked

    private void slot21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot21MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot21MouseReleased

    private void slot22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot22MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot22MouseClicked

    private void slot22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot22MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot22MouseReleased

    private void slot23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot23MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot23MouseClicked

    private void slot23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot23MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot23MouseReleased

    private void slot24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot24MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot24MouseClicked

    private void slot24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot24MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot24MouseReleased

    private void slot25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot25MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot25MouseClicked

    private void slot25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot25MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot25MouseReleased

    private void slot26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot26MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot26MouseClicked

    private void slot26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot26MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot26MouseReleased

    private void slot27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot27MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot27MouseClicked

    private void slot27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot27MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot27MouseReleased

    private void slot28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot28MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot28MouseClicked

    private void slot28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot28MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot28MouseReleased

    private void slot29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot29MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot29MouseClicked

    private void slot29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot29MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot29MouseReleased

    private void slot30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot30MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot30MouseClicked

    private void slot30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot30MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot30MouseReleased

    private void slot31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot31MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot31MouseClicked

    private void slot31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot31MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot31MouseReleased

    private void slot32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot32MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot32MouseClicked

    private void slot32MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot32MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot32MouseReleased

    private void slot33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot33MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot33MouseClicked

    private void slot33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot33MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot33MouseReleased

    private void slot34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot34MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot34MouseClicked

    private void slot34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot34MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot34MouseReleased

    private void slot35MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot35MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot35MouseClicked

    private void slot35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot35MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot35MouseReleased

    private void slot36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot36MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot36MouseClicked

    private void slot36MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot36MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot36MouseReleased

    private void slot37MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot37MouseClicked
        slot1MouseClicked(evt);
    }//GEN-LAST:event_slot37MouseClicked

    private void slot37MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot37MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot37MouseReleased

    private void slot38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot38MouseClicked
        slot2MouseClicked(evt);
    }//GEN-LAST:event_slot38MouseClicked

    private void slot38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot38MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot38MouseReleased

    private void slot39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot39MouseClicked
        slot3MouseClicked(evt);
    }//GEN-LAST:event_slot39MouseClicked

    private void slot39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot39MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot39MouseReleased

    private void slot40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot40MouseClicked
        slot4MouseClicked(evt);
    }//GEN-LAST:event_slot40MouseClicked

    private void slot40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot40MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot40MouseReleased

    private void slot30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot30ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot30ActionPerformed

    private void slot16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot16ActionPerformed

    private void slot15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot15ActionPerformed

    private void slot14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot14ActionPerformed

    private void slot25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_slot25ActionPerformed

    private void checkButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkButtonActionPerformed

    private void greenChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_greenChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_greenChoiceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                newFrame dialog = new newFrame(new javax.swing.JFrame(), true);
                
                
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.createBoard(); 
                dialog.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton blueChoice;
    private javax.swing.JButton checkButton;
    private javax.swing.ButtonGroup colorChoice;
    private javax.swing.JRadioButton greenChoice;
    private javax.swing.JLabel hint1;
    private javax.swing.JLabel hint10;
    private javax.swing.JLabel hint11;
    private javax.swing.JLabel hint12;
    private javax.swing.JLabel hint13;
    private javax.swing.JLabel hint14;
    private javax.swing.JLabel hint15;
    private javax.swing.JLabel hint16;
    private javax.swing.JLabel hint17;
    private javax.swing.JLabel hint18;
    private javax.swing.JLabel hint19;
    private javax.swing.JLabel hint2;
    private javax.swing.JLabel hint20;
    private javax.swing.JLabel hint21;
    private javax.swing.JLabel hint22;
    private javax.swing.JLabel hint23;
    private javax.swing.JLabel hint24;
    private javax.swing.JLabel hint25;
    private javax.swing.JLabel hint26;
    private javax.swing.JLabel hint27;
    private javax.swing.JLabel hint28;
    private javax.swing.JLabel hint29;
    private javax.swing.JLabel hint3;
    private javax.swing.JLabel hint30;
    private javax.swing.JLabel hint31;
    private javax.swing.JLabel hint32;
    private javax.swing.JLabel hint33;
    private javax.swing.JLabel hint34;
    private javax.swing.JLabel hint35;
    private javax.swing.JLabel hint36;
    private javax.swing.JLabel hint37;
    private javax.swing.JLabel hint38;
    private javax.swing.JLabel hint39;
    private javax.swing.JLabel hint4;
    private javax.swing.JLabel hint40;
    private javax.swing.JLabel hint5;
    private javax.swing.JLabel hint6;
    private javax.swing.JLabel hint7;
    private javax.swing.JLabel hint8;
    private javax.swing.JLabel hint9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButton orangeChoice;
    private javax.swing.JRadioButton pinkChoice;
    private javax.swing.JRadioButton purpleChoice;
    private javax.swing.JRadioButton redChoice;
    private javax.swing.JButton slot1;
    private javax.swing.JButton slot10;
    private javax.swing.JButton slot11;
    private javax.swing.JButton slot12;
    private javax.swing.JButton slot13;
    private javax.swing.JButton slot14;
    private javax.swing.JButton slot15;
    private javax.swing.JButton slot16;
    private javax.swing.JButton slot17;
    private javax.swing.JButton slot18;
    private javax.swing.JButton slot19;
    private javax.swing.JButton slot2;
    private javax.swing.JButton slot20;
    private javax.swing.JButton slot21;
    private javax.swing.JButton slot22;
    private javax.swing.JButton slot23;
    private javax.swing.JButton slot24;
    private javax.swing.JButton slot25;
    private javax.swing.JButton slot26;
    private javax.swing.JButton slot27;
    private javax.swing.JButton slot28;
    private javax.swing.JButton slot29;
    private javax.swing.JButton slot3;
    private javax.swing.JButton slot30;
    private javax.swing.JButton slot31;
    private javax.swing.JButton slot32;
    private javax.swing.JButton slot33;
    private javax.swing.JButton slot34;
    private javax.swing.JButton slot35;
    private javax.swing.JButton slot36;
    private javax.swing.JButton slot37;
    private javax.swing.JButton slot38;
    private javax.swing.JButton slot39;
    private javax.swing.JButton slot4;
    private javax.swing.JButton slot40;
    private javax.swing.JButton slot5;
    private javax.swing.JButton slot6;
    private javax.swing.JButton slot7;
    private javax.swing.JButton slot8;
    private javax.swing.JButton slot9;
    private javax.swing.JRadioButton whiteChoice;
    private javax.swing.JRadioButton yellowChoice;
    // End of variables declaration//GEN-END:variables
}


class ImagePanel extends javax.swing.JComponent {
    public java.awt.Image image;
    public ImagePanel(java.awt.Image image) {
        this.image = image;
    }
    @Override
    protected void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this);
    }
}