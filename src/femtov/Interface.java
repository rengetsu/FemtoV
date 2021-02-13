/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package femtov; //  femtov - основной пакет программы

import actions.Editability;
import actions.IconChanger;
import actions.Switches;
import transitions.Tabs;
import transitions.PopupMenu;
import transitions.Visibility;
import calculations.Calibrations;
import calculations.ChannelsUpdate;
import calculations.ChoiceStandard;
import calculations.LevelStandard;
import transitions.Animations;
import java.awt.Color;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;

/**
 *
 * @author PAVEL TROSTIANKO
 */

public class Interface extends javax.swing.JFrame {
    /* ГРАФИЧЕСКИЙ ИНТЕРФЕЙС ПРОГРАММЫ  */
    
    //  ВЫЗОВ КЛАССОВ
    Tabs            tabs            = new Tabs();
    Switches        switches        = new Switches();
    PopupMenu       popupmenu       = new PopupMenu();
    Visibility      visibility      = new Visibility();
    Editability     editability     = new Editability();
    Animations      animations      = new Animations();
    IconChanger     iconchanger     = new IconChanger();
    Calibrations    calibrations    = new Calibrations();
    LevelStandard   levelStandard   = new LevelStandard();
    ChannelsUpdate  channelsupdate  = new ChannelsUpdate();
    ChoiceStandard  choicestandard  = new ChoiceStandard();
    
    //  Переменная для сохранения определения пути к директории с проектом
    Path currentDir = Paths.get(".");
    
    //  Специальный цвет для подсветки кнопок
    public static final Color BLUE_FOR_BUTTONS = new Color(100,158,242);
    public static final Color GRAY_FOR_BUTTONS = new Color(240,240,240);
    
    //  ДАЛЕЕ ИДУТ ЧЕКЕРЫ
    
    //  Чекеры для проверки статуса включения/выключения каналов (меню слева)
    public static boolean on_off_ch1 = false;
    public static boolean on_off_ch2 = false;
    
    //  Чекеры для проверки статуса включения/выключения каналов (меню справа)
    public static boolean on_off_ch1_r = true;
    public static boolean on_off_ch2_r = false;
    
    //  Чекеры для проверки статуса кнопки включения/выключения
    public static boolean on_off_btn_ch1 = false;
    public static boolean on_off_btn_ch2 = false;
    
    //  Чекеры для проверки нажатия кнопок нижнего меню
    public static boolean ch1 = true, ch2 = true, ch3 = true, ch4 = true, ch5 = true, ch6 = true, ch7 = true, ch8 = true, ch9 = true, ch10 = true;
    
    //  Чекеры для проверки включения частоты и периода
    public static boolean peri_ch = true;
    public static boolean freq_ch = false;
    
    //  Чекеры для проверки включения частоты и периода
    public static boolean nrml_ch = true;
    public static boolean comp_ch = false;
    
    //  Чекеры для проверки включения high-low, offset и standard
    public static boolean hilo_ch = true;
    public static boolean ofst_ch = false;
    public static boolean stnd_ch = false;
    
    //  Чекеры для проверки задержки и фазы
    public static boolean delay_ch = true;
    public static boolean phase_ch = false;
    
    //  Чекеры для проверки задержки и фазы
    public static boolean width_ch = true;
    public static boolean dcycle_ch = false;
    
    //  ЗДЕСЬ ЗАКАНЧИВАЕТСЯ КОД ОТНОСЯЩИЙСЯ К КНОПКАМ МЕНЮ
    
