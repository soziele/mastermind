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
    javax.swing.JLabel hints[] = new javax.swing.JLabel[4]; //tablica podpowiedzi 
    
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
    
    public void generateCode(){
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            this.secretCode[i]=rand.nextInt(8)+1;
        }
    }
    
    public void createBoard(){
        this.generateCode();
        this.currentRound=0;
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
                        this.hints[j].setBackground(Color.black);
                    }
                    else{
                        this.hintBoard[this.currentRound][i] = 1;
                        //this.paintHints(Color.white);
                        this.hints[j].setBackground(Color.red);
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
    public void paintHints(Color color){
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
        else if(color==Color.white){
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(157, 157, 157)
                                .addComponent(redChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yellowChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(purpleChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(blueChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(slot2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(slot3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(slot4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hint1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hint2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(hint3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(hint4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(131, 180, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(whiteChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(orangeChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(greenChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pinkChoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkButton)))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(68, 68, 68)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(checkButton, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(slot6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(slot5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slot8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
        );

        jLabel1.getAccessibleContext().setAccessibleName("label1");
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
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
          slot1.setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[0]=2;
            slot1.setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[0]=3;
            slot1.setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[0]=4;
            slot1.setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[0]=5;
            slot1.setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[0]=6;
            slot1.setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[0]=7;
            slot1.setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[0]=8;
            slot1.setIcon(pinkChoice.getIcon());
        }
      //}
    }//GEN-LAST:event_slot1MouseClicked

    private void slot2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[1]=1;
          slot2.setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[1]=2;
            slot2.setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[1]=3;
            slot2.setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[1]=4;
            slot2.setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[1]=5;
            slot2.setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[1]=6;
            slot2.setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[1]=7;
            slot2.setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[1]=8;
            slot2.setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot2MouseClicked

    private void slot2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot2MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot2MouseReleased

    private void slot3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[2]=1;
          slot3.setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[2]=2;
            slot3.setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[2]=3;
            slot3.setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[2]=4;
            slot3.setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[2]=5;
            slot3.setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[2]=6;
            slot3.setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[2]=7;
            slot3.setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[2]=8;
            slot3.setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot3MouseClicked

    private void slot3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot3MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot3MouseReleased

    private void slot4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseClicked
        if(redChoice.isSelected()){
          this.tryCode[3]=1;
          slot4.setIcon(redChoice.getIcon());
      } 
      if(yellowChoice.isSelected()){
            this.tryCode[3]=2;
            slot4.setIcon(yellowChoice.getIcon());
        }
       if(purpleChoice.isSelected()){
            this.tryCode[3]=3;
            slot4.setIcon(purpleChoice.getIcon());
        }
       if(blueChoice.isSelected()){
            this.tryCode[3]=4;
            slot4.setIcon(blueChoice.getIcon());
        }
       if(whiteChoice.isSelected()){
            this.tryCode[3]=5;
            slot4.setIcon(whiteChoice.getIcon());
        } 
       if(orangeChoice.isSelected()){
            this.tryCode[3]=6;
            slot4.setIcon(orangeChoice.getIcon());
        }
        if(greenChoice.isSelected()){
            this.tryCode[3]=7;
            slot4.setIcon(greenChoice.getIcon());
        }
        if(pinkChoice.isSelected()){
            this.tryCode[3]=8;
            slot4.setIcon(pinkChoice.getIcon());
        }
    }//GEN-LAST:event_slot4MouseClicked

    private void slot4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot4MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot4MouseReleased

    private void purpleChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purpleChoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_purpleChoiceActionPerformed

    private void checkButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkButtonMouseClicked

        if(this.currentRound==0){
            
        slot1.setDisabledIcon(slot1.getIcon());
        slot2.setDisabledIcon(slot2.getIcon());
        slot3.setDisabledIcon(slot3.getIcon());
        slot4.setDisabledIcon(slot4.getIcon());
        
        slot1.setEnabled(false);
        slot2.setEnabled(false);
        slot3.setEnabled(false);
        slot4.setEnabled(false);
        
        this.hints[0]=hint1;
        this.hints[1]=hint2;
        this.hints[2]=hint3;
        this.hints[3]=hint4;
        
        this.checkCode();
        }
    }//GEN-LAST:event_checkButtonMouseClicked

    private void slot5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slot5MouseClicked

    private void slot5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot5MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot5MouseReleased

    private void slot6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slot6MouseClicked

    private void slot6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot6MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot6MouseReleased

    private void slot7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_slot7MouseClicked

    private void slot7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot7MouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_slot7MouseReleased

    private void slot8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_slot8MouseClicked
        // TODO add your handling code here:
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
    private javax.swing.JLabel hint2;
    private javax.swing.JLabel hint3;
    private javax.swing.JLabel hint4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton orangeChoice;
    private javax.swing.JRadioButton pinkChoice;
    private javax.swing.JRadioButton purpleChoice;
    private javax.swing.JRadioButton redChoice;
    private javax.swing.JButton slot1;
    private javax.swing.JButton slot2;
    private javax.swing.JButton slot3;
    private javax.swing.JButton slot4;
    private javax.swing.JButton slot5;
    private javax.swing.JButton slot6;
    private javax.swing.JButton slot7;
    private javax.swing.JButton slot8;
    private javax.swing.JRadioButton whiteChoice;
    private javax.swing.JRadioButton yellowChoice;
    // End of variables declaration//GEN-END:variables
}
