/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package femtov;

import java.awt.Color;
import java.awt.Component;
import java.awt.Insets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;
/**
 *
 * @author pavel
 */
public class Interface extends javax.swing.JFrame {
    
    // Переменная для сохранения определения пути к директории с проектом
    Path currentDir = Paths.get(".");
    
    //  Специальный цвет для подсветки кнопок
    public static final Color BLUE_FOR_BUTTONS = new Color(100,158,242);
    public static final Color GRAY_FOR_BUTTONS = new Color(240,240,240);
    
    // Чекеры для проверки статуса включения/выключения каналов (меню слева)
    boolean on_off_ch1 = false;
    boolean on_off_ch2 = false;
    
    // Чекеры для проверки статуса включения/выключения каналов (меню справа)
    boolean on_off_ch1_r = false;
    boolean on_off_ch2_r = false;
    
    // Чекеры для проверки статуса кнопки включения/выключения
    boolean on_off_btn_ch1 = false;
    boolean on_off_btn_ch2 = false;
    
    // Чекеры для проверки нажатия кнопок нижнего меню
    boolean ch1 = true, ch2 = true, ch3 = true, ch4 = true, ch5 = true, ch6 = true, ch7 = true, ch8 = true, ch9 = true, ch10 = true;

    /**
     * Creates new form Interface
     */
    public Interface() {
        
        
        initComponents();
        
        //  НАКЛАДЫВАЕМ ЦВЕТ НА КНОПКИ НИЖНЕГО МЕНЮ
        
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  КНОПКИ ВЫБОРА
        
        JToggleButton jtb1 = jToggleButton1;
        JToggleButton jtb12 = jToggleButton12;
        JToggleButton jtb15 = jToggleButton15;
        JToggleButton jtb16 = jToggleButton16;
        JToggleButton jtb17 = jToggleButton17;
        
        // Прокрикиваем кнопки выбора
        jtb17.doClick();
        jtb16.doClick();
        jtb12.doClick();
        jtb15.doClick();
        jtb1.doClick();
         
        //jtb1.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jtb1.setOpaque(true);                           // Делает кнопку непрозрачной
        jtb1.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb12.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jtb12.setOpaque(true);                           // Делает кнопку непрозрачной
        jtb12.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb15.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jtb15.setOpaque(true);                           // Делает кнопку непрозрачной
        jtb15.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb16.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jtb16.setOpaque(true);                           // Делает кнопку непрозрачной
        jtb16.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb17.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jtb17.setOpaque(true);                           // Делает кнопку непрозрачной
        jtb17.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        JButton jb17 = jButton17;
        JButton jb18 = jButton18;
        JButton jb19 = jButton19;
        JButton jb20 = jButton20;
        JButton jb21 = jButton21;
        JButton jb22 = jButton22;
        JButton jb23 = jButton23;
        JButton jb24 = jButton24;
        JButton jb25 = jButton25;
        JButton jb26 = jButton26;
        JButton jb27 = jButton27;
        JButton jb28 = jButton28;
        JButton jb29 = jButton29;
        JButton jb30 = jButton30;
        JButton jb31 = jButton31;
        JButton jb32 = jButton32;
        JButton jb33 = jButton33;
        JButton jb34 = jButton34;
        JButton jb35 = jButton35;
        JButton jb36 = jButton36;
        
        //  Настройка внешнего вида кнопок
        jb17.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb17.setOpaque(true);                           // Делает кнопку непрозрачной
        jb17.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb18.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb18.setOpaque(true);                           // Делает кнопку непрозрачной
        jb18.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb19.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb19.setOpaque(true);                           // Делает кнопку непрозрачной
        jb19.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb20.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb20.setOpaque(true);                           // Делает кнопку непрозрачной
        jb20.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb21.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb21.setOpaque(true);                           // Делает кнопку непрозрачной
        jb21.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb22.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb22.setOpaque(true);                           // Делает кнопку непрозрачной
        jb22.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb23.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb23.setOpaque(true);                           // Делает кнопку непрозрачной
        jb23.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb24.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb24.setOpaque(true);                           // Делает кнопку непрозрачной
        jb24.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb25.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb25.setOpaque(true);                           // Делает кнопку непрозрачной
        jb25.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb26.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb26.setOpaque(true);                           // Делает кнопку непрозрачной
        jb26.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb27.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb27.setOpaque(true);                           // Делает кнопку непрозрачной
        jb27.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb28.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb28.setOpaque(true);                           // Делает кнопку непрозрачной
        jb28.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb29.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb29.setOpaque(true);                           // Делает кнопку непрозрачной
        jb29.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb30.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb30.setOpaque(true);                           // Делает кнопку непрозрачной
        jb30.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb31.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb31.setOpaque(true);                           // Делает кнопку непрозрачной
        jb31.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb32.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb32.setOpaque(true);                           // Делает кнопку непрозрачной
        jb32.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb33.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb33.setOpaque(true);                           // Делает кнопку непрозрачной
        jb33.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb34.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb34.setOpaque(true);                           // Делает кнопку непрозрачной
        jb34.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb35.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb35.setOpaque(true);                           // Делает кнопку непрозрачной
        jb35.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb36.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb36.setOpaque(true);                           // Делает кнопку непрозрачной
        jb36.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        // КНОПКИ ПРАВОГО МЕНЮ
        
        JButton jb37 = jButton37;
        JButton jb38 = jButton38;
        JButton jb39 = jButton39;
        JButton jb40 = jButton40;
        JButton jb41 = jButton41;
        JButton jb42 = jButton42;
        JButton jb43 = jButton43;
        JButton jb44 = jButton44;
        JButton jb45 = jButton45;
        JButton jb46 = jButton46;
        JButton jb47 = jButton47;
        JButton jb48 = jButton48;
        JButton jb49 = jButton49;
        JButton jb50 = jButton50;
        JButton jb51 = jButton51;
        
        jb37.setContentAreaFilled(false);
        jb37.setOpaque(true);
        jb37.setBorder(new LineBorder(Color.BLACK));
        
        jb38.setContentAreaFilled(false);
        jb38.setOpaque(true);
        jb38.setBorder(new LineBorder(Color.BLACK));
        
        jb39.setContentAreaFilled(false);
        jb39.setOpaque(true);
        jb39.setBorder(new LineBorder(Color.BLACK));
        
        jb40.setContentAreaFilled(false);
        jb40.setOpaque(true);
        jb40.setBorder(new LineBorder(Color.BLACK));
        
        jb41.setContentAreaFilled(false);
        jb41.setOpaque(true);
        jb41.setBorder(new LineBorder(Color.BLACK));
        
        jb42.setContentAreaFilled(false);
        jb42.setOpaque(true);
        jb42.setBorder(new LineBorder(Color.BLACK));
        
        jb43.setContentAreaFilled(false);
        jb43.setOpaque(true);
        jb43.setBorder(new LineBorder(Color.BLACK));
        
        jb44.setContentAreaFilled(false);
        jb44.setOpaque(true);
        jb44.setBorder(new LineBorder(Color.BLACK));
        
        jb45.setContentAreaFilled(false);
        jb45.setOpaque(true);
        jb45.setBorder(new LineBorder(Color.BLACK));
        
        jb46.setContentAreaFilled(false);
        jb46.setOpaque(true);
        jb46.setBorder(new LineBorder(Color.BLACK));
        
        jb47.setContentAreaFilled(false);
        jb47.setOpaque(true);
        jb47.setBorder(new LineBorder(Color.BLACK));
        
        jb48.setContentAreaFilled(false);
        jb48.setOpaque(true);
        jb48.setBorder(new LineBorder(Color.BLACK));
        
        jb49.setContentAreaFilled(false);
        jb49.setOpaque(true);
        jb49.setBorder(new LineBorder(Color.BLACK));
        
        jb50.setContentAreaFilled(false);
        jb50.setOpaque(true);
        jb50.setBorder(new LineBorder(Color.BLACK));
        
        jb51.setContentAreaFilled(false);
        jb51.setOpaque(true);
        jb51.setBorder(new LineBorder(Color.BLACK));
        
        // КНОПКИ НИЖНЕГО МЕНЮ
        
        JButton jb13 = jButton13;
        JButton jb14 = jButton14;
        JButton jb16 = jButton16;
        JButton jb52 = jButton52;
        JButton jb53 = jButton53;
        JButton jb54 = jButton54;
        JButton jb55 = jButton55;
        JButton jb58 = jButton58;
        JButton jb59 = jButton59;
        JButton jb62 = jButton62;
        
        jb13.setContentAreaFilled(false);
        jb13.setOpaque(true);
        jb13.setBorder(new LineBorder(Color.BLACK));
        
        jb14.setContentAreaFilled(false);
        jb14.setOpaque(true);
        jb14.setBorder(new LineBorder(Color.BLACK));
        
        jb16.setContentAreaFilled(false);
        jb16.setOpaque(true);
        jb16.setBorder(new LineBorder(Color.BLACK));
        
        jb52.setContentAreaFilled(false);
        jb52.setOpaque(true);
        jb52.setBorder(new LineBorder(Color.BLACK));
        
        jb53.setContentAreaFilled(false);
        jb53.setOpaque(true);
        jb53.setBorder(new LineBorder(Color.BLACK));
        
        jb54.setContentAreaFilled(false);
        jb54.setOpaque(true);
        jb54.setBorder(new LineBorder(Color.BLACK));
        
        jb55.setContentAreaFilled(false);
        jb55.setOpaque(true);
        jb55.setBorder(new LineBorder(Color.BLACK));
        
        jb58.setContentAreaFilled(false);
        jb58.setOpaque(true);
        jb58.setBorder(new LineBorder(Color.BLACK));
        
        jb59.setContentAreaFilled(false);
        jb59.setOpaque(true);
        jb59.setBorder(new LineBorder(Color.BLACK));
        
        jb62.setContentAreaFilled(false);
        jb62.setOpaque(true);
        jb62.setBorder(new LineBorder(Color.BLACK));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton60 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jToggleButton12 = new javax.swing.JToggleButton();
        jToggleButton15 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton16 = new javax.swing.JToggleButton();
        jToggleButton17 = new javax.swing.JToggleButton();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jPanel5 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jButton61 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jButton39 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton8 = new javax.swing.JToggleButton();
        jToggleButton7 = new javax.swing.JToggleButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jButton43 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton48 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jButton37 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jButton50 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jButton38 = new javax.swing.JButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jButton42 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton44 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Femto V   FemtoScope 9512   1,2 GHz   Pulse Pattern Generator");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(111, 111, 111));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 226, 255));
        jLabel2.setText("Levels");

        jButton60.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_cancel.png"))); // NOI18N

        jButton11.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_help.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel5.setText("Complement");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setText("Normal");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Polarity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Level Format");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NECL", "5-V PECL", "3.3-V PECL", "2.5-V PECL", "1.8-V PECL", "5-TTL", "3.3-V TTL", "2.5-V TTL", "LVDS", "CML", "3.3-V CML", "2.5-V CML", "1.8-V CML", "1.2-V CML", "5-V CMOS", "3.3-V CMOS", "2.5-V CMOS", "1.8-V CMOS", "1.5-V CMOS", "1.2-V CMOS", "0.8-V CMOS" }));
        jComboBox1.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Limits");

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_down.png"))); // NOI18N
        jButton17.setAlignmentY(0.0F);
        jButton17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton17.setVerifyInputWhenFocusTarget(false);

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_up.png"))); // NOI18N
        jButton18.setAlignmentY(0.0F);
        jButton18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton18.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton18.setVerifyInputWhenFocusTarget(false);

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton19.setAlignmentY(0.0F);
        jButton19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton19.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_down.png"))); // NOI18N
        jButton20.setAlignmentY(0.0F);
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton20.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton20.setVerifyInputWhenFocusTarget(false);

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_up.png"))); // NOI18N
        jButton21.setAlignmentY(0.0F);
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton21.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton21.setVerifyInputWhenFocusTarget(false);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(1);
        jTextArea1.setText("3 V");
        jScrollPane3.setViewportView(jTextArea1);

        jToggleButton4.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/off_button.png"))); // NOI18N
        jToggleButton4.setBorder(null);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("High Voltage");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Low Voltage");

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(1);
        jTextArea2.setText("-3 V");
        jScrollPane4.setViewportView(jTextArea2);

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_down.png"))); // NOI18N
        jButton22.setAlignmentY(0.0F);
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton22.setIconTextGap(0);
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_up.png"))); // NOI18N
        jButton23.setAlignmentY(0.0F);
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton23.setIconTextGap(0);
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton24.setAlignmentY(0.0F);
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton24.setIconTextGap(0);
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_down.png"))); // NOI18N
        jButton25.setAlignmentY(0.0F);
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton25.setIconTextGap(0);
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_up.png"))); // NOI18N
        jButton26.setAlignmentY(0.0F);
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton26.setIconTextGap(0);
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(1);
        jTextArea3.setText("3 V");
        jScrollPane5.setViewportView(jTextArea3);

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_down.png"))); // NOI18N
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_up.png"))); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_down.png"))); // NOI18N
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_up.png"))); // NOI18N
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Low");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("High");

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea4.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea4.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea4.setLineWrap(true);
        jTextArea4.setRows(1);
        jTextArea4.setText("3 V");
        jTextArea4.setMinimumSize(new java.awt.Dimension(100, 17));
        jScrollPane6.setViewportView(jTextArea4);

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_down.png"))); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton33.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton33FocusGained(evt);
            }
        });
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton33MouseClicked(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jButton33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton33KeyPressed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_up.png"))); // NOI18N
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_down.png"))); // NOI18N
        jButton35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_up.png"))); // NOI18N
        jButton36.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jToggleButton12.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jToggleButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/icon_std_log2.png"))); // NOI18N
        jToggleButton12.setText("Standard Log");
        jToggleButton12.setAlignmentY(0.0F);
        jToggleButton12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton12ActionPerformed(evt);
            }
        });

        jToggleButton15.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jToggleButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/icon_high_low.png"))); // NOI18N
        jToggleButton15.setText("Offset");
        jToggleButton15.setAlignmentY(0.0F);
        jToggleButton15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton15.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton15ActionPerformed(evt);
            }
        });

        jToggleButton1.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/icon_high_low.png"))); // NOI18N
        jToggleButton1.setSelected(true);
        jToggleButton1.setText("High-Low");
        jToggleButton1.setAlignmentY(0.0F);
        jToggleButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jToggleButton16.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jToggleButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/icon_positive.png"))); // NOI18N
        jToggleButton16.setSelected(true);
        jToggleButton16.setText("Normal");
        jToggleButton16.setAlignmentY(0.0F);
        jToggleButton16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton16.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton16ActionPerformed(evt);
            }
        });

        jToggleButton17.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jToggleButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buttons/icon_negative.png"))); // NOI18N
        jToggleButton17.setText("Complement");
        jToggleButton17.setAlignmentY(0.0F);
        jToggleButton17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jToggleButton17.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton17ActionPerformed(evt);
            }
        });

        jToggleButton18.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/off_button.png"))); // NOI18N
        jToggleButton18.setBorder(null);
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/ch1_off.png"))); // NOI18N
        jToggleButton19.setBorder(null);
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/ch2_off.png"))); // NOI18N
        jToggleButton20.setBorder(null);
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, 0)
                                        .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel12))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jToggleButton17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jToggleButton4)
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(jToggleButton18))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel5))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton19)
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton20)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton16)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton15)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton12)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel15)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel14)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabel4)))
                .addGap(0, 33, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(111, 111, 111));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton7.setText("Mannual Trig/Gate");

        jButton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_next.png"))); // NOI18N
        jButton6.setToolTipText("");
        jButton6.setEnabled(false);

        jButton8.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_back.png"))); // NOI18N
        jButton8.setEnabled(false);

        jButton57.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_help.png"))); // NOI18N
        jButton57.setText("Help");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton57)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(47, 47, 47));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screen.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addGap(0, 41, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(111, 111, 111));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(187, 226, 255));
        jLabel17.setText("Timing");

        jButton61.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_help.png"))); // NOI18N

        jButton12.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_cancel.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel17)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(192, 192, 192));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 650));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_d.png"))); // NOI18N
        jButton39.setAlignmentY(0.0F);
        jButton39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_right.png"))); // NOI18N
        jButton46.setAlignmentY(0.0F);
        jButton46.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_d.png"))); // NOI18N
        jButton49.setAlignmentY(0.0F);
        jButton49.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_left.png"))); // NOI18N
        jButton45.setAlignmentY(0.0F);
        jButton45.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_left.png"))); // NOI18N
        jButton40.setAlignmentY(0.0F);
        jButton40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToggleButton9.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton9.setText("Delay");
        jToggleButton9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jToggleButton8.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton8.setText("DCycle");
        jToggleButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton8ActionPerformed(evt);
            }
        });

        jToggleButton7.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton7.setText("Width");
        jToggleButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jScrollPane10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea7.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea7.setColumns(20);
        jTextArea7.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea7.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea7.setLineWrap(true);
        jTextArea7.setRows(1);
        jTextArea7.setText("10 µs");
        jScrollPane10.setViewportView(jTextArea7);

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_right.png"))); // NOI18N
        jButton43.setAlignmentY(0.0F);
        jButton43.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jScrollPane9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea6.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea6.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea6.setLineWrap(true);
        jTextArea6.setRows(1);
        jTextArea6.setText("10 µs");
        jScrollPane9.setViewportView(jTextArea6);

        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_right.png"))); // NOI18N
        jButton48.setAlignmentY(0.0F);
        jButton48.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Period");

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_left.png"))); // NOI18N
        jButton37.setAlignmentY(0.0F);
        jButton37.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_right.png"))); // NOI18N
        jButton51.setAlignmentY(0.0F);
        jButton51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });

        jToggleButton10.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton10.setText("Phase");

        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_left.png"))); // NOI18N
        jButton50.setAlignmentY(0.0F);
        jButton50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_right.png"))); // NOI18N
        jButton38.setAlignmentY(0.0F);
        jButton38.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToggleButton11.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton11.setText("Freq");
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jScrollPane8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTextArea5.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        jTextArea5.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea5.setLineWrap(true);
        jTextArea5.setRows(1);
        jTextArea5.setText("10 ns");
        jScrollPane8.setViewportView(jTextArea5);

        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_left.png"))); // NOI18N
        jButton42.setAlignmentY(0.0F);
        jButton42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_big_right.png"))); // NOI18N
        jButton41.setAlignmentY(0.0F);
        jButton41.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Period");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Width");

        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_mid_d.png"))); // NOI18N
        jButton44.setAlignmentY(0.0F);
        jButton44.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silver/silver_icon_button_small_left.png"))); // NOI18N
        jButton47.setAlignmentY(0.0F);
        jButton47.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jToggleButton6.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        jToggleButton6.setText("Period");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton21.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/ch1_off.png"))); // NOI18N
        jToggleButton21.setBorder(null);
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/ch2_off.png"))); // NOI18N
        jToggleButton22.setBorder(null);
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(49, 49, 49))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel21)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jToggleButton7)
                                .addGap(0, 0, 0)
                                .addComponent(jToggleButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jToggleButton9)
                                        .addGap(0, 0, 0)
                                        .addComponent(jToggleButton10))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                            .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, 0)
                                            .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jToggleButton11)
                                        .addGap(0, 0, 0)
                                        .addComponent(jToggleButton6))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel22))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jToggleButton21)
                                        .addGap(4, 4, 4)
                                        .addComponent(jToggleButton22)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton49, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton50, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton51, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton43, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton46, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel18)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(6, 6, 6))
        );

        jPanel8.setBackground(new java.awt.Color(192, 192, 192));
        jPanel8.setFocusTraversalPolicyProvider(true);
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon-mouse-left.png"))); // NOI18N

        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_inputs.png"))); // NOI18N
        jButton14.setText("Mode");
        jButton14.setBorder(null);
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton58.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_pattern.png"))); // NOI18N
        jButton58.setText("Pattern");
        jButton58.setBorder(null);
        jButton58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton58.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_display.png"))); // NOI18N
        jButton13.setText("Display");
        jButton13.setBorder(null);
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_levels.png"))); // NOI18N
        jButton52.setText("Calibration");
        jButton52.setBorder(null);
        jButton52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton52.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_inputs.png"))); // NOI18N
        jButton59.setText("Inputs");
        jButton59.setBorder(null);
        jButton59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton59.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_trigger.png"))); // NOI18N
        jButton16.setText("Trigger");
        jButton16.setBorder(null);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_timing.png"))); // NOI18N
        jButton54.setText("Timing");
        jButton54.setBorder(null);
        jButton54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton54.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_levels.png"))); // NOI18N
        jButton55.setText("Levels");
        jButton55.setBorder(null);
        jButton55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton55.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton62.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_outputs.png"))); // NOI18N
        jButton62.setText("Outputs");
        jButton62.setBorder(null);
        jButton62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton62.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton53.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_down_utilits.png"))); // NOI18N
        jButton53.setText("Utility");
        jButton53.setBorder(null);
        jButton53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton53.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon-mouse-right.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel23)
                            .addGap(0, 0, 0)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel8Layout.createSequentialGroup()
                                    .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, 0)
                                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(0, 0, 0)
                            .addComponent(jLabel16)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
                        .addComponent(jLabel16)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 0, 0)
                            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("View");
        jMenuBar1.add(jMenu3);

        jMenu4.setText("Setup");
        jMenuBar1.add(jMenu4);

        jMenu5.setText("System");
        jMenuBar1.add(jMenu5);

        jMenu6.setText("Utility");
        jMenuBar1.add(jMenu6);

        jMenu7.setText("Help");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 543, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jToggleButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton8ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // Делает кнопку синей при нажатии
        jToggleButton1.setUI(new MetalToggleButtonUI()
        {
            @Override
            protected Color getSelectColor()
            {
                return BLUE_FOR_BUTTONS;
            }
            
        });
        
        // Если выбрана эта кнопка другие не могуть быть выбраны
        if( jToggleButton1.isSelected() == true )
        {
            jToggleButton12.setSelected(false);
            jToggleButton15.setSelected(false);
            //  Возвращаем черный цвет тексту кнопок
            jToggleButton12.setForeground(Color.BLACK);
            jToggleButton15.setForeground(Color.BLACK);
        }
        // Если пользователь нажал эту же кнопку повторно
        if( jToggleButton1.isSelected() == false )
        {
            jToggleButton1.doClick();
        }
        
        // Также в случае выбора добавляет белый цвет тексту
        if( jToggleButton1.isSelected() == true )
        {
            jToggleButton1.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton15ActionPerformed
        // Делает кнопку синей при нажатии
        jToggleButton15.setUI(new MetalToggleButtonUI()
        {
            @Override
            protected Color getSelectColor()
            {
                return BLUE_FOR_BUTTONS;
            }
        });
        
        // Если выбрана эта кнопка другие не могуть быть выбраны
        if( jToggleButton15.isSelected() == true )
        {
            jToggleButton1.setSelected(false);
            jToggleButton12.setSelected(false);
            //  Возвращаем черный цвет тексту кнопок
            jToggleButton1.setForeground(Color.BLACK);
            jToggleButton12.setForeground(Color.BLACK);
        }
        // Если пользователь нажал эту же кнопку повторно
        if( jToggleButton15.isSelected() == false )
        {
            jToggleButton15.doClick();
        }
        
        // Также в случае выбора добавляет белый цвет тексту
        if( jToggleButton15.isSelected() == true )
        {
            jToggleButton15.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton15ActionPerformed

    private void jToggleButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton12ActionPerformed
        // Делает кнопку синей при нажатии
        jToggleButton12.setUI(new MetalToggleButtonUI()
        {
            @Override
            protected Color getSelectColor()
            {
                return BLUE_FOR_BUTTONS;
            }
        });
        
        // Если выбрана эта кнопка другие не могуть быть выбраны
        if( jToggleButton12.isSelected() == true )
        {
            jToggleButton1.setSelected(false);
            jToggleButton15.setSelected(false);
            //  Возвращаем черный цвет тексту кнопок
            jToggleButton1.setForeground(Color.BLACK);
            jToggleButton15.setForeground(Color.BLACK);
        }
        // Если пользователь нажал эту же кнопку повторно
        if( jToggleButton12.isSelected() == false )
        {
            jToggleButton12.doClick();
        }
        
        // Также в случае выбора добавляет белый цвет тексту
        if( jToggleButton12.isSelected() == true )
        {
            jToggleButton12.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton12ActionPerformed

    private void jToggleButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton16ActionPerformed
        // Делает кнопку синей при нажатии
        jToggleButton16.setUI(new MetalToggleButtonUI()
        {
            @Override
            protected Color getSelectColor()
            {
                return BLUE_FOR_BUTTONS;
            }
        });
        
        // Если выбрана эта кнопка другие не могуть быть выбраны
        if( jToggleButton16.isSelected() == true )
        {
            jToggleButton17.setSelected(false);
            //  Возвращаем черный цвет тексту кнопок
            jToggleButton17.setForeground(Color.BLACK);
        }
        // Если пользователь нажал эту же кнопку повторно
        if( jToggleButton16.isSelected() == false )
        {
            jToggleButton16.doClick();
        }
        // Также в случае выбора добавляет белый цвет тексту
        if( jToggleButton16.isSelected() == true )
        {
            jToggleButton16.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton16ActionPerformed

    private void jToggleButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton17ActionPerformed
        // Делает кнопку синей при нажатии
        jToggleButton17.setUI(new MetalToggleButtonUI()
        {
            @Override
            protected Color getSelectColor()
            {
                return BLUE_FOR_BUTTONS;
            }
        });
        
        // Если выбрана эта кнопка другие не могуть быть выбраны
        if( jToggleButton17.isSelected() == true )
        {
            jToggleButton16.setSelected(false);
            //  Возвращаем черный цвет тексту кнопок
            jToggleButton16.setForeground(Color.BLACK);
        }
        // Если пользователь нажал эту же кнопку повторно
        if( jToggleButton17.isSelected() == false )
        {
            jToggleButton17.doClick();
        }
        
        // Также в случае выбора добавляет белый цвет тексту
        if( jToggleButton17.isSelected() == true )
        {
            jToggleButton17.setForeground(Color.WHITE);
        }
    }//GEN-LAST:event_jToggleButton17ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch8 == false ){ch8 = true; jButton14.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch8 == true ){ ch8 = false; jButton14.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch4 == false ){ch4 = true; jButton58.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch4 == true ){ ch4 = false; jButton58.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch1 == false ){ch1 = true; jButton13.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch1 == true ){ ch1 = false; jButton13.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch3 == false ){ch3 = true; jButton52.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch3 == true ){ ch3 = false; jButton52.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch5 == false ){ch5 = true; jButton59.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch5 == true ){ ch5 = false; jButton59.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch2 == false ){ch2 = true; jButton16.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch2 == true ){ ch2 = false; jButton16.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch9 == false ){ch9 = true; jButton54.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch9 == true ){ ch9 = false; jButton54.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch10 == false ){ch10 = true; jButton55.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch10 == true ){ ch10 = false; jButton55.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch6 == false ){ch6 = true; jButton62.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch6 == true ){ ch6 = false; jButton62.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch7 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch7 == false ){ch7 = true; jButton53.setBackground(GRAY_FOR_BUTTONS);}
        else if( ch7 == true ){ ch7 = false; jButton53.setBackground(BLUE_FOR_BUTTONS);}

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch8 = true;
        ch9 = true;
        ch10 = true;
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // Меняем иконку
        if( on_off_btn_ch1 == false )
        {
            on_off_btn_ch1 = true;
            jToggleButton18.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\on_button.png"));
        }
        else if( on_off_btn_ch1 == true )
        {
            on_off_btn_ch1 = false;
            jToggleButton18.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\off_button.png"));
        }
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // Меняем иконку
        if( on_off_btn_ch2 == false )
        {
            on_off_btn_ch2 = true;
            jToggleButton4.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\on_button.png"));
        }
        else if( on_off_btn_ch2 == true )
        {
            on_off_btn_ch2 = false;
            jToggleButton4.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\off_button.png"));
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // Меняем иконку
        if( on_off_ch1 == false )
        {
            on_off_ch1 = true;
            jToggleButton19.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch1_on.png"));
        }
        else if( on_off_ch1 == true )
        {
            on_off_ch1 = false;
            jToggleButton19.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch1_off.png"));
        }
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // Меняем иконку
        if( on_off_ch2 == false )
        {
            on_off_ch2 = true;
            jToggleButton20.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch2_on.png"));
        }
        else if( on_off_ch2 == true )
        {
            on_off_ch2 = false;
            jToggleButton20.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch2_off.png"));
        }
    }//GEN-LAST:event_jToggleButton20ActionPerformed

    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // Меняем иконку
        if( on_off_ch1_r == false )
        {
            on_off_ch1_r = true;
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch1_on.png"));
        }
        else if( on_off_ch1_r == true )
        {
            on_off_ch1_r = false;
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch1_off.png"));
        }
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // Меняем иконку
        if( on_off_ch2_r == false )
        {
            on_off_ch2_r = true;
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch2_on.png"));
        }
        else if( on_off_ch2_r == true )
        {
            on_off_ch2_r = false;
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\ch2_off.png"));
        }
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jButton33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseClicked

    }//GEN-LAST:event_jButton33MouseClicked

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
 
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton33KeyPressed
        
    }//GEN-LAST:event_jButton33KeyPressed

    private void jButton33FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton33FocusGained
        
    }//GEN-LAST:event_jButton33FocusGained

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton12;
    private javax.swing.JToggleButton jToggleButton15;
    private javax.swing.JToggleButton jToggleButton16;
    private javax.swing.JToggleButton jToggleButton17;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton7;
    private javax.swing.JToggleButton jToggleButton8;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}