    /**
     * Создает форму для Interface
     */
    public Interface() {
        //  initComponents() регенерируется средой IDE при создании пользовательского интерфейса в редакторе графического интерфейса
        initComponents();
        
        //  ДАЛЕЕ ИДЕТ РЕДАКТИРУЕМЫЙ КОД ГРАФИЧЕСКОГО ИНТЕРФЕЙСА
        
        //  ЗАПУСКАЕМ ВСЮ АНИМАЦИЮ ПРОГРАММЫ ЧЕРЕЗ ГЛАВНЫЙ КЛАСС АНИМАЦИЙ
        animations.startAnimations();
        
        //  ЗАПУСКАЕМ КОМБОБОКС ДЛЯ ВЫБОРА ИЗ ТАБЛИЦЫ СТАНДАРТОВ
        choicestandard.runChoice();
        
        //  ВЫКЛЮЧАЕМ РЕДАКТИРУЕМОСТЬ ТЕКСТОВЫХ ПОЛЕЙ
        editability.notEditableTextFields(false);
        
        //  ЗАКРЫВАЕМ ВКЛАДКИ (ПОТОМ СДЕЛАТЬ ИЗНАЧАЛЬНО ЗАКРЫТЫМИ)
        tabs.closeTab("Levels", "left");
        tabs.closeTab("Timing", "left");
        
        //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
        pack();
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
        panel_TopMenu = new javax.swing.JPanel();
        topMenu_ManualTrigGateButton = new javax.swing.JButton();
        topMenu_BackLeftButton = new javax.swing.JButton();
        topMenu_BackRightButton = new javax.swing.JButton();
        topMenu_HelpButton = new javax.swing.JButton();
        panel_Screen = new javax.swing.JPanel();
        ScreenImage = new javax.swing.JLabel();
        panel_CalibrationsScreen = new javax.swing.JPanel();
        panel_CalibrationsTable = new javax.swing.JPanel();
        panel_Calibrations_Delay = new javax.swing.JPanel();
        calibLabel_Period = new javax.swing.JLabel();
        calibLabel_DelayChOne = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        panel_Calibrations_Width = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        panel_Calibrations_Ampl = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        panel_Calibrations_Offset = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        panel_DownMenu = new javax.swing.JPanel();
        downMenu_ModeButton = new javax.swing.JButton();
        downMenu_TriggerButton = new javax.swing.JButton();
        downMenu_TimingButton = new javax.swing.JButton();
        downMenu_LevelsButton = new javax.swing.JButton();
        downMenu_PatternButton = new javax.swing.JButton();
        downMenu_InputsButton = new javax.swing.JButton();
        downMenu_OutputsButton = new javax.swing.JButton();
        downMenu_DisplayButton = new javax.swing.JButton();
        downMenu_CalibrationButton = new javax.swing.JButton();
        downMenu_UtilityButton = new javax.swing.JButton();
        downMenu_LeftLine = new javax.swing.JLabel();
        downMenu_RightMouseImage = new javax.swing.JLabel();
        downMenu_LeftMouseImage = new javax.swing.JLabel();
        downMenu_RightLine = new javax.swing.JLabel();
        panel_TopTab_Levels = new javax.swing.JPanel();
        topTab_Levels_TextLabel = new javax.swing.JLabel();
        topTab_Levels_CancelButton = new javax.swing.JButton();
        topTab_Levels_HelpButton = new javax.swing.JButton();
        panel_Tab_Levels = new javax.swing.JPanel();
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
        panel_TopTab_Timing = new javax.swing.JPanel();
        tobTab_Timing_TextLabel = new javax.swing.JLabel();
        topTab_Timing_CancelButton = new javax.swing.JButton();
        topTab_Timing_HelpButton = new javax.swing.JButton();
        panel_Tab_Timing = new javax.swing.JPanel();
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
        MenuBar = new javax.swing.JMenuBar();
        MenuBar_FileItem = new javax.swing.JMenu();
        MenuBar_EditItem = new javax.swing.JMenu();
        MenuBar_ViewItem = new javax.swing.JMenu();
        MenuBar_SetupItem = new javax.swing.JMenu();
        MenuBar_SystemItem = new javax.swing.JMenu();
        MenuBar_UtilityItem = new javax.swing.JMenu();
        MenuBar_HelpItem = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Femto V   FemtoScope 9512   1,2 GHz   Pulse Pattern Generator");
        setBackground(new java.awt.Color(192, 192, 192));
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        panel_TopMenu.setBackground(new java.awt.Color(111, 111, 111));

        topMenu_ManualTrigGateButton.setBackground(new java.awt.Color(111, 111, 111));
        topMenu_ManualTrigGateButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        topMenu_ManualTrigGateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/MannualTrigGate.png"))); // NOI18N
        topMenu_ManualTrigGateButton.setToolTipText("");
        topMenu_ManualTrigGateButton.setAlignmentY(0.0F);
        topMenu_ManualTrigGateButton.setBorder(null);
        topMenu_ManualTrigGateButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topMenu_ManualTrigGateButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        topMenu_ManualTrigGateButton.setIconTextGap(0);
        topMenu_ManualTrigGateButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        topMenu_ManualTrigGateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenu_ManualTrigGateButtonActionPerformed(evt);
            }
        });

        topMenu_BackLeftButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topMenu_BackLeftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_left.png"))); // NOI18N
        topMenu_BackLeftButton.setToolTipText("");
        topMenu_BackLeftButton.setAlignmentY(0.0F);
        topMenu_BackLeftButton.setBorder(null);
        topMenu_BackLeftButton.setIconTextGap(0);
        topMenu_BackLeftButton.setMargin(new java.awt.Insets(0, 0, 0, 0));

        topMenu_BackRightButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topMenu_BackRightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_right.png"))); // NOI18N
        topMenu_BackRightButton.setAlignmentY(0.0F);
        topMenu_BackRightButton.setBorder(null);
        topMenu_BackRightButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topMenu_BackRightButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        topMenu_BackRightButton.setIconTextGap(0);
        topMenu_BackRightButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        topMenu_BackRightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenu_BackRightButtonActionPerformed(evt);
            }
        });

        topMenu_HelpButton.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        topMenu_HelpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/HelpButton.png"))); // NOI18N
        topMenu_HelpButton.setAlignmentY(0.0F);
        topMenu_HelpButton.setBorder(null);
        topMenu_HelpButton.setIconTextGap(0);
        topMenu_HelpButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        topMenu_HelpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topMenu_HelpButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_TopMenuLayout = new javax.swing.GroupLayout(panel_TopMenu);
        panel_TopMenu.setLayout(panel_TopMenuLayout);
        panel_TopMenuLayout.setHorizontalGroup(
            panel_TopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TopMenuLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(topMenu_ManualTrigGateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topMenu_BackLeftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topMenu_BackRightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topMenu_HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_TopMenuLayout.setVerticalGroup(
            panel_TopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TopMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(topMenu_ManualTrigGateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(topMenu_BackLeftButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(topMenu_BackRightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(topMenu_HelpButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_Screen.setBackground(new java.awt.Color(47, 47, 47));

        ScreenImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/screen.png"))); // NOI18N
        ScreenImage.setPreferredSize(new java.awt.Dimension(445, 405));

        javax.swing.GroupLayout panel_ScreenLayout = new javax.swing.GroupLayout(panel_Screen);
        panel_Screen.setLayout(panel_ScreenLayout);
        panel_ScreenLayout.setHorizontalGroup(
            panel_ScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScreenImage, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        panel_ScreenLayout.setVerticalGroup(
            panel_ScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ScreenLayout.createSequentialGroup()
                .addComponent(ScreenImage, javax.swing.GroupLayout.PREFERRED_SIZE, 381, Short.MAX_VALUE)
                .addContainerGap())
        );

        panel_CalibrationsScreen.setBackground(new java.awt.Color(47, 47, 47));

        panel_CalibrationsTable.setBackground(new java.awt.Color(47, 47, 47));
        panel_CalibrationsTable.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        panel_Calibrations_Delay.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Delay.setPreferredSize(new java.awt.Dimension(101, 50));

        calibLabel_Period.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_Period.setForeground(new java.awt.Color(255, 255, 255));
        calibLabel_Period.setText("Period = -1.02 us");

        calibLabel_DelayChOne.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_DelayChOne.setForeground(new java.awt.Color(252, 252, 132));
        calibLabel_DelayChOne.setText("Delay(1) = 1.02 us");

        jLabel32.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(132, 252, 252));
        jLabel32.setText("Delay(2) = 1.02 us");

        javax.swing.GroupLayout panel_Calibrations_DelayLayout = new javax.swing.GroupLayout(panel_Calibrations_Delay);
        panel_Calibrations_Delay.setLayout(panel_Calibrations_DelayLayout);
        panel_Calibrations_DelayLayout.setHorizontalGroup(
            panel_Calibrations_DelayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_DelayLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_DelayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calibLabel_Period, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_DelayChOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_DelayLayout.setVerticalGroup(
            panel_Calibrations_DelayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_DelayLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(calibLabel_Period)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_DelayChOne)
                .addGap(3, 3, 3)
                .addComponent(jLabel32)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Width.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Width.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText(" ");

        jLabel34.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(252, 252, 132));
        jLabel34.setText("Width(1) = 1.02 us");

        jLabel35.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(132, 252, 252));
        jLabel35.setText("Width(2) = 1.02 us");

        javax.swing.GroupLayout panel_Calibrations_WidthLayout = new javax.swing.GroupLayout(panel_Calibrations_Width);
        panel_Calibrations_Width.setLayout(panel_Calibrations_WidthLayout);
        panel_Calibrations_WidthLayout.setHorizontalGroup(
            panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_WidthLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_WidthLayout.setVerticalGroup(
            panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_WidthLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel33)
                .addGap(3, 3, 3)
                .addComponent(jLabel34)
                .addGap(3, 3, 3)
                .addComponent(jLabel35)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Ampl.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Ampl.setPreferredSize(new java.awt.Dimension(101, 50));

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

        javax.swing.GroupLayout panel_Calibrations_AmplLayout = new javax.swing.GroupLayout(panel_Calibrations_Ampl);
        panel_Calibrations_Ampl.setLayout(panel_Calibrations_AmplLayout);
        panel_Calibrations_AmplLayout.setHorizontalGroup(
            panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_AmplLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_AmplLayout.setVerticalGroup(
            panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_AmplLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel36)
                .addGap(3, 3, 3)
                .addComponent(jLabel37)
                .addGap(3, 3, 3)
                .addComponent(jLabel38)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Offset.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Offset.setPreferredSize(new java.awt.Dimension(101, 50));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText(" ");

        jLabel40.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(252, 252, 132));
        jLabel40.setText("Offset(1) = -1.03V");

        jLabel41.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(132, 252, 252));
        jLabel41.setText("Offset(2) = -1.03V");

        javax.swing.GroupLayout panel_Calibrations_OffsetLayout = new javax.swing.GroupLayout(panel_Calibrations_Offset);
        panel_Calibrations_Offset.setLayout(panel_Calibrations_OffsetLayout);
        panel_Calibrations_OffsetLayout.setHorizontalGroup(
            panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_OffsetLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_OffsetLayout.setVerticalGroup(
            panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_OffsetLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel39)
                .addGap(3, 3, 3)
                .addComponent(jLabel40)
                .addGap(3, 3, 3)
                .addComponent(jLabel41)
                .addGap(6, 6, 6))
        );

        javax.swing.GroupLayout panel_CalibrationsTableLayout = new javax.swing.GroupLayout(panel_CalibrationsTable);
        panel_CalibrationsTable.setLayout(panel_CalibrationsTableLayout);
        panel_CalibrationsTableLayout.setHorizontalGroup(
            panel_CalibrationsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CalibrationsTableLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(panel_Calibrations_Delay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_Calibrations_Width, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_Calibrations_Ampl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_Calibrations_Offset, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        panel_CalibrationsTableLayout.setVerticalGroup(
            panel_CalibrationsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_CalibrationsTableLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panel_CalibrationsTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Calibrations_Delay, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Calibrations_Width, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Calibrations_Ampl, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Calibrations_Offset, 65, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout panel_CalibrationsScreenLayout = new javax.swing.GroupLayout(panel_CalibrationsScreen);
        panel_CalibrationsScreen.setLayout(panel_CalibrationsScreenLayout);
        panel_CalibrationsScreenLayout.setHorizontalGroup(
            panel_CalibrationsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CalibrationsScreenLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(panel_CalibrationsTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );
        panel_CalibrationsScreenLayout.setVerticalGroup(
            panel_CalibrationsScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_CalibrationsScreenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_CalibrationsTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_DownMenu.setBackground(new java.awt.Color(192, 192, 192));
        panel_DownMenu.setFocusTraversalPolicyProvider(true);
        panel_DownMenu.setPreferredSize(new java.awt.Dimension(600, 80));

        downMenu_ModeButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_ModeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mode_Off.png"))); // NOI18N
        downMenu_ModeButton.setAlignmentY(0.0F);
        downMenu_ModeButton.setBorder(null);
        downMenu_ModeButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_ModeButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_ModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_ModeButtonActionPerformed(evt);
            }
        });

        downMenu_TriggerButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_TriggerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Trigger_Off.png"))); // NOI18N
        downMenu_TriggerButton.setBorder(null);
        downMenu_TriggerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_TriggerButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_TriggerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_TriggerButtonActionPerformed(evt);
            }
        });

        downMenu_TimingButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_TimingButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Timing_Off.png"))); // NOI18N
        downMenu_TimingButton.setBorder(null);
        downMenu_TimingButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_TimingButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_TimingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_TimingButtonActionPerformed(evt);
            }
        });

        downMenu_LevelsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_LevelsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Levels_Off.png"))); // NOI18N
        downMenu_LevelsButton.setBorder(null);
        downMenu_LevelsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_LevelsButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_LevelsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_LevelsButtonActionPerformed(evt);
            }
        });

        downMenu_PatternButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_PatternButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Pattern_Off.png"))); // NOI18N
        downMenu_PatternButton.setAlignmentY(0.0F);
        downMenu_PatternButton.setBorder(null);
        downMenu_PatternButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_PatternButton.setIconTextGap(0);
        downMenu_PatternButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        downMenu_PatternButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_PatternButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_PatternButtonActionPerformed(evt);
            }
        });

        downMenu_InputsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_InputsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Inputs_Off.png"))); // NOI18N
        downMenu_InputsButton.setAlignmentY(0.0F);
        downMenu_InputsButton.setBorder(null);
        downMenu_InputsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_InputsButton.setIconTextGap(0);
        downMenu_InputsButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        downMenu_InputsButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_InputsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_InputsButtonActionPerformed(evt);
            }
        });

        downMenu_OutputsButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_OutputsButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Outputs_Off.png"))); // NOI18N
        downMenu_OutputsButton.setAlignmentY(0.0F);
        downMenu_OutputsButton.setBorder(null);
        downMenu_OutputsButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_OutputsButton.setIconTextGap(0);
        downMenu_OutputsButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        downMenu_OutputsButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_OutputsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_OutputsButtonActionPerformed(evt);
            }
        });

        downMenu_DisplayButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_DisplayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Display_Off.png"))); // NOI18N
        downMenu_DisplayButton.setBorder(null);
        downMenu_DisplayButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_DisplayButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_DisplayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_DisplayButtonActionPerformed(evt);
            }
        });

        downMenu_CalibrationButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_CalibrationButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Calibrat_Off.png"))); // NOI18N
        downMenu_CalibrationButton.setBorder(null);
        downMenu_CalibrationButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_CalibrationButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_CalibrationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_CalibrationButtonActionPerformed(evt);
            }
        });

        downMenu_UtilityButton.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        downMenu_UtilityButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Utility_Off.png"))); // NOI18N
        downMenu_UtilityButton.setBorder(null);
        downMenu_UtilityButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        downMenu_UtilityButton.setPreferredSize(new java.awt.Dimension(80, 18));
        downMenu_UtilityButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downMenu_UtilityButtonActionPerformed(evt);
            }
        });

        downMenu_LeftLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border_line.png"))); // NOI18N
        downMenu_LeftLine.setToolTipText("");

        downMenu_RightMouseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Right.png"))); // NOI18N

        downMenu_LeftMouseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Left.png"))); // NOI18N

        downMenu_RightLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border_line.png"))); // NOI18N
        downMenu_RightLine.setToolTipText("");

        javax.swing.GroupLayout panel_DownMenuLayout = new javax.swing.GroupLayout(panel_DownMenu);
        panel_DownMenu.setLayout(panel_DownMenuLayout);
        panel_DownMenuLayout.setHorizontalGroup(
            panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_DownMenuLayout.createSequentialGroup()
                .addComponent(downMenu_LeftLine)
                .addGap(5, 5, 5)
                .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_DownMenuLayout.createSequentialGroup()
                        .addComponent(downMenu_LeftMouseImage)
                        .addGap(16, 16, 16)
                        .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(downMenu_PatternButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downMenu_DisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_DownMenuLayout.createSequentialGroup()
                                .addComponent(downMenu_CalibrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(downMenu_UtilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_DownMenuLayout.createSequentialGroup()
                                .addComponent(downMenu_InputsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(downMenu_OutputsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(16, 16, 16)
                        .addComponent(downMenu_RightMouseImage, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_DownMenuLayout.createSequentialGroup()
                        .addComponent(downMenu_ModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(downMenu_TriggerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(downMenu_TimingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(downMenu_LevelsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(downMenu_RightLine)
                .addGap(0, 0, 0))
        );
        panel_DownMenuLayout.setVerticalGroup(
            panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(downMenu_RightLine, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(panel_DownMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downMenu_ModeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downMenu_TriggerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downMenu_TimingButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(downMenu_LevelsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(downMenu_RightMouseImage)
                    .addGroup(panel_DownMenuLayout.createSequentialGroup()
                        .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downMenu_PatternButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downMenu_InputsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downMenu_OutputsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(panel_DownMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(downMenu_DisplayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downMenu_CalibrationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downMenu_UtilityButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(downMenu_LeftMouseImage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(downMenu_LeftLine, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        panel_TopTab_Levels.setBackground(new java.awt.Color(111, 111, 111));
        panel_TopTab_Levels.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        topTab_Levels_TextLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        topTab_Levels_TextLabel.setForeground(new java.awt.Color(187, 226, 255));
        topTab_Levels_TextLabel.setText("Levels");

        topTab_Levels_CancelButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topTab_Levels_CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_button.png"))); // NOI18N
        topTab_Levels_CancelButton.setAlignmentY(0.0F);
        topTab_Levels_CancelButton.setIconTextGap(0);
        topTab_Levels_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topTab_Levels_CancelButtonActionPerformed(evt);
            }
        });

        topTab_Levels_HelpButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topTab_Levels_HelpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help_button.png"))); // NOI18N
        topTab_Levels_HelpButton.setAlignmentY(0.0F);
        topTab_Levels_HelpButton.setIconTextGap(0);

        javax.swing.GroupLayout panel_TopTab_LevelsLayout = new javax.swing.GroupLayout(panel_TopTab_Levels);
        panel_TopTab_Levels.setLayout(panel_TopTab_LevelsLayout);
        panel_TopTab_LevelsLayout.setHorizontalGroup(
            panel_TopTab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TopTab_LevelsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(topTab_Levels_TextLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topTab_Levels_CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topTab_Levels_HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panel_TopTab_LevelsLayout.setVerticalGroup(
            panel_TopTab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TopTab_LevelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TopTab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TopTab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(topTab_Levels_CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(topTab_Levels_HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(topTab_Levels_TextLabel))
                .addContainerGap())
        );

        panel_Tab_Levels.setBackground(new java.awt.Color(192, 192, 192));
        panel_Tab_Levels.setPreferredSize(new java.awt.Dimension(200, 650));

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

        javax.swing.GroupLayout panel_Tab_LevelsLayout = new javax.swing.GroupLayout(panel_Tab_Levels);
        panel_Tab_Levels.setLayout(panel_Tab_LevelsLayout);
        panel_Tab_LevelsLayout.setHorizontalGroup(
            panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
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
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
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
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(jToggleButton19)
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton20))
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
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
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
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
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(jToggleButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton18))
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Tab_LevelsLayout.setVerticalGroup(
            panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(jLabel4))
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(3, 3, 3)
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton22, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton23, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton25, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        panel_TopTab_Timing.setBackground(new java.awt.Color(111, 111, 111));
        panel_TopTab_Timing.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));

        tobTab_Timing_TextLabel.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        tobTab_Timing_TextLabel.setForeground(new java.awt.Color(187, 226, 255));
        tobTab_Timing_TextLabel.setText("Timing");

        topTab_Timing_CancelButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topTab_Timing_CancelButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel_button.png"))); // NOI18N
        topTab_Timing_CancelButton.setAlignmentY(0.0F);
        topTab_Timing_CancelButton.setIconTextGap(0);
        topTab_Timing_CancelButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        topTab_Timing_CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topTab_Timing_CancelButtonActionPerformed(evt);
            }
        });

        topTab_Timing_HelpButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        topTab_Timing_HelpButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/help_button.png"))); // NOI18N
        topTab_Timing_HelpButton.setAlignmentY(0.0F);
        topTab_Timing_HelpButton.setIconTextGap(0);

        javax.swing.GroupLayout panel_TopTab_TimingLayout = new javax.swing.GroupLayout(panel_TopTab_Timing);
        panel_TopTab_Timing.setLayout(panel_TopTab_TimingLayout);
        panel_TopTab_TimingLayout.setHorizontalGroup(
            panel_TopTab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TopTab_TimingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(topTab_Timing_CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topTab_Timing_HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tobTab_Timing_TextLabel)
                .addContainerGap())
        );
        panel_TopTab_TimingLayout.setVerticalGroup(
            panel_TopTab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TopTab_TimingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_TopTab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(topTab_Timing_CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(topTab_Timing_HelpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tobTab_Timing_TextLabel))
                .addContainerGap())
        );

        panel_Tab_Timing.setBackground(new java.awt.Color(192, 192, 192));
        panel_Tab_Timing.setPreferredSize(new java.awt.Dimension(200, 650));

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

        javax.swing.GroupLayout panel_Tab_TimingLayout = new javax.swing.GroupLayout(panel_Tab_Timing);
        panel_Tab_Timing.setLayout(panel_Tab_TimingLayout);
        panel_Tab_TimingLayout.setHorizontalGroup(
            panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_Tab_TimingLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(49, 49, 49))
                    .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                        .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton5)
                            .addComponent(jToggleButton23)
                            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
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
                            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                                .addComponent(jToggleButton21)
                                .addGap(4, 4, 4)
                                .addComponent(jToggleButton22))
                            .addComponent(jLabel21)
                            .addComponent(jLabel22)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jToggleButton9)
                            .addComponent(jToggleButton27)
                            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
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
                            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
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
        panel_Tab_TimingLayout.setVerticalGroup(
            panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
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
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton37, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton38, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton40, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton41, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addGap(12, 12, 12)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton30, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton31, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(6, 6, 6))
        );

        MenuBar_FileItem.setText("File");
        MenuBar.add(MenuBar_FileItem);

        MenuBar_EditItem.setText("Edit");
        MenuBar.add(MenuBar_EditItem);

        MenuBar_ViewItem.setText("View");
        MenuBar.add(MenuBar_ViewItem);

        MenuBar_SetupItem.setText("Setup");
        MenuBar.add(MenuBar_SetupItem);

        MenuBar_SystemItem.setText("System");
        MenuBar.add(MenuBar_SystemItem);

        MenuBar_UtilityItem.setText("Utility");
        MenuBar.add(MenuBar_UtilityItem);

        MenuBar_HelpItem.setText("Help");
        MenuBar.add(MenuBar_HelpItem);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_Tab_Levels, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_TopTab_Levels, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_Screen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_CalibrationsScreen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_DownMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_TopMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_TopTab_Timing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Tab_Timing, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panel_TopTab_Levels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_TopMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_TopTab_Timing, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Tab_Levels, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_Tab_Timing, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panel_Screen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panel_CalibrationsScreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(panel_DownMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void topMenu_HelpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenu_HelpButtonActionPerformed
        
    }//GEN-LAST:event_topMenu_HelpButtonActionPerformed

    private void downMenu_ModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_ModeButtonActionPerformed
        //  Обработка нажатия на пноку нижнего меню "Mode"
        if( ch8 == false ){
            ch8 = true;
            iconchanger.changeDownMenuButtonIcon(currentDir,"Mode","Down_Mode_Off.png");}
        else if( ch8 == true ){
            ch8 = false;
            iconchanger.changeDownMenuButtonIcon(currentDir,"Mode","Down_Mode_On.png");}

        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, true,true, true,true, true,true, false,false, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_ModeButtonActionPerformed

    private void downMenu_PatternButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_PatternButtonActionPerformed
        //  Обработка нажатия на пноку нижнего меню "Pattern"
        if( ch4 == false ){
            ch4 = true;
            iconchanger.changeDownMenuButtonIcon(currentDir,"Pattern","Down_Pattern_Off.png");
        }
        else if( ch4 == true ){
            ch4 = false;
            iconchanger.changeDownMenuButtonIcon(currentDir,"Pattern","Down_Pattern_On.png");
        }
        
        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, false,false, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_PatternButtonActionPerformed

    private void downMenu_DisplayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_DisplayButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch1 == false )
        {
            ch1 = true;
            downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        }
        else if( ch1 == true )
        {
            ch1 = false;
            downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_On.png"));
        }
        
        //  Меняем значение чекеров
        switches.chChanger_DownMenu(false,false, true,true, true,true, true,true, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_DisplayButtonActionPerformed

    private void downMenu_CalibrationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_CalibrationButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch3 == false )
        {
            ch3 = true;
            downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        }
        else if( ch3 == true )
        {
            ch3 = false;
            downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_On.png"));
        }

        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, false,false, true,true, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_CalibrationButtonActionPerformed

    private void downMenu_InputsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_InputsButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch5 == false )
        {
            ch5 = true;
            downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        }
        else if( ch5 == true )
        {
            ch5 = false;
            downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_On.png"));
        }

        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, false,false, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_InputsButtonActionPerformed

    private void downMenu_TriggerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_TriggerButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch2 == false )
        {
            ch2 = true;
            downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        }
        else if( ch2 == true )
        {
            ch2 = false;
            downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_On.png"));
        }
        
        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, false,false, true,true, true,true, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_TriggerButtonActionPerformed

    private void downMenu_TimingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_TimingButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch9 == false )
        {
            //  Закрываем вкладку "Timing" справа
            tabs.closeTab("Timing", "right");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch9 = true;
            downMenu_TimingButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
        }
        else if( ch9 == true )
        {
            //  Открываем вкладку "Timing" справа
            tabs.openTab("Timing", "right");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch9 = false;
            downMenu_TimingButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_On.png"));
        }
        
        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_TimingButtonActionPerformed

    private void downMenu_LevelsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_LevelsButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch10 == false )
        {
            //  Закрываем вкладку "Levels" слева
            tabs.closeTab("Levels", "left");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch10 = true;
            downMenu_LevelsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
        }
        else if( ch10 == true )
        {
            //  Открываем вкладку "Levels" слева
            tabs.openTab("Levels", "left");
            
            //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры. 
            pack();
            
            ch10 = false;
            downMenu_LevelsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_On.png"));
        }

        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, true,true, true,true, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_LevelsButtonActionPerformed

    private void downMenu_OutputsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_OutputsButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch6 == false )
        {
            ch6 = true;
            downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
        }
        else if( ch6 == true )
        {
            ch6 = false;
            downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_On.png"));
        }
        
        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, true,true, false,false, true,true, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
    }//GEN-LAST:event_downMenu_OutputsButtonActionPerformed

    private void downMenu_UtilityButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downMenu_UtilityButtonActionPerformed
        //  При нажатии подсвечивать синим
        if( ch7 == false )
        {
            ch7 = true;
            downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_Off.png"));
        }
        else if( ch7 == true )
        {
            ch7 = false;
            downMenu_UtilityButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Utility_On.png"));
        }

        //  Меняем значение чекеров
        switches.chChanger_DownMenu(true,true, true,true, true,true, true,true, true,true, true,true, false,false, true,true, false,false, false,false);
        
        //  Меняем картинку иконки на всех других кнопках на выключенную
        downMenu_DisplayButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Display_Off.png"));
        downMenu_ModeButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Mode_Off.png"));
        downMenu_TriggerButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Trigger_Off.png"));
        downMenu_CalibrationButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Calibrat_Off.png"));
        downMenu_PatternButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Pattern_Off.png"));
        downMenu_InputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Inputs_Off.png"));
        downMenu_OutputsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Outputs_Off.png"));
    }//GEN-LAST:event_downMenu_UtilityButtonActionPerformed

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
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
        else if( on_off_ch1_r == true )
        {
            //  Переключаем чекер
            on_off_ch1_r = false;
            on_off_ch2_r = true;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
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
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
        else if( on_off_ch2_r == true )
        {
            //  Переключаем чекер
            on_off_ch2_r = false;
            on_off_ch1_r = true;
            
            //  Меняем картинку
            jToggleButton21.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
            jToggleButton22.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
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
        visibility.levelsTab_HighLowLevelsVisibility(true);
        
        //  Делаем видимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(true);
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
        visibility.levelsTab_HighLowLevelsVisibility(true);
        
        //  Делаем видимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(true);
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
        visibility.levelsTab_HighLowLevelsVisibility(false);
        
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(false);
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
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                jTextField6.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                jTextField6.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch2 ] );
            }
            
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
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                jTextField6.setText( calibrations.phas_mas [ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                jTextField6.setText( calibrations.phas_mas [ calibrations.phas_mas_nmb_ch2 ] );
            }
            
            //  Меняеем картинки
            jToggleButton9.setIcon(new ImageIcon(currentDir + "\\src\\images\\delay_off.png"));
            jToggleButton27.setIcon(new ImageIcon(currentDir + "\\src\\images\\phase_on.png"));
        }
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed

    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed

    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed

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
                if( calibrations.width_mas_nmb_ch1 < 20 )
                {
                    //  Увеличиваем значение переменной 1 канала
                    calibrations.width_mas_nmb_ch1++;
                    
                    //  Отправляем данные в функцию определения значения
                    calibrations.VDF(6, calibrations.width_mas_nmb_ch1, 1);
                }
                //  Устанавливаем значение Width
                jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch1_r == false && on_off_ch2_r == true )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.width_mas_nmb_ch2 < 20 )
                {
                    //  Увеличиваем значение переменной 2 канала
                    calibrations.width_mas_nmb_ch2++;
                    
                    //  Отправляем данные в функцию определения значения
                    calibrations.VDF(6, calibrations.width_mas_nmb_ch2, 2);
                }
                //  Устанавливаем значение Width
                jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
            }
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
            //  Если выбран 1 канал
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.del_mas_nmb_ch1 < 21 )
                {
                    //  Увеличиваем значение переменной 1 канала
                    calibrations.del_mas_nmb_ch1++;
                }
                //  Устанавливаем значение Delay на 1 канале
                jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch1 ] );
            }
            //  Если выбран 2 канал
            if      ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.del_mas_nmb_ch2 < 21 )
                {
                    //  Увеличиваем значение переменной 2 канала
                    calibrations.del_mas_nmb_ch2++;
                }
                //  Устанавливаем значение Delay на 2 канале
                jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch2 ] );
            }
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  Если выбран 1 канал
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.phas_mas_nmb_ch1 < 21 )
                {
                    //  Увеличиваем значение переменной 1 канала
                    calibrations.phas_mas_nmb_ch1++;
                }
                //  Устанавливаем значение Phase
                jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.phas_mas_nmb_ch2 < 21 )
                {
                    //  Увеличиваем значение переменной 2 канала
                    calibrations.phas_mas_nmb_ch2++;
                }
                //  Устанавливаем значение Phase
                jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
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
        
        //  Если активен 1 канал
        if      ( on_off_ch1_r == true && on_off_ch2_r == false )
        {
            //  Определяем значение li_width для 1 канала
            if(         calibrations.li_width_ch1 < 1000    ){s = Integer.toString(calibrations.li_width_ch1);      }        
            else if(    calibrations.li_width_ch1 < 1000000 ){s = Integer.toString(calibrations.li_width_ch1/1000); }
        
            //  Определяем как будет выглядеть текстовое значение li_width для 1 канала
            if      (   calibrations.li_width_ch1 < 1000    ){jTextField5.setText(s + " ps");}
            else if (   calibrations.li_width_ch1 < 1000000 ){jTextField5.setText(s + " ns");}
        }
        //  Если активен 2 канал
        else if ( on_off_ch2_r == true && on_off_ch1_r == false )
        {
            //  Определяем значение li_width для 2 канала
            if(         calibrations.li_width_ch2 < 1000    ){s = Integer.toString(calibrations.li_width_ch2);      }        
            else if(    calibrations.li_width_ch2 < 1000000 ){s = Integer.toString(calibrations.li_width_ch2/1000); }
        
            //  Определяем как будет выглядеть текстовое значение li_width для 2 канала
            if      (   calibrations.li_width_ch2 < 1000    ){jTextField5.setText(s + " ps");}
            else if (   calibrations.li_width_ch2 < 1000000 ){jTextField5.setText(s + " ns");}
        }
        
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

    private void topMenu_BackRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenu_BackRightButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topMenu_BackRightButtonActionPerformed

    private void topMenu_ManualTrigGateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenu_ManualTrigGateButtonActionPerformed
        
    }//GEN-LAST:event_topMenu_ManualTrigGateButtonActionPerformed

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
        //  При нажатии калибровки уменьшаем пределы изменения плавного шага High Level на -0.01
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
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.del_mas_nmb_ch1 > 0 )
                {
                    calibrations.del_mas_nmb_ch1--;
                }
                //  Устанавливаем значение Delay
                jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.del_mas_nmb_ch2 > 0 )
                {
                    calibrations.del_mas_nmb_ch2--;
                }
                //  Устанавливаем значение Delay
                jTextField6.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch2 ] );
            }
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.phas_mas_nmb_ch1 > 0 )
                {
                    calibrations.phas_mas_nmb_ch1--;
                }
                //  Устанавливаем значение Phase
                jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.phas_mas_nmb_ch2 > 0 )
                {
                    calibrations.phas_mas_nmb_ch2--;
                }
                //  Устанавливаем значение Phase
                jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        //  Если активен Delay
        if( delay_ch == true )
        {
            //  Устанавливаем значение Delay по дефолту
            jTextField6.setText( calibrations.del_mas[ 7 ] );
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Присваиваем дефолтное значение
                calibrations.del_mas_nmb_ch1 = 7;
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Присваиваем дефолтное значение
                calibrations.del_mas_nmb_ch2 = 7;
            }
        }
        //  Если активен Phase
        else if( phase_ch == true )
        {
            //  Устанавливаем значение Phase по дефолту
            jTextField6.setText( calibrations.phas_mas[ 7 ] );
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Присваиваем дефолтное значение
                calibrations.phas_mas_nmb_ch1 = 7;
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {   
                //  Присваиваем дефолтное значение
                calibrations.phas_mas_nmb_ch2 = 7;
            }
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
            //  Устанавливаем значение Width по дефолту
            jTextField5.setText( calibrations.width_mas[ 5 ] );
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Присваиваем дефолтное значение
                calibrations.width_mas_nmb_ch1 = 5;
                
                //  Отправляем в функцию определения значения
                calibrations.VDF(6, calibrations.width_mas_nmb_ch1, 1);
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false)
            {   
                //  Присваиваем дефолтное значение
                calibrations.width_mas_nmb_ch2 = 5;
                
                //  Отправляем в функцию определения значения
                calibrations.VDF(6, calibrations.width_mas_nmb_ch2, 2);
            }
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
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную для 1 канала
                String ans_ch1 = calibrations.VDDF(6, calibrations.li_width_ch1, false, 1);
                
                //  Выводим результат
                jTextField5.setText(ans_ch1);
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false)
            {     
                //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную для 2 канала
                String ans_ch2 = calibrations.VDDF(6, calibrations.li_width_ch2, false, 2);
                
                //  Выводим результат
                jTextField5.setText(ans_ch2);
            }
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
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Понижаем значение переменной номера мас
                if( calibrations.width_mas_nmb_ch1 > 0 )
                {
                    calibrations.width_mas_nmb_ch1--;
                    calibrations.VDF(6, calibrations.width_mas_nmb_ch1, 1);
                }
                //  Устанавливаем значение Width
                jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false)
            {   
                //  Понижаем значение переменной номера мас
                if( calibrations.width_mas_nmb_ch2 > 0 )
                {
                    calibrations.width_mas_nmb_ch2--;
                    calibrations.VDF(6, calibrations.width_mas_nmb_ch2, 2);
                }
                //  Устанавливаем значение Width
                jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
            }
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

    private void topTab_Timing_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topTab_Timing_CancelButtonActionPerformed
        //  Закрываем вкладку "Timing"
        tabs.closeTab("Timing", "right");
        
        //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры.
        pack();
        
        //  Меняем значение чекера и картинку на самой кнопке
        ch9 = true;
        downMenu_TimingButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Timing_Off.png"));
    }//GEN-LAST:event_topTab_Timing_CancelButtonActionPerformed

    private void topTab_Levels_CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topTab_Levels_CancelButtonActionPerformed
        //  Закрываем вкладку "Levels"
        tabs.closeTab("Levels", "left");

        //  Метод pack изменяет размер кадра таким образом, чтобы все его содержимое было равным или превышающим их предпочтительные размеры.
        pack();
        
        //  Меняем значение чекера и картинку на самой кнопке
        ch10 = true;
        downMenu_LevelsButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\Down_Levels_Off.png"));
    }//GEN-LAST:event_topTab_Levels_CancelButtonActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed

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
    public static javax.swing.JMenuBar MenuBar;
    public static javax.swing.JMenu MenuBar_EditItem;
    public static javax.swing.JMenu MenuBar_FileItem;
    public static javax.swing.JMenu MenuBar_HelpItem;
    public static javax.swing.JMenu MenuBar_SetupItem;
    public static javax.swing.JMenu MenuBar_SystemItem;
    public static javax.swing.JMenu MenuBar_UtilityItem;
    public static javax.swing.JMenu MenuBar_ViewItem;
    public static javax.swing.JLabel ScreenImage;
    public static javax.swing.JLabel calibLabel_DelayChOne;
    public static javax.swing.JLabel calibLabel_Period;
    public static java.awt.Choice choice1;
    public static javax.swing.JButton downMenu_CalibrationButton;
    public static javax.swing.JButton downMenu_DisplayButton;
    public static javax.swing.JButton downMenu_InputsButton;
    public static javax.swing.JLabel downMenu_LeftLine;
    public static javax.swing.JLabel downMenu_LeftMouseImage;
    public static javax.swing.JButton downMenu_LevelsButton;
    public static javax.swing.JButton downMenu_ModeButton;
    public static javax.swing.JButton downMenu_OutputsButton;
    public static javax.swing.JButton downMenu_PatternButton;
    public static javax.swing.JLabel downMenu_RightLine;
    public static javax.swing.JLabel downMenu_RightMouseImage;
    public static javax.swing.JButton downMenu_TimingButton;
    public static javax.swing.JButton downMenu_TriggerButton;
    public static javax.swing.JButton downMenu_UtilityButton;
    public static javax.swing.JButton jButton22;
    public static javax.swing.JButton jButton23;
    public static javax.swing.JButton jButton24;
    public static javax.swing.JButton jButton25;
    public static javax.swing.JButton jButton26;
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
    public static javax.swing.JButton jButton37;
    public static javax.swing.JButton jButton38;
    public static javax.swing.JButton jButton39;
    public static javax.swing.JButton jButton40;
    public static javax.swing.JButton jButton41;
    public static javax.swing.JButton jButton56;
    public static javax.swing.JButton jButton63;
    public static javax.swing.JButton jButton64;
    public static javax.swing.JButton jButton65;
    public static javax.swing.JButton jButton66;
    public static javax.swing.JButton jButton67;
    public static javax.swing.JButton jButton68;
    public static javax.swing.JButton jButton69;
    public static javax.swing.JButton jButton70;
    public static javax.swing.JButton jButton71;
    public static javax.swing.JButton jButton72;
    public static javax.swing.JButton jButton73;
    public static javax.swing.JButton jButton74;
    public static javax.swing.JButton jButton75;
    public static javax.swing.JButton jButton76;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel11;
    public static javax.swing.JLabel jLabel14;
    public static javax.swing.JLabel jLabel15;
    public static javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel19;
    public static javax.swing.JLabel jLabel20;
    public static javax.swing.JLabel jLabel21;
    public static javax.swing.JLabel jLabel22;
    public static javax.swing.JLabel jLabel24;
    public static javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel26;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    public static javax.swing.JLabel jLabel29;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    public static javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JPopupMenu jPopupMenu1;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    public static javax.swing.JTextField jTextField7;
    public static javax.swing.JToggleButton jToggleButton10;
    public static javax.swing.JToggleButton jToggleButton11;
    public static javax.swing.JToggleButton jToggleButton18;
    public static javax.swing.JToggleButton jToggleButton19;
    public static javax.swing.JToggleButton jToggleButton20;
    public static javax.swing.JToggleButton jToggleButton21;
    public static javax.swing.JToggleButton jToggleButton22;
    public static javax.swing.JToggleButton jToggleButton23;
    public static javax.swing.JToggleButton jToggleButton24;
    public static javax.swing.JToggleButton jToggleButton25;
    public static javax.swing.JToggleButton jToggleButton26;
    public static javax.swing.JToggleButton jToggleButton27;
    public static javax.swing.JToggleButton jToggleButton28;
    public static javax.swing.JToggleButton jToggleButton4;
    public static javax.swing.JToggleButton jToggleButton5;
    public static javax.swing.JToggleButton jToggleButton6;
    public static javax.swing.JToggleButton jToggleButton9;
    public static javax.swing.JPanel panel_CalibrationsScreen;
    public static javax.swing.JPanel panel_CalibrationsTable;
    public static javax.swing.JPanel panel_Calibrations_Ampl;
    public static javax.swing.JPanel panel_Calibrations_Delay;
    public static javax.swing.JPanel panel_Calibrations_Offset;
    public static javax.swing.JPanel panel_Calibrations_Width;
    public static javax.swing.JPanel panel_DownMenu;
    public static javax.swing.JPanel panel_Screen;
    public static javax.swing.JPanel panel_Tab_Levels;
    public static javax.swing.JPanel panel_Tab_Timing;
    public static javax.swing.JPanel panel_TopMenu;
    public static javax.swing.JPanel panel_TopTab_Levels;
    public static javax.swing.JPanel panel_TopTab_Timing;
    public static javax.swing.JLabel tobTab_Timing_TextLabel;
    public static javax.swing.JButton topMenu_BackLeftButton;
    public static javax.swing.JButton topMenu_BackRightButton;
    public static javax.swing.JButton topMenu_HelpButton;
    public static javax.swing.JButton topMenu_ManualTrigGateButton;
    public static javax.swing.JButton topTab_Levels_CancelButton;
    public static javax.swing.JButton topTab_Levels_HelpButton;
    public static javax.swing.JLabel topTab_Levels_TextLabel;
    public static javax.swing.JButton topTab_Timing_CancelButton;
    public static javax.swing.JButton topTab_Timing_HelpButton;
    // End of variables declaration//GEN-END:variables
}