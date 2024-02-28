
package Maytinh;

import javax.swing.JOptionPane;

public class Maytinh extends javax.swing.JFrame {

    double enterNum1,enterNum2;
    double result;
    String math;

    public Maytinh() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jResult = new javax.swing.JTextField();
        jPlus = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        jMinus = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        jMul = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j1 = new javax.swing.JButton();
        jDiv = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j0 = new javax.swing.JButton();
        jEqual = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jResult.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResultActionPerformed(evt);
            }
        });
        getContentPane().add(jResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 460, 60));

        jPlus.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jPlus.setText("+");
        jPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPlusActionPerformed(evt);
            }
        });
        getContentPane().add(jPlus, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 80, 60));

        j9.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j9.setText("9");
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        getContentPane().add(j9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 80, 60));

        j7.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j7.setText("7");
        j7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j7ActionPerformed(evt);
            }
        });
        getContentPane().add(j7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 80, 60));

        jMinus.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jMinus.setText("-");
        jMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMinusActionPerformed(evt);
            }
        });
        getContentPane().add(jMinus, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 80, 60));

        j8.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j8.setText("8");
        j8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j8ActionPerformed(evt);
            }
        });
        getContentPane().add(j8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 80, 60));

        j6.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j6.setText("6");
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        getContentPane().add(j6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 80, 60));

        j4.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j4.setText("4");
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        getContentPane().add(j4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, 80, 60));

        jMul.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jMul.setText("*");
        jMul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMulActionPerformed(evt);
            }
        });
        getContentPane().add(jMul, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 80, 60));

        j5.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j5.setText("5");
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        getContentPane().add(j5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 80, 60));

        j3.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j3.setText("3");
        j3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j3ActionPerformed(evt);
            }
        });
        getContentPane().add(j3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 80, 60));

        j1.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j1.setText("1");
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        getContentPane().add(j1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, 60));

        jDiv.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jDiv.setText("/");
        jDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDivActionPerformed(evt);
            }
        });
        getContentPane().add(jDiv, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 80, 60));

        j2.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j2.setText("2");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });
        getContentPane().add(j2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 80, 60));

        j0.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        j0.setText("0");
        j0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j0ActionPerformed(evt);
            }
        });
        getContentPane().add(j0, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 80, 60));

        jEqual.setFont(new java.awt.Font("Dialog", 1, 23)); // NOI18N
        jEqual.setText("=");
        jEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEqualActionPerformed(evt);
            }
        });
        getContentPane().add(jEqual, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 200, 60));

        jButton2.setBackground(new java.awt.Color(255, 255, 51));
        jButton2.setFont(new java.awt.Font(".VnCourier NewH", 3, 14)); // NOI18N
        jButton2.setText("design by");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 470, 160, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhanh/bixn.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterNumbers(String a){
        String nums=jResult.getText()+a;
        jResult.setText(nums);
    }
    private void jResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jResultActionPerformed

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
           EnterNumbers("2");
    }//GEN-LAST:event_j2ActionPerformed

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
           EnterNumbers("4");
    }//GEN-LAST:event_j4ActionPerformed

    private void j7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j7ActionPerformed
           EnterNumbers("7");
    }//GEN-LAST:event_j7ActionPerformed

    private void j8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j8ActionPerformed
           EnterNumbers("8");
    }//GEN-LAST:event_j8ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
           EnterNumbers("1");
        // TODO add your handling code here:
    }//GEN-LAST:event_j1ActionPerformed

    private void j3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j3ActionPerformed
           EnterNumbers("3");
    }//GEN-LAST:event_j3ActionPerformed

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
           EnterNumbers("5");
    }//GEN-LAST:event_j5ActionPerformed

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
           EnterNumbers("6");
    }//GEN-LAST:event_j6ActionPerformed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
           EnterNumbers("9");
    }//GEN-LAST:event_j9ActionPerformed

    private void j0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j0ActionPerformed
           EnterNumbers("0");
    }//GEN-LAST:event_j0ActionPerformed

    private void jDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDivActionPerformed
       
        enterNum1=Double.parseDouble(jResult.getText());
        jResult.setText("");
        math="/";
        
    }//GEN-LAST:event_jDivActionPerformed

    private void jPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPlusActionPerformed

        enterNum1=Double.parseDouble(jResult.getText());
        jResult.setText("");
        math="+";
            }//GEN-LAST:event_jPlusActionPerformed

    private void jMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMinusActionPerformed

        enterNum1=Double.parseDouble(jResult.getText());
        jResult.setText("");
        math="-";
            }//GEN-LAST:event_jMinusActionPerformed

    private void jMulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMulActionPerformed

        enterNum1=Double.parseDouble(jResult.getText());
        jResult.setText("");
        math="*";
            }//GEN-LAST:event_jMulActionPerformed

    private void jEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEqualActionPerformed
        enterNum2=Double.parseDouble(jResult.getText());
        if(math=="+"){
          result=enterNum1+enterNum2;
          jResult.setText(String.valueOf(result));
        }
        else if (math=="-"){
          result=enterNum1-enterNum2;
          jResult.setText(String.valueOf(result));
        }
        else if (math=="*"){
          result=enterNum1*enterNum2;
          jResult.setText(String.valueOf(result));
        } 
        else if (math=="/"){
          result=enterNum1/enterNum2;
          jResult.setText(String.valueOf(result));
        }
    }//GEN-LAST:event_jEqualActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(this, "Phần mềm được phát triển bởi \n-----------HÀ ANH VŨ----------- ", "Thông Báo =))", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maytinh.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maytinh().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton j0;
    private javax.swing.JButton j1;
    private javax.swing.JButton j2;
    private javax.swing.JButton j3;
    private javax.swing.JButton j4;
    private javax.swing.JButton j5;
    private javax.swing.JButton j6;
    private javax.swing.JButton j7;
    private javax.swing.JButton j8;
    private javax.swing.JButton j9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jDiv;
    private javax.swing.JButton jEqual;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jMinus;
    private javax.swing.JButton jMul;
    private javax.swing.JButton jPlus;
    private javax.swing.JTextField jResult;
    // End of variables declaration//GEN-END:variables
}
