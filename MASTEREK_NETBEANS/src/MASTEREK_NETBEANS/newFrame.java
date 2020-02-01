/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MASTEREK_NETBEANS;
import java.awt.Color;
import java.util.*;


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
    private int[][] hintBoard = new int[10][4];
    javax.swing.JLabel hints[][] = new javax.swing.JLabel[10][4]; //tablica podpowiedzi 
    javax.swing.JButton slotBoard[][] = new javax.swing.JButton[10][4];
    
    /*
                COLORS
    --------------------------------
    red=1
    yellow=2
    purple=3
    blue=4
    white=5
    orange=6
    green=7
    pink=8
    --------------------------------
    */
    
    public newFrame(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
    
    public void generateCode(){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            this.secretCode[i]=rand.nextInt(8)+1;
        }
    }
    
    public void createBoard(){
        this.generateCode();
        this.currentRound=0;
        this.generateSlotTable();
        this.generateHintTable();
        
        for(int i = 0; i < 10; i++){
            for(int j=0; j < 4; j++){
                this.codeBoard[i][j] = 0;   //0 - puste pole; 1 - 8 cyfry odpowiadające kolorkom
                this.hintBoard[i][j] = 0;   //0 - brak bolca; 1 - biały bolec; 2 - czerwony bolec
            }
        }
    }
    
    public void checkCode(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (this.secretCode[i] == this.tryCode[j]) {
                    if (i == j){
                        this.hintBoard[this.currentRound][i] = 2; 
                        //this.paintHints(Color.black);
                        this.hints[this.currentRound][i].setBackground(Color.black);
                    }
                    else{
                        this.hintBoard[this.currentRound][i] = 1;
                        //this.paintHints(Color.white);
                        this.hints[this.currentRound][i].setBackground(Color.red);
                    }
                }
                /*
                else
                    this.hints[i].setBackground(Color.red);
                */
            }
        }
    }
    /*
    public void paintHints(Color color){                    //sortowanie żeby czarne hinty były przed białymi
        if(color==Color.black){
            for(int i = 0; i < 4; i++){
                if(this.hints[i].getBackground()!=color){
                    Color temp = this.hints[i].getBackground();
                    this.hints[i].setBackground(color);
                    if(i < 3){
                    this.hints[i+1].setBackground(temp);
                    }
                }
            }   
        }
        else if(color==Color.white){                        //a białe przed czerwonymi
            for(int i = 0; i < 4; i++){
                if(this.hints[i].getBackground()==Color.red){
                    Color temp = Color.red;
                    this.hints[i].setBackground(color);
                    if(i < 3){
                    this.hints[i+1].setBackground(temp);
                    }
                }
            }
        }
    }
    */

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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MasterMind");
        setBackground(new java.awt.Color(204, 255, 204));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusableWindowState(false);
        setSize(new java.awt.Dimension(550, 650));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 18)); // NOI18N
        jLabel1.setText("MASTERMIND");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        slot1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot1.setContentAreaFilled(false);
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
        redChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kuladajefula.png")); // NOI18N
        redChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        redChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redChoiceActionPerformed(evt);
            }
        });

        colorChoice.add(yellowChoice);
        yellowChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yellowChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulazolta.png")); // NOI18N
        yellowChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        colorChoice.add(purpleChoice);
        purpleChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        purpleChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulafioletowa.png")); // NOI18N
        purpleChoice.setPreferredSize(new java.awt.Dimension(32, 32));
        purpleChoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purpleChoiceActionPerformed(evt);
            }
        });

        colorChoice.add(blueChoice);
        blueChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        blueChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulaniebieska.png")); // NOI18N
        blueChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        colorChoice.add(greenChoice);
        greenChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        greenChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulazielona.png")); // NOI18N
        greenChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        slot2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot2.setContentAreaFilled(false);
        slot2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot2MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot2MouseReleased(evt);
            }
        });

        slot3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot3.setContentAreaFilled(false);
        slot3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot3MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot3MouseReleased(evt);
            }
        });

        slot4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot4.setContentAreaFilled(false);
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
        orangeChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapomaranczowa.png")); // NOI18N
        orangeChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        colorChoice.add(pinkChoice);
        pinkChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pinkChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kularozowa.png")); // NOI18N
        pinkChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        colorChoice.add(whiteChoice);
        whiteChoice.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whiteChoice.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulabiala.png")); // NOI18N
        whiteChoice.setPreferredSize(new java.awt.Dimension(32, 32));

        checkButton.setText("CHECK");
        checkButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkButtonMouseClicked(evt);
            }
        });

        slot5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot5.setContentAreaFilled(false);
        slot5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot5MouseReleased(evt);
            }
        });

        slot6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot6.setContentAreaFilled(false);
        slot6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot6MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot6MouseReleased(evt);
            }
        });

        slot7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot7.setContentAreaFilled(false);
        slot7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot7MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot7MouseReleased(evt);
            }
        });

        slot8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot8.setContentAreaFilled(false);
        slot8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot8MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot8MouseReleased(evt);
            }
        });

        hint1.setForeground(new java.awt.Color(255, 255, 255));
        hint1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint1.setPreferredSize(new java.awt.Dimension(15, 15));

        hint2.setForeground(new java.awt.Color(255, 255, 255));
        hint2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint2.setPreferredSize(new java.awt.Dimension(15, 15));

        hint3.setForeground(new java.awt.Color(255, 255, 255));
        hint3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint3.setPreferredSize(new java.awt.Dimension(15, 15));

        hint4.setForeground(new java.awt.Color(255, 255, 255));
        hint4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint4.setPreferredSize(new java.awt.Dimension(15, 15));

        jLabel2.setText("kod spoiler");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        slot9.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot9.setContentAreaFilled(false);
        slot9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot9MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot9MouseReleased(evt);
            }
        });

        slot10.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot10.setContentAreaFilled(false);
        slot10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot10MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot10MouseReleased(evt);
            }
        });

        slot11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot11.setContentAreaFilled(false);
        slot11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot11MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot11MouseReleased(evt);
            }
        });

        slot12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot12.setContentAreaFilled(false);
        slot12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot12MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot12MouseReleased(evt);
            }
        });

        slot13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot13.setContentAreaFilled(false);
        slot13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot13MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot13MouseReleased(evt);
            }
        });

        slot14.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot14.setContentAreaFilled(false);
        slot14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot14MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot14MouseReleased(evt);
            }
        });

        slot15.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot15.setContentAreaFilled(false);
        slot15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot15MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot15MouseReleased(evt);
            }
        });

        slot16.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot16.setContentAreaFilled(false);
        slot16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot16MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot16MouseReleased(evt);
            }
        });

        slot17.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot17.setContentAreaFilled(false);
        slot17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot17MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot17MouseReleased(evt);
            }
        });

        slot18.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot18.setContentAreaFilled(false);
        slot18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot18MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot18MouseReleased(evt);
            }
        });

        slot19.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot19.setContentAreaFilled(false);
        slot19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot19MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot19MouseReleased(evt);
            }
        });

        slot20.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot20.setContentAreaFilled(false);
        slot20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot20MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot20MouseReleased(evt);
            }
        });

        slot21.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot21.setContentAreaFilled(false);
        slot21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot21MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot21MouseReleased(evt);
            }
        });

        slot22.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot22.setContentAreaFilled(false);
        slot22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot22MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot22MouseReleased(evt);
            }
        });

        slot23.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot23.setContentAreaFilled(false);
        slot23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot23MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot23MouseReleased(evt);
            }
        });

        slot24.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot24.setContentAreaFilled(false);
        slot24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot24MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot24MouseReleased(evt);
            }
        });

        slot25.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot25.setContentAreaFilled(false);
        slot25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot25MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot25MouseReleased(evt);
            }
        });

        slot26.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot26.setContentAreaFilled(false);
        slot26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot26MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot26MouseReleased(evt);
            }
        });

        slot27.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot27.setContentAreaFilled(false);
        slot27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot27MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot27MouseReleased(evt);
            }
        });

        slot28.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot28.setContentAreaFilled(false);
        slot28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot28MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot28MouseReleased(evt);
            }
        });

        slot29.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot29.setContentAreaFilled(false);
        slot29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot29MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot29MouseReleased(evt);
            }
        });

        slot30.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot30.setContentAreaFilled(false);
        slot30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot30MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot30MouseReleased(evt);
            }
        });

        slot31.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot31.setContentAreaFilled(false);
        slot31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot31MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot31MouseReleased(evt);
            }
        });

        slot32.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot32.setContentAreaFilled(false);
        slot32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot32MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot32MouseReleased(evt);
            }
        });

        slot33.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot33.setContentAreaFilled(false);
        slot33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot33MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot33MouseReleased(evt);
            }
        });

        slot34.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot34.setContentAreaFilled(false);
        slot34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot34MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot34MouseReleased(evt);
            }
        });

        slot35.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot35.setContentAreaFilled(false);
        slot35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot35MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot35MouseReleased(evt);
            }
        });

        slot36.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot36.setContentAreaFilled(false);
        slot36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot36MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot36MouseReleased(evt);
            }
        });

        slot37.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot37.setContentAreaFilled(false);
        slot37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot37MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot37MouseReleased(evt);
            }
        });

        slot38.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot38.setContentAreaFilled(false);
        slot38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot38MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot38MouseReleased(evt);
            }
        });

        slot39.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot39.setContentAreaFilled(false);
        slot39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot39MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot39MouseReleased(evt);
            }
        });

        slot40.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sonia\\Downloads\\kulapusta.png")); // NOI18N
        slot40.setContentAreaFilled(false);
        slot40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                slot40MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                slot40MouseReleased(evt);
            }
        });

        hint5.setForeground(new java.awt.Color(255, 255, 255));
        hint5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint5.setPreferredSize(new java.awt.Dimension(15, 15));

        hint6.setForeground(new java.awt.Color(255, 255, 255));
        hint6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint6.setPreferredSize(new java.awt.Dimension(15, 15));

        hint7.setForeground(new java.awt.Color(255, 255, 255));
        hint7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint7.setPreferredSize(new java.awt.Dimension(15, 15));

        hint8.setForeground(new java.awt.Color(255, 255, 255));
        hint8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint8.setPreferredSize(new java.awt.Dimension(15, 15));

        hint9.setForeground(new java.awt.Color(255, 255, 255));
        hint9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint9.setPreferredSize(new java.awt.Dimension(15, 15));

        hint10.setForeground(new java.awt.Color(255, 255, 255));
        hint10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint10.setPreferredSize(new java.awt.Dimension(15, 15));

        hint11.setForeground(new java.awt.Color(255, 255, 255));
        hint11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint11.setPreferredSize(new java.awt.Dimension(15, 15));

        hint12.setForeground(new java.awt.Color(255, 255, 255));
        hint12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint12.setPreferredSize(new java.awt.Dimension(15, 15));

        hint13.setForeground(new java.awt.Color(255, 255, 255));
        hint13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint13.setPreferredSize(new java.awt.Dimension(15, 15));

        hint14.setForeground(new java.awt.Color(255, 255, 255));
        hint14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint14.setPreferredSize(new java.awt.Dimension(15, 15));

        hint15.setForeground(new java.awt.Color(255, 255, 255));
        hint15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint15.setPreferredSize(new java.awt.Dimension(15, 15));

        hint16.setForeground(new java.awt.Color(255, 255, 255));
        hint16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint16.setPreferredSize(new java.awt.Dimension(15, 15));

        hint17.setForeground(new java.awt.Color(255, 255, 255));
        hint17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint17.setPreferredSize(new java.awt.Dimension(15, 15));

        hint18.setForeground(new java.awt.Color(255, 255, 255));
        hint18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint18.setPreferredSize(new java.awt.Dimension(15, 15));

        hint19.setForeground(new java.awt.Color(255, 255, 255));
        hint19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint19.setPreferredSize(new java.awt.Dimension(15, 15));

        hint20.setForeground(new java.awt.Color(255, 255, 255));
        hint20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint20.setPreferredSize(new java.awt.Dimension(15, 15));

        hint21.setForeground(new java.awt.Color(255, 255, 255));
        hint21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint21.setPreferredSize(new java.awt.Dimension(15, 15));

        hint22.setForeground(new java.awt.Color(255, 255, 255));
        hint22.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint22.setPreferredSize(new java.awt.Dimension(15, 15));

        hint23.setForeground(new java.awt.Color(255, 255, 255));
        hint23.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint23.setPreferredSize(new java.awt.Dimension(15, 15));

        hint24.setForeground(new java.awt.Color(255, 255, 255));
        hint24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint24.setPreferredSize(new java.awt.Dimension(15, 15));

        hint25.setForeground(new java.awt.Color(255, 255, 255));
        hint25.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint25.setPreferredSize(new java.awt.Dimension(15, 15));

        hint26.setForeground(new java.awt.Color(255, 255, 255));
        hint26.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint26.setPreferredSize(new java.awt.Dimension(15, 15));

        hint27.setForeground(new java.awt.Color(255, 255, 255));
        hint27.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint27.setPreferredSize(new java.awt.Dimension(15, 15));

        hint28.setForeground(new java.awt.Color(255, 255, 255));
        hint28.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint28.setPreferredSize(new java.awt.Dimension(15, 15));

        hint29.setForeground(new java.awt.Color(255, 255, 255));
        hint29.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint29.setPreferredSize(new java.awt.Dimension(15, 15));

        hint30.setForeground(new java.awt.Color(255, 255, 255));
        hint30.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint30.setPreferredSize(new java.awt.Dimension(15, 15));

        hint31.setForeground(new java.awt.Color(255, 255, 255));
        hint31.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint31.setPreferredSize(new java.awt.Dimension(15, 15));

        hint32.setForeground(new java.awt.Color(255, 255, 255));
        hint32.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint32.setPreferredSize(new java.awt.Dimension(15, 15));

        hint33.setForeground(new java.awt.Color(255, 255, 255));
        hint33.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint33.setPreferredSize(new java.awt.Dimension(15, 15));

        hint34.setForeground(new java.awt.Color(255, 255, 255));
        hint34.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint34.setPreferredSize(new java.awt.Dimension(15, 15));

        hint35.setForeground(new java.awt.Color(255, 255, 255));
        hint35.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint35.setPreferredSize(new java.awt.Dimension(15, 15));

        hint36.setForeground(new java.awt.Color(255, 255, 255));
        hint36.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint36.setPreferredSize(new java.awt.Dimension(15, 15));

        hint37.setForeground(new java.awt.Color(255, 255, 255));
        hint37.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint37.setPreferredSize(new java.awt.Dimension(15, 15));

        hint38.setForeground(new java.awt.Color(255, 255, 255));
        hint38.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint38.setPreferredSize(new java.awt.Dimension(15, 15));

        hint39.setForeground(new java.awt.Color(255, 255, 255));
        hint39.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint39.setPreferredSize(new java.awt.Dimension(15, 15));

        hint40.setForeground(new java.awt.Color(255, 255, 255));
        hint40.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        hint40.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(redChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(purpleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blueChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(whiteChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orangeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(pinkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hint2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hint3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(hint8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(44, 44, 44)
                                .addComponent(checkButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot38, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot37, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot39, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot40, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hint38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hint40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hint37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hint39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hint34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hint36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hint33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(hint35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot32, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hint32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(hint29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(hint31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(slot25, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(slot28, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(hint26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(hint28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(hint25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(hint27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(slot21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(slot23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(slot24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(19, 19, 19)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(slot12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(slot17, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(slot19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(slot20, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(slot13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(slot15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(slot16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(slot14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                            .addComponent(slot18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(slot10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(hint6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(hint8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(hint5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                    .addComponent(hint7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                        .addGap(18, 18, 18)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(hint3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGap(45, 45, 45)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(yellowChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(greenChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(orangeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(pinkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(whiteChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(blueChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(purpleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                            .addComponent(redChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(50, 50, 50))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(slot22, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(slot30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(slot34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
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
          this.slotBoard[this.currentRound][0].setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[0]=2;
            this.slotBoard[this.currentRound][0].setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[0]=3;
            this.slotBoard[this.currentRound][0].setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[0]=4;
            this.slotBoard[this.currentRound][0].setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[0]=5;
            this.slotBoard[this.currentRound][0].setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[0]=6;
            this.slotBoard[this.currentRound][0].setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[0]=7;
            this.slotBoard[this.currentRound][0].setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[0]=8;
            this.slotBoard[this.currentRound][0].setIcon(pinkChoice.getIcon());
        }
      //}
    }//GEN-LAST:event_slot1MouseClicked

    private void slot2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[1]=1;
          this.slotBoard[this.currentRound][1].setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[1]=2;
            this.slotBoard[this.currentRound][1].setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[1]=3;
            this.slotBoard[this.currentRound][1].setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[1]=4;
            this.slotBoard[this.currentRound][1].setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[1]=5;
            this.slotBoard[this.currentRound][1].setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[1]=6;
            this.slotBoard[this.currentRound][1].setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[1]=7;
           this.slotBoard[this.currentRound][1].setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[1]=8;
            this.slotBoard[this.currentRound][1].setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot2MouseClicked

    private void slot2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot2MouseReleased

    private void slot3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[2]=1;
          this.slotBoard[this.currentRound][2].setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[2]=2;
            this.slotBoard[this.currentRound][2].setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[2]=3;
            this.slotBoard[this.currentRound][2].setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[2]=4;
            this.slotBoard[this.currentRound][2].setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[2]=5;
            this.slotBoard[this.currentRound][2].setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[2]=6;
            this.slotBoard[this.currentRound][2].setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[2]=7;
            this.slotBoard[this.currentRound][2].setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[2]=8;
            this.slotBoard[this.currentRound][2].setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot3MouseClicked

    private void slot3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot3MouseReleased

    private void slot4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[3]=1;
          this.slotBoard[this.currentRound][3].setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[3]=2;
            this.slotBoard[this.currentRound][3].setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[3]=3;
            this.slotBoard[this.currentRound][3].setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[3]=4;
            this.slotBoard[this.currentRound][3].setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[3]=5;
            this.slotBoard[this.currentRound][3].setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[3]=6;
            this.slotBoard[this.currentRound][3].setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[3]=7;
            this.slotBoard[this.currentRound][3].setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[3]=8;
            this.slotBoard[this.currentRound][3].setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot4MouseClicked

    private void slot4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot4MouseReleased

    private void purpleChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purpleChoiceActionPerformed

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked
        this.checkButton.setBackground(Color.red);
        for(int i = 0; i < 4; i++){
        this.slotBoard[this.currentRound][i].setDisabledIcon(this.slotBoard[this.currentRound][i].getIcon());
        this.slotBoard[this.currentRound][i].setEnabled(false);
        
        if(this.currentRound < 9){
            this.slotBoard[this.currentRound+1][i].setEnabled(true);
        }
        }
        
        this.checkCode();
        
        this.currentRound++;
        this.checkButton.setBackground(Color.green);
        
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
