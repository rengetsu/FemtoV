/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package femtov; //  femtov - основной пакет программы

import transitions.Tabs;
import transitions.PopupMenu;
import transitions.Visibility;
import calculations.Calibrations;
import calculations.LevelStandard;
import java.awt.AWTEvent;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Toolkit;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;
import java.awt.event.AWTEventListener;
import java.awt.Font;
import java.awt.Component;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.geom.RoundRectangle2D;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.event.MouseEvent.MOUSE_CLICKED;
import java.awt.event.MouseListener;
import javax.swing.SwingUtilities;

/**
 *
 * @author PAVEL TROSTIANKO
 */

public class Interface extends javax.swing.JFrame {
    /* ГРАФИЧЕСКИЙ ИНТЕРФЕЙС ПРОГРАММЫ  */
    
    //  ВЫЗОВ КЛАССОВ
    Tabs            tabs            = new Tabs();
    PopupMenu       popupmenu       = new PopupMenu();
    Visibility      visibility      = new Visibility();
    Calibrations    calibrations    = new Calibrations();
    LevelStandard   levelStandard   = new LevelStandard();
    
    //  Переменная для сохранения определения пути к директории с проектом
    Path currentDir = Paths.get(".");
    
    //  Специальный цвет для подсветки кнопок
    public static final Color BLUE_FOR_BUTTONS = new Color(100,158,242);
    public static final Color GRAY_FOR_BUTTONS = new Color(240,240,240);
    
    //  ДАЛЕЕ ИДУТ ЧЕКЕРЫ
    
    //  Чекеры для проверки статуса включения/выключения каналов (меню слева)
    boolean on_off_ch1 = false;
    boolean on_off_ch2 = false;
    
    //  Чекеры для проверки статуса включения/выключения каналов (меню справа)
    boolean on_off_ch1_r = true;
    boolean on_off_ch2_r = false;
    
    //  Чекеры для проверки статуса кнопки включения/выключения
    boolean on_off_btn_ch1 = false;
    boolean on_off_btn_ch2 = false;
    
    //  Чекеры для проверки нажатия кнопок нижнего меню
    boolean ch1 = true, ch2 = true, ch3 = true, ch4 = true, ch5 = true, ch6 = true, ch7 = true, ch8 = true, ch9 = false, ch10 = false;
    
    //  Чекеры для проверки включения частоты и периода
    boolean peri_ch = true;
    boolean freq_ch = false;
    
    //  Чекеры для проверки включения частоты и периода
    boolean nrml_ch = true;
    boolean comp_ch = false;
    
    //  Чекеры для проверки включения high-low, offset и standard
    boolean hilo_ch = true;
    boolean ofst_ch = false;
    boolean stnd_ch = false;
    
    //  Чекеры для проверки задержки и фазы
    boolean delay_ch = true;
    boolean phase_ch = false;
    
    //  Чекеры для проверки задержки и фазы
    boolean width_ch = true;
    boolean dcycle_ch = false;
    
