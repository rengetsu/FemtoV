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
        calibLabel_DelayChTwo = new javax.swing.JLabel();
        panel_Calibrations_Width = new javax.swing.JPanel();
        calibLabel_Width = new javax.swing.JLabel();
        calibLabel_WidthChOne = new javax.swing.JLabel();
        calibLabel_WidthChTwo = new javax.swing.JLabel();
        panel_Calibrations_Ampl = new javax.swing.JPanel();
        calibLabel_Ampl = new javax.swing.JLabel();
        calibLabel_AmplChOne = new javax.swing.JLabel();
        calibLabel_AmplChTwo = new javax.swing.JLabel();
        panel_Calibrations_Offset = new javax.swing.JPanel();
        calibLabel_Offset = new javax.swing.JLabel();
        calibLabel_OffsetChOne = new javax.swing.JLabel();
        calibLabel_OffsetChTwo = new javax.swing.JLabel();
        panel_DownMenu = new javax.swing.JPanel();
        downMenu_LeftLine = new javax.swing.JLabel();
        downMenu_LeftMouseImage = new javax.swing.JLabel();
        downMenu_RightLine = new javax.swing.JLabel();
        downMenu_RightMouseImage = new javax.swing.JLabel();
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
        panel_TopTab_Levels = new javax.swing.JPanel();
        topTab_Levels_TextLabel = new javax.swing.JLabel();
        topTab_Levels_CancelButton = new javax.swing.JButton();
        topTab_Levels_HelpButton = new javax.swing.JButton();
        panel_Tab_Levels = new javax.swing.JPanel();
        tabLevels_NormalLabel = new javax.swing.JLabel();
        tabLevels_ComplLabel = new javax.swing.JLabel();
        tabLevels_PolarityLabel = new javax.swing.JLabel();
        tabLevels_LevelFormatLabel = new javax.swing.JLabel();
        tabLevels_HighLevelLabel = new javax.swing.JLabel();
        tabLevels_LowLevelLabel = new javax.swing.JLabel();
        tabLevels_HighLimitLabel = new javax.swing.JLabel();
        tabLevels_LowLimitLabel = new javax.swing.JLabel();
        tabLevels_HighLevelMapLabel = new javax.swing.JLabel();
        tabLevels_LowLevelMapLabel = new javax.swing.JLabel();
        tabLevels_HighLimitMapLabel = new javax.swing.JLabel();
        tabLevels_LowLimitMapLabel = new javax.swing.JLabel();
        tabLevels_ChOne_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_ChTwo_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_NormalOnOff_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_ComplOnOff_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_Normal_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_Compl_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_HighLow_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_OffsetAmpl_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_Standard_ToggleButton = new javax.swing.JToggleButton();
        tabLevels_smallDownButton_HighLevel = new javax.swing.JButton();
        tabLevels_smallUpButton_HighLevel = new javax.swing.JButton();
        tabLevels_zeroButton_HighLevel = new javax.swing.JButton();
        tabLevels_bigDownButton_HighLevel = new javax.swing.JButton();
        tabLevels_bigUpButton_HighLevel = new javax.swing.JButton();
        tabLevels_smallDownButton_LowLevel = new javax.swing.JButton();
        tabLevels_smallUpButton_LowLevel = new javax.swing.JButton();
        tabLevels_zeroButton_LowLevel = new javax.swing.JButton();
        tabLevels_bigDownButton_LowLevel = new javax.swing.JButton();
        tabLevels_bigUpButton_LowLevel = new javax.swing.JButton();
        tabLevels_smallDownButton_HighLimit = new javax.swing.JButton();
        tabLevels_smallUpButton_HighLimit = new javax.swing.JButton();
        tabLevels_zeroButton_HighLimit = new javax.swing.JButton();
        tabLevels_bigDownButton_HighLimit = new javax.swing.JButton();
        tabLevels_bigUpButton_HighLimit = new javax.swing.JButton();
        tabLevels_smallDownButton_LowLimit = new javax.swing.JButton();
        tabLevels_smallUpButton_LowLimit = new javax.swing.JButton();
        tabLevels_zeroButton_LowLimit = new javax.swing.JButton();
        tabLevels_bigDownButton_LowLimit = new javax.swing.JButton();
        tabLevels_bigUpButton_LowLimit = new javax.swing.JButton();
        tabLevels_HighLimitTextField = new javax.swing.JTextField();
        tabLevels_LowLimitTextField = new javax.swing.JTextField();
        tabLevels_LowLevelTextField = new javax.swing.JTextField();
        tabLevels_HighLevelTextField = new javax.swing.JTextField();
        tabLevels_Choice = new java.awt.Choice();
        panel_TopTab_Timing = new javax.swing.JPanel();
        tobTab_Timing_TextLabel = new javax.swing.JLabel();
        topTab_Timing_CancelButton = new javax.swing.JButton();
        topTab_Timing_HelpButton = new javax.swing.JButton();
        panel_Tab_Timing = new javax.swing.JPanel();
        tabTiming_PeriodLabel = new javax.swing.JLabel();
        tabTiming_PeriodMapLabel = new javax.swing.JLabel();
        tabTiming_UpLineLabel = new javax.swing.JLabel();
        tabTiming_DownLineLabel = new javax.swing.JLabel();
        tabTiming_DelayLabel = new javax.swing.JLabel();
        tabTiming_DelayMapLabel = new javax.swing.JLabel();
        tabTiming_WidthLabel = new javax.swing.JLabel();
        tabTiming_WidthMapLabel = new javax.swing.JLabel();
        tabTiming_Period_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_Frequency_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_ChOne_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_ChTwo_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_Delay_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_Phase_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_Width_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_DCycle_ToggleButton = new javax.swing.JToggleButton();
        tabTiming_smallLeftButton_PeriodFreq = new javax.swing.JButton();
        tabTiming_smallRightButton_PeriodFreq = new javax.swing.JButton();
        tabTiming_delayButton_PeriodFreq = new javax.swing.JButton();
        tabTiming_bigLeftButton_PeriodFreq = new javax.swing.JButton();
        tabTiming_bigRightButton_PeriodFreq = new javax.swing.JButton();
        tabTiming_smallLeftButton_DelayPhase = new javax.swing.JButton();
        tabTiming_smallRightButton_DelayPhase = new javax.swing.JButton();
        tabTiming_delayButton_DelayPhase = new javax.swing.JButton();
        tabTiming_bigLeftButton_DelayPhase = new javax.swing.JButton();
        tabTiming_bigRightButton_DelayPhase = new javax.swing.JButton();
        tabTiming_smallLeftButton_WidthDCycle = new javax.swing.JButton();
        tabTiming_smallRightButton_WidthDCycle = new javax.swing.JButton();
        tabTiming_delayButton_WidthDCycle = new javax.swing.JButton();
        tabTiming_bigLeftButton_WidthDCycle = new javax.swing.JButton();
        tabTiming_bigRightButton_WidthDCycle = new javax.swing.JButton();
        tabTiming_PeriodTextField = new javax.swing.JTextField();
        tabTiming_DelayTextField = new javax.swing.JTextField();
        tabTiming_WidthTextField = new javax.swing.JTextField();
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

        calibLabel_DelayChTwo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_DelayChTwo.setForeground(new java.awt.Color(132, 252, 252));
        calibLabel_DelayChTwo.setText("Delay(2) = 1.02 us");

        javax.swing.GroupLayout panel_Calibrations_DelayLayout = new javax.swing.GroupLayout(panel_Calibrations_Delay);
        panel_Calibrations_Delay.setLayout(panel_Calibrations_DelayLayout);
        panel_Calibrations_DelayLayout.setHorizontalGroup(
            panel_Calibrations_DelayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_DelayLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_DelayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calibLabel_Period, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_DelayChOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_DelayChTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(calibLabel_DelayChTwo)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Width.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Width.setPreferredSize(new java.awt.Dimension(101, 50));

        calibLabel_Width.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_Width.setForeground(new java.awt.Color(255, 255, 255));
        calibLabel_Width.setText(" ");

        calibLabel_WidthChOne.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_WidthChOne.setForeground(new java.awt.Color(252, 252, 132));
        calibLabel_WidthChOne.setText("Width(1) = 1.02 us");

        calibLabel_WidthChTwo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_WidthChTwo.setForeground(new java.awt.Color(132, 252, 252));
        calibLabel_WidthChTwo.setText("Width(2) = 1.02 us");

        javax.swing.GroupLayout panel_Calibrations_WidthLayout = new javax.swing.GroupLayout(panel_Calibrations_Width);
        panel_Calibrations_Width.setLayout(panel_Calibrations_WidthLayout);
        panel_Calibrations_WidthLayout.setHorizontalGroup(
            panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_WidthLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calibLabel_Width, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_WidthChOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_WidthChTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_WidthLayout.setVerticalGroup(
            panel_Calibrations_WidthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_WidthLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(calibLabel_Width)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_WidthChOne)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_WidthChTwo)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Ampl.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Ampl.setPreferredSize(new java.awt.Dimension(101, 50));

        calibLabel_Ampl.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_Ampl.setForeground(new java.awt.Color(255, 255, 255));
        calibLabel_Ampl.setText(" ");
        calibLabel_Ampl.setToolTipText("");

        calibLabel_AmplChOne.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_AmplChOne.setForeground(new java.awt.Color(252, 252, 132));
        calibLabel_AmplChOne.setText("Ampl(1) = -1.03V");

        calibLabel_AmplChTwo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_AmplChTwo.setForeground(new java.awt.Color(132, 252, 252));
        calibLabel_AmplChTwo.setText("Ampl(2) = -1.03V");

        javax.swing.GroupLayout panel_Calibrations_AmplLayout = new javax.swing.GroupLayout(panel_Calibrations_Ampl);
        panel_Calibrations_Ampl.setLayout(panel_Calibrations_AmplLayout);
        panel_Calibrations_AmplLayout.setHorizontalGroup(
            panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_AmplLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calibLabel_Ampl, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                    .addComponent(calibLabel_AmplChOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_AmplChTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_AmplLayout.setVerticalGroup(
            panel_Calibrations_AmplLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_AmplLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(calibLabel_Ampl)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_AmplChOne)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_AmplChTwo)
                .addGap(6, 6, 6))
        );

        panel_Calibrations_Offset.setBackground(new java.awt.Color(47, 47, 47));
        panel_Calibrations_Offset.setPreferredSize(new java.awt.Dimension(101, 50));

        calibLabel_Offset.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_Offset.setForeground(new java.awt.Color(255, 255, 255));
        calibLabel_Offset.setText(" ");

        calibLabel_OffsetChOne.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_OffsetChOne.setForeground(new java.awt.Color(252, 252, 132));
        calibLabel_OffsetChOne.setText("Offset(1) = -1.03V");

        calibLabel_OffsetChTwo.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        calibLabel_OffsetChTwo.setForeground(new java.awt.Color(132, 252, 252));
        calibLabel_OffsetChTwo.setText("Offset(2) = -1.03V");

        javax.swing.GroupLayout panel_Calibrations_OffsetLayout = new javax.swing.GroupLayout(panel_Calibrations_Offset);
        panel_Calibrations_Offset.setLayout(panel_Calibrations_OffsetLayout);
        panel_Calibrations_OffsetLayout.setHorizontalGroup(
            panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_OffsetLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(calibLabel_Offset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_OffsetChOne, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(calibLabel_OffsetChTwo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(5, 5, 5))
        );
        panel_Calibrations_OffsetLayout.setVerticalGroup(
            panel_Calibrations_OffsetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Calibrations_OffsetLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(calibLabel_Offset)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_OffsetChOne)
                .addGap(3, 3, 3)
                .addComponent(calibLabel_OffsetChTwo)
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

        downMenu_LeftLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border_line.png"))); // NOI18N
        downMenu_LeftLine.setToolTipText("");

        downMenu_LeftMouseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Left.png"))); // NOI18N

        downMenu_RightLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/border_line.png"))); // NOI18N
        downMenu_RightLine.setToolTipText("");

        downMenu_RightMouseImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Down_Mouse_Right.png"))); // NOI18N

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

        tabLevels_NormalLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_NormalLabel.setText("Normal");

        tabLevels_ComplLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_ComplLabel.setText("Compl");

        tabLevels_PolarityLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_PolarityLabel.setText("Polarity");

        tabLevels_LevelFormatLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_LevelFormatLabel.setText("Level Format");

        tabLevels_HighLevelLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_HighLevelLabel.setText("High Level");

        tabLevels_LowLevelLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_LowLevelLabel.setText("Low Level");

        tabLevels_HighLimitLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_HighLimitLabel.setText("High Limit");

        tabLevels_LowLimitLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_LowLimitLabel.setText("Low Limit");

        tabLevels_HighLevelMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabLevels_HighLevelMapLabel.setAlignmentY(0.0F);

        tabLevels_LowLevelMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabLevels_LowLevelMapLabel.setAlignmentY(0.0F);

        tabLevels_HighLimitMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabLevels_HighLimitMapLabel.setAlignmentY(0.0F);

        tabLevels_LowLimitMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabLevels_LowLimitMapLabel.setAlignmentY(0.0F);

        tabLevels_ChOne_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_ChOne_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch1_off.png"))); // NOI18N
        tabLevels_ChOne_ToggleButton.setBorder(null);
        tabLevels_ChOne_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_ChOne_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_ChTwo_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_ChTwo_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch2_off.png"))); // NOI18N
        tabLevels_ChTwo_ToggleButton.setBorder(null);
        tabLevels_ChTwo_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_ChTwo_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_NormalOnOff_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_NormalOnOff_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off_button.png"))); // NOI18N
        tabLevels_NormalOnOff_ToggleButton.setBorder(null);
        tabLevels_NormalOnOff_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_NormalOnOff_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_ComplOnOff_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_ComplOnOff_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/off_button.png"))); // NOI18N
        tabLevels_ComplOnOff_ToggleButton.setBorder(null);
        tabLevels_ComplOnOff_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_ComplOnOff_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_Normal_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_Normal_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/normal_on.png"))); // NOI18N
        tabLevels_Normal_ToggleButton.setAlignmentY(0.0F);
        tabLevels_Normal_ToggleButton.setBorder(null);
        tabLevels_Normal_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_Normal_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_Normal_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_Compl_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_Compl_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/complement_off.png"))); // NOI18N
        tabLevels_Compl_ToggleButton.setAlignmentY(0.0F);
        tabLevels_Compl_ToggleButton.setBorder(null);
        tabLevels_Compl_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_Compl_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_Compl_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_HighLow_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_HighLow_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/high-low_on.png"))); // NOI18N
        tabLevels_HighLow_ToggleButton.setAlignmentY(0.0F);
        tabLevels_HighLow_ToggleButton.setBorder(null);
        tabLevels_HighLow_ToggleButton.setIconTextGap(0);
        tabLevels_HighLow_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_HighLow_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_HighLow_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_OffsetAmpl_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_OffsetAmpl_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/offset_off.png"))); // NOI18N
        tabLevels_OffsetAmpl_ToggleButton.setAlignmentY(0.0F);
        tabLevels_OffsetAmpl_ToggleButton.setBorder(null);
        tabLevels_OffsetAmpl_ToggleButton.setIconTextGap(0);
        tabLevels_OffsetAmpl_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_OffsetAmpl_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_OffsetAmpl_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_Standard_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabLevels_Standard_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/std_off.png"))); // NOI18N
        tabLevels_Standard_ToggleButton.setAlignmentY(0.0F);
        tabLevels_Standard_ToggleButton.setBorder(null);
        tabLevels_Standard_ToggleButton.setIconTextGap(0);
        tabLevels_Standard_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_Standard_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_Standard_ToggleButtonActionPerformed(evt);
            }
        });

        tabLevels_smallDownButton_HighLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        tabLevels_smallDownButton_HighLevel.setAlignmentY(0.0F);
        tabLevels_smallDownButton_HighLevel.setBorder(null);
        tabLevels_smallDownButton_HighLevel.setIconTextGap(0);
        tabLevels_smallDownButton_HighLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_smallDownButton_HighLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_smallDownButton_HighLevelActionPerformed(evt);
            }
        });

        tabLevels_smallUpButton_HighLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        tabLevels_smallUpButton_HighLevel.setAlignmentY(0.0F);
        tabLevels_smallUpButton_HighLevel.setBorder(null);
        tabLevels_smallUpButton_HighLevel.setIconTextGap(0);
        tabLevels_smallUpButton_HighLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_smallUpButton_HighLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_smallUpButton_HighLevelActionPerformed(evt);
            }
        });

        tabLevels_zeroButton_HighLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        tabLevels_zeroButton_HighLevel.setAlignmentY(0.0F);
        tabLevels_zeroButton_HighLevel.setBorder(null);
        tabLevels_zeroButton_HighLevel.setIconTextGap(0);
        tabLevels_zeroButton_HighLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_zeroButton_HighLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_zeroButton_HighLevelActionPerformed(evt);
            }
        });

        tabLevels_bigDownButton_HighLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        tabLevels_bigDownButton_HighLevel.setAlignmentY(0.0F);
        tabLevels_bigDownButton_HighLevel.setBorder(null);
        tabLevels_bigDownButton_HighLevel.setIconTextGap(0);
        tabLevels_bigDownButton_HighLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigDownButton_HighLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigDownButton_HighLevelActionPerformed(evt);
            }
        });

        tabLevels_bigUpButton_HighLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        tabLevels_bigUpButton_HighLevel.setAlignmentY(0.0F);
        tabLevels_bigUpButton_HighLevel.setBorder(null);
        tabLevels_bigUpButton_HighLevel.setIconTextGap(0);
        tabLevels_bigUpButton_HighLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigUpButton_HighLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigUpButton_HighLevelActionPerformed(evt);
            }
        });

        tabLevels_smallDownButton_LowLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        tabLevels_smallDownButton_LowLevel.setAlignmentY(0.0F);
        tabLevels_smallDownButton_LowLevel.setBorder(null);
        tabLevels_smallDownButton_LowLevel.setIconTextGap(0);
        tabLevels_smallDownButton_LowLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_smallDownButton_LowLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_smallDownButton_LowLevelActionPerformed(evt);
            }
        });

        tabLevels_smallUpButton_LowLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        tabLevels_smallUpButton_LowLevel.setAlignmentY(0.0F);
        tabLevels_smallUpButton_LowLevel.setBorder(null);
        tabLevels_smallUpButton_LowLevel.setIconTextGap(0);
        tabLevels_smallUpButton_LowLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_smallUpButton_LowLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_smallUpButton_LowLevelActionPerformed(evt);
            }
        });

        tabLevels_zeroButton_LowLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        tabLevels_zeroButton_LowLevel.setAlignmentY(0.0F);
        tabLevels_zeroButton_LowLevel.setBorder(null);
        tabLevels_zeroButton_LowLevel.setIconTextGap(0);
        tabLevels_zeroButton_LowLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_zeroButton_LowLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_zeroButton_LowLevelActionPerformed(evt);
            }
        });

        tabLevels_bigDownButton_LowLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        tabLevels_bigDownButton_LowLevel.setAlignmentY(0.0F);
        tabLevels_bigDownButton_LowLevel.setBorder(null);
        tabLevels_bigDownButton_LowLevel.setIconTextGap(0);
        tabLevels_bigDownButton_LowLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigDownButton_LowLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigDownButton_LowLevelActionPerformed(evt);
            }
        });

        tabLevels_bigUpButton_LowLevel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        tabLevels_bigUpButton_LowLevel.setAlignmentY(0.0F);
        tabLevels_bigUpButton_LowLevel.setBorder(null);
        tabLevels_bigUpButton_LowLevel.setIconTextGap(0);
        tabLevels_bigUpButton_LowLevel.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigUpButton_LowLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigUpButton_LowLevelActionPerformed(evt);
            }
        });

        tabLevels_smallDownButton_HighLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        tabLevels_smallDownButton_HighLimit.setAlignmentY(0.0F);
        tabLevels_smallDownButton_HighLimit.setBorder(null);
        tabLevels_smallDownButton_HighLimit.setIconTextGap(0);
        tabLevels_smallDownButton_HighLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_smallUpButton_HighLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        tabLevels_smallUpButton_HighLimit.setAlignmentY(0.0F);
        tabLevels_smallUpButton_HighLimit.setBorder(null);
        tabLevels_smallUpButton_HighLimit.setIconTextGap(0);
        tabLevels_smallUpButton_HighLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_zeroButton_HighLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        tabLevels_zeroButton_HighLimit.setAlignmentY(0.0F);
        tabLevels_zeroButton_HighLimit.setBorder(null);
        tabLevels_zeroButton_HighLimit.setIconTextGap(0);
        tabLevels_zeroButton_HighLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_bigDownButton_HighLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        tabLevels_bigDownButton_HighLimit.setAlignmentY(0.0F);
        tabLevels_bigDownButton_HighLimit.setBorder(null);
        tabLevels_bigDownButton_HighLimit.setIconTextGap(0);
        tabLevels_bigDownButton_HighLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_bigUpButton_HighLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        tabLevels_bigUpButton_HighLimit.setAlignmentY(0.0F);
        tabLevels_bigUpButton_HighLimit.setBorder(null);
        tabLevels_bigUpButton_HighLimit.setIconTextGap(0);
        tabLevels_bigUpButton_HighLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigUpButton_HighLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigUpButton_HighLimitActionPerformed(evt);
            }
        });

        tabLevels_smallDownButton_LowLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_down.png"))); // NOI18N
        tabLevels_smallDownButton_LowLimit.setAlignmentY(0.0F);
        tabLevels_smallDownButton_LowLimit.setBorder(null);
        tabLevels_smallDownButton_LowLimit.setIconTextGap(0);
        tabLevels_smallDownButton_LowLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_smallUpButton_LowLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_up.png"))); // NOI18N
        tabLevels_smallUpButton_LowLimit.setAlignmentY(0.0F);
        tabLevels_smallUpButton_LowLimit.setBorder(null);
        tabLevels_smallUpButton_LowLimit.setIconTextGap(0);
        tabLevels_smallUpButton_LowLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_zeroButton_LowLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_zero.png"))); // NOI18N
        tabLevels_zeroButton_LowLimit.setAlignmentY(0.0F);
        tabLevels_zeroButton_LowLimit.setBorder(null);
        tabLevels_zeroButton_LowLimit.setIconTextGap(0);
        tabLevels_zeroButton_LowLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_bigDownButton_LowLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_down.png"))); // NOI18N
        tabLevels_bigDownButton_LowLimit.setAlignmentY(0.0F);
        tabLevels_bigDownButton_LowLimit.setBorder(null);
        tabLevels_bigDownButton_LowLimit.setIconTextGap(0);
        tabLevels_bigDownButton_LowLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabLevels_bigUpButton_LowLimit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_up.png"))); // NOI18N
        tabLevels_bigUpButton_LowLimit.setAlignmentY(0.0F);
        tabLevels_bigUpButton_LowLimit.setBorder(null);
        tabLevels_bigUpButton_LowLimit.setIconTextGap(0);
        tabLevels_bigUpButton_LowLimit.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_bigUpButton_LowLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_bigUpButton_LowLimitActionPerformed(evt);
            }
        });

        tabLevels_HighLimitTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabLevels_HighLimitTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabLevels_HighLimitTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabLevels_HighLimitTextField.setText("3 V");
        tabLevels_HighLimitTextField.setAlignmentX(0.0F);
        tabLevels_HighLimitTextField.setAlignmentY(0.0F);
        tabLevels_HighLimitTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabLevels_HighLimitTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_HighLimitTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLevels_HighLimitTextFieldMouseClicked(evt);
            }
        });
        tabLevels_HighLimitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_HighLimitTextFieldActionPerformed(evt);
            }
        });

        tabLevels_LowLimitTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabLevels_LowLimitTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabLevels_LowLimitTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabLevels_LowLimitTextField.setText("-3 V");
        tabLevels_LowLimitTextField.setAlignmentX(0.0F);
        tabLevels_LowLimitTextField.setAlignmentY(0.0F);
        tabLevels_LowLimitTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabLevels_LowLimitTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_LowLimitTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLevels_LowLimitTextFieldMouseClicked(evt);
            }
        });
        tabLevels_LowLimitTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_LowLimitTextFieldActionPerformed(evt);
            }
        });

        tabLevels_LowLevelTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabLevels_LowLevelTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabLevels_LowLevelTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabLevels_LowLevelTextField.setText("0.0 V");
        tabLevels_LowLevelTextField.setAlignmentX(0.0F);
        tabLevels_LowLevelTextField.setAlignmentY(0.0F);
        tabLevels_LowLevelTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabLevels_LowLevelTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_LowLevelTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLevels_LowLevelTextFieldMouseClicked(evt);
            }
        });
        tabLevels_LowLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_LowLevelTextFieldActionPerformed(evt);
            }
        });

        tabLevels_HighLevelTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabLevels_HighLevelTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabLevels_HighLevelTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabLevels_HighLevelTextField.setText("1 V");
        tabLevels_HighLevelTextField.setAlignmentX(0.0F);
        tabLevels_HighLevelTextField.setAlignmentY(0.0F);
        tabLevels_HighLevelTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabLevels_HighLevelTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabLevels_HighLevelTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabLevels_HighLevelTextFieldMouseClicked(evt);
            }
        });
        tabLevels_HighLevelTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabLevels_HighLevelTextFieldActionPerformed(evt);
            }
        });

        tabLevels_Choice.setBackground(new java.awt.Color(0, 0, 0));
        tabLevels_Choice.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tabLevels_Choice.setFocusable(false);
        tabLevels_Choice.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabLevels_Choice.setForeground(new java.awt.Color(255, 255, 255));
        tabLevels_Choice.setName(""); // NOI18N
        tabLevels_Choice.setEnabled(false);
        tabLevels_Choice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tabLevels_ChoiceItemStateChanged(evt);
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
                        .addComponent(tabLevels_smallDownButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_smallUpButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_zeroButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigDownButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigUpButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabLevels_LowLimitMapLabel)
                    .addComponent(tabLevels_LowLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_smallDownButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_smallUpButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_zeroButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigDownButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigUpButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabLevels_HighLimitMapLabel)
                    .addComponent(tabLevels_HighLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_LowLimitLabel)
                    .addComponent(tabLevels_HighLimitLabel)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_ChOne_ToggleButton)
                        .addGap(4, 4, 4)
                        .addComponent(tabLevels_ChTwo_ToggleButton))
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_smallDownButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_smallUpButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_zeroButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigDownButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigUpButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabLevels_LowLevelMapLabel)
                    .addComponent(tabLevels_LowLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_LowLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_smallDownButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_smallUpButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_zeroButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigDownButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabLevels_bigUpButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabLevels_HighLevelMapLabel)
                    .addComponent(tabLevels_HighLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_HighLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_LevelFormatLabel)
                    .addComponent(tabLevels_HighLow_ToggleButton)
                    .addComponent(tabLevels_OffsetAmpl_ToggleButton)
                    .addComponent(tabLevels_Standard_ToggleButton)
                    .addComponent(tabLevels_PolarityLabel)
                    .addComponent(tabLevels_Normal_ToggleButton)
                    .addComponent(tabLevels_Compl_ToggleButton)
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_NormalOnOff_ToggleButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabLevels_ComplOnOff_ToggleButton))
                    .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                        .addComponent(tabLevels_NormalLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tabLevels_ComplLabel))
                    .addComponent(tabLevels_Choice, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Tab_LevelsLayout.setVerticalGroup(
            panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_LevelsLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_ChOne_ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_ChTwo_ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tabLevels_NormalLabel)
                    .addComponent(tabLevels_ComplLabel))
                .addGap(3, 3, 3)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_NormalOnOff_ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_ComplOnOff_ToggleButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabLevels_PolarityLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_Normal_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_Compl_ToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLevels_LevelFormatLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_HighLow_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_OffsetAmpl_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_Standard_ToggleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLevels_Choice, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLevels_HighLevelLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_HighLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_HighLevelMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_smallDownButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_smallUpButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_zeroButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigDownButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigUpButton_HighLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabLevels_LowLevelLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_LowLevelTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_LowLevelMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_smallDownButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_smallUpButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_zeroButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigDownButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigUpButton_LowLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabLevels_HighLimitLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_HighLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_HighLimitMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_smallDownButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_smallUpButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_zeroButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigDownButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigUpButton_HighLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(tabLevels_LowLimitLabel)
                .addGap(3, 3, 3)
                .addComponent(tabLevels_LowLimitTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabLevels_LowLimitMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_LevelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabLevels_smallDownButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_smallUpButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_zeroButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigDownButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabLevels_bigUpButton_LowLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        tabTiming_PeriodLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabTiming_PeriodLabel.setText("Period");

        tabTiming_PeriodMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabTiming_PeriodMapLabel.setAlignmentY(0.0F);

        tabTiming_UpLineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_line.png"))); // NOI18N

        tabTiming_DownLineLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icon_line.png"))); // NOI18N

        tabTiming_DelayLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabTiming_DelayLabel.setText("Delay");

        tabTiming_DelayMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabTiming_DelayMapLabel.setAlignmentY(0.0F);

        tabTiming_WidthLabel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tabTiming_WidthLabel.setText("Width");

        tabTiming_WidthMapLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/long_button.png"))); // NOI18N
        tabTiming_WidthMapLabel.setAlignmentY(0.0F);

        tabTiming_Period_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_Period_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/period_on.png"))); // NOI18N
        tabTiming_Period_ToggleButton.setAlignmentY(0.0F);
        tabTiming_Period_ToggleButton.setBorder(null);
        tabTiming_Period_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_Period_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_Period_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_Frequency_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_Frequency_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/frequency_off.png"))); // NOI18N
        tabTiming_Frequency_ToggleButton.setAlignmentY(0.0F);
        tabTiming_Frequency_ToggleButton.setBorder(null);
        tabTiming_Frequency_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_Frequency_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_Frequency_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_ChOne_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_ChOne_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch1_on.png"))); // NOI18N
        tabTiming_ChOne_ToggleButton.setBorder(null);
        tabTiming_ChOne_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_ChOne_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_ChTwo_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_ChTwo_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ch2_off.png"))); // NOI18N
        tabTiming_ChTwo_ToggleButton.setBorder(null);
        tabTiming_ChTwo_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_ChTwo_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_Delay_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_Delay_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delay_on.png"))); // NOI18N
        tabTiming_Delay_ToggleButton.setAlignmentY(0.0F);
        tabTiming_Delay_ToggleButton.setBorder(null);
        tabTiming_Delay_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_Delay_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_Delay_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_Phase_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_Phase_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/phase_off.png"))); // NOI18N
        tabTiming_Phase_ToggleButton.setAlignmentY(0.0F);
        tabTiming_Phase_ToggleButton.setBorder(null);
        tabTiming_Phase_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_Phase_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_Phase_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_Width_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_Width_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/width_on.png"))); // NOI18N
        tabTiming_Width_ToggleButton.setAlignmentY(0.0F);
        tabTiming_Width_ToggleButton.setBorder(null);
        tabTiming_Width_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_Width_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_Width_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_DCycle_ToggleButton.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        tabTiming_DCycle_ToggleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/dcycle_off.png"))); // NOI18N
        tabTiming_DCycle_ToggleButton.setAlignmentY(0.0F);
        tabTiming_DCycle_ToggleButton.setBorder(null);
        tabTiming_DCycle_ToggleButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_DCycle_ToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_DCycle_ToggleButtonActionPerformed(evt);
            }
        });

        tabTiming_smallLeftButton_PeriodFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        tabTiming_smallLeftButton_PeriodFreq.setAlignmentY(0.0F);
        tabTiming_smallLeftButton_PeriodFreq.setBorder(null);
        tabTiming_smallLeftButton_PeriodFreq.setIconTextGap(0);
        tabTiming_smallLeftButton_PeriodFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));

        tabTiming_smallRightButton_PeriodFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        tabTiming_smallRightButton_PeriodFreq.setAlignmentY(0.0F);
        tabTiming_smallRightButton_PeriodFreq.setBorder(null);
        tabTiming_smallRightButton_PeriodFreq.setIconTextGap(0);
        tabTiming_smallRightButton_PeriodFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_smallRightButton_PeriodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_smallRightButton_PeriodFreqActionPerformed(evt);
            }
        });

        tabTiming_delayButton_PeriodFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        tabTiming_delayButton_PeriodFreq.setAlignmentY(0.0F);
        tabTiming_delayButton_PeriodFreq.setBorder(null);
        tabTiming_delayButton_PeriodFreq.setIconTextGap(0);
        tabTiming_delayButton_PeriodFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_delayButton_PeriodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_delayButton_PeriodFreqActionPerformed(evt);
            }
        });

        tabTiming_bigLeftButton_PeriodFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        tabTiming_bigLeftButton_PeriodFreq.setAlignmentY(0.0F);
        tabTiming_bigLeftButton_PeriodFreq.setBorder(null);
        tabTiming_bigLeftButton_PeriodFreq.setIconTextGap(0);
        tabTiming_bigLeftButton_PeriodFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigLeftButton_PeriodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigLeftButton_PeriodFreqActionPerformed(evt);
            }
        });

        tabTiming_bigRightButton_PeriodFreq.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        tabTiming_bigRightButton_PeriodFreq.setAlignmentY(0.0F);
        tabTiming_bigRightButton_PeriodFreq.setBorder(null);
        tabTiming_bigRightButton_PeriodFreq.setIconTextGap(0);
        tabTiming_bigRightButton_PeriodFreq.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigRightButton_PeriodFreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigRightButton_PeriodFreqActionPerformed(evt);
            }
        });

        tabTiming_smallLeftButton_DelayPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        tabTiming_smallLeftButton_DelayPhase.setAlignmentY(0.0F);
        tabTiming_smallLeftButton_DelayPhase.setBorder(null);
        tabTiming_smallLeftButton_DelayPhase.setIconTextGap(0);
        tabTiming_smallLeftButton_DelayPhase.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_smallLeftButton_DelayPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_smallLeftButton_DelayPhaseActionPerformed(evt);
            }
        });

        tabTiming_smallRightButton_DelayPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        tabTiming_smallRightButton_DelayPhase.setAlignmentY(0.0F);
        tabTiming_smallRightButton_DelayPhase.setBorder(null);
        tabTiming_smallRightButton_DelayPhase.setIconTextGap(0);
        tabTiming_smallRightButton_DelayPhase.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_smallRightButton_DelayPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_smallRightButton_DelayPhaseActionPerformed(evt);
            }
        });

        tabTiming_delayButton_DelayPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        tabTiming_delayButton_DelayPhase.setAlignmentY(0.0F);
        tabTiming_delayButton_DelayPhase.setBorder(null);
        tabTiming_delayButton_DelayPhase.setIconTextGap(0);
        tabTiming_delayButton_DelayPhase.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_delayButton_DelayPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_delayButton_DelayPhaseActionPerformed(evt);
            }
        });

        tabTiming_bigLeftButton_DelayPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        tabTiming_bigLeftButton_DelayPhase.setAlignmentY(0.0F);
        tabTiming_bigLeftButton_DelayPhase.setBorder(null);
        tabTiming_bigLeftButton_DelayPhase.setIconTextGap(0);
        tabTiming_bigLeftButton_DelayPhase.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigLeftButton_DelayPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigLeftButton_DelayPhaseActionPerformed(evt);
            }
        });

        tabTiming_bigRightButton_DelayPhase.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        tabTiming_bigRightButton_DelayPhase.setAlignmentY(0.0F);
        tabTiming_bigRightButton_DelayPhase.setBorder(null);
        tabTiming_bigRightButton_DelayPhase.setIconTextGap(0);
        tabTiming_bigRightButton_DelayPhase.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigRightButton_DelayPhase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigRightButton_DelayPhaseActionPerformed(evt);
            }
        });

        tabTiming_smallLeftButton_WidthDCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_left.png"))); // NOI18N
        tabTiming_smallLeftButton_WidthDCycle.setAlignmentY(0.0F);
        tabTiming_smallLeftButton_WidthDCycle.setBorder(null);
        tabTiming_smallLeftButton_WidthDCycle.setIconTextGap(0);
        tabTiming_smallLeftButton_WidthDCycle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_smallLeftButton_WidthDCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_smallLeftButton_WidthDCycleActionPerformed(evt);
            }
        });

        tabTiming_smallRightButton_WidthDCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_small_right.png"))); // NOI18N
        tabTiming_smallRightButton_WidthDCycle.setAlignmentY(0.0F);
        tabTiming_smallRightButton_WidthDCycle.setBorder(null);
        tabTiming_smallRightButton_WidthDCycle.setIconTextGap(0);
        tabTiming_smallRightButton_WidthDCycle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_smallRightButton_WidthDCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_smallRightButton_WidthDCycleActionPerformed(evt);
            }
        });

        tabTiming_delayButton_WidthDCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_mid_d.png"))); // NOI18N
        tabTiming_delayButton_WidthDCycle.setAlignmentY(0.0F);
        tabTiming_delayButton_WidthDCycle.setBorder(null);
        tabTiming_delayButton_WidthDCycle.setIconTextGap(0);
        tabTiming_delayButton_WidthDCycle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_delayButton_WidthDCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_delayButton_WidthDCycleActionPerformed(evt);
            }
        });

        tabTiming_bigLeftButton_WidthDCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_left.png"))); // NOI18N
        tabTiming_bigLeftButton_WidthDCycle.setAlignmentY(0.0F);
        tabTiming_bigLeftButton_WidthDCycle.setBorder(null);
        tabTiming_bigLeftButton_WidthDCycle.setIconTextGap(0);
        tabTiming_bigLeftButton_WidthDCycle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigLeftButton_WidthDCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigLeftButton_WidthDCycleActionPerformed(evt);
            }
        });

        tabTiming_bigRightButton_WidthDCycle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/silver_icon_button_big_right.png"))); // NOI18N
        tabTiming_bigRightButton_WidthDCycle.setAlignmentY(0.0F);
        tabTiming_bigRightButton_WidthDCycle.setBorder(null);
        tabTiming_bigRightButton_WidthDCycle.setIconTextGap(0);
        tabTiming_bigRightButton_WidthDCycle.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_bigRightButton_WidthDCycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_bigRightButton_WidthDCycleActionPerformed(evt);
            }
        });

        tabTiming_PeriodTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabTiming_PeriodTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabTiming_PeriodTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabTiming_PeriodTextField.setText("400 ps");
        tabTiming_PeriodTextField.setAlignmentX(0.0F);
        tabTiming_PeriodTextField.setAlignmentY(0.0F);
        tabTiming_PeriodTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabTiming_PeriodTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_PeriodTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTiming_PeriodTextFieldMouseClicked(evt);
            }
        });
        tabTiming_PeriodTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_PeriodTextFieldActionPerformed(evt);
            }
        });

        tabTiming_DelayTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabTiming_DelayTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabTiming_DelayTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabTiming_DelayTextField.setText("0 s");
        tabTiming_DelayTextField.setAlignmentX(0.0F);
        tabTiming_DelayTextField.setAlignmentY(0.0F);
        tabTiming_DelayTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabTiming_DelayTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_DelayTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTiming_DelayTextFieldMouseClicked(evt);
            }
        });
        tabTiming_DelayTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_DelayTextFieldActionPerformed(evt);
            }
        });

        tabTiming_WidthTextField.setBackground(new java.awt.Color(0, 0, 0));
        tabTiming_WidthTextField.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        tabTiming_WidthTextField.setForeground(new java.awt.Color(255, 255, 255));
        tabTiming_WidthTextField.setText("200 ps");
        tabTiming_WidthTextField.setAlignmentX(0.0F);
        tabTiming_WidthTextField.setAlignmentY(0.0F);
        tabTiming_WidthTextField.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        tabTiming_WidthTextField.setMargin(new java.awt.Insets(0, 0, 0, 0));
        tabTiming_WidthTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabTiming_WidthTextFieldMouseClicked(evt);
            }
        });
        tabTiming_WidthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tabTiming_WidthTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_Tab_TimingLayout = new javax.swing.GroupLayout(panel_Tab_Timing);
        panel_Tab_Timing.setLayout(panel_Tab_TimingLayout);
        panel_Tab_TimingLayout.setHorizontalGroup(
            panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTiming_PeriodLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_Period_ToggleButton)
                    .addComponent(tabTiming_Frequency_ToggleButton)
                    .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                        .addComponent(tabTiming_smallLeftButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_smallRightButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_delayButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigLeftButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigRightButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabTiming_PeriodMapLabel)
                    .addComponent(tabTiming_PeriodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                        .addComponent(tabTiming_ChOne_ToggleButton)
                        .addGap(4, 4, 4)
                        .addComponent(tabTiming_ChTwo_ToggleButton))
                    .addComponent(tabTiming_UpLineLabel)
                    .addComponent(tabTiming_DownLineLabel)
                    .addComponent(tabTiming_WidthLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_DelayLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_Delay_ToggleButton)
                    .addComponent(tabTiming_Phase_ToggleButton)
                    .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                        .addComponent(tabTiming_smallLeftButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_smallRightButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_delayButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigLeftButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigRightButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabTiming_WidthMapLabel)
                    .addComponent(tabTiming_WidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                        .addComponent(tabTiming_smallLeftButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_smallRightButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_delayButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigLeftButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(tabTiming_bigRightButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tabTiming_DelayMapLabel)
                    .addComponent(tabTiming_DelayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_Width_ToggleButton)
                    .addComponent(tabTiming_DCycle_ToggleButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_Tab_TimingLayout.setVerticalGroup(
            panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_Tab_TimingLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(tabTiming_Period_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_Frequency_ToggleButton)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_PeriodLabel)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_PeriodTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_PeriodMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTiming_smallLeftButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_smallRightButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_delayButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigLeftButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigRightButton_PeriodFreq, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabTiming_UpLineLabel)
                .addGap(12, 12, 12)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTiming_ChOne_ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_ChTwo_ToggleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(tabTiming_DownLineLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabTiming_Delay_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_Phase_ToggleButton)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_DelayLabel)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_DelayTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_DelayMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTiming_smallLeftButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_smallRightButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_delayButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigLeftButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigRightButton_DelayPhase, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(tabTiming_Width_ToggleButton)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_DCycle_ToggleButton)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_WidthLabel)
                .addGap(3, 3, 3)
                .addComponent(tabTiming_WidthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tabTiming_WidthMapLabel)
                .addGap(0, 0, 0)
                .addGroup(panel_Tab_TimingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabTiming_smallLeftButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_smallRightButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_delayButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigLeftButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tabTiming_bigRightButton_WidthDCycle, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
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

    private void tabLevels_ComplOnOff_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_ComplOnOff_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_btn_ch1 == false )
        {
            //  Переключаем чекер
            on_off_btn_ch1 = true;
            
            //  Меняем картинку
            tabLevels_ComplOnOff_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\on_button.png"));
        }
        else if( on_off_btn_ch1 == true )
        {
            //  Переключаем чекер
            on_off_btn_ch1 = false;
            
            //  Меняем картинку
            tabLevels_ComplOnOff_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\off_button.png"));
        }
    }//GEN-LAST:event_tabLevels_ComplOnOff_ToggleButtonActionPerformed

    private void tabLevels_NormalOnOff_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_NormalOnOff_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_btn_ch2 == false )
        {
            //  Переключаем чекер
            on_off_btn_ch2 = true;
            
            //  Меняем картинку
            tabLevels_NormalOnOff_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\on_button.png"));
        }
        else if( on_off_btn_ch2 == true )
        {
            //  Переключаем чекер
            on_off_btn_ch2 = false;
            
            //  Меняем картинку
            tabLevels_NormalOnOff_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\off_button.png"));
        }
    }//GEN-LAST:event_tabLevels_NormalOnOff_ToggleButtonActionPerformed

    private void tabLevels_ChOne_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_ChOne_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_ch1 == false )
        {
            //  Переключаем чекер
            on_off_ch1 = true;
            
            //  Меняем картинку
            tabLevels_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
        }
        else if( on_off_ch1 == true )
        {
            //  Переключаем чекер
            on_off_ch1 = false;
            
            //  Меняем картинку
            tabLevels_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
        }
    }//GEN-LAST:event_tabLevels_ChOne_ToggleButtonActionPerformed

    private void tabLevels_ChTwo_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_ChTwo_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_ch2 == false )
        {
            //  Переключаем чекер
            on_off_ch2 = true;
            
            //  Меняем картинку
            tabLevels_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
        }
        else if( on_off_ch2 == true )
        {
            //  Переключаем чекер
            on_off_ch2 = false;
            
            //  Меняем картинку
            tabLevels_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
        }
    }//GEN-LAST:event_tabLevels_ChTwo_ToggleButtonActionPerformed
    
    private void tabTiming_ChOne_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_ChOne_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_ch1_r == false )
        {
            //  Переключаем чекер
            on_off_ch1_r = true;
            on_off_ch2_r = false;
            
            //  Меняем картинку
            tabTiming_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
            tabTiming_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
        else if( on_off_ch1_r == true )
        {
            //  Переключаем чекер
            on_off_ch1_r = false;
            on_off_ch2_r = true;
            
            //  Меняем картинку
            tabTiming_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
            tabTiming_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
    }//GEN-LAST:event_tabTiming_ChOne_ToggleButtonActionPerformed

    private void tabTiming_ChTwo_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_ChTwo_ToggleButtonActionPerformed
        // Меняем иконку
        if( on_off_ch2_r == false )
        {
            //  Переключаем чекер
            on_off_ch2_r = true;
            on_off_ch1_r = false;
            
            //  Меняем картинку
            tabTiming_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_off.png"));
            tabTiming_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_on.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
        else if( on_off_ch2_r == true )
        {
            //  Переключаем чекер
            on_off_ch2_r = false;
            on_off_ch1_r = true;
            
            //  Меняем картинку
            tabTiming_ChOne_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch1_on.png"));
            tabTiming_ChTwo_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\ch2_off.png"));
            
            //  Обновление каналов вкладки Timing
            channelsupdate.updateTimingChannels(delay_ch, width_ch, on_off_ch1_r, on_off_ch2_r);
        }
    }//GEN-LAST:event_tabTiming_ChTwo_ToggleButtonActionPerformed

    private void tabTiming_Period_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_Period_ToggleButtonActionPerformed
        // Меняем иконку
        if( peri_ch == true )
        {
            //  Ничего не происходит
        }
        else if( peri_ch == false )
        {
            //  Меняем текст
            tabTiming_PeriodLabel.setText("Period");
            
            //  Переключаем чекеры
            peri_ch = true;
            freq_ch = false;
            
            //  Устанавливаем текст относящийся к Period
            tabTiming_PeriodTextField.setText( calibrations.per_mas [ calibrations.per_mas_nmb ] );
            
            //  Меняеем картинки
            tabTiming_Period_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\period_on.png"));
            tabTiming_Frequency_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\frequency_off.png"));
        }
    }//GEN-LAST:event_tabTiming_Period_ToggleButtonActionPerformed

    private void tabTiming_Frequency_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_Frequency_ToggleButtonActionPerformed
        // Меняем иконку
        if( freq_ch == true )
        {
            //  Ничего не происходит
        }
        else if( freq_ch == false )
        {
            // Меняем текст
            tabTiming_PeriodLabel.setText("Frequency");
            
            //  Переключаем чекеры
            freq_ch = true;
            peri_ch = false;
            
            //  Устанавливаем текст относящийся к Period
            tabTiming_PeriodTextField.setText( calibrations.freq_mas [ calibrations.freq_mas_nmb ] );
            
            //  Меняеем картинки
            tabTiming_Frequency_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\frequency_on.png"));
            tabTiming_Period_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\period_off.png"));
        }
    }//GEN-LAST:event_tabTiming_Frequency_ToggleButtonActionPerformed

    private void tabLevels_Compl_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_Compl_ToggleButtonActionPerformed
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
            tabLevels_Compl_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\complement_on.png"));
            tabLevels_Normal_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\normal_off.png"));
        }
    }//GEN-LAST:event_tabLevels_Compl_ToggleButtonActionPerformed

    private void tabLevels_Normal_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_Normal_ToggleButtonActionPerformed
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
            tabLevels_Normal_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\normal_on.png"));
            tabLevels_Compl_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\complement_off.png"));
        }
    }//GEN-LAST:event_tabLevels_Normal_ToggleButtonActionPerformed

    private void tabLevels_OffsetAmpl_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_OffsetAmpl_ToggleButtonActionPerformed
        // Меняем иконку
        if( ofst_ch == true )
        {
            //  Ничего не происходит
        }
        else if( ofst_ch == false )
        {
            //  Меняем текст
            tabLevels_HighLevelLabel.setText("Offset");
            tabLevels_LowLevelLabel.setText("Amplitude");
            
            //  Переключаем чекеры
            ofst_ch = true;
            hilo_ch = false;
            stnd_ch = false;
            
            //  Меняеем картинки
            tabLevels_OffsetAmpl_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_on.png"));
            tabLevels_HighLow_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_off.png"));
            tabLevels_Standard_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_off.png"));
        }
        
        //  Выключаем чекбокс (делаем затемненным)
        tabLevels_Choice.setEnabled(false);
        
        //  Делаем видимыми кнопки и шкалы относящиеся к этой секции
        visibility.levelsTab_HighLowLevelsVisibility(true);
        
        //  Делаем видимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(true);
    }//GEN-LAST:event_tabLevels_OffsetAmpl_ToggleButtonActionPerformed

    private void tabLevels_HighLow_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_HighLow_ToggleButtonActionPerformed
        // Меняем иконку
        if( hilo_ch == true )
        {
            //  Ничего не происходит
        }
        else if( hilo_ch == false )
        {
            //  Меняем текст
            tabLevels_HighLevelLabel.setText("High Level");
            tabLevels_LowLevelLabel.setText("Low Level");
            
            //  Переключаем чекеры
            hilo_ch = true;
            ofst_ch = false;
            stnd_ch = false;
            
            //  Меняеем картинки
            tabLevels_HighLow_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_on.png"));
            tabLevels_OffsetAmpl_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_off.png"));
            tabLevels_Standard_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_off.png"));
        }
        
        //  Выключаем чекбокс (делаем затемненным)
        tabLevels_Choice.setEnabled(false);
        
        //  Делаем видимыми кнопки и шкалы относящиеся к этой секции
        visibility.levelsTab_HighLowLevelsVisibility(true);
        
        //  Делаем видимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(true);
    }//GEN-LAST:event_tabLevels_HighLow_ToggleButtonActionPerformed

    private void tabLevels_Standard_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_Standard_ToggleButtonActionPerformed
        // Меняем иконку
        if( stnd_ch == true )
        {
            //  Ничего не происходит
        }
        else if( stnd_ch == false )
        {
            //  Меняем текст
            tabLevels_HighLevelLabel.setText("High Level");
            tabLevels_LowLevelLabel.setText("Low Level");
            
            //  Переключаем чекеры
            stnd_ch = true;
            hilo_ch = false;
            ofst_ch = false;
            
            //  Меняеем картинки
            tabLevels_Standard_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\std_on.png"));
            tabLevels_HighLow_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\high-low_off.png"));
            tabLevels_OffsetAmpl_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\offset_off.png"));
        }
        
        //  Включаем чекбокс (делаем затемненным)
        tabLevels_Choice.setEnabled(true);
        
        //  Делаем невидимыми кнопки и шкалы относящиеся к этой секции
        visibility.levelsTab_HighLowLevelsVisibility(false);
        
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        visibility.levelsTab_HighLowLimitsVisibility(false);
    }//GEN-LAST:event_tabLevels_Standard_ToggleButtonActionPerformed

    private void tabTiming_Delay_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_Delay_ToggleButtonActionPerformed
        // Меняем иконку
        if( delay_ch == true )
        {
            //  Ничего не происходит
        }
        else if( delay_ch == false )
        {
            //  Меняем текст
            tabTiming_DelayLabel.setText("Delay");
            
            //  Переключаем чекеры
            delay_ch = true;
            phase_ch = false;
            
            //  Устанавливаем текст относящийся к Delay
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                tabTiming_DelayTextField.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                tabTiming_DelayTextField.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch2 ] );
            }
            
            //  Меняеем картинки
            tabTiming_Delay_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\delay_on.png"));
            tabTiming_Phase_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\phase_off.png"));
        }
    }//GEN-LAST:event_tabTiming_Delay_ToggleButtonActionPerformed

    private void tabTiming_Phase_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_Phase_ToggleButtonActionPerformed
        // Меняем иконку
        if( phase_ch == true )
        {
            //  Ничего не происходит
        }
        else if( phase_ch == false )
        {
            //  Меняем текст
            tabTiming_DelayLabel.setText("Phase");
            
            //  Переключаем чекеры
            phase_ch = true;
            delay_ch = false;
            
            //  Устанавливаем текст относящийся к Phase
            
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                tabTiming_DelayTextField.setText( calibrations.phas_mas [ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                tabTiming_DelayTextField.setText( calibrations.phas_mas [ calibrations.phas_mas_nmb_ch2 ] );
            }
            
            //  Меняеем картинки
            tabTiming_Delay_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\delay_off.png"));
            tabTiming_Phase_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\phase_on.png"));
        }
    }//GEN-LAST:event_tabTiming_Phase_ToggleButtonActionPerformed

    private void tabLevels_bigUpButton_LowLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigUpButton_LowLimitActionPerformed

    }//GEN-LAST:event_tabLevels_bigUpButton_LowLimitActionPerformed

    private void tabLevels_LowLimitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_LowLimitTextFieldActionPerformed
        
    }//GEN-LAST:event_tabLevels_LowLimitTextFieldActionPerformed

    private void tabLevels_HighLimitTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_HighLimitTextFieldActionPerformed

    }//GEN-LAST:event_tabLevels_HighLimitTextFieldActionPerformed

    private void tabLevels_bigUpButton_HighLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigUpButton_HighLimitActionPerformed

    }//GEN-LAST:event_tabLevels_bigUpButton_HighLimitActionPerformed

    private void tabLevels_bigUpButton_LowLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigUpButton_LowLevelActionPerformed
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
        tabLevels_LowLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_bigUpButton_LowLevelActionPerformed

    private void tabLevels_LowLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_LowLevelTextFieldActionPerformed

    }//GEN-LAST:event_tabLevels_LowLevelTextFieldActionPerformed

    private void tabLevels_bigUpButton_HighLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigUpButton_HighLevelActionPerformed
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
        tabLevels_HighLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_bigUpButton_HighLevelActionPerformed

    private void tabLevels_HighLevelTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_HighLevelTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabLevels_HighLevelTextFieldActionPerformed

    private void tabTiming_WidthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_WidthTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabTiming_WidthTextFieldActionPerformed

    private void tabTiming_bigRightButton_WidthDCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigRightButton_WidthDCycleActionPerformed
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
                tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
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
                tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
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
            tabTiming_WidthTextField.setText(s + " %");
        }
    }//GEN-LAST:event_tabTiming_bigRightButton_WidthDCycleActionPerformed

    private void tabTiming_DelayTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_DelayTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabTiming_DelayTextFieldActionPerformed

    private void tabTiming_bigRightButton_DelayPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigRightButton_DelayPhaseActionPerformed
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
                tabTiming_DelayTextField.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch1 ] );
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
                tabTiming_DelayTextField.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch2 ] );
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
                tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
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
                tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
        }
    }//GEN-LAST:event_tabTiming_bigRightButton_DelayPhaseActionPerformed

    private void tabTiming_PeriodTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_PeriodTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tabTiming_PeriodTextFieldActionPerformed
        
    private void tabTiming_bigRightButton_PeriodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigRightButton_PeriodFreqActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Повышаем значение переменной номера мас
            if( calibrations.per_mas_nmb < 20 )
            {
                calibrations.per_mas_nmb++;
            }

            //  Устанавливаем значение Period
            tabTiming_PeriodTextField.setText( calibrations.per_mas[ calibrations.per_mas_nmb ] );
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
            tabTiming_PeriodTextField.setText( calibrations.freq_mas[ calibrations.freq_mas_nmb ] );
        }
    }//GEN-LAST:event_tabTiming_bigRightButton_PeriodFreqActionPerformed

    private void tabTiming_Width_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_Width_ToggleButtonActionPerformed
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
            if      (   calibrations.li_width_ch1 < 1000    ){tabTiming_WidthTextField.setText(s + " ps");}
            else if (   calibrations.li_width_ch1 < 1000000 ){tabTiming_WidthTextField.setText(s + " ns");}
        }
        //  Если активен 2 канал
        else if ( on_off_ch2_r == true && on_off_ch1_r == false )
        {
            //  Определяем значение li_width для 2 канала
            if(         calibrations.li_width_ch2 < 1000    ){s = Integer.toString(calibrations.li_width_ch2);      }        
            else if(    calibrations.li_width_ch2 < 1000000 ){s = Integer.toString(calibrations.li_width_ch2/1000); }
        
            //  Определяем как будет выглядеть текстовое значение li_width для 2 канала
            if      (   calibrations.li_width_ch2 < 1000    ){tabTiming_WidthTextField.setText(s + " ps");}
            else if (   calibrations.li_width_ch2 < 1000000 ){tabTiming_WidthTextField.setText(s + " ns");}
        }
        
        // Меняем иконку
        if( width_ch == true )
        {
            //  Ничего не происходит
        }
        else if( width_ch == false )
        {
            //  Меняем текст
            tabTiming_WidthLabel.setText("Width");
            
            //  Переключаем чекеры
            width_ch = true;
            dcycle_ch = false;
            
            //  Меняеем картинки
            tabTiming_Width_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\width_on.png"));
            tabTiming_DCycle_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\dcycle_off.png"));
        }
    }//GEN-LAST:event_tabTiming_Width_ToggleButtonActionPerformed

    private void tabTiming_DCycle_ToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_DCycle_ToggleButtonActionPerformed
        //  Присваиваем значение DCycle
        String s = Integer.toString(calibrations.dcycle_percent);
        tabTiming_WidthTextField.setText(s + " %");

        // Меняем иконку
        if( dcycle_ch == true )
        {
            //  Ничего не происходит
        }
        else if( dcycle_ch == false )
        {
            //  Меняем текст
            tabTiming_WidthLabel.setText("Duty Cycle");
            
            //  Переключаем чекеры
            dcycle_ch = true;
            width_ch = false;
            
            //  Меняеем картинки
            tabTiming_Width_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\width_off.png"));
            tabTiming_DCycle_ToggleButton.setIcon(new ImageIcon(currentDir + "\\src\\images\\dcycle_on.png"));
        }
    }//GEN-LAST:event_tabTiming_DCycle_ToggleButtonActionPerformed

    private void topMenu_BackRightButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenu_BackRightButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_topMenu_BackRightButtonActionPerformed

    private void topMenu_ManualTrigGateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topMenu_ManualTrigGateButtonActionPerformed
        
    }//GEN-LAST:event_topMenu_ManualTrigGateButtonActionPerformed

    private void tabTiming_smallRightButton_WidthDCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_smallRightButton_WidthDCycleActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
            //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную
            String ans = calibrations.VDDF(6, calibrations.li_width_ch1, true, 1);
            
            //  Выводим результат
            tabTiming_WidthTextField.setText(ans);
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
            tabTiming_WidthTextField.setText(s + " %");
        }
    }//GEN-LAST:event_tabTiming_smallRightButton_WidthDCycleActionPerformed

    private void tabTiming_smallRightButton_DelayPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_smallRightButton_DelayPhaseActionPerformed
        
    }//GEN-LAST:event_tabTiming_smallRightButton_DelayPhaseActionPerformed

    private void tabTiming_smallRightButton_PeriodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_smallRightButton_PeriodFreqActionPerformed
        
    }//GEN-LAST:event_tabTiming_smallRightButton_PeriodFreqActionPerformed

    private void tabLevels_ChoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tabLevels_ChoiceItemStateChanged
        //  Получаем выбранное значение и сохраняем его в переменную
        String choiceSelectedItem = tabLevels_Choice.getSelectedItem();
        
        //  Отправляем его в функцию изменения значений High/Low Level
        levelStandard.changeLevelValues(choiceSelectedItem);
    }//GEN-LAST:event_tabLevels_ChoiceItemStateChanged

    private void tabTiming_bigLeftButton_PeriodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigLeftButton_PeriodFreqActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Понижаем значение переменной номера мас
            if( calibrations.per_mas_nmb > 0 )
            {
                calibrations.per_mas_nmb--;
            }

            //  Устанавливаем значение Period
            tabTiming_PeriodTextField.setText( calibrations.per_mas[ calibrations.per_mas_nmb ] );
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
            tabTiming_PeriodTextField.setText( calibrations.freq_mas[ calibrations.freq_mas_nmb ] );
        }
    }//GEN-LAST:event_tabTiming_bigLeftButton_PeriodFreqActionPerformed

    private void tabTiming_delayButton_PeriodFreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_delayButton_PeriodFreqActionPerformed
        //  Если активен Period
        if( peri_ch == true )
        {
            //  Устанавливаем значение Period по дефолту
            tabTiming_PeriodTextField.setText( calibrations.per_mas[ 11 ] );
            calibrations.per_mas_nmb = 11;
        }
        //  Если активен Frequency
        else if( freq_ch == true )
        {
            tabTiming_PeriodTextField.setText( calibrations.freq_mas[ 9 ] );
            calibrations.freq_mas_nmb = 9;
        }
    }//GEN-LAST:event_tabTiming_delayButton_PeriodFreqActionPerformed

    private void tabLevels_bigDownButton_HighLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigDownButton_HighLevelActionPerformed
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
        tabLevels_HighLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_bigDownButton_HighLevelActionPerformed

    private void tabLevels_zeroButton_HighLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_zeroButton_HighLevelActionPerformed
        //  При нажатии калибровки выставляем пределы изменения High Level на ноль
        //  Присваиваем переменной значение ноль
        calibrations.cl_High_Level = 0;
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_HighLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_zeroButton_HighLevelActionPerformed

    private void tabLevels_smallUpButton_HighLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_smallUpButton_HighLevelActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения плавного шага High Level на +0.01
        //  Увеличиваем значение переменной на +0.01
        calibrations.cl_High_Level++;
        
        //  Проверяем ограничения по верхнему пределу High Level (2.5 V)
        if( calibrations.cl_High_Level >= 250){calibrations.cl_High_Level = 250;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_HighLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_smallUpButton_HighLevelActionPerformed

    private void tabLevels_smallDownButton_HighLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_smallDownButton_HighLevelActionPerformed
        //  При нажатии калибровки уменьшаем пределы изменения плавного шага High Level на -0.01
        //  Уменьшаем значение переменной на -0.01
        calibrations.cl_High_Level--;
        
        //  Проверяем ограничения по нижнему пределу High Level (-1.9)
        if( calibrations.cl_High_Level <= -190){calibrations.cl_High_Level = -190;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_High_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_HighLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_smallDownButton_HighLevelActionPerformed

    private void tabLevels_bigDownButton_LowLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_bigDownButton_LowLevelActionPerformed
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
        tabLevels_LowLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_bigDownButton_LowLevelActionPerformed

    private void tabLevels_zeroButton_LowLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_zeroButton_LowLevelActionPerformed
        //  При нажатии калибровки выставляем пределы изменения Low Level на ноль
        //  Присваиваем переменной значение ноль
        calibrations.cl_Low_Level = 0;
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_LowLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_zeroButton_LowLevelActionPerformed

    private void tabLevels_smallUpButton_LowLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_smallUpButton_LowLevelActionPerformed
        //  При нажатии калибровки увеличиваем пределы изменения плавного шага Low Level на +0.01
        //  Увеличиваем значение переменной на +0.01
        calibrations.cl_Low_Level++;
        
        //  Проверяем ограничения по верхнему пределу High Level (2.4 V)
        if( calibrations.cl_Low_Level >= 240){calibrations.cl_Low_Level = 240;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_LowLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_smallUpButton_LowLevelActionPerformed

    private void tabLevels_smallDownButton_LowLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabLevels_smallDownButton_LowLevelActionPerformed
        //   При нажатии калибровки уменьшаем пределы изменения плавного шага Low Level на -0.01
        //  Уменьшаем значение переменной на -0.01
        calibrations.cl_Low_Level--;
        
        //  Проверяем ограничения по нижнему пределу High Level (-1.9)
        if( calibrations.cl_Low_Level <= -200){calibrations.cl_Low_Level = -200;}
        
        //  Присваиваем новое значение переменной
        float qqq = (float) (calibrations.cl_Low_Level * 0.01);
        
        //  Передаем это значение текстовому полю
        tabLevels_LowLevelTextField.setText(qqq + " V");
    }//GEN-LAST:event_tabLevels_smallDownButton_LowLevelActionPerformed

    private void tabTiming_bigLeftButton_DelayPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigLeftButton_DelayPhaseActionPerformed
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
                tabTiming_DelayTextField.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.del_mas_nmb_ch2 > 0 )
                {
                    calibrations.del_mas_nmb_ch2--;
                }
                //  Устанавливаем значение Delay
                tabTiming_DelayTextField.setText( calibrations.del_mas[ calibrations.del_mas_nmb_ch2 ] );
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
                tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false )
            {
                //  Повышаем значение переменной номера мас
                if( calibrations.phas_mas_nmb_ch2 > 0 )
                {
                    calibrations.phas_mas_nmb_ch2--;
                }
                //  Устанавливаем значение Phase
                tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
        }
    }//GEN-LAST:event_tabTiming_bigLeftButton_DelayPhaseActionPerformed

    private void tabTiming_delayButton_DelayPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_delayButton_DelayPhaseActionPerformed
        //  Если активен Delay
        if( delay_ch == true )
        {
            //  Устанавливаем значение Delay по дефолту
            tabTiming_DelayTextField.setText( calibrations.del_mas[ 7 ] );
            
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
            tabTiming_DelayTextField.setText( calibrations.phas_mas[ 7 ] );
            
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
    }//GEN-LAST:event_tabTiming_delayButton_DelayPhaseActionPerformed

    private void tabLevels_HighLevelTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLevels_HighLevelTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(4);
    }//GEN-LAST:event_tabLevels_HighLevelTextFieldMouseClicked

    private void tabLevels_LowLevelTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLevels_LowLevelTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(3);
    }//GEN-LAST:event_tabLevels_LowLevelTextFieldMouseClicked

    private void tabLevels_HighLimitTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLevels_HighLimitTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(2);
    }//GEN-LAST:event_tabLevels_HighLimitTextFieldMouseClicked

    private void tabLevels_LowLimitTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabLevels_LowLimitTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(1);
    }//GEN-LAST:event_tabLevels_LowLimitTextFieldMouseClicked

    private void tabTiming_PeriodTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTiming_PeriodTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(7);
    }//GEN-LAST:event_tabTiming_PeriodTextFieldMouseClicked

    private void tabTiming_DelayTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTiming_DelayTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(6);
    }//GEN-LAST:event_tabTiming_DelayTextFieldMouseClicked

    private void tabTiming_WidthTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabTiming_WidthTextFieldMouseClicked
        //  Вызываем функцию отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
        popupmenu.showAdjPopupMenu(5);
    }//GEN-LAST:event_tabTiming_WidthTextFieldMouseClicked

    private void tabTiming_delayButton_WidthDCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_delayButton_WidthDCycleActionPerformed
        //  Если активен Period
        if( width_ch == true )
        {
            //  Устанавливаем значение Width по дефолту
            tabTiming_WidthTextField.setText( calibrations.width_mas[ 5 ] );
            
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
            tabTiming_WidthTextField.setText(s + " %");
        }
    }//GEN-LAST:event_tabTiming_delayButton_WidthDCycleActionPerformed

    private void tabTiming_smallLeftButton_WidthDCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_smallLeftButton_WidthDCycleActionPerformed
        //  Если активен Width
        if( width_ch == true )
        {
            //  Проверяем какой из каналов выбран
            if      ( on_off_ch1_r == true && on_off_ch2_r == false )
            {
                //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную для 1 канала
                String ans_ch1 = calibrations.VDDF(6, calibrations.li_width_ch1, false, 1);
                
                //  Выводим результат
                tabTiming_WidthTextField.setText(ans_ch1);
            }
            else if ( on_off_ch2_r == true && on_off_ch1_r == false)
            {     
                //  Отправляем запрос в функцию VDDF и сохраняем возвращяемое значение в переменную для 2 канала
                String ans_ch2 = calibrations.VDDF(6, calibrations.li_width_ch2, false, 2);
                
                //  Выводим результат
                tabTiming_WidthTextField.setText(ans_ch2);
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
            tabTiming_WidthTextField.setText(s + " %");
        }
    }//GEN-LAST:event_tabTiming_smallLeftButton_WidthDCycleActionPerformed

    private void tabTiming_bigLeftButton_WidthDCycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_bigLeftButton_WidthDCycleActionPerformed
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
                tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
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
                tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
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
            tabTiming_WidthTextField.setText(s + " %");
        }
    }//GEN-LAST:event_tabTiming_bigLeftButton_WidthDCycleActionPerformed

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

    private void tabTiming_smallLeftButton_DelayPhaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tabTiming_smallLeftButton_DelayPhaseActionPerformed

    }//GEN-LAST:event_tabTiming_smallLeftButton_DelayPhaseActionPerformed

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
    public static javax.swing.JLabel calibLabel_Ampl;
    public static javax.swing.JLabel calibLabel_AmplChOne;
    public static javax.swing.JLabel calibLabel_AmplChTwo;
    public static javax.swing.JLabel calibLabel_DelayChOne;
    public static javax.swing.JLabel calibLabel_DelayChTwo;
    public static javax.swing.JLabel calibLabel_Offset;
    public static javax.swing.JLabel calibLabel_OffsetChOne;
    public static javax.swing.JLabel calibLabel_OffsetChTwo;
    public static javax.swing.JLabel calibLabel_Period;
    public static javax.swing.JLabel calibLabel_Width;
    public static javax.swing.JLabel calibLabel_WidthChOne;
    public static javax.swing.JLabel calibLabel_WidthChTwo;
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
    public static javax.swing.JPopupMenu jPopupMenu1;
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
    public static javax.swing.JToggleButton tabLevels_ChOne_ToggleButton;
    public static javax.swing.JToggleButton tabLevels_ChTwo_ToggleButton;
    public static java.awt.Choice tabLevels_Choice;
    public static javax.swing.JLabel tabLevels_ComplLabel;
    public static javax.swing.JToggleButton tabLevels_ComplOnOff_ToggleButton;
    public static javax.swing.JToggleButton tabLevels_Compl_ToggleButton;
    public static javax.swing.JLabel tabLevels_HighLevelLabel;
    public static javax.swing.JLabel tabLevels_HighLevelMapLabel;
    public static javax.swing.JTextField tabLevels_HighLevelTextField;
    public static javax.swing.JLabel tabLevels_HighLimitLabel;
    public static javax.swing.JLabel tabLevels_HighLimitMapLabel;
    public static javax.swing.JTextField tabLevels_HighLimitTextField;
    public static javax.swing.JToggleButton tabLevels_HighLow_ToggleButton;
    public static javax.swing.JLabel tabLevels_LevelFormatLabel;
    public static javax.swing.JLabel tabLevels_LowLevelLabel;
    public static javax.swing.JLabel tabLevels_LowLevelMapLabel;
    public static javax.swing.JTextField tabLevels_LowLevelTextField;
    public static javax.swing.JLabel tabLevels_LowLimitLabel;
    public static javax.swing.JLabel tabLevels_LowLimitMapLabel;
    public static javax.swing.JTextField tabLevels_LowLimitTextField;
    public static javax.swing.JLabel tabLevels_NormalLabel;
    public static javax.swing.JToggleButton tabLevels_NormalOnOff_ToggleButton;
    public static javax.swing.JToggleButton tabLevels_Normal_ToggleButton;
    public static javax.swing.JToggleButton tabLevels_OffsetAmpl_ToggleButton;
    public static javax.swing.JLabel tabLevels_PolarityLabel;
    public static javax.swing.JToggleButton tabLevels_Standard_ToggleButton;
    public static javax.swing.JButton tabLevels_bigDownButton_HighLevel;
    public static javax.swing.JButton tabLevels_bigDownButton_HighLimit;
    public static javax.swing.JButton tabLevels_bigDownButton_LowLevel;
    public static javax.swing.JButton tabLevels_bigDownButton_LowLimit;
    public static javax.swing.JButton tabLevels_bigUpButton_HighLevel;
    public static javax.swing.JButton tabLevels_bigUpButton_HighLimit;
    public static javax.swing.JButton tabLevels_bigUpButton_LowLevel;
    public static javax.swing.JButton tabLevels_bigUpButton_LowLimit;
    public static javax.swing.JButton tabLevels_smallDownButton_HighLevel;
    public static javax.swing.JButton tabLevels_smallDownButton_HighLimit;
    public static javax.swing.JButton tabLevels_smallDownButton_LowLevel;
    public static javax.swing.JButton tabLevels_smallDownButton_LowLimit;
    public static javax.swing.JButton tabLevels_smallUpButton_HighLevel;
    public static javax.swing.JButton tabLevels_smallUpButton_HighLimit;
    public static javax.swing.JButton tabLevels_smallUpButton_LowLevel;
    public static javax.swing.JButton tabLevels_smallUpButton_LowLimit;
    public static javax.swing.JButton tabLevels_zeroButton_HighLevel;
    public static javax.swing.JButton tabLevels_zeroButton_HighLimit;
    public static javax.swing.JButton tabLevels_zeroButton_LowLevel;
    public static javax.swing.JButton tabLevels_zeroButton_LowLimit;
    public static javax.swing.JToggleButton tabTiming_ChOne_ToggleButton;
    public static javax.swing.JToggleButton tabTiming_ChTwo_ToggleButton;
    public static javax.swing.JToggleButton tabTiming_DCycle_ToggleButton;
    public static javax.swing.JLabel tabTiming_DelayLabel;
    public static javax.swing.JLabel tabTiming_DelayMapLabel;
    public static javax.swing.JTextField tabTiming_DelayTextField;
    public static javax.swing.JToggleButton tabTiming_Delay_ToggleButton;
    public static javax.swing.JLabel tabTiming_DownLineLabel;
    public static javax.swing.JToggleButton tabTiming_Frequency_ToggleButton;
    public static javax.swing.JLabel tabTiming_PeriodLabel;
    public static javax.swing.JLabel tabTiming_PeriodMapLabel;
    public static javax.swing.JTextField tabTiming_PeriodTextField;
    public static javax.swing.JToggleButton tabTiming_Period_ToggleButton;
    public static javax.swing.JToggleButton tabTiming_Phase_ToggleButton;
    public static javax.swing.JLabel tabTiming_UpLineLabel;
    public static javax.swing.JLabel tabTiming_WidthLabel;
    public static javax.swing.JLabel tabTiming_WidthMapLabel;
    public static javax.swing.JTextField tabTiming_WidthTextField;
    public static javax.swing.JToggleButton tabTiming_Width_ToggleButton;
    public static javax.swing.JButton tabTiming_bigLeftButton_DelayPhase;
    public static javax.swing.JButton tabTiming_bigLeftButton_PeriodFreq;
    public static javax.swing.JButton tabTiming_bigLeftButton_WidthDCycle;
    public static javax.swing.JButton tabTiming_bigRightButton_DelayPhase;
    public static javax.swing.JButton tabTiming_bigRightButton_PeriodFreq;
    public static javax.swing.JButton tabTiming_bigRightButton_WidthDCycle;
    public static javax.swing.JButton tabTiming_delayButton_DelayPhase;
    public static javax.swing.JButton tabTiming_delayButton_PeriodFreq;
    public static javax.swing.JButton tabTiming_delayButton_WidthDCycle;
    public static javax.swing.JButton tabTiming_smallLeftButton_DelayPhase;
    public static javax.swing.JButton tabTiming_smallLeftButton_PeriodFreq;
    public static javax.swing.JButton tabTiming_smallLeftButton_WidthDCycle;
    public static javax.swing.JButton tabTiming_smallRightButton_DelayPhase;
    public static javax.swing.JButton tabTiming_smallRightButton_PeriodFreq;
    public static javax.swing.JButton tabTiming_smallRightButton_WidthDCycle;
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