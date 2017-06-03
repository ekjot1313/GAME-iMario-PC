
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ekjot
 */
public class mario1_2 extends javax.swing.JFrame {

    /**
     * Creates new form mario1_2
     */
    public mario1_2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        speed_slider = new javax.swing.JSlider();
        score_lbl = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tp = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        speed_slider.setBackground(new java.awt.Color(204, 204, 204));
        speed_slider.setForeground(new java.awt.Color(255, 0, 102));
        speed_slider.setMajorTickSpacing(10);
        speed_slider.setPaintLabels(true);
        speed_slider.setToolTipText("Speed");
        speed_slider.setValue(30);
        speed_slider.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Speed", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 14))); // NOI18N
        speed_slider.setFocusable(false);

        score_lbl.setFont(new java.awt.Font("Comic Sans MS", 3, 18)); // NOI18N
        score_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        score_lbl.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Score", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 3, 14))); // NOI18N

        lbl.setFont(new java.awt.Font("Comic Sans MS", 3, 26)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl.setFocusable(false);

        tp.setBackground(new java.awt.Color(0, 255, 255));
        tp.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        tp.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        tp.setEnabled(false);
        tp.setFocusable(false);
        jScrollPane2.setViewportView(tp);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(258, 258, 258)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(253, Short.MAX_VALUE)))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jLayeredPane1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(106, Short.MAX_VALUE)))
        );
        jLayeredPane1.setLayer(lbl, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 3, 16)); // NOI18N
        jButton1.setText("start");
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(score_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(speed_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(speed_slider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(score_lbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    String a[][]=new String[10][60];
   int old_pole_dist=6,man_y_pos=8,man_x_pos=2,jump=0,score=0;
    
    
    ActionListener screenListener=new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            print_to_screen();
            int speed=speed_slider.getValue();
            speed=1000-(speed*9);
            pole_bait.setDelay(speed);
            if(speed<=100){speed=75;}
            else if(speed<=500){speed=110;}
            else if(speed<=1000){speed=300;}
            
            man.setDelay(speed);
            pole_bait.start();
           
            
        }
    };
   
    ActionListener pole_baitListener=new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          update_pole();
            update_bait();
         new_pole();
            new_bait();
           
            
        }
    };
    
    ActionListener manListener=new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
            
             if(jump>0)
                {
                    update_man(0);
                
            
           
        }
        }
    };
    
    Timer screen=new Timer(5,screenListener);
     Timer pole_bait=new Timer(1,pole_baitListener);
      Timer man=new Timer(1,manListener);
    
    void reset()
    {
        stop();
        old_pole_dist=6;
        man_y_pos=8;
        man_x_pos=2;
        jump=0;
        score=0;
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<60;j++)
            {
                a[i][j]=" ";
                if(i==9)
                {
                    a[i][j]=":";
                }
            }
        }
        a[8][2]="Ɨ";
        a[8][59]=":";
        a[7][59]=":";
        a[6][59]=":";
        old_pole_dist=0;
        lbl.setText("");
        score_lbl.setText("");
    }
    
    void print_to_screen()
    {
        String str="";
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<60;j++)
            {
                str=str+a[i][j];
            }
            str=str+"\n";
        }
        tp.setText(str);
    }
    
    void update_pole()
    {
                a[6][0]=" ";
                a[7][0]=" ";
                a[8][0]=" ";
                for(int i=6;i<9;i++)
                {
            for(int j=1;j<60;j++)
            {
                if(a[i][j].equals(":"))
                {
                    if(a[i][j-1].equals("Ɨ"))
                    {
                        a[i][j-1]="Ɨ";
                        print_to_screen();
                        stop();
                    }
                        a[i][j-1]=":";
                        a[i][j]=" ";
                }
            }
        }

        old_pole_dist++;
    }
    
    
    void update_bait()
    {
         a[3][0]=" ";
                a[4][0]=" ";
                a[5][0]=" ";
          for(int i=3;i<6;i++)
        {
            for(int j=1;j<60;j++)
            {
                if(a[i][j]=="ŧ")
                {
                    if(a[i][j-1].equals("Ɨ"))
                    {
                        score++;
                        score_lbl.setText(score+"");
                        
                    }
                    a[i][j-1]="ŧ";
                    a[i][j]=" ";
                }
                
            }
        }
    }
    
    
    void update_man(int direction)
    {

        a[man_y_pos][man_x_pos]=" ";
        
       
        if(jump==1)
        {
            man_y_pos--;
        }
        else if(jump==2)
        {
            man_y_pos++;
        }
        if(man_y_pos==2)
        {
            jump=2;
        }
        else if(man_y_pos==8)
        {
            jump=0;
        }
        
        
        
            man_x_pos=man_x_pos+direction;
        
        
         if(a[man_y_pos][man_x_pos].equals(":"))
            {
                 a[man_y_pos][man_x_pos]="Ɨ";
                        print_to_screen();
                stop();
            }
            else if(a[man_y_pos][man_x_pos].equals("ŧ"))
            {
                score++;
                score_lbl.setText(""+score);
            }
                
            
            
            a[man_y_pos][man_x_pos]="Ɨ";
        
        
        
    }
    
    void new_pole()
    {
        int i=0;
            String temp=""+Math.random();
            temp=temp.substring(2,4);
            i=Integer.parseInt(temp);
            
            if((i>=0&&i<=25)&&(old_pole_dist>30))
            {
                a[8][59]=":";
                a[7][59]=":";
                a[6][59]=":";
                old_pole_dist=0;
            }
    }
    
    void new_bait()
    {
        int i=0;
            String temp=""+Math.random();
            temp=temp.substring(2,4);
            i=Integer.parseInt(temp);
           
          
            
            if(i>=0&&i<=3)
            {
                a[5][59]="ŧ";
            }
        else  if(i>25&&i<=27)
           
            {
                a[4][59]="ŧ";
            }
           else  if(i>50&&i<=53)
           
            {
                a[3][59]="ŧ";
            }
    }
  
    void stop()
    {
        screen.stop();
        pole_bait.stop();
        man.stop();
        lbl.setText("oppsss");
                
    }
    
    

    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        reset();
        screen.start();

        man.start();

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed

        if(man_y_pos==8)
        {
        
        if(evt.getKeyCode()==KeyEvent.VK_UP)
        {

                jump++;
             
        }
        else  if(evt.getKeyCode()==KeyEvent.VK_RIGHT&&man_x_pos<59)
        {
            update_man(1);
      
        }
        else  if(evt.getKeyCode()==KeyEvent.VK_LEFT&&man_x_pos>1)
        {
            update_man(-1);
          
        }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(mario1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mario1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mario1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mario1_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mario1_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel score_lbl;
    private javax.swing.JSlider speed_slider;
    private javax.swing.JTextPane tp;
    // End of variables declaration//GEN-END:variables
}