    /**
     * Создает форму для Interface
     */
    public Interface() {
        //  initComponents() регенерируется средой IDE при создании пользовательского интерфейса в редакторе графического интерфейса
        initComponents();
        
        //  ДАЛЕЕ ИДЕТ РЕДАКТИРУЕМЫЙ КОД ГРАФИЧЕСКОГО ИНТЕРФЕЙСА
        
        //  Делаем невозможным редактирование текстовых полей
        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField5.setEditable(false);
        jTextField6.setEditable(false);
        jTextField7.setEditable(false);
        
        //  АНИМАЦИИ ПРИ НАЖАТИИ НА КНОПКИ
        
        //  АНИМАЦИЯ КНОПОК ВЕРХНЕГО ЛЕВОГО МЕНЮ
        
        //  Анимация нажатия - Кнопка помощи
        jButton11.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));
        
        //  Анимация нажатия - Кнопка закрытия
        jButton60.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));
        
        //  АНИМАЦИЯ КНОПОК ВЕРХНЕГО ПРАВОГО МЕНЮ
        
        //  Анимация нажатия - Кнопка закрытия
        jButton12.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));
        
        //  Анимация нажатия - Кнопка помощи
        jButton61.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));
        
        //  АНИМАЦИЯ КНОПОК ВЕРХНЕГО СРЕДНЕГО МЕНЮ
        
        jButton6.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_left_cl.png"));
        jButton7.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\ManualTrigGate_cl.png"));
        jButton8.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_right_cl.png"));
        jButton57.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\HelpButton_cl.png"));
        
        //  АНИМАЦИЯ КНОПОК ЛЕВОГО МЕНЮ
        
        //  Анимация нажатия - Маленькая стрелка вниз
        jButton22.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        jButton56.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        jButton71.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        jButton72.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        
        //  Анимация нажатия - Маленькая стрелка вверх
        jButton23.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        jButton63.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        jButton70.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        jButton73.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        
        //  Анимация нажатия - Ноль
        jButton24.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        jButton64.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        jButton69.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        jButton74.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        
        //  Анимация нажатия - Большая стрелка вниз
        jButton25.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        jButton65.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        jButton68.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        jButton75.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        
        //  Анимация нажатия - Большая стрелка вверх
        jButton26.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        jButton66.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        jButton67.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        jButton76.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        
        //  АНИМАЦИЯ КНОПОК ПРАВОГО МЕНЮ
        
        //  Анимация нажатия - Маленькая стрелка влево
        jButton27.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        jButton32.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        jButton37.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        
        //  Анимация нажатия - Маленькая стрелка вправо
        jButton28.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        jButton33.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        jButton38.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        
        //  Анимация нажатия - Дельта
        jButton29.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        jButton34.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        jButton39.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        
        //  Анимация нажатия - Большая стрелка влево
        jButton30.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        jButton35.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        jButton40.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        
        //  Анимация нажатия - Большая стрелка вправо
        jButton31.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        jButton36.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        jButton41.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        
        //  КОМБО БОКС ПО ВЫБОРЕ ИЗ ТАБЛИЦЫ СТАНДАРТОВ
        
        //  Переменная количества элементов в массиве таблицы стандартов
        int fam_mas_qt  = 21;
        
        //  Массив таблицы стандартов
        String[] fam_mas =
        {
            "NECL", "5-V PECL", "3.3-V PECL", "2.5-V PECL", "1.8-V PECL",
            "5-V TTL", "3-V TTL", "2.5-V TTL", "LVDS", "CML",
            "3.3-V CML", "2.5-V CML", "1.8-V CML", "1.2-V CML",
            "5-V CMOS", "3.3-V CMOS", "2.5-V CMOS", "1.8-V CMOS",
            "1.5-V CMOS", "1.2-V CMOS", "0.8-V CMOS"
        };
        
        //  Кнопка выбора
        Choice chc1 = choice1;
        
        //  Цикл добавления элементов в кнопку выбора из масcива
        for (int i = 0; i < fam_mas_qt; i++)
        {
            chc1.add( fam_mas [ i ] );
        }
        
        //  ЗДЕСЬ ЗАКАНЧИВАЕТСЯ КОД ОТНОСЯЩИЙСЯ К КНОПКАМ МЕНЮ
    }
    
    /**
     * Этот метод вызывается из конструктора для инициализации формы.
     * ВНИМАНИЕ: НЕ изменяйте этот код. Содержание этого метода всегда
     * Код восстановлен редактором форм.
     */
    //  ДАЛЕЕ СГЕНЕРИРОВАННЫЙ КОД
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton60 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jToggleButton18 = new javax.swing.JToggleButton();
        jToggleButton19 = new javax.swing.JToggleButton();
        jToggleButton20 = new javax.swing.JToggleButton();
        jToggleButton24 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton25 = new javax.swing.JToggleButton();
        jToggleButton11 = new javax.swing.JToggleButton();
        jToggleButton26 = new javax.swing.JToggleButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton56 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        choice1 = new java.awt.Choice();
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
        jLabel21 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jToggleButton21 = new javax.swing.JToggleButton();
        jToggleButton22 = new javax.swing.JToggleButton();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton23 = new javax.swing.JToggleButton();
        jToggleButton9 = new javax.swing.JToggleButton();
        jToggleButton27 = new javax.swing.JToggleButton();
        jButton28 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jLabel28 = new javax.swing.JLabel();
        jButton30 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jToggleButton10 = new javax.swing.JToggleButton();
        jToggleButton28 = new javax.swing.JToggleButton();
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
        jPanel11 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
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
        setBackground(new java.awt.Color(192, 192, 192));
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(111, 111, 111));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(187, 226, 255));
        jLabel2.setText("Levels");

        jButton60.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_button.png"))); // NOI18N
        jButton60.setAlignmentY(0.0F);
        jButton60.setIconTextGap(0);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });

        jButton11.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help_button.png"))); // NOI18N
        jButton11.setAlignmentY(0.0F);
        jButton11.setIconTextGap(0);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Compl");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Normal");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Polarity");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Level Format");

        jToggleButton4.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off_button.png"))); // NOI18N
        jToggleButton4.setBorder(null);
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("High Limit");

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Low Limit");

        jLabel14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel14.setText("Low Level");

        jLabel15.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel15.setText("High Level");

        jToggleButton18.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off_button.png"))); // NOI18N
        jToggleButton18.setBorder(null);
        jToggleButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton18ActionPerformed(evt);
            }
        });

        jToggleButton19.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch1_off.png"))); // NOI18N
        jToggleButton19.setBorder(null);
        jToggleButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton19ActionPerformed(evt);
            }
        });

        jToggleButton20.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch2_off.png"))); // NOI18N
        jToggleButton20.setBorder(null);
        jToggleButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton20ActionPerformed(evt);
            }
        });

        jToggleButton24.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/complement_off.png"))); // NOI18N
        jToggleButton24.setAlignmentY(0.0F);
        jToggleButton24.setBorder(null);
        jToggleButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normal_on.png"))); // NOI18N
        jToggleButton6.setAlignmentY(0.0F);
        jToggleButton6.setBorder(null);
        jToggleButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton25.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offset_off.png"))); // NOI18N
        jToggleButton25.setAlignmentY(0.0F);
        jToggleButton25.setBorder(null);
        jToggleButton25.setIconTextGap(0);
        jToggleButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton25ActionPerformed(evt);
            }
        });

        jToggleButton11.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-low_on.png"))); // NOI18N
        jToggleButton11.setAlignmentY(0.0F);
        jToggleButton11.setBorder(null);
        jToggleButton11.setIconTextGap(0);
        jToggleButton11.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton11ActionPerformed(evt);
            }
        });

        jToggleButton26.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/std_off.png"))); // NOI18N
        jToggleButton26.setAlignmentY(0.0F);
        jToggleButton26.setBorder(null);
        jToggleButton26.setIconTextGap(0);
        jToggleButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        jButton22.setAlignmentY(0.0F);
        jButton22.setBorder(null);
        jButton22.setIconTextGap(0);
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        jButton23.setAlignmentY(0.0F);
        jButton23.setBorder(null);
        jButton23.setIconTextGap(0);
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton24.setAlignmentY(0.0F);
        jButton24.setBorder(null);
        jButton24.setIconTextGap(0);
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        jButton25.setAlignmentY(0.0F);
        jButton25.setBorder(null);
        jButton25.setIconTextGap(0);
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        jButton26.setAlignmentY(0.0F);
        jButton26.setBorder(null);
        jButton26.setIconTextGap(0);
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("-3 V");
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel24.setAlignmentY(0.0F);

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("3 V");
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        jButton56.setAlignmentY(0.0F);
        jButton56.setBorder(null);
        jButton56.setIconTextGap(0);
        jButton56.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        jButton63.setAlignmentY(0.0F);
        jButton63.setBorder(null);
        jButton63.setIconTextGap(0);
        jButton63.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton64.setAlignmentY(0.0F);
        jButton64.setBorder(null);
        jButton64.setIconTextGap(0);
        jButton64.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        jButton65.setAlignmentY(0.0F);
        jButton65.setBorder(null);
        jButton65.setIconTextGap(0);
        jButton65.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        jButton66.setAlignmentY(0.0F);
        jButton66.setBorder(null);
        jButton66.setIconTextGap(0);
        jButton66.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        jButton67.setAlignmentY(0.0F);
        jButton67.setBorder(null);
        jButton67.setIconTextGap(0);
        jButton67.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        jButton68.setAlignmentY(0.0F);
        jButton68.setBorder(null);
        jButton68.setIconTextGap(0);
        jButton68.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton69.setAlignmentY(0.0F);
        jButton69.setBorder(null);
        jButton69.setIconTextGap(0);
        jButton69.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton69.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton69ActionPerformed(evt);
            }
        });

        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        jButton70.setAlignmentY(0.0F);
        jButton70.setBorder(null);
        jButton70.setIconTextGap(0);
        jButton70.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton70ActionPerformed(evt);
            }
        });

        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        jButton71.setAlignmentY(0.0F);
        jButton71.setBorder(null);
        jButton71.setIconTextGap(0);
        jButton71.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton71.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton71ActionPerformed(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel26.setAlignmentY(0.0F);

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("0.0 V");
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        jButton72.setAlignmentY(0.0F);
        jButton72.setBorder(null);
        jButton72.setIconTextGap(0);
        jButton72.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton72.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton72ActionPerformed(evt);
            }
        });

        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        jButton73.setAlignmentY(0.0F);
        jButton73.setBorder(null);
        jButton73.setIconTextGap(0);
        jButton73.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton73.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton73ActionPerformed(evt);
            }
        });

        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton74.setAlignmentY(0.0F);
        jButton74.setBorder(null);
        jButton74.setIconTextGap(0);
        jButton74.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton74.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton74ActionPerformed(evt);
            }
        });

        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        jButton75.setAlignmentY(0.0F);
        jButton75.setBorder(null);
        jButton75.setIconTextGap(0);
        jButton75.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton75ActionPerformed(evt);
            }
        });

        jButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        jButton76.setAlignmentY(0.0F);
        jButton76.setBorder(null);
        jButton76.setIconTextGap(0);
        jButton76.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel27.setAlignmentY(0.0F);

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("1 V");
        jTextField4.setAlignmentX(0.0F);
        jTextField4.setAlignmentY(0.0F);
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        choice1.setBackground(new java.awt.Color(0, 0, 0));
        choice1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice1.setFocusable(false);
        choice1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        choice1.setForeground(new java.awt.Color(255, 255, 255));
        choice1.setName(""); // NOI18N
        choice1.setEnabled(false);
        choice1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel24)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton19)
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel26)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jToggleButton11)
                    .addComponent(jToggleButton25)
                    .addComponent(jToggleButton26)
                    .addComponent(jLabel3)
                    .addComponent(jToggleButton6)
                    .addComponent(jToggleButton24)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jToggleButton6)
                        .addGap(0, 0, 0)
                        .addComponent(jToggleButton24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(3, 3, 3)
                        .addComponent(jToggleButton11)
                        .addGap(0, 0, 0)
                        .addComponent(jToggleButton25)
                        .addGap(0, 0, 0)
                        .addComponent(jToggleButton26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel27)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton74, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton75, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel26)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton71, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton69, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton67, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel24)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton56, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton63, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton66, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11)
                        .addGap(3, 3, 3)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel1)
                        .addGap(0, 0, 0)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(111, 111, 111));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setBackground(new java.awt.Color(111, 111, 111));
        jButton7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MannualTrigGate.png"))); // NOI18N
        jButton7.setToolTipText("");
        jButton7.setAlignmentY(0.0F);
        jButton7.setBorder(null);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton7.setIconTextGap(0);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_left.png"))); // NOI18N
        jButton6.setToolTipText("");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setIconTextGap(0);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton8.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_right.png"))); // NOI18N
        jButton8.setAlignmentY(0.0F);
        jButton8.setBorder(null);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton8.setIconTextGap(0);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton57.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HelpButton.png"))); // NOI18N
        jButton57.setAlignmentY(0.0F);
        jButton57.setBorder(null);
        jButton57.setIconTextGap(0);
        jButton57.setMargin(new java.awt.Insets(0, 0, 0, 0));
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
                .addGap(64, 64, 64)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(47, 47, 47));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/screen.png"))); // NOI18N
        jLabel10.setPreferredSize(new java.awt.Dimension(445, 405));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(111, 111, 111));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(187, 226, 255));
        jLabel17.setText("Timing");

        jButton61.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help_button.png"))); // NOI18N
        jButton61.setAlignmentY(0.0F);
        jButton61.setIconTextGap(0);

        jButton12.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_button.png"))); // NOI18N
        jButton12.setAlignmentY(0.0F);
        jButton12.setIconTextGap(0);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(192, 192, 192));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_line.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Delay");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_line.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Period");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Width");

        jToggleButton21.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch1_on.png"))); // NOI18N
        jToggleButton21.setBorder(null);
        jToggleButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton21ActionPerformed(evt);
            }
        });

        jToggleButton22.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch2_off.png"))); // NOI18N
        jToggleButton22.setBorder(null);
        jToggleButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton22ActionPerformed(evt);
            }
        });

        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/period_on.png"))); // NOI18N
        jToggleButton5.setAlignmentY(0.0F);
        jToggleButton5.setBorder(null);
        jToggleButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton23.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frequency_off.png"))); // NOI18N
        jToggleButton23.setAlignmentY(0.0F);
        jToggleButton23.setBorder(null);
        jToggleButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton9.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delay_on.png"))); // NOI18N
        jToggleButton9.setAlignmentY(0.0F);
        jToggleButton9.setBorder(null);
        jToggleButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton27.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phase_off.png"))); // NOI18N
        jToggleButton27.setAlignmentY(0.0F);
        jToggleButton27.setBorder(null);
        jToggleButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        jButton28.setAlignmentY(0.0F);
        jButton28.setBorder(null);
        jButton28.setIconTextGap(0);
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("200 ps");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        jButton29.setAlignmentY(0.0F);
        jButton29.setBorder(null);
        jButton29.setIconTextGap(0);
        jButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        jButton27.setAlignmentY(0.0F);
        jButton27.setBorder(null);
        jButton27.setIconTextGap(0);
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        jButton31.setAlignmentY(0.0F);
        jButton31.setBorder(null);
        jButton31.setIconTextGap(0);
        jButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel28.setAlignmentY(0.0F);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        jButton30.setAlignmentY(0.0F);
        jButton30.setBorder(null);
        jButton30.setIconTextGap(0);
        jButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        jButton32.setAlignmentY(0.0F);
        jButton32.setBorder(null);
        jButton32.setIconTextGap(0);
        jButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel29.setAlignmentY(0.0F);

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("0 s");
        jTextField6.setAlignmentX(0.0F);
        jTextField6.setAlignmentY(0.0F);
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField6MouseClicked(evt);
            }
        });
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        jButton33.setAlignmentY(0.0F);
        jButton33.setBorder(null);
        jButton33.setIconTextGap(0);
        jButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        jButton34.setAlignmentY(0.0F);
        jButton34.setBorder(null);
        jButton34.setIconTextGap(0);
        jButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        jButton35.setAlignmentY(0.0F);
        jButton35.setBorder(null);
        jButton35.setIconTextGap(0);
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        jButton36.setAlignmentY(0.0F);
        jButton36.setBorder(null);
        jButton36.setIconTextGap(0);
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        jButton37.setAlignmentY(0.0F);
        jButton37.setBorder(null);
        jButton37.setIconTextGap(0);
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        jLabel30.setAlignmentY(0.0F);

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("400 ps");
        jTextField7.setAlignmentX(0.0F);
        jTextField7.setAlignmentY(0.0F);
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField7MouseClicked(evt);
            }
        });
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        jButton38.setAlignmentY(0.0F);
        jButton38.setBorder(null);
        jButton38.setIconTextGap(0);
        jButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        jButton39.setAlignmentY(0.0F);
        jButton39.setBorder(null);
        jButton39.setIconTextGap(0);
        jButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        jButton40.setAlignmentY(0.0F);
        jButton40.setBorder(null);
        jButton40.setIconTextGap(0);
        jButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        jButton41.setAlignmentY(0.0F);
        jButton41.setBorder(null);
        jButton41.setIconTextGap(0);
        jButton41.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jToggleButton10.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/width_on.png"))); // NOI18N
        jToggleButton10.setAlignmentY(0.0F);
        jToggleButton10.setBorder(null);
        jToggleButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton28.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dcycle_off.png"))); // NOI18N
        jToggleButton28.setAlignmentY(0.0F);
        jToggleButton28.setBorder(null);
        jToggleButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5)
                            .addComponent(jToggleButton23)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel30)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jToggleButton21)
                                .addGap(4, 4, 4)
                                .addComponent(jToggleButton22))
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9)
                            .addComponent(jToggleButton27)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel28)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton10)
                            .addComponent(jToggleButton28))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jToggleButton5)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton23)
                .addGap(3, 3, 3)
                .addComponent(jLabel20)
                .addGap(3, 3, 3)
                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel30)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(12, 12, 12)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton21, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jToggleButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jToggleButton9)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton27)
                .addGap(3, 3, 3)
                .addComponent(jLabel19)
                .addGap(3, 3, 3)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel29)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton33, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton34, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton35, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton36, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jToggleButton10)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton28)
                .addGap(3, 3, 3)
                .addComponent(jLabel18)
                .addGap(3, 3, 3)
                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel28)
                .addGap(0, 0, 0)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(6, 6, 6))
        );

        jPanel8.setBackground(new java.awt.Color(192, 192, 192));
        jPanel8.setFocusTraversalPolicyProvider(true);
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Left.png"))); // NOI18N

        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mode_Off.png"))); // NOI18N
        jButton14.setAlignmentY(0.0F);
        jButton14.setBorder(null);
        jButton14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton14.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jButton58.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Pattern_Off.png"))); // NOI18N
        jButton58.setAlignmentY(0.0F);
        jButton58.setBorder(null);
        jButton58.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton58.setIconTextGap(0);
        jButton58.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton58.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });

        jButton13.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Display_Off.png"))); // NOI18N
        jButton13.setBorder(null);
        jButton13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton13.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton52.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Calibrat_Off.png"))); // NOI18N
        jButton52.setBorder(null);
        jButton52.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton52.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });

        jButton59.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Inputs_Off.png"))); // NOI18N
        jButton59.setAlignmentY(0.0F);
        jButton59.setBorder(null);
        jButton59.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton59.setIconTextGap(0);
        jButton59.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton59.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Trigger_Off.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Timing_On.png"))); // NOI18N
        jButton54.setBorder(null);
        jButton54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton54.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Levels_On.png"))); // NOI18N
        jButton55.setBorder(null);
        jButton55.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton55.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });

        jButton62.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Outputs_Off.png"))); // NOI18N
        jButton62.setAlignmentY(0.0F);
        jButton62.setBorder(null);
        jButton62.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton62.setIconTextGap(0);
        jButton62.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton62.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });

        jButton53.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Utility_Off.png"))); // NOI18N
        jButton53.setBorder(null);
        jButton53.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton53.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Right.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(16, 16, 16)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton58, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton59, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton52, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(47, 47, 47));

        jPanel4.setBackground(new java.awt.Color(47, 47, 47));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jPanel13.setBackground(new java.awt.Color(47, 47, 47));
        jPanel13.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Period = -1.02 us");

        jLabel31.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(252, 252, 132));
        jLabel31.setText("Delay(1) = 1.02 us");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(132, 252, 252));
        jLabel32.setText("Delay(2) = 1.02 us");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jLabel31)
                .addGap(3, 3, 3)
                .addComponent(jLabel32)
                .addGap(6, 6, 6))
        );

        jPanel14.setBackground(new java.awt.Color(47, 47, 47));
        jPanel14.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(" ");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(252, 252, 132));
        jLabel34.setText("Width(1) = 1.02 us");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(132, 252, 252));
        jLabel35.setText("Width(2) = 1.02 us");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addGap(3, 3, 3)
                .addComponent(jLabel34)
                .addGap(3, 3, 3)
                .addComponent(jLabel35)
                .addGap(6, 6, 6))
        );

        jPanel16.setBackground(new java.awt.Color(47, 47, 47));
        jPanel16.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText(" ");
        jLabel36.setToolTipText("");

        jLabel37.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(252, 252, 132));
        jLabel37.setText("Ampl(1) = -1.03V");

        jLabel38.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(132, 252, 252));
        jLabel38.setText("Ampl(2) = -1.03V");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addGap(3, 3, 3)
                .addComponent(jLabel37)
                .addGap(3, 3, 3)
                .addComponent(jLabel38)
                .addGap(6, 6, 6))
        );

        jPanel17.setBackground(new java.awt.Color(47, 47, 47));
        jPanel17.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText(" ");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(252, 252, 132));
        jLabel40.setText("Offset(1) = -1.03V");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(132, 252, 252));
        jLabel41.setText("Offset(2) = -1.03V");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel39)
                .addGap(3, 3, 3)
                .addComponent(jLabel40)
                .addGap(3, 3, 3)
                .addComponent(jLabel41)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch8 == false )
        {
            ch8 = true;
            jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
            
            //jButton14.setBackground(GRAY_FOR_BUTTONS);
            //jButton14.setForeground(Color.BLACK);
        }
        else if( ch8 == true )
        {
            ch8 = false;
            jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_On.png"));
            
            //jButton14.setBackground(BLUE_FOR_BUTTONS);
            //jButton14.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch4 == false )
        {
            ch4 = true;
            jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
            
            //jButton58.setBackground(GRAY_FOR_BUTTONS);
            //jButton58.setForeground(Color.BLACK);
        }
        else if( ch4 == true )
        {
            ch4 = false;
            jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_On.png"));
            
            //jButton58.setBackground(BLUE_FOR_BUTTONS);
            //jButton58.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch1 == false )
        {
            ch1 = true;
            jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
            
            //jButton13.setBackground(GRAY_FOR_BUTTONS);
            //jButton13.setForeground(Color.BLACK);
        }
        else if( ch1 == true )
        {
            ch1 = false;
            jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_On.png"));
            
            //jButton13.setBackground(BLUE_FOR_BUTTONS);
            //jButton13.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);
        
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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch3 == false )
        {
            ch3 = true;
            jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
            
            //jButton52.setBackground(GRAY_FOR_BUTTONS);
            //jButton52.setForeground(Color.BLACK);
        }
        else if( ch3 == true )
        {
            ch3 = false;
            jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_On.png"));
            
            //jButton52.setBackground(BLUE_FOR_BUTTONS);
            //jButton52.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch5 == false )
        {
            ch5 = true;
            jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
            
            //jButton59.setBackground(GRAY_FOR_BUTTONS);
            //jButton59.setForeground(Color.BLACK);
        }
        else if( ch5 == true )
        {
            ch5 = false;
            jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_On.png"));
            
            //jButton59.setBackground(BLUE_FOR_BUTTONS);
            //jButton59.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch2 == false )
        {
            ch2 = true;
            jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
            
            //jButton16.setBackground(GRAY_FOR_BUTTONS);
            //jButton16.setForeground(Color.BLACK);
        }
        else if( ch2 == true )
        {
            ch2 = false;
            jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_On.png"));
            
            //jButton16.setBackground(BLUE_FOR_BUTTONS);
            //jButton16.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch9 == false )
        {
            //  Закрываем вкладку "Timing" справа
            tabs.closeTab("Timing", "right");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch9 = true;
            jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
            //jButton54.setBackground(GRAY_FOR_BUTTONS);
            //jButton54.setForeground(Color.BLACK);
        }
        else if( ch9 == true )
        {
            //  Открываем вкладку "Timing" справа
            tabs.openTab("Timing", "right");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch9 = false;
            jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_On.png"));
            //jButton54.setBackground(BLUE_FOR_BUTTONS);
            //jButton54.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        //ch10 = true;
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        //jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch10 == false )
        {
            //  Закрываем вкладку "Levels" слева
            tabs.closeTab("Levels", "left");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch10 = true;
            jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
            
            //jButton55.setBackground(GRAY_FOR_BUTTONS);
            //jButton55.setForeground(Color.BLACK);
        }
        else if( ch10 == true )
        {
            //  Открываем вкладку "Levels" слева
            tabs.openTab("Levels", "left");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch10 = false;
            jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_On.png"));
            
            //jButton55.setBackground(BLUE_FOR_BUTTONS);
            //jButton55.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

        //  Меняем значение чекеров
        ch1 = true;
        ch2 = true;
        ch3 = true;
        ch4 = true;
        ch5 = true;
        ch6 = true;
        ch7 = true;
        ch8 = true;
        //ch9 = true;
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        //jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch6 == false )
        {
            ch6 = true;
            jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
            
            //jButton62.setBackground(GRAY_FOR_BUTTONS);
            //jButton62.setForeground(Color.BLACK);
        }
        else if( ch6 == true )
        {
            ch6 = false;
            jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_On.png"));
            
            //jButton62.setBackground(BLUE_FOR_BUTTONS);
            //jButton62.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        //  При нажатии подсвечивать синим
        if( ch7 == false )
        {
            ch7 = true;
            jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
            
            //jButton53.setBackground(GRAY_FOR_BUTTONS);
            //jButton53.setForeground(Color.BLACK);
        }
        else if( ch7 == true )
        {
            ch7 = false;
            jButton53.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_On.png"));
            
            //jButton53.setBackground(BLUE_FOR_BUTTONS);
            //jButton53.setForeground(Color.WHITE);
        }

        //  Остальные кнопки сделать серыми
        //jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        //jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        //jButton58.setBackground(GRAY_FOR_BUTTONS);
        //jButton59.setBackground(GRAY_FOR_BUTTONS);
        //jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  Текст остальных кнопок сделать черным
        //jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        //jButton52.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        //jButton58.setForeground(Color.BLACK);
        //jButton59.setForeground(Color.BLACK);
        //jButton62.setForeground(Color.BLACK);

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
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        jButton13.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        jButton14.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        jButton16.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        jButton52.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        jButton58.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        jButton59.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        jButton62.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jToggleButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton18ActionPerformed
        // Меняем иконку
        if( on_off_btn_ch1 == false )
        {
            //  Переключаем чекер
            on_off_btn_ch1 = true;
            
            //  Меняем картинку
            jToggleButton18.setIcon(new ImageIcon(currentDir + "\\src\\images\\on_button.png"));
        }
        else if( on_off_btn_ch1 == true )
        {
            //  Переключаем чекер
            on_off_btn_ch1 = false;
            
            //  Меняем картинку
            jToggleButton18.setIcon(new ImageIcon(currentDir + "\\src\\images\\off_button.png"));
        }
    }//GEN-LAST:event_jToggleButton18ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        // Меняем иконку
        if( on_off_btn_ch2 == false )
        {
            //  Переключаем чекер
            on_off_btn_ch2 = true;
            
            //  Меняем картинку
            jToggleButton4.setIcon(new ImageIcon(currentDir + "\\src\\images\\on_button.png"));
        }
        else if( on_off_btn_ch2 == true )
        {
            //  Переключаем чекер
            on_off_btn_ch2 = false;
            
            //  Меняем картинку
            jToggleButton4.setIcon(new ImageIcon(currentDir + "\\src\\images\\off_button.png"));
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void jToggleButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton19ActionPerformed
        // Меняем иконку
        if( on_off_ch1 == false )
        {
            //  Переключаем чекер
            on_off_ch1 = true;
            
            //  Меняем картинку
            jToggleButton19.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
        }
        else if( on_off_ch1 == true )
        {
            //  Переключаем чекер
            on_off_ch1 = false;
            
            //  Меняем картинку
            jToggleButton19.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
        }
    }//GEN-LAST:event_jToggleButton19ActionPerformed

    private void jToggleButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton20ActionPerformed
        // Меняем иконку
        if( on_off_ch2 == false )
        {
            //  Переключаем чекер
            on_off_ch2 = true;
            
            //  Меняем картинку
            jToggleButton20.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
        }
        else if( on_off_ch2 == true )
        {
            //  Переключаем чекер
            on_off_ch2 = false;
            
            //  Меняем картинку
            jToggleButton20.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
        }
    }//GEN-LAST:event_jToggleButton20ActionPerformed
    
    private void jToggleButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton21ActionPerformed
        // Меняем иконку
        if( on_off_ch1_r == false )
        {
            //  Переключаем чекер
            on_off_ch1_r = true;
            on_off_ch2_r = false;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
        }
        else if( on_off_ch1_r == true )
        {
            //  Переключаем чекер
            on_off_ch1_r = false;
            on_off_ch2_r = true;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
        }
    }//GEN-LAST:event_jToggleButton21ActionPerformed

    private void jToggleButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton22ActionPerformed
        // Меняем иконку
        if( on_off_ch2_r == false )
        {
            //  Переключаем чекер
            on_off_ch2_r = true;
            on_off_ch1_r = false;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
        }
        else if( on_off_ch2_r == true )
        {
            //  Переключаем чекер
            on_off_ch2_r = false;
            on_off_ch1_r = true;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
        }
    }//GEN-LAST:event_jToggleButton22ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // Меняем иконку
        if( peri_ch == true )
        {
            //  Ничего не происходит
        }
        else if( peri_ch == false )
        {
            //  Меняем текст
            jLabel20.setText("Period");
            
            //  Переключаем чекеры
            peri_ch = true;
            freq_ch = false;
            
            //  Устанавливаем текст относящийся к Period
            jTextField7.setText( calibrations.per_mas [ calibrations.per_mas_nmb ] );
            
            //  Меняеем картинки
            jToggleButton5.setIcon(new ImageIcon(currentDir + "\\src\\images\\period_on.png"));
            jToggleButton23.setIcon(new ImageIcon(currentDir + "\\src\\images\\frequency_off.png"));
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // Меняем иконку
        if( freq_ch == true )
        {
            //  Ничего не происходит
        }
        else if( freq_ch == false )
        {
            // Меняем текст
            jLabel20.setText("Frequency");
            
            //  Переключаем чекеры
            freq_ch = true;
            peri_ch = false;
            
            //  Устанавливаем текст относящийся к Period
            jTextField7.setText( calibrations.freq_mas [ calibrations.freq_mas_nmb ] );
            
            //  Меняеем картинки
            jToggleButton23.setIcon(new ImageIcon(currentDir + "\\src\\images\\frequency_on.png"));
            jToggleButton5.setIcon(new ImageIcon(currentDir + "\\src\\images\\period_off.png"));
        }
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // Меняем иконку
        if( comp_ch == true )
        {
            //  Ничего не происходит
        }
        else if( comp_ch == false )
        {
            //  Переключаем чекеры
            comp_ch = true;
            nrml_ch = false;
            
            //  Меняеем картинки
            jToggleButton24.setIcon(new ImageIcon(currentDir + "\\src\\images\\complement_on.png"));
            jToggleButton6.setIcon(new ImageIcon(currentDir + "\\src\\images\\normal_off.png"));
        }
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // Меняем иконку
        if( nrml_ch == true )
        {
            //  Ничего не происходит
        }
        else if( nrml_ch == false )
        {
            //  Переключаем чекеры
            nrml_ch = true;
            comp_ch = false;
            
            //  Меняеем картинки
            jToggleButton6.setIcon(new ImageIcon(currentDir + "\\src\\images\\normal_on.png"));
            jToggleButton24.setIcon(new ImageIcon(currentDir + "\\src\\images\\complement_off.png"));
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // Меняем иконку
        if( ofst_ch == true )
        {
            //  Ничего не происходит
        }
        else if( ofst_ch == false )
        {
            //  Меняем текст
            jLabel15.setText("Offset");
            jLabel14.setText("Amplitude");
            
            //  Переключаем чекеры
            ofst_ch = true;
            hilo_ch = false;
            stnd_ch = false;
            
            //  Меняеем картинки
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_on.png"));
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_off.png"));
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_off.png"));
        }
        
        //  Выключаем чекбокс (делаем затемненным)
        choice1.setEnabled(false);
        
        //  Делаем видимыми кнопки и шкалы относящиеся к этой секции
        jLabel26.setVisible(true);
        jLabel27.setVisible(true);
        jButton67.setVisible(true);
        jButton68.setVisible(true);
        jButton69.setVisible(true);
        jButton70.setVisible(true);
        jButton71.setVisible(true);
        jButton72.setVisible(true);
        jButton73.setVisible(true);
        jButton74.setVisible(true);
        jButton75.setVisible(true);
        jButton76.setVisible(true);
        
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        jLabel1.setVisible(true);
        jLabel8.setVisible(true);
        jLabel11.setVisible(true);
        jLabel24.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jButton22.setVisible(true);
        jButton23.setVisible(true);
        jButton24.setVisible(true);
        jButton25.setVisible(true);
        jButton26.setVisible(true);
        jButton56.setVisible(true);
        jButton63.setVisible(true);
        jButton64.setVisible(true);
        jButton65.setVisible(true);
        jButton66.setVisible(true);
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // Меняем иконку
        if( hilo_ch == true )
        {
            //  Ничего не происходит
        }
        else if( hilo_ch == false )
        {
            //  Меняем текст
            jLabel15.setText("High Level");
            jLabel14.setText("Low Level");
            
            //  Переключаем чекеры
            hilo_ch = true;
            ofst_ch = false;
            stnd_ch = false;
            
            //  Меняеем картинки
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_on.png"));
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_off.png"));
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_off.png"));
        }
        
        //  Выключаем чекбокс (делаем затемненным)
        choice1.setEnabled(false);
        
        //  Делаем видимыми кнопки и шкалы относящиеся к этой секции
        jLabel26.setVisible(true);
        jLabel27.setVisible(true);
        jButton67.setVisible(true);
        jButton68.setVisible(true);
        jButton69.setVisible(true);
        jButton70.setVisible(true);
        jButton71.setVisible(true);
        jButton72.setVisible(true);
        jButton73.setVisible(true);
        jButton74.setVisible(true);
        jButton75.setVisible(true);
        jButton76.setVisible(true);
        
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        jLabel1.setVisible(true);
        jLabel8.setVisible(true);
        jLabel11.setVisible(true);
        jLabel24.setVisible(true);
        jTextField1.setVisible(true);
        jTextField2.setVisible(true);
        jButton22.setVisible(true);
        jButton23.setVisible(true);
        jButton24.setVisible(true);
        jButton25.setVisible(true);
        jButton26.setVisible(true);
        jButton56.setVisible(true);
        jButton63.setVisible(true);
        jButton64.setVisible(true);
        jButton65.setVisible(true);
        jButton66.setVisible(true);
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // Меняем иконку
        if( stnd_ch == true )
        {
            //  Ничего не происходит
        }
        else if( stnd_ch == false )
        {
            //  Меняем текст
            jLabel15.setText("High Level");
            jLabel14.setText("Low Level");
            
            //  Переключаем чекеры
            stnd_ch = true;
            hilo_ch = false;
            ofst_ch = false;
            
            //  Меняеем картинки
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_on.png"));
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_off.png"));
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_off.png"));
        }
        
        //  Включаем чекбокс (делаем затемненным)
        choice1.setEnabled(true);
        
        //  Делаем невидимыми кнопки и шкалы относящиеся к этой секции
        jLabel26.setVisible(false);
        jLabel27.setVisible(false);
        jButton67.setVisible(false);
        jButton68.setVisible(false);
        jButton69.setVisible(false);
        jButton70.setVisible(false);
        jButton71.setVisible(false);
        jButton72.setVisible(false);
        jButton73.setVisible(false);
        jButton74.setVisible(false);
        jButton75.setVisible(false);
        jButton76.setVisible(false);
        
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        jLabel1.setVisible(false);
        jLabel8.setVisible(false);
        jLabel11.setVisible(false);
        jLabel24.setVisible(false);
        jTextField1.setVisible(false);
        jTextField2.setVisible(false);
        jButton22.setVisible(false);
        jButton23.setVisible(false);
        jButton24.setVisible(false);
        jButton25.setVisible(false);
        jButton26.setVisible(false);
        jButton56.setVisible(false);
        jButton63.setVisible(false);
        jButton64.setVisible(false);
        jButton65.setVisible(false);
        jButton66.setVisible(false);
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // Меняем иконку
        if( delay_ch == true )
        {
            //  Ничего не происходит
        }
        else if( delay_ch == false )
        {
            //  Меняем текст
            jLabel19.setText("Delay");
            
            //  Переключаем чекеры
            delay_ch = true;
            phase_ch = false;
            
            //  Устанавливаем текст относящийся к Delay
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.del_mas [ calibrations.del_mas_nmb ] );
            
            //  Меняеем картинки
            jToggleButton9.setIcon(new ImageIcon(currentDir + "\\src\\images\\delay_on.png"));
            jToggleButton27.setIcon(new ImageIcon(currentDir + "\\src\\images\\phase_off.png"));
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // Меняем иконку
        if( phase_ch == true )
        {
            //  Ничего не происходит
        }
        else if( phase_ch == false )
        {
            //  Меняем текст
            jLabel19.setText("Phase");
            
            //  Переключаем чекеры
            phase_ch = true;
            delay_ch = false;
            
            //  Устанавливаем текст относящийся к Phase
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.phas_mas [ calibrations.phas_mas_nmb ] );
            
            //  Меняеем картинки
            jToggleButton9.setIcon(new ImageIcon(currentDir + "\\src\\images\\delay_off.png"));
            jToggleButton27.setIcon(new ImageIcon(currentDir + "\\src\\images\\phase_on.png"));
        }
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения грубого шага Low Level на -0.05
        //  Увеличиваем значение переменной на +0.05
        calibrations.cl_Low_Level += 5;
        
        //  Округляем до ближайшего значения около 0.05
        calibrations.cl_Low_Level -= calibrations.cl_Low_Level % 5;
        
        //  Проверяем ограничения по верхнему пределу Low Level (2.4 V)
        if( calibrations.cl_Low_Level >= 240){calibrations.cl_Low_Level = 240;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField3.setText(qqq + " V");
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения грубого шага High Level на +0.05
        //  Увеличиваем значение переменной на +0.05
        calibrations.cl_High_Level += 5;
        
        //  Округляем до ближайшего значения около 0.05
        calibrations.cl_High_Level -= calibrations.cl_High_Level % 5;
        
        //  Проверяем ограничения по верхнему пределу High Level (2.5 V)
        if( calibrations.cl_High_Level >= 250){calibrations.cl_High_Level = 250;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField4.setText(qqq + " V");
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
            //  Если выбран 1 канал
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Повышаем значение переменной номера мас
                //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
                //if( calibrations.width_mas_nmb < 20 )
                //{
                //    calibrations.width_mas_nmb++;
                    
                //        calibrations.VDF(6, calibrations.width_mas_nmb_ch1, 1);
                    
                    
                //        calibrations.VDF(6, calibrations.width_mas_nmb, 2);
                //}
            }
        
        else if ( on_off_ch1_r == false && on_off_ch2_r == true )
        {
        
        }
            //  Устанавливаем значение Width
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb ] );
        }
        //  Если активен DCycle
        else if( dcycle_ch == true )
        {
            //  Округляем переменную до ближайшего значение делимого на 5, чтобы был ровный шаг
            calibrations.dcycle_percent = ( calibrations.dcycle_percent / 5 ) * 5;
            
            //  Проверяем не превышает ли переменная dcycle_percent максимальное значение
            if( ( calibrations.dcycle_percent + 5 ) < 101 )
            {
                //  Добавляем 5 процентов к значению переменной dcycle_percent
                calibrations.dcycle_percent += 5;
            }
            
            //  Конвертируем переменную процентов int в String
            String s = Integer.toString(calibrations.dcycle_percent);
            
            //  Устанавливаем значение
            jTextField5.setText(s + " %");
        }
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        //  Если активен Delay
        if( delay_ch == true )
        {
            //  Повышаем значение переменной номера мас
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //if( calibrations.del_mas_nmb < 21 )
            //{
            //    calibrations.del_mas_nmb++;
            //}

            //  Устанавливаем значение Delay
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb ] );
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  Повышаем значение переменной номера мас
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //if( calibrations.phas_mas_nmb < 21 )
            //{
            //    calibrations.phas_mas_nmb++;
            //}

            //  Устанавливаем значение Phase
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb ] );
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed
        
    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Повышаем значение переменной номера мас
            if( calibrations.per_mas_nmb < 20 )
            {
                calibrations.per_mas_nmb++;
            }

            //  Устанавливаем значение Period
            jTextField7.setText( calibrations.per_mas[ calibrations.per_mas_nmb ] );
        }
        //  Если активен Frequency
        else if( freq_ch == true )
        {
            //  Повышаем значение переменной номера мас
            if( calibrations.freq_mas_nmb < 19 )
            {
                calibrations.freq_mas_nmb++;
            }

            //  Устанавливаем значение Period
            jTextField7.setText( calibrations.freq_mas[ calibrations.freq_mas_nmb ] );
        }
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        //  Присваиваем значение Width
        
        String s;       //  Создаем переменную для хранения текстового значения
        s = "";         //  Присваиваем стандартное значение перменной
        
        //  Определяем значение li_width
        //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
        //if( calibrations.li_width < 1000 ){s = Integer.toString(calibrations.li_width);}        
        //else if( calibrations.li_width < 1000000 ){s = Integer.toString(calibrations.li_width/1000);}
        
        //  Определяем как будет выглядеть текстовое значение li_width
        //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
        //if( calibrations.li_width < 1000 ){jTextField5.setText(s + " ps");}
        //else if( calibrations.li_width < 1000000 ){jTextField5.setText(s + " ns");}
        
        // Меняем иконку
        if( width_ch == true )
        {
            //  Ничего не происходит
        }
        else if( width_ch == false )
        {
            //  Меняем текст
            jLabel18.setText("Width");
            
            //  Переключаем чекеры
            width_ch = true;
            dcycle_ch = false;
            
            //  Меняеем картинки
            jToggleButton10.setIcon(new ImageIcon(currentDir + "\\src\\images\\width_on.png"));
            jToggleButton28.setIcon(new ImageIcon(currentDir + "\\src\\images\\dcycle_off.png"));
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        //  Присваиваем значение DCycle
        String s = Integer.toString(calibrations.dcycle_percent);
        jTextField5.setText(s + " %");

        // Меняем иконку
        if( dcycle_ch == true )
        {
            //  Ничего не происходит
        }
        else if( dcycle_ch == false )
        {
            //  Меняем текст
            jLabel18.setText("Duty Cycle");
            
            //  Переключаем чекеры
            dcycle_ch = true;
            width_ch = false;
            
            //  Меняеем картинки
            jToggleButton10.setIcon(new ImageIcon(currentDir + "\\src\\images\\width_off.png"));
            jToggleButton28.setIcon(new ImageIcon(currentDir + "\\src\\images\\dcycle_on.png"));
        }
    }//GEN-LAST:event_jToggleButton28ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
            //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную
            String ans = calibrations.VDDF(6, calibrations.li_width_ch1, true, 1);
            
            //  Выводим результат
            jTextField5.setText(ans);
        }
        //  Если активен DCycle
        else if( dcycle_ch == true )
        {
            //  Проверяем не превышает ли переменная dcycle_percent максимальное значение
            if( ( calibrations.dcycle_percent + 1 ) < 101 )
            {
                //  Добавляем 1 процент к значению переменной dcycle_percent
                calibrations.dcycle_percent += 1;
            }
            
            //  Конвертируем переменную процентов int в String
            String s = Integer.toString(calibrations.dcycle_percent);
            
            //  Устанавливаем значение
            jTextField5.setText(s + " %");
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        
    }//GEN-LAST:event_jButton38ActionPerformed

    private void choice1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice1ItemStateChanged
        //  Получаем выбранное значение и сохраняем его в переменную
        String choiceSelectedItem = choice1.getSelectedItem();
        
        //  Отправляем его в функцию изменения значений High/Low Level
        levelStandard.changeLevelValues(choiceSelectedItem);
    }//GEN-LAST:event_choice1ItemStateChanged

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Понижаем значение переменной номера мас
            if( calibrations.per_mas_nmb > 0 )
            {
                calibrations.per_mas_nmb--;
            }

            //  Устанавливаем значение Period
            jTextField7.setText( calibrations.per_mas[ calibrations.per_mas_nmb ] );
        }
        //  Если активен Frequency
        else if( freq_ch == true )
        {
            //  Повышаем значение переменной номера мас
            if( calibrations.freq_mas_nmb > 0 )
            {
                calibrations.freq_mas_nmb--;
            }

            //  Устанавливаем значение Period
            jTextField7.setText( calibrations.freq_mas[ calibrations.freq_mas_nmb ] );
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Устанавливаем значение Period по дефолту
            jTextField7.setText( calibrations.per_mas[ 11 ] );
            calibrations.per_mas_nmb = 11;
        }
        //  Если активен Frequency
        else if( freq_ch == true )
        {
            jTextField7.setText( calibrations.freq_mas[ 9 ] );
            calibrations.freq_mas_nmb = 9;
        }
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton75ActionPerformed
        //  При нажатии калибровки уменьшаем пределы изменения грубого шага High Level на -0.05
        //  Уменьшаем значение переменной на -0.05
        calibrations.cl_High_Level -= 5;
        
        //  Округляем до ближайшего значения около 0.05
        calibrations.cl_High_Level -= calibrations.cl_High_Level % 5;
        
        //  Проверяем ограничения по нижнему пределу High Level (-1.9)
        if( calibrations.cl_High_Level <= -190){calibrations.cl_High_Level = -190;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField4.setText(qqq + " V");
    }//GEN-LAST:event_jButton75ActionPerformed

    private void jButton74ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton74ActionPerformed
        //  При нажатии калибровки выставляем пределы изменения High Level на ноль
        //  Присваиваем переменной значение ноль
        calibrations.cl_High_Level = 0;
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField4.setText(qqq + " V");
    }//GEN-LAST:event_jButton74ActionPerformed

    private void jButton73ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton73ActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения плавного шага High Level на +0.01
        //  Увеличиваем значение переменной на +0.01
        calibrations.cl_High_Level++;
        
        //  Проверяем ограничения по верхнему пределу High Level (2.5 V)
        if( calibrations.cl_High_Level >= 250){calibrations.cl_High_Level = 250;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField4.setText(qqq + " V");
    }//GEN-LAST:event_jButton73ActionPerformed

    private void jButton72ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton72ActionPerformed
        //   При нажатии калибровки уменьшаем пределы изменения плавного шага High Level на -0.01
        //  Уменьшаем значение переменной на -0.01
        calibrations.cl_High_Level--;
        
        //  Проверяем ограничения по нижнему пределу High Level (-1.9)
        if( calibrations.cl_High_Level <= -190){calibrations.cl_High_Level = -190;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField4.setText(qqq + " V");
    }//GEN-LAST:event_jButton72ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        //  При нажатии калибровки уменьшаем пределы изменения грубого шага Low Level на -0.05
        //  Уменьшаем значение переменной на -0.05
        calibrations.cl_Low_Level -= 5;
        
        //  Округляем до ближайшего значения около 0.05
        calibrations.cl_Low_Level -= calibrations.cl_Low_Level % 5;
        
        //  Проверяем ограничения по нижнему пределу Low Level (-2.0)
        if( calibrations.cl_Low_Level <= -200){calibrations.cl_Low_Level = -200;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField3.setText(qqq + " V");
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton69ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton69ActionPerformed
        //  При нажатии калибровки выставляем пределы изменения Low Level на ноль
        //  Присваиваем переменной значение ноль
        calibrations.cl_Low_Level = 0;
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField3.setText(qqq + " V");
    }//GEN-LAST:event_jButton69ActionPerformed

    private void jButton70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton70ActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения плавного шага Low Level на +0.01
        //  Увеличиваем значение переменной на +0.01
        calibrations.cl_Low_Level++;
        
        //  Проверяем ограничения по верхнему пределу High Level (2.4 V)
        if( calibrations.cl_Low_Level >= 240){calibrations.cl_Low_Level = 240;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField3.setText(qqq + " V");
    }//GEN-LAST:event_jButton70ActionPerformed

    private void jButton71ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton71ActionPerformed
        //   При нажатии калибровки уменьшаем пределы изменения плавного шага Low Level на -0.01
        //  Уменьшаем значение переменной на -0.01
        calibrations.cl_Low_Level--;
        
        //  Проверяем ограничения по нижнему пределу High Level (-1.9)
        if( calibrations.cl_Low_Level <= -200){calibrations.cl_Low_Level = -200;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        jTextField3.setText(qqq + " V");
    }//GEN-LAST:event_jButton71ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        //  Если активен Delay
        if( delay_ch == true )
        {
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //  Повышаем значение переменной номера мас
            //if( calibrations.del_mas_nmb > 0 )
            //{
            //    calibrations.del_mas_nmb--;
            //}

            //  Устанавливаем значение Delay
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb ] );
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  Повышаем значение переменной номера мас
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //if( calibrations.phas_mas_nmb > 0 )
            //{
            //    calibrations.phas_mas_nmb--;
            //}

            //  Устанавливаем значение Phase
            //jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb ] );
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        //  Если активен Delay
        if( delay_ch == true )
        {
            //  Устанавливаем значение Delay по дефолту
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.del_mas[ 7 ] );
            //calibrations.del_mas_nmb = 7;
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField6.setText( calibrations.phas_mas[ 7 ] );
            //calibrations.phas_mas_nmb = 7;
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(4);
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(3);
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(2);
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(1);
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField7MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(7);
    }//GEN-LAST:event_jTextField7MouseClicked

    private void jTextField6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField6MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(6);
    }//GEN-LAST:event_jTextField6MouseClicked

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(5);
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        //  Если активен Period
        if( width_ch == true )
        {
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //  Устанавливаем значение Width по дефолту
            //jTextField5.setText( calibrations.width_mas[ 5 ] );
            //calibrations.width_mas_nmb = 5;
            //calibrations.VDF(6, calibrations.width_mas_nmb);
        }
        //  Если активен DCycle
        else if( dcycle_ch == true )
        {
            //  Устанавливаем значение 50 %
            calibrations.dcycle_percent = 50;
            
            //  Конвертируем переменную процентов int в String
            String s = Integer.toString(calibrations.dcycle_percent);
            
            //  Устанавливаем значение
            jTextField5.setText(s + " %");
        }
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
            //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //String ans = calibrations.VDDF(6, calibrations.li_width, false);
            
            //  Выводим результат
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField5.setText(ans);
        }
        //  Если активен DCycle
        if( dcycle_ch == true )
        {
            //  Проверяем не является ли переменная dcycle_percent меньше минимального значения
            if( ( calibrations.dcycle_percent - 1 ) >= 0 )
            {
                //  Убавляем 1 процент от значения переменной dcycle_percent
                calibrations.dcycle_percent -= 1;
            }
            
            //  Конвертируем переменную процентов int в String
            String s = Integer.toString(calibrations.dcycle_percent);
            
            //  Устанавливаем значение
            jTextField5.setText(s + " %");
        }
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
        //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //  Понижаем значение переменной номера мас
            //if( calibrations.width_mas_nmb > 0 )
            //{
            //    calibrations.width_mas_nmb--;
            //    calibrations.VDF(6, calibrations.width_mas_nmb);
            //}

            //  Устанавливаем значение Width
            //  ПОТОМ ОТКОММЕНТИРОВАТЬ НАЗАД
            //jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb ] );
        }

        //  Если активен DCycle
        if( dcycle_ch == true )
        {
            //  Переменная для проверки делится ли процентное значение DCycle на 5
            boolean division_by_five = true;
            
            //  Проверяем делится ли настоящее значение dcycle_percent на 5
            if( calibrations.dcycle_percent > ( ( calibrations.dcycle_percent / 5 ) * 5 ) )
            {
                division_by_five = false;
            }
            else{division_by_five = true;}  //  В случае если нет возвращяем значение true
            
            //  Округляем переменную до ближайшего значение делимого на 5, чтобы был ровный шаг
            calibrations.dcycle_percent = ( calibrations.dcycle_percent / 5 ) * 5;
            
            //  Понижение значения процентов на 5 выполняется только в том случае если значение делится на 5 ровно, чтобы был ровный шаг
            if( division_by_five == true )
            {
                //  Проверяем не является ли переменная dcycle_percent меньше минимального значения
                if( ( calibrations.dcycle_percent - 5 ) >= 0 )
                {
                    //  Убавляем 5 процентов от значения переменной dcycle_percent
                    calibrations.dcycle_percent -= 5;
                }
            }
            
            //  Конвертируем переменную процентов int в String
            String s;
            s = Integer.toString(calibrations.dcycle_percent);
            
            //  Устанавливаем значение
            jTextField5.setText(s + " %");
        }
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        //  Закрываем вкладку "Timing"
        tabs.closeTab("Timing", "right");
        
        //  Меняем значение чекера и картинку на самой кнопке
        ch9 = true;
        jButton54.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        //  Закрываем вкладку "Levels"
        tabs.closeTab("Levels", "left");
        
        //  Меняем значение чекера и картинку на самой кнопке
        ch10 = true;
        jButton55.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32ActionPerformed

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
        
        /* Создает и отображает форму */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static java.awt.Choice choice1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    public static javax.swing.JButton jButton27;
    public static javax.swing.JButton jButton28;
    public static javax.swing.JButton jButton29;
    public static javax.swing.JButton jButton30;
    public static javax.swing.JButton jButton31;
    public static javax.swing.JButton jButton32;
    public static javax.swing.JButton jButton33;
    public static javax.swing.JButton jButton34;
    public static javax.swing.JButton jButton35;
    public static javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
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
    public static javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    public static javax.swing.JPanel jPanel2;
    public static javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JPanel jPanel5;
    public static javax.swing.JPanel jPanel6;
    public static javax.swing.JPanel jPanel7;
    public static javax.swing.JPanel jPanel8;
    public static javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JToggleButton jToggleButton10;
    private javax.swing.JToggleButton jToggleButton11;
    private javax.swing.JToggleButton jToggleButton18;
    private javax.swing.JToggleButton jToggleButton19;
    private javax.swing.JToggleButton jToggleButton20;
    private javax.swing.JToggleButton jToggleButton21;
    private javax.swing.JToggleButton jToggleButton22;
    private javax.swing.JToggleButton jToggleButton23;
    private javax.swing.JToggleButton jToggleButton24;
    private javax.swing.JToggleButton jToggleButton25;
    private javax.swing.JToggleButton jToggleButton26;
    public static javax.swing.JToggleButton jToggleButton27;
    public static javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    public static javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}