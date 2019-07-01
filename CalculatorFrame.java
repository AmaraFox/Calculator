package pc2calculator;

import com.sun.xml.internal.ws.util.StringUtils;
import java.awt.Font;
import java.text.DecimalFormat;
import java.lang.*;
import java.lang.NumberFormatException;

public class CalculatorFrame extends javax.swing.JFrame {
    
    //creating instance of calculate class
    Calculate calculate = new Calculate();

    public CalculatorFrame() {
        initComponents();
        //setting calculator to basic for launch
        panelExtended.setVisible(false);
        setSize(250,350);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgrDeRa = new javax.swing.ButtonGroup();
        bgrView = new javax.swing.ButtonGroup();
        bgrFont = new javax.swing.ButtonGroup();
        bgrRound = new javax.swing.ButtonGroup();
        bgrHelp = new javax.swing.ButtonGroup();
        msgMessage = new javax.swing.JOptionPane();
        msgAbout = new javax.swing.JOptionPane();
        errorDecimal = new javax.swing.JOptionPane();
        errorZero = new javax.swing.JOptionPane();
        txtInOut = new javax.swing.JTextField();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnDividedByX = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnPower = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnNegPos = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnFactorial = new javax.swing.JButton();
        btnCA = new javax.swing.JButton();
        btnCE = new javax.swing.JButton();
        panelExtended = new javax.swing.JPanel();
        radDegrees = new javax.swing.JRadioButton();
        radRadians = new javax.swing.JRadioButton();
        btnSin = new javax.swing.JButton();
        btnAcos = new javax.swing.JButton();
        btnAsin = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnAtan = new javax.swing.JButton();
        btnPI = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuView = new javax.swing.JMenu();
        mnuBasic = new javax.swing.JRadioButtonMenuItem();
        mnuExtended = new javax.swing.JRadioButtonMenuItem();
        mnuFont = new javax.swing.JMenu();
        mnuPlain = new javax.swing.JRadioButtonMenuItem();
        mnuBold = new javax.swing.JRadioButtonMenuItem();
        mnuRound = new javax.swing.JMenu();
        mnu0 = new javax.swing.JRadioButtonMenuItem();
        mnu1 = new javax.swing.JRadioButtonMenuItem();
        mnu2 = new javax.swing.JRadioButtonMenuItem();
        mnu3 = new javax.swing.JRadioButtonMenuItem();
        mnu4 = new javax.swing.JRadioButtonMenuItem();
        mnu5 = new javax.swing.JRadioButtonMenuItem();
        mnu6 = new javax.swing.JRadioButtonMenuItem();
        mnu7 = new javax.swing.JRadioButtonMenuItem();
        mnu8 = new javax.swing.JRadioButtonMenuItem();
        mnu9 = new javax.swing.JRadioButtonMenuItem();
        mnuHelp = new javax.swing.JMenu();
        mnuAbout = new javax.swing.JRadioButtonMenuItem();
        mnuHotKeys = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        getContentPane().setLayout(null);
        getContentPane().add(txtInOut);
        txtInOut.setBounds(6, 17, 225, 26);

        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        getContentPane().add(btn1);
        btn1.setBounds(6, 55, 39, 40);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);
        btn2.setBounds(51, 55, 42, 40);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);
        btn3.setBounds(99, 55, 39, 40);

        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        getContentPane().add(btnMultiply);
        btnMultiply.setBounds(144, 55, 40, 40);

        btnDividedByX.setText("1/x");
        btnDividedByX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDividedByXActionPerformed(evt);
            }
        });
        getContentPane().add(btnDividedByX);
        btnDividedByX.setBounds(190, 60, 41, 40);

        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        getContentPane().add(btn4);
        btn4.setBounds(6, 101, 39, 39);

        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        getContentPane().add(btn5);
        btn5.setBounds(51, 101, 42, 39);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);
        btn6.setBounds(99, 101, 39, 39);

        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        getContentPane().add(btnDivide);
        btnDivide.setBounds(144, 101, 40, 39);

        btnPower.setText("x^y");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });
        getContentPane().add(btnPower);
        btnPower.setBounds(190, 101, 41, 39);

        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        getContentPane().add(btn7);
        btn7.setBounds(6, 146, 39, 39);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);
        btn8.setBounds(51, 146, 42, 39);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(99, 146, 39, 39);

        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(144, 146, 40, 39);

        btnNegPos.setText("+/-");
        btnNegPos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNegPosActionPerformed(evt);
            }
        });
        getContentPane().add(btnNegPos);
        btnNegPos.setBounds(190, 152, 41, 37);

        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        getContentPane().add(btn0);
        btn0.setBounds(6, 191, 39, 39);

        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        getContentPane().add(btnDecimal);
        btnDecimal.setBounds(51, 191, 42, 39);

        btnEquals.setText("=");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        getContentPane().add(btnEquals);
        btnEquals.setBounds(99, 191, 39, 39);

        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubtract);
        btnSubtract.setBounds(144, 191, 40, 39);

        btnFactorial.setText("x!");
        btnFactorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactorialActionPerformed(evt);
            }
        });
        getContentPane().add(btnFactorial);
        btnFactorial.setBounds(190, 191, 41, 39);

        btnCA.setText("CA");
        btnCA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCAActionPerformed(evt);
            }
        });
        getContentPane().add(btnCA);
        btnCA.setBounds(28, 236, 75, 29);

        btnCE.setText("CE");
        btnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCEActionPerformed(evt);
            }
        });
        getContentPane().add(btnCE);
        btnCE.setBounds(109, 236, 75, 29);

        bgrDeRa.add(radDegrees);
        radDegrees.setText("Degrees");

        bgrDeRa.add(radRadians);
        radRadians.setText("Radians");

        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });

        btnAcos.setText("acos");
        btnAcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcosActionPerformed(evt);
            }
        });

        btnAsin.setText("asin");
        btnAsin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsinActionPerformed(evt);
            }
        });

        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });

        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });

        btnAtan.setText("atan");
        btnAtan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtanActionPerformed(evt);
            }
        });

        btnPI.setText("PI");
        btnPI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPIActionPerformed(evt);
            }
        });

        btnE.setText("E");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelExtendedLayout = new javax.swing.GroupLayout(panelExtended);
        panelExtended.setLayout(panelExtendedLayout);
        panelExtendedLayout.setHorizontalGroup(
            panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExtendedLayout.createSequentialGroup()
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExtendedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSin)
                            .addComponent(radDegrees)
                            .addComponent(btnCos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radRadians)
                            .addComponent(btnAsin)
                            .addComponent(btnAcos))
                        .addGap(14, 14, 14))
                    .addGroup(panelExtendedLayout.createSequentialGroup()
                        .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelExtendedLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnTan)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAtan))
                            .addGroup(panelExtendedLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnPI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelExtendedLayout.setVerticalGroup(
            panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelExtendedLayout.createSequentialGroup()
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelExtendedLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(radRadians))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelExtendedLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radDegrees)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAsin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAcos, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelExtendedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPI, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        getContentPane().add(panelExtended);
        panelExtended.setBounds(240, 0, 190, 270);

        mnuView.setText("View");
        mnuView.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuViewItemStateChanged(evt);
            }
        });

        mnuBasic.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        bgrView.add(mnuBasic);
        mnuBasic.setMnemonic('B');
        mnuBasic.setSelected(true);
        mnuBasic.setText("Basic");
        mnuBasic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuBasicItemStateChanged(evt);
            }
        });
        mnuBasic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBasicActionPerformed(evt);
            }
        });
        mnuView.add(mnuBasic);

        mnuExtended.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        bgrView.add(mnuExtended);
        mnuExtended.setMnemonic('E');
        mnuExtended.setText("Extended");
        mnuExtended.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuExtendedItemStateChanged(evt);
            }
        });
        mnuExtended.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuExtendedActionPerformed(evt);
            }
        });
        mnuView.add(mnuExtended);

        jMenuBar1.add(mnuView);

        mnuFont.setText("Font");

        mnuPlain.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        bgrFont.add(mnuPlain);
        mnuPlain.setMnemonic('P');
        mnuPlain.setSelected(true);
        mnuPlain.setText("Plain");
        mnuPlain.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuPlainItemStateChanged(evt);
            }
        });
        mnuPlain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuPlainActionPerformed(evt);
            }
        });
        mnuFont.add(mnuPlain);

        mnuBold.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        bgrFont.add(mnuBold);
        mnuBold.setMnemonic('B');
        mnuBold.setText("Bold");
        mnuBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuBoldActionPerformed(evt);
            }
        });
        mnuFont.add(mnuBold);

        jMenuBar1.add(mnuFont);

        mnuRound.setText("Round");

        bgrRound.add(mnu0);
        mnu0.setSelected(true);
        mnu0.setText("0");
        mnu0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu0ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu0);

        bgrRound.add(mnu1);
        mnu1.setText("1");
        mnu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu1ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu1);

        bgrRound.add(mnu2);
        mnu2.setText("2");
        mnu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu2ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu2);

        bgrRound.add(mnu3);
        mnu3.setText("3");
        mnu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu3ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu3);

        bgrRound.add(mnu4);
        mnu4.setText("4");
        mnu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu4ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu4);

        bgrRound.add(mnu5);
        mnu5.setText("5");
        mnu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu5ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu5);

        bgrRound.add(mnu6);
        mnu6.setText("6");
        mnu6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu6ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu6);

        bgrRound.add(mnu7);
        mnu7.setText("7");
        mnu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu7ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu7);

        bgrRound.add(mnu8);
        mnu8.setText("8");
        mnu8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu8ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu8);

        bgrRound.add(mnu9);
        mnu9.setText("9");
        mnu9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnu9ActionPerformed(evt);
            }
        });
        mnuRound.add(mnu9);

        jMenuBar1.add(mnuRound);

        mnuHelp.setText("Help");

        mnuAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        bgrHelp.add(mnuAbout);
        mnuAbout.setMnemonic('A');
        mnuAbout.setSelected(true);
        mnuAbout.setText("About");
        mnuAbout.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuAboutItemStateChanged(evt);
            }
        });
        mnuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuAboutActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuAbout);

        mnuHotKeys.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.ALT_MASK));
        bgrHelp.add(mnuHotKeys);
        mnuHotKeys.setMnemonic('H');
        mnuHotKeys.setText("Hot Keys");
        mnuHotKeys.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                mnuHotKeysItemStateChanged(evt);
            }
        });
        mnuHotKeys.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuHotKeysActionPerformed(evt);
            }
        });
        mnuHelp.add(mnuHotKeys);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        // Does the calculation to display
        Double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum2(number);
        double answer = calculate.answer();
        txtInOut.setText(""+ answer);
        if (number == 0) {
            
            txtInOut.setText("");
            errorZero.showMessageDialog(this, "ERROR: Devision by zero is not allowed",
                     "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void mnu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu2ActionPerformed
        // Round number to 2 
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu2ActionPerformed

    private void mnuExtendedItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuExtendedItemStateChanged
        //mistake 
    }//GEN-LAST:event_mnuExtendedItemStateChanged

    private void mnuBasicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuBasicItemStateChanged
        // mistake
    }//GEN-LAST:event_mnuBasicItemStateChanged

    private void mnuViewItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuViewItemStateChanged
        // mistake
    }//GEN-LAST:event_mnuViewItemStateChanged

    private void mnuPlainItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuPlainItemStateChanged
        //mistake
    }//GEN-LAST:event_mnuPlainItemStateChanged

    private void mnuHotKeysItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuHotKeysItemStateChanged
        //Mistake pls ignore
    }//GEN-LAST:event_mnuHotKeysItemStateChanged

    private void mnuAboutItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_mnuAboutItemStateChanged
        // Mistake pls ignore
    }//GEN-LAST:event_mnuAboutItemStateChanged

    private void mnuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuAboutActionPerformed
        //display message about the program creator
        msgAbout.showMessageDialog(this, "Calculator \nCreated By: Amara Fox"
                + "\n12/06/2017", "About", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuAboutActionPerformed

    private void mnuHotKeysActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuHotKeysActionPerformed
        //display information message about hot keys
        msgMessage.showMessageDialog(this, "Alt+A- About \nAlt+H- Hot Keys \nAlt+P- Plain Font "
                + "\nAlt+B- Bold Font \nAlt+S- Basic View \nAlt+E- Extended View", "Hot Keys", 
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_mnuHotKeysActionPerformed

    private void mnuBasicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBasicActionPerformed
        // sets calculator to basic view
        panelExtended.setVisible(false);
        setSize(250, 350);
    }//GEN-LAST:event_mnuBasicActionPerformed

    private void mnuExtendedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuExtendedActionPerformed
        //sets calculator to extended view
        panelExtended.setVisible(true);
        setSize(450, 350);
    }//GEN-LAST:event_mnuExtendedActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // Inserts number 1
        String display;
        display = txtInOut.getText() + btn1.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // Inserts number 2
        String display;
        display = txtInOut.getText() + btn2.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // Inserts number 3
        String display;
        display = txtInOut.getText() + btn3.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // Inserts number 4
        String display;
        display = txtInOut.getText() + btn4.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // Inserts number 5
        String display;
        display = txtInOut.getText() + btn5.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // Inserts number 6
        String display;
        display = txtInOut.getText() + btn6.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // Inserts number 7
        String display;
        display = txtInOut.getText() + btn7.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // Inserts number 8
        String display;
        display = txtInOut.getText() + btn8.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // Inserts number 9
        String display;
        display = txtInOut.getText() + btn9.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        // Inserts number 0
        String display;
        display = txtInOut.getText() + btn0.getText();
        txtInOut.setText(display);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        String display;
        display = txtInOut.getText() + btnDecimal.getText();
        txtInOut.setText(display);
        
        try {
        double x = Double.parseDouble(txtInOut.getText());
        } 
        
        catch (NumberFormatException nfe) {
            errorDecimal.showMessageDialog(this, "ERROR: The number cannot have multiple decimal points",
                 "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        Double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(number);
        calculate.setOperator('*');
        txtInOut.setText("");
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        Double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(number);
        calculate.setOperator('/');
        txtInOut.setText("");
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        Double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(number);
        calculate.setOperator('+');
        txtInOut.setText("");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        Double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(number);
        calculate.setOperator('-');
        txtInOut.setText("");
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void mnuBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuBoldActionPerformed
        // Set text to bold
        Font font = txtInOut.getFont();
        txtInOut.setFont(font.deriveFont(Font.BOLD));
    }//GEN-LAST:event_mnuBoldActionPerformed

    private void mnuPlainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuPlainActionPerformed
        // Set text to plain
        Font font = txtInOut.getFont();
        txtInOut.setFont(font.deriveFont(Font.PLAIN));
    }//GEN-LAST:event_mnuPlainActionPerformed

    private void mnu0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu0ActionPerformed
        // Round number to 0
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,0);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu0ActionPerformed

    private void btnCAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCAActionPerformed
        double number;
        number = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(number);
        double clear = calculate.clearAll();
        txtInOut.setText("");
    }//GEN-LAST:event_btnCAActionPerformed

    private void mnu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu1ActionPerformed
        // Round number to 1
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,1);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu1ActionPerformed

    private void mnu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu3ActionPerformed
        // Round number to 3
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,3);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu3ActionPerformed

    private void mnu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu4ActionPerformed
        // Round number to 4
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,4);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu4ActionPerformed

    private void mnu6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu6ActionPerformed
        // Round number to 6
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,6);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu6ActionPerformed

    private void mnu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu7ActionPerformed
        // Round number to 7
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,7);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu7ActionPerformed

    private void mnu8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu8ActionPerformed
        // Round number to 8
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,8);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu8ActionPerformed

    private void mnu9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu9ActionPerformed
        // Round number to 9
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,9);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu9ActionPerformed

    private void mnu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnu5ActionPerformed
        // Round number to 5
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,5);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_mnu5ActionPerformed

    private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
        txtInOut.setText("");
    }//GEN-LAST:event_btnCEActionPerformed

    private void btnDividedByXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDividedByXActionPerformed
        //divide 1 by x
        double x;
        double y;
        x = Double.parseDouble(txtInOut.getText());
        if (x == 0){
            txtInOut.setText("");
            errorDecimal.showMessageDialog(this, "Division by zero is not allowed",
                    "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        else {
            y = 1/x;
            txtInOut.setText(String.valueOf(y));
        }
    }//GEN-LAST:event_btnDividedByXActionPerformed

    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSinActionPerformed
        //sin
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.sin(x)));
        
        if (radDegrees.isSelected()) {
            double y = 0;
            y = x * Math.PI/180;
            txtInOut.setText(String.valueOf(Math.sin(y)));
        }
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnSinActionPerformed

    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCosActionPerformed
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.cos(x)));
        
        if (radDegrees.isSelected()) {
            double y = 0;
            y = x * Math.PI/180;
            txtInOut.setText(String.valueOf(Math.cos(y)));
        }
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnCosActionPerformed

    private void btnAsinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsinActionPerformed
        //Asin
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.asin(x)));
        
        if (radDegrees.isSelected()) {
            x = Double.parseDouble(txtInOut.getText());
            x = Math.toDegrees(x);
            txtInOut.setText(String.valueOf(x));
        }
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnAsinActionPerformed

    private void btnAcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcosActionPerformed
        //Acos
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.acos(x)));
        
        if (radDegrees.isSelected()) {
            x = Double.parseDouble(txtInOut.getText());
            x = Math.toDegrees(x);
            txtInOut.setText(String.valueOf(x));
        }
        
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnAcosActionPerformed

    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTanActionPerformed
        //tan
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.tan(x)));
        
        if (radDegrees.isSelected()) {
            double y = 0;
            y = x * Math.PI/180;
            txtInOut.setText(String.valueOf(Math.tan(y)));
        }
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnTanActionPerformed

    private void btnAtanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtanActionPerformed
        //Tan
        double x = 0;
        x = Double.parseDouble(txtInOut.getText());
        txtInOut.setText(String.valueOf(Math.atan(x)));
        
        if (radDegrees.isSelected()) {
            x = Double.parseDouble(txtInOut.getText());
            x = Math.toDegrees(x);
            txtInOut.setText(String.valueOf(x));
        }
        
        String toBeRounded = txtInOut.getText();
        String rounded = calculate.roundTo(toBeRounded,2);
        txtInOut.setText(rounded);
    }//GEN-LAST:event_btnAtanActionPerformed

    private void btnPIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPIActionPerformed
        // PI
        txtInOut.setText(String.valueOf(Math.PI));
    }//GEN-LAST:event_btnPIActionPerformed

    private void btnFactorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFactorialActionPerformed
        // calculate factorial
        int x;
        int y;
        int fact = 1;
        
        try {
            x = Integer.parseInt(txtInOut.getText());
        
            if ((x >= 0) && (x <=20)) {
                for (y =1 ;y <= x ; y++) {
                    fact = fact*y;
                }
                txtInOut.setText(String.valueOf(fact));
            }
        
            else {
                errorZero.showMessageDialog ( this, "ERROR: Please provide a positive integer "
                   + "between 0 and 20", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
            }   
        }
        catch (NumberFormatException nfe) {
            errorZero.showMessageDialog ( this, "ERROR: Please provide a positive integer "
                    + "between 0 and 20", "ERROR", javax.swing.JOptionPane.ERROR_MESSAGE);
        }     
    }//GEN-LAST:event_btnFactorialActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        //E
        txtInOut.setText(String.valueOf(Math.E));
    }//GEN-LAST:event_btnEActionPerformed

    private void btnNegPosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNegPosActionPerformed
        // change number from negative to positive and vice versa
        Double x = Double.parseDouble(txtInOut.getText());
        x *= -1;
        txtInOut.setText(String.valueOf(x));
    }//GEN-LAST:event_btnNegPosActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        // To the power of
        Double x;
        x = Double.parseDouble(txtInOut.getText());
        calculate.setNum1(x);
        calculate.setOperator('^');
        txtInOut.setText("");
    }//GEN-LAST:event_btnPowerActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgrDeRa;
    private javax.swing.ButtonGroup bgrFont;
    private javax.swing.ButtonGroup bgrHelp;
    private javax.swing.ButtonGroup bgrRound;
    private javax.swing.ButtonGroup bgrView;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAcos;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAsin;
    private javax.swing.JButton btnAtan;
    private javax.swing.JButton btnCA;
    private javax.swing.JButton btnCE;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnDividedByX;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFactorial;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNegPos;
    private javax.swing.JButton btnPI;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnTan;
    private javax.swing.JOptionPane errorDecimal;
    private javax.swing.JOptionPane errorZero;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JRadioButtonMenuItem mnu0;
    private javax.swing.JRadioButtonMenuItem mnu1;
    private javax.swing.JRadioButtonMenuItem mnu2;
    private javax.swing.JRadioButtonMenuItem mnu3;
    private javax.swing.JRadioButtonMenuItem mnu4;
    private javax.swing.JRadioButtonMenuItem mnu5;
    private javax.swing.JRadioButtonMenuItem mnu6;
    private javax.swing.JRadioButtonMenuItem mnu7;
    private javax.swing.JRadioButtonMenuItem mnu8;
    private javax.swing.JRadioButtonMenuItem mnu9;
    private javax.swing.JRadioButtonMenuItem mnuAbout;
    private javax.swing.JRadioButtonMenuItem mnuBasic;
    private javax.swing.JRadioButtonMenuItem mnuBold;
    private javax.swing.JRadioButtonMenuItem mnuExtended;
    private javax.swing.JMenu mnuFont;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JRadioButtonMenuItem mnuHotKeys;
    private javax.swing.JRadioButtonMenuItem mnuPlain;
    private javax.swing.JMenu mnuRound;
    private javax.swing.JMenu mnuView;
    private javax.swing.JOptionPane msgAbout;
    private javax.swing.JOptionPane msgMessage;
    private javax.swing.JPanel panelExtended;
    private javax.swing.JRadioButton radDegrees;
    private javax.swing.JRadioButton radRadians;
    private javax.swing.JTextField txtInOut;
    // End of variables declaration//GEN-END:variables
}
