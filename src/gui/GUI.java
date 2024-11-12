package gui;

import java.awt.*;
import javax.swing.*;

public class GUI extends javax.swing.JFrame {

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menuButton = new javax.swing.JPanel();
        menuIcon = new javax.swing.JLabel();
        homeButton = new javax.swing.JPanel();
        homeIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cartButton = new javax.swing.JPanel();
        cartIcon = new javax.swing.JLabel();
        userButton = new javax.swing.JPanel();
        userIcon = new javax.swing.JLabel();
        menu = new javax.swing.JPanel();
        dashboardView = new gui.PanelCover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        header.setBackground(new java.awt.Color(66, 73, 73));
        header.setPreferredSize(new java.awt.Dimension(1000, 50));
        header.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(66, 73, 73));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menuButton.setBackground(new java.awt.Color(66, 73, 73));
        menuButton.setPreferredSize(new java.awt.Dimension(50, 50));
        menuButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuButtonMouseExited(evt);
            }
        });
        menuButton.setLayout(new java.awt.BorderLayout());

        menuIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menuIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/menu.png"))); // NOI18N
        menuButton.add(menuIcon, java.awt.BorderLayout.CENTER);

        jPanel1.add(menuButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        homeButton.setBackground(new java.awt.Color(66, 73, 73));
        homeButton.setPreferredSize(new java.awt.Dimension(50, 50));
        homeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeButtonMouseExited(evt);
            }
        });
        homeButton.setLayout(new java.awt.BorderLayout());

        homeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        homeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home.png"))); // NOI18N
        homeButton.add(homeIcon, java.awt.BorderLayout.CENTER);

        jPanel1.add(homeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        header.add(jPanel1, java.awt.BorderLayout.LINE_START);

        jPanel2.setBackground(new java.awt.Color(66, 73, 73));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 50));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cartButton.setBackground(new java.awt.Color(66, 73, 73));
        cartButton.setPreferredSize(new java.awt.Dimension(50, 50));
        cartButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cartButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cartButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cartButtonMouseExited(evt);
            }
        });
        cartButton.setLayout(new java.awt.BorderLayout());

        cartIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cartIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cart.png"))); // NOI18N
        cartButton.add(cartIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(cartButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        userButton.setBackground(new java.awt.Color(66, 73, 73));
        userButton.setPreferredSize(new java.awt.Dimension(50, 50));
        userButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userButtonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                userButtonMouseExited(evt);
            }
        });
        userButton.setLayout(new java.awt.BorderLayout());

        userIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/user.png"))); // NOI18N
        userButton.add(userIcon, java.awt.BorderLayout.CENTER);

        jPanel2.add(userButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        header.add(jPanel2, java.awt.BorderLayout.LINE_END);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        menu.setBackground(new java.awt.Color(97, 106, 107));
        menu.setPreferredSize(new java.awt.Dimension(250, 550));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(menu, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout dashboardViewLayout = new javax.swing.GroupLayout(dashboardView);
        dashboardView.setLayout(dashboardViewLayout);
        dashboardViewLayout.setHorizontalGroup(
            dashboardViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        dashboardViewLayout.setVerticalGroup(
            dashboardViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(dashboardView, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private boolean menuButtonClicked = false;
    private boolean homeButtonClicked = false;
    
    public void colorchange(JPanel hover, Color rand) {
        hover.setBackground(rand);
    }
    
    public void clickcolor (JPanel h1, JPanel h2, int numberbool) {
        System.out.println("clickcolor called with numberbool = " + numberbool);
        if (numberbool == 1) {
            h1.setBackground(new Color(0x616A6B));
            h2.setBackground(new Color(0x424949));
        }
        else {
            h1.setBackground(new Color(0x424949));
            h2.setBackground(new Color(0x616A6B));
        }
        h1.revalidate();
        h1.repaint();
        h2.revalidate();
        h2.repaint();
    }
    
    public void hideshow(JPanel menushowhide, boolean dashboard) {
        if (dashboard == true) {
            menushowhide.setPreferredSize(new Dimension(50, menushowhide.getHeight()));
        }
        else {
            menushowhide.setPreferredSize(new Dimension(250, menushowhide.getHeight())); 
        }
    }
    
    private void menuButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseEntered
        if (!menuButtonClicked) {
        colorchange(menuButton, new Color(0x616a6b));
        }
    }//GEN-LAST:event_menuButtonMouseEntered

    private void menuButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseExited
        if (!menuButtonClicked) {
        colorchange(menuButton, new Color(0x424949));
        }
    }//GEN-LAST:event_menuButtonMouseExited

    private void menuButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuButtonMouseClicked
        menuButtonClicked = !menuButtonClicked;
        if (menuButtonClicked) {
            clickcolor(menuButton, homeButton, 1);
        }
        else {
            clickcolor(menuButton, homeButton, 0);
        }
    }//GEN-LAST:event_menuButtonMouseClicked

    private void homeButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseEntered
        if (!homeButtonClicked) {
        colorchange(homeButton, new Color(0x616a6b));
        }
    }//GEN-LAST:event_homeButtonMouseEntered

    private void homeButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseExited
        if (!homeButtonClicked) {
        colorchange(homeButton, new Color(0x424949));
        }
    }//GEN-LAST:event_homeButtonMouseExited

    private void homeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeButtonMouseClicked
        clickcolor(homeButton, menuButton, 1);
    }//GEN-LAST:event_homeButtonMouseClicked

    private void cartButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonMouseEntered

    private void cartButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonMouseExited

    private void cartButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cartButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cartButtonMouseClicked

    private void userButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonMouseEntered

    private void userButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonMouseExited

    private void userButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userButtonMouseClicked
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cartButton;
    private javax.swing.JLabel cartIcon;
    private gui.PanelCover dashboardView;
    private javax.swing.JPanel header;
    private javax.swing.JPanel homeButton;
    private javax.swing.JLabel homeIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel menuButton;
    private javax.swing.JLabel menuIcon;
    private javax.swing.JPanel userButton;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
