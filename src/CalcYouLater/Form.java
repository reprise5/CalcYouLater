package CalcYouLater;
/**
 *
 * @author reprise
 */
public class Form extends javax.swing.JFrame {
    /**
     * Creates new form "Form"
     */
    public Form() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        calcButton1 = new javax.swing.JButton();
        calcButton2 = new javax.swing.JButton();
        calcButton3 = new javax.swing.JButton();
        calcButton5 = new javax.swing.JButton();
        calcButton7 = new javax.swing.JButton();
        calcButton8 = new javax.swing.JButton();
        calcButton6 = new javax.swing.JButton();
        calcButton4 = new javax.swing.JButton();
        calcButton9 = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        multButton = new javax.swing.JButton();
        calcScreen = new javax.swing.JTextField();
        calcButton0 = new javax.swing.JButton();
        delButton = new javax.swing.JButton();
        equalsKey = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        clearScreen = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calc-You-Later");
        setIconImages(null);
        setResizable(false);

        calcButton1.setText("1");
        calcButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton1ActionPerformed(evt);
            }
        });

        calcButton2.setText("2");
        calcButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton2ActionPerformed(evt);
            }
        });

        calcButton3.setText("3");
        calcButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton3ActionPerformed(evt);
            }
        });

        calcButton5.setText("5");
        calcButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton5ActionPerformed(evt);
            }
        });

        calcButton7.setText("7");
        calcButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton7ActionPerformed(evt);
            }
        });

        calcButton8.setText("8");
        calcButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton8ActionPerformed(evt);
            }
        });

        calcButton6.setText("6");
        calcButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton6ActionPerformed(evt);
            }
        });

        calcButton4.setText("4");
        calcButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton4ActionPerformed(evt);
            }
        });

        calcButton9.setText("9");
        calcButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton9ActionPerformed(evt);
            }
        });

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subtractButton.setText("-");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        divideButton.setText("/");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideButtonActionPerformed(evt);
            }
        });

        multButton.setText("x");
        multButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multButtonActionPerformed(evt);
            }
        });

        calcScreen.setEditable(false);
        calcScreen.setBackground(new java.awt.Color(255, 255, 204));
        calcScreen.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        calcScreen.setForeground(new java.awt.Color(0, 0, 0));
        calcScreen.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcScreen.setText("0");

        calcButton0.setText("0");
        calcButton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButton0ActionPerformed(evt);
            }
        });

        delButton.setText("DEL");
        delButton.setName("delButton"); // NOI18N
        delButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtonActionPerformed(evt);
            }
        });

        equalsKey.setText("=");
        equalsKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsKeyActionPerformed(evt);
            }
        });

        jLabel1.setText("Programmed by Dani M");

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        jMenuItem1.setText("QUIT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        clearScreen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        clearScreen.setText("Clear All");
        clearScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearScreenActionPerformed(evt);
            }
        });
        jMenu2.add(clearScreen);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(calcButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(calcButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calcButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calcButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(calcButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(calcButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(calcButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equalsKey, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(calcScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calcScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calcButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calcButton0, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(equalsKey, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(delButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jLabel1.getAccessibleContext().setAccessibleName("ProgrammerLabel");

        pack();
    }// </editor-fold>                        
   
    //FILE>QUIT
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        System.exit(0);
    }                                          
    
    //EDIT>Clear
    private void clearScreenActionPerformed(java.awt.event.ActionEvent evt) {                                            
        //clear the screen, and dump all global variables from memory.  Or replace with null. whatever. same thing.
        calcScreen.setText("0");
        operator = ".";
        sNum1 = "";
        sNum2 = "";
        screen = "";
        num1 = 0;
        num2 =0;
    }                                           

    //Press 1 Key
    private void calcButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("1");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "1");
        
        //if test char is an operator, clear and begin typing a new num.  when equals is pressed, the screen will be taken and saved as sNum2.
        //sNum1 is already saved when the operator is pressed. before printing the operator.
        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("1");
            }
        }
    }                                           

    //Press 2 Key
    private void calcButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("2");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "2");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("2");
            }
        }
    }                                           

    //Press 3 Key
    private void calcButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("3");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "3");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("3");
            }
        }
    }                                           

    //Press 4 Key
    private void calcButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("4");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "4");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("4");
            }
        }
    }                                           

    //Press 5 Key
    private void calcButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("5");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "5");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("5");
            }
        }
    }                                           

    //Press 6 Key
    private void calcButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("6");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "6");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("6");
            }
        }
    }                                           

    //Press 7 Key
    private void calcButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("7");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "7");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("7");
            }
        }
    }                                           

    //Press 8 Key
    private void calcButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("8");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "8");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("8");
            }
        }
    }                                           

    //Press 9 key
    private void calcButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (calcScreen.getText().equals("0")){
            calcScreen.setText("9");
        }
        else    
            calcScreen.setText(calcScreen.getText() + "9");

        screen = calcScreen.getText();
        if (screen.length() > 2){
            char test = screen.charAt(screen.length()-2);
            System.out.println(test);
            
            if (test == '+' || test == '-' || test == '*' || test == '/'){
                calcScreen.setText("");
                calcScreen.setText("9");
            }
        }
    }                                           

    //Press 0 key
    private void calcButton0ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (!calcScreen.getText().equals("0")){
            calcScreen.setText(calcScreen.getText() + "0");
        }    
    }                                           

    //Press - operator
    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        sNum1 = calcScreen.getText();
        screen = calcScreen.getText();
        char test = screen.charAt(screen.length()-1);
        
        if (!calcScreen.getText().equals("0") && test != '-' && test != '+' && test != '*' && test != '/'){
            calcScreen.setText(calcScreen.getText() + "-");
            operator = "-";         
        }      
    }                                              

    // Press DEL key
    private void delButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (!calcScreen.getText().equals("0")){
            screen = calcScreen.getText();
            screen = screen.substring(0, screen.length()-1);
            calcScreen.setText(screen);
        }
        //if the screen would be empty, put a 0 instead.  so that it's handled by the first if next press.
        if (calcScreen.getText().equals("")){
            calcScreen.setText("0");
        }
    }                                         

    //Press + operator
    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        sNum1 = calcScreen.getText();
        screen = calcScreen.getText();
        char test = screen.charAt(screen.length()-1);
        
        if (!calcScreen.getText().equals("0") && test != '-' && test != '+' && test != '*' && test != '/'){
            calcScreen.setText(calcScreen.getText() + "+");
            operator = "+";
        } 
    }                                         

    //Press x operator
    private void multButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        sNum1 = calcScreen.getText();
        screen = calcScreen.getText();
        char test = screen.charAt(screen.length()-1);
        
        if (!calcScreen.getText().equals("0") && test != '-' && test != '+' && test != '*' && test != '/'){
            calcScreen.setText(calcScreen.getText() + "*");
            operator = "*";
        } 
    }                                          

    //Press / operator
    private void divideButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        sNum1 = calcScreen.getText();
        screen = calcScreen.getText();
        char test = screen.charAt(screen.length()-1);
        
        if (!calcScreen.getText().equals("0") && test != '-' && test != '+' && test != '*' && test != '/'){
            calcScreen.setText(calcScreen.getText() + "/");
            operator = "/";
        } 
    }                                            

    private void equalsKeyActionPerformed(java.awt.event.ActionEvent evt) {                                          
        //cast sNum1 and sNum2 into num1 and num2.  THEN use them below.
        //...
        //...           I need to figure it out.
        //              also need to take in sNum2 still.
        switch (operator) {
            case "+":
                answer = num1 + num2;
                sAnswer = Integer.toString(answer);
                calcScreen.setText(sAnswer);
                break;
            case "-":
                answer = num1 - num2;
                sAnswer = Integer.toString(answer);
                calcScreen.setText(sAnswer);
                break;
            case "*":
                answer = num1 - num2;
                sAnswer = Integer.toString(answer);
                calcScreen.setText(sAnswer);
                break;
            case "/":
                answer = num1 - num2;
                sAnswer = Integer.toString(answer);
                calcScreen.setText(sAnswer);
                break;
        }  
    }                                         

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
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JButton calcButton0;
    private javax.swing.JButton calcButton1;
    private javax.swing.JButton calcButton2;
    private javax.swing.JButton calcButton3;
    private javax.swing.JButton calcButton4;
    private javax.swing.JButton calcButton5;
    private javax.swing.JButton calcButton6;
    private javax.swing.JButton calcButton7;
    private javax.swing.JButton calcButton8;
    private javax.swing.JButton calcButton9;
    private javax.swing.JTextField calcScreen;
    private javax.swing.JMenuItem clearScreen;
    private javax.swing.JButton delButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton equalsKey;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JButton multButton;
    private javax.swing.JButton subtractButton;
    // End of variables declaration                   

    //GLOBAL VARIABLES
    String operator;
    String sNum1 = "";
    String sNum2 = "";
    String screen = "";
    String sAnswer = "";
    int num1 = 0;
    int num2 = 0;
    int answer = 0;
  }

