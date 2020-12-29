/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
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
 * @author PAVEL TROSTIANKO
 */
public class Interface extends javax.swing.JFrame {
    
    /* ГРАФИЧЕСКИЙ ИНТЕРФЕЙС ПРОГРАММЫ  */
    
    // Переменная для сохранения определения пути к директории с проектом
    Path currentDir = Paths.get(".");
    
    //  Специальный цвет для подсветки кнопок
    public static final Color BLUE_FOR_BUTTONS = new Color(100,158,242);
    public static final Color GRAY_FOR_BUTTONS = new Color(240,240,240);
    
    //  Цвета для автоматического выставления фонового цвета
    //  public static final Color zen_ginks = new Color(105,125,245);
    //  public static final Color zen_qinkz = new Color(115,125,220);
    //  public static final Color zen_qinkd = new Color(150,150,250);
    //  public static final Color zen_qinkq = new Color(199,130,200);
    //  public static final Color zen_qinkf = new Color(174,115,215);
    //  public static final Color zen_qinkl = new Color(144,133,220);
    
    // ЧЕКЕРЫ
    
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
    
    // Чекеры для проверки включения частоты и периода
    boolean peri_ch = true;
    boolean freq_ch = false;
    
    // Чекеры для проверки включения частоты и периода
    boolean nrml_ch = true;
    boolean comp_ch = false;
    
    // Чекеры для проверки включения high-low, offset и standard
    boolean hilo_ch = true;
    boolean ofst_ch = false;
    boolean stnd_ch = false;
    
    // Чекеры для проверки задержки и фазы
    boolean delay_ch = true;
    boolean phase_ch = false;
    
    // Чекеры для проверки задержки и фазы
    boolean width_ch = true;
    boolean dcycle_ch = false;
    
    public Interface() {
        initComponents();
        //  initComponents() регенерируется средой IDE при создании пользовательского интерфейса в редакторе графического интерфейса
        
        //  ДАЛЕЕ ИДЕТ РЕДАКТИРУЕМЫЙ КОД ГРАФИЧЕСКОГО ИНТЕРФЕЙСА
        //  НАКЛАДЫВАЕМ ЦВЕТ НА КНОПКИ НИЖНЕГО МЕНЮ
        
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        //  КНОПКИ ВЫБОРА
        
        //JToggleButton jtb5 = jToggleButton5;
        //JToggleButton jtb6 = jToggleButton6;
        //JToggleButton jtb9 = jToggleButton9;
        //JToggleButton jtb11 = jToggleButton11;
        //JToggleButton jtb23 = jToggleButton23;
        //JToggleButton jtb24 = jToggleButton24;
        //JToggleButton jtb25 = jToggleButton25;
        //JToggleButton jtb26 = jToggleButton26;
        //JToggleButton jtb27 = jToggleButton27;
        
        //  ПРОКЛИКИВАЕМ КНОПКИ ВЫБОРА
        
        //jtb17.doClick();
        //jtb16.doClick();
        //jtb12.doClick();
        //jtb15.doClick();
        //jtb1.doClick();
        
        //  НАСТРОЙКА КНОПОК ВЫБОРА
         
        //jtb1.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb11.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb11.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb5.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb5.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb5.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb16.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb6.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb6.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb19.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb9.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb9.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb23.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb23.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb23.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb24.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb24.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb24.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb25.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb25.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb25.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb26.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb26.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb26.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jtb27.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jtb27.setOpaque(true);                           // Делает кнопку непрозрачной
        //jtb27.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //  КНОПКИ ВЕРХНЕГО МЕНЮ
        
        JButton jb7 = jButton7;
        //JButton jb17 = jButton17;
        //JButton jb18 = jButton18;
        //JButton jb19 = jButton19;
        //JButton jb20 = jButton20;
        //JButton jb21 = jButton21;
        JButton jb22 = jButton22;
        JButton jb23 = jButton23;
        JButton jb24 = jButton24;
        JButton jb25 = jButton25;
        JButton jb26 = jButton26;
        //JButton jb27 = jButton27;
        //JButton jb28 = jButton28;
        //JButton jb29 = jButton29;
        //JButton jb30 = jButton30;
        //JButton jb31 = jButton31;
        //JButton jb32 = jButton32;
        //JButton jb33 = jButton33;
        //JButton jb34 = jButton34;
        //JButton jb35 = jButton35;
        //JButton jb36 = jButton36;
        
        //  НАСТРОЙКА ВНЕШНЕГО ВИДА КНОПОК
        
        //jb7.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb7.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb7.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb17.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb17.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb17.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb18.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb18.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb18.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb19.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb19.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb19.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb20.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb20.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb20.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb21.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb21.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb21.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb22.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb22.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb22.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb23.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb23.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb23.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb24.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb24.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb24.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb25.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb25.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb25.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        jb26.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        jb26.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb26.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb27.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb27.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb27.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb28.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb28.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb28.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb29.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb29.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb29.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb30.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb30.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb30.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb31.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb31.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb31.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb32.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb32.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb32.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb33.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb33.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb33.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb34.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb34.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb34.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb35.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb35.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb35.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //jb36.setContentAreaFilled(false);               // Делает кнопку полностью заполненой
        //jb36.setOpaque(true);                           // Делает кнопку непрозрачной
        //jb36.setBorder(new LineBorder(Color.BLACK));    // Создает темную рамку вокруг кнопки
        
        //  КНОПКИ ПРАВОГО МЕНЮ
        
        //JButton jb37 = jButton37;
        //JButton jb38 = jButton38;
        //JButton jb39 = jButton39;
        //JButton jb40 = jButton40;
        //JButton jb41 = jButton41;
        //JButton jb42 = jButton42;
        //JButton jb43 = jButton43;
        //JButton jb44 = jButton44;
        //JButton jb45 = jButton45;
        //JButton jb46 = jButton46;
        //JButton jb47 = jButton47;
        //JButton jb48 = jButton48;
        //JButton jb49 = jButton49;
        //JButton jb50 = jButton50;
        //JButton jb51 = jButton51;
        
        //jb37.setContentAreaFilled(false);
        //jb37.setOpaque(true);
        //jb37.setBorder(new LineBorder(Color.BLACK));
        
        //jb38.setContentAreaFilled(false);
        //jb38.setOpaque(true);
        //jb38.setBorder(new LineBorder(Color.BLACK));
        
        //jb39.setContentAreaFilled(false);
        //jb39.setOpaque(true);
        //jb39.setBorder(new LineBorder(Color.BLACK));
        
        //jb40.setContentAreaFilled(false);
        //jb40.setOpaque(true);
        //jb40.setBorder(new LineBorder(Color.BLACK));
        
        //jb41.setContentAreaFilled(false);
        //jb41.setOpaque(true);
        //jb41.setBorder(new LineBorder(Color.BLACK));
        
        //jb42.setContentAreaFilled(false);
        //jb42.setOpaque(true);
        //jb42.setBorder(new LineBorder(Color.BLACK));
        
        //jb43.setContentAreaFilled(false);
        //jb43.setOpaque(true);
        //jb43.setBorder(new LineBorder(Color.BLACK));
        
        //jb44.setContentAreaFilled(false);
        //jb44.setOpaque(true);
        //jb44.setBorder(new LineBorder(Color.BLACK));
        
        //jb45.setContentAreaFilled(false);
        //jb45.setOpaque(true);
        //jb45.setBorder(new LineBorder(Color.BLACK));
        
        //jb46.setContentAreaFilled(false);
        //jb46.setOpaque(true);
        //jb46.setBorder(new LineBorder(Color.BLACK));
        
        //jb47.setContentAreaFilled(false);
        //jb47.setOpaque(true);
        //jb47.setBorder(new LineBorder(Color.BLACK));
        
        //jb48.setContentAreaFilled(false);
        //jb48.setOpaque(true);
        //jb48.setBorder(new LineBorder(Color.BLACK));
        
        //jb49.setContentAreaFilled(false);
        //jb49.setOpaque(true);
        //jb49.setBorder(new LineBorder(Color.BLACK));
        
        //jb50.setContentAreaFilled(false);
        //jb50.setOpaque(true);
        //jb50.setBorder(new LineBorder(Color.BLACK));
        
        //jb51.setContentAreaFilled(false);
        //jb51.setOpaque(true);
        //jb51.setBorder(new LineBorder(Color.BLACK));
        
        // КНОПКИ НИЖНЕГО МЕНЮ
        
        JButton jb13 = jButton13;
        //JButton jb14 = jButton14;
        //JButton jb16 = jButton16;
        JButton jb52 = jButton52;
        JButton jb53 = jButton53;
        JButton jb54 = jButton54;
        //JButton jb55 = jButton55;
        JButton jb58 = jButton58;
        JButton jb59 = jButton59;
        JButton jb62 = jButton62;
        
        jb13.setContentAreaFilled(false);
        jb13.setOpaque(true);
        jb13.setBorder(new LineBorder(Color.BLACK));
        
        //jb14.setContentAreaFilled(false);
        //jb14.setOpaque(true);
        //jb14.setBorder(new LineBorder(Color.BLACK));
        
        //jb16.setContentAreaFilled(false);
        //jb16.setOpaque(true);
        //jb16.setBorder(new LineBorder(Color.BLACK));
        
        jb52.setContentAreaFilled(false);
        jb52.setOpaque(true);
        jb52.setBorder(new LineBorder(Color.BLACK));
        
        jb53.setContentAreaFilled(false);
        jb53.setOpaque(true);
        jb53.setBorder(new LineBorder(Color.BLACK));
        
        //jb54.setContentAreaFilled(false);
        //jb54.setOpaque(true);
        //jb54.setBorder(new LineBorder(Color.BLACK));
        
        //jb55.setContentAreaFilled(false);
        //jb55.setOpaque(true);
        //jb55.setBorder(new LineBorder(Color.BLACK));
        
        jb58.setContentAreaFilled(false);
        jb58.setOpaque(true);
        jb58.setBorder(new LineBorder(Color.BLACK));
        
        jb59.setContentAreaFilled(false);
        jb59.setOpaque(true);
        jb59.setBorder(new LineBorder(Color.BLACK));
        
        jb62.setContentAreaFilled(false);
        jb62.setOpaque(true);
        jb62.setBorder(new LineBorder(Color.BLACK));
        
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
        jButton60.setAlignmentY(0.0F);
        jButton60.setIconTextGap(0);

        jButton11.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_help.png"))); // NOI18N
        jButton11.setAlignmentY(0.0F);
        jButton11.setIconTextGap(0);

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
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE)
                            .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(192, 192, 192));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Compl");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Normal");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Polarity");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Level Format");

        jComboBox1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NECL", "5-V PECL", "3.3-V PECL", "2.5-V PECL", "1.8-V PECL", "5-TTL", "3.3-V TTL", "2.5-V TTL", "LVDS", "CML", "3.3-V CML", "2.5-V CML", "1.8-V CML", "1.2-V CML", "5-V CMOS", "3.3-V CMOS", "2.5-V CMOS", "1.8-V CMOS", "1.5-V CMOS", "1.2-V CMOS", "0.8-V CMOS" }));
        jComboBox1.setToolTipText("");

        jToggleButton4.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/off_button.png"))); // NOI18N
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

        jToggleButton24.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/complement_off.png"))); // NOI18N
        jToggleButton24.setAlignmentY(0.0F);
        jToggleButton24.setBorder(null);
        jToggleButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton24ActionPerformed(evt);
            }
        });

        jToggleButton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/normal_on.png"))); // NOI18N
        jToggleButton6.setAlignmentY(0.0F);
        jToggleButton6.setBorder(null);
        jToggleButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });

        jToggleButton25.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/offset_off.png"))); // NOI18N
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
        jToggleButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/high-low_on.png"))); // NOI18N
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
        jToggleButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/std_off.png"))); // NOI18N
        jToggleButton26.setAlignmentY(0.0F);
        jToggleButton26.setBorder(null);
        jToggleButton26.setIconTextGap(0);
        jToggleButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton26ActionPerformed(evt);
            }
        });

        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_down.png"))); // NOI18N
        jButton22.setAlignmentY(0.0F);
        jButton22.setBorder(null);
        jButton22.setIconTextGap(0);
        jButton22.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_up.png"))); // NOI18N
        jButton23.setAlignmentY(0.0F);
        jButton23.setBorder(null);
        jButton23.setIconTextGap(0);
        jButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton24.setAlignmentY(0.0F);
        jButton24.setBorder(null);
        jButton24.setIconTextGap(0);
        jButton24.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_down.png"))); // NOI18N
        jButton25.setAlignmentY(0.0F);
        jButton25.setBorder(null);
        jButton25.setIconTextGap(0);
        jButton25.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_up.png"))); // NOI18N
        jButton26.setAlignmentY(0.0F);
        jButton26.setBorder(null);
        jButton26.setIconTextGap(0);
        jButton26.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);

        jTextField1.setBackground(new java.awt.Color(0, 0, 0));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("-3 V");
        jTextField1.setAlignmentX(0.0F);
        jTextField1.setAlignmentY(0.0F);
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel24.setAlignmentY(0.0F);

        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setText("3 V");
        jTextField2.setAlignmentX(0.0F);
        jTextField2.setAlignmentY(0.0F);
        jTextField2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_down.png"))); // NOI18N
        jButton56.setAlignmentY(0.0F);
        jButton56.setBorder(null);
        jButton56.setIconTextGap(0);
        jButton56.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_up.png"))); // NOI18N
        jButton63.setAlignmentY(0.0F);
        jButton63.setBorder(null);
        jButton63.setIconTextGap(0);
        jButton63.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton64.setAlignmentY(0.0F);
        jButton64.setBorder(null);
        jButton64.setIconTextGap(0);
        jButton64.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_down.png"))); // NOI18N
        jButton65.setAlignmentY(0.0F);
        jButton65.setBorder(null);
        jButton65.setIconTextGap(0);
        jButton65.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_up.png"))); // NOI18N
        jButton66.setAlignmentY(0.0F);
        jButton66.setBorder(null);
        jButton66.setIconTextGap(0);
        jButton66.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton66ActionPerformed(evt);
            }
        });

        jButton67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_up.png"))); // NOI18N
        jButton67.setAlignmentY(0.0F);
        jButton67.setBorder(null);
        jButton67.setIconTextGap(0);
        jButton67.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_down.png"))); // NOI18N
        jButton68.setAlignmentY(0.0F);
        jButton68.setBorder(null);
        jButton68.setIconTextGap(0);
        jButton68.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton69.setAlignmentY(0.0F);
        jButton69.setBorder(null);
        jButton69.setIconTextGap(0);
        jButton69.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_up.png"))); // NOI18N
        jButton70.setAlignmentY(0.0F);
        jButton70.setBorder(null);
        jButton70.setIconTextGap(0);
        jButton70.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_down.png"))); // NOI18N
        jButton71.setAlignmentY(0.0F);
        jButton71.setBorder(null);
        jButton71.setIconTextGap(0);
        jButton71.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel26.setAlignmentY(0.0F);

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setText("-3 V");
        jTextField3.setAlignmentX(0.0F);
        jTextField3.setAlignmentY(0.0F);
        jTextField3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField3.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_down.png"))); // NOI18N
        jButton72.setAlignmentY(0.0F);
        jButton72.setBorder(null);
        jButton72.setIconTextGap(0);
        jButton72.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_up.png"))); // NOI18N
        jButton73.setAlignmentY(0.0F);
        jButton73.setBorder(null);
        jButton73.setIconTextGap(0);
        jButton73.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_zero.png"))); // NOI18N
        jButton74.setAlignmentY(0.0F);
        jButton74.setBorder(null);
        jButton74.setIconTextGap(0);
        jButton74.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_down.png"))); // NOI18N
        jButton75.setAlignmentY(0.0F);
        jButton75.setBorder(null);
        jButton75.setIconTextGap(0);
        jButton75.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_up.png"))); // NOI18N
        jButton76.setAlignmentY(0.0F);
        jButton76.setBorder(null);
        jButton76.setIconTextGap(0);
        jButton76.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton76.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton76ActionPerformed(evt);
            }
        });

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel27.setAlignmentY(0.0F);

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setText("3 V");
        jTextField4.setAlignmentX(0.0F);
        jTextField4.setAlignmentY(0.0F);
        jTextField4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField4.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
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
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jToggleButton19)
                        .addGap(4, 4, 4)
                        .addComponent(jToggleButton20)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                .addComponent(jLabel5)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(3, 3, 3)
                .addComponent(jToggleButton11)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton25)
                .addGap(0, 0, 0)
                .addComponent(jToggleButton26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(111, 111, 111));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setBackground(new java.awt.Color(111, 111, 111));
        jButton7.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/ManualTrigGate.png"))); // NOI18N
        jButton7.setAlignmentY(0.0F);
        jButton7.setBorder(null);
        jButton7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton7.setIconTextGap(0);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton6.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/left.png"))); // NOI18N
        jButton6.setToolTipText("");
        jButton6.setAlignmentY(0.0F);
        jButton6.setBorder(null);
        jButton6.setIconTextGap(0);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton8.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/right.png"))); // NOI18N
        jButton8.setAlignmentY(0.0F);
        jButton8.setBorder(null);
        jButton8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jButton8.setIconTextGap(0);
        jButton8.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton57.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/help.png"))); // NOI18N
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton57)
                .addGap(65, 65, 65))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton57, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(47, 47, 47));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/screen/Screen.png"))); // NOI18N

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
        jButton61.setAlignmentY(0.0F);
        jButton61.setIconTextGap(0);

        jButton12.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_cancel.png"))); // NOI18N
        jButton12.setAlignmentY(0.0F);
        jButton12.setIconTextGap(0);
        jButton12.setMargin(new java.awt.Insets(0, 0, 0, 0));

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
                    .addComponent(jButton12, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 22, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(192, 192, 192));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(200, 650));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jLabel19.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel19.setText("Delay");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icon_line.png"))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel20.setText("Period");

        jLabel18.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel18.setText("Width");

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

        jToggleButton5.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/period_on.png"))); // NOI18N
        jToggleButton5.setAlignmentY(0.0F);
        jToggleButton5.setBorder(null);
        jToggleButton5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });

        jToggleButton23.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/frequency_off.png"))); // NOI18N
        jToggleButton23.setAlignmentY(0.0F);
        jToggleButton23.setBorder(null);
        jToggleButton23.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton23ActionPerformed(evt);
            }
        });

        jToggleButton9.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/delay_on.png"))); // NOI18N
        jToggleButton9.setAlignmentY(0.0F);
        jToggleButton9.setBorder(null);
        jToggleButton9.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton9ActionPerformed(evt);
            }
        });

        jToggleButton27.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/phase_off.png"))); // NOI18N
        jToggleButton27.setAlignmentY(0.0F);
        jToggleButton27.setBorder(null);
        jToggleButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton27ActionPerformed(evt);
            }
        });

        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_right.png"))); // NOI18N
        jButton28.setAlignmentY(0.0F);
        jButton28.setBorder(null);
        jButton28.setIconTextGap(0);
        jButton28.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setText("10 ns");
        jTextField5.setAlignmentX(0.0F);
        jTextField5.setAlignmentY(0.0F);
        jTextField5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField5.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_d.png"))); // NOI18N
        jButton29.setAlignmentY(0.0F);
        jButton29.setBorder(null);
        jButton29.setIconTextGap(0);
        jButton29.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_left.png"))); // NOI18N
        jButton27.setAlignmentY(0.0F);
        jButton27.setBorder(null);
        jButton27.setIconTextGap(0);
        jButton27.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_right.png"))); // NOI18N
        jButton31.setAlignmentY(0.0F);
        jButton31.setBorder(null);
        jButton31.setIconTextGap(0);
        jButton31.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel28.setAlignmentY(0.0F);

        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_left.png"))); // NOI18N
        jButton30.setAlignmentY(0.0F);
        jButton30.setBorder(null);
        jButton30.setIconTextGap(0);
        jButton30.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_left.png"))); // NOI18N
        jButton32.setAlignmentY(0.0F);
        jButton32.setBorder(null);
        jButton32.setIconTextGap(0);
        jButton32.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel29.setAlignmentY(0.0F);

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(255, 255, 255));
        jTextField6.setText("10 µs");
        jTextField6.setAlignmentX(0.0F);
        jTextField6.setAlignmentY(0.0F);
        jTextField6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_right.png"))); // NOI18N
        jButton33.setAlignmentY(0.0F);
        jButton33.setBorder(null);
        jButton33.setIconTextGap(0);
        jButton33.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_d.png"))); // NOI18N
        jButton34.setAlignmentY(0.0F);
        jButton34.setBorder(null);
        jButton34.setIconTextGap(0);
        jButton34.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_left.png"))); // NOI18N
        jButton35.setAlignmentY(0.0F);
        jButton35.setBorder(null);
        jButton35.setIconTextGap(0);
        jButton35.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_right.png"))); // NOI18N
        jButton36.setAlignmentY(0.0F);
        jButton36.setBorder(null);
        jButton36.setIconTextGap(0);
        jButton36.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_left.png"))); // NOI18N
        jButton37.setAlignmentY(0.0F);
        jButton37.setBorder(null);
        jButton37.setIconTextGap(0);
        jButton37.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/long_button.png"))); // NOI18N
        jLabel30.setAlignmentY(0.0F);

        jTextField7.setBackground(new java.awt.Color(0, 0, 0));
        jTextField7.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(255, 255, 255));
        jTextField7.setText("10 µs");
        jTextField7.setAlignmentX(0.0F);
        jTextField7.setAlignmentY(0.0F);
        jTextField7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        jTextField7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_small_right.png"))); // NOI18N
        jButton38.setAlignmentY(0.0F);
        jButton38.setBorder(null);
        jButton38.setIconTextGap(0);
        jButton38.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_mid_d.png"))); // NOI18N
        jButton39.setAlignmentY(0.0F);
        jButton39.setBorder(null);
        jButton39.setIconTextGap(0);
        jButton39.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_left.png"))); // NOI18N
        jButton40.setAlignmentY(0.0F);
        jButton40.setBorder(null);
        jButton40.setIconTextGap(0);
        jButton40.setMargin(new java.awt.Insets(0, 0, 0, 0));

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/silvernew/silver_icon_button_big_right.png"))); // NOI18N
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
        jToggleButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/width_on.png"))); // NOI18N
        jToggleButton10.setAlignmentY(0.0F);
        jToggleButton10.setBorder(null);
        jToggleButton10.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jToggleButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton10ActionPerformed(evt);
            }
        });

        jToggleButton28.setFont(new java.awt.Font("Arial", 1, 8)); // NOI18N
        jToggleButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fullbuttons/dcycle_off.png"))); // NOI18N
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
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(6, 6, 6))
        );

        jPanel8.setBackground(new java.awt.Color(192, 192, 192));
        jPanel8.setFocusTraversalPolicyProvider(true);
        jPanel8.setPreferredSize(new java.awt.Dimension(600, 80));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Mouse_Left.png"))); // NOI18N

        jButton14.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Mode_Off.png"))); // NOI18N
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
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/down/icon_display.png"))); // NOI18N
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
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Trigger_Off.png"))); // NOI18N
        jButton16.setBorder(null);
        jButton16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton16.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton54.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Timing_Off.png"))); // NOI18N
        jButton54.setBorder(null);
        jButton54.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton54.setPreferredSize(new java.awt.Dimension(80, 18));
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });

        jButton55.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Levels_Off.png"))); // NOI18N
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

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/downnew/Down_Mouse_Right.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(310, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                    .addComponent(jButton62, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, 0)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel23)
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
                    .addContainerGap()))
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
                        .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
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
            jButton14.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Mode_Off.png"));
            
            //jButton14.setBackground(GRAY_FOR_BUTTONS);
            //jButton14.setForeground(Color.BLACK);
        }
        else if( ch8 == true )
        {
            ch8 = false;
            jButton14.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Mode_On.png"));
            
            //jButton14.setBackground(BLUE_FOR_BUTTONS);
            //jButton14.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch4 == false )
        {
            ch4 = true;
            jButton58.setBackground(GRAY_FOR_BUTTONS);
            jButton58.setForeground(Color.BLACK);
        }
        else if( ch4 == true )
        {
            ch4 = false;
            jButton58.setBackground(BLUE_FOR_BUTTONS);
            jButton58.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch1 == false )
        {
            ch1 = true;
            jButton13.setBackground(GRAY_FOR_BUTTONS);
            jButton13.setForeground(Color.BLACK);
        }
        else if( ch1 == true )
        {
            ch1 = false;
            jButton13.setBackground(BLUE_FOR_BUTTONS);
            jButton13.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);
        
        

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
        if( ch3 == false )
        {
            ch3 = true;
            jButton52.setBackground(GRAY_FOR_BUTTONS);
            jButton52.setForeground(Color.BLACK);
        }
        else if( ch3 == true )
        {
            ch3 = false;
            jButton52.setBackground(BLUE_FOR_BUTTONS);
            jButton52.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch5 == false )
        {
            ch5 = true;
            jButton59.setBackground(GRAY_FOR_BUTTONS);
            jButton59.setForeground(Color.BLACK);
        }
        else if( ch5 == true )
        {
            ch5 = false;
            jButton59.setBackground(BLUE_FOR_BUTTONS);
            jButton59.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch2 == false )
        {
            ch2 = true;
            jButton16.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Trigger_Off.png"));
            
            //jButton16.setBackground(GRAY_FOR_BUTTONS);
            //jButton16.setForeground(Color.BLACK);
        }
        else if( ch2 == true )
        {
            ch2 = false;
            jButton16.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Trigger_On.png"));
            
            //jButton16.setBackground(BLUE_FOR_BUTTONS);
            //jButton16.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch9 == false )
        {
            ch9 = true;
            jButton54.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Timing_Off.png"));
            
            //jButton54.setBackground(GRAY_FOR_BUTTONS);
            //jButton54.setForeground(Color.BLACK);
        }
        else if( ch9 == true )
        {
            ch9 = false;
            jButton54.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Timing_On.png"));
            
            //jButton54.setBackground(BLUE_FOR_BUTTONS);
            //jButton54.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch10 == false )
        {
            ch10 = true;
            jButton55.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Levels_Off.png"));
            
            jButton55.setBackground(GRAY_FOR_BUTTONS);
            jButton55.setForeground(Color.BLACK);
        }
        else if( ch10 == true )
        {
            ch10 = false;
            jButton55.setIcon(new ImageIcon(currentDir + "\\src\\downnew\\Down_Levels_On.png"));
            
            jButton55.setBackground(BLUE_FOR_BUTTONS);
            jButton55.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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
        if( ch6 == false )
        {
            ch6 = true;
            jButton62.setBackground(GRAY_FOR_BUTTONS);
            jButton62.setForeground(Color.BLACK);
        }
        else if( ch6 == true )
        {
            ch6 = false;
            jButton62.setBackground(BLUE_FOR_BUTTONS);
            jButton62.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        jButton53.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        jButton53.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);

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
        if( ch7 == false )
        {
            ch7 = true;
            jButton53.setBackground(GRAY_FOR_BUTTONS);
            jButton53.setForeground(Color.BLACK);
        }
        else if( ch7 == true )
        {
            ch7 = false;
            jButton53.setBackground(BLUE_FOR_BUTTONS);
            jButton53.setForeground(Color.WHITE);
        }

        // Остальные кнопки сделать серыми
        jButton13.setBackground(GRAY_FOR_BUTTONS);
        //jButton14.setBackground(GRAY_FOR_BUTTONS);
        //jButton16.setBackground(GRAY_FOR_BUTTONS);
        jButton52.setBackground(GRAY_FOR_BUTTONS);
        //jButton54.setBackground(GRAY_FOR_BUTTONS);
        //jButton55.setBackground(GRAY_FOR_BUTTONS);
        jButton58.setBackground(GRAY_FOR_BUTTONS);
        jButton59.setBackground(GRAY_FOR_BUTTONS);
        jButton62.setBackground(GRAY_FOR_BUTTONS);
        
        // Текст остальных кнопок сделать черным
        jButton13.setForeground(Color.BLACK);
        //jButton14.setForeground(Color.BLACK);
        //jButton16.setForeground(Color.BLACK);
        jButton52.setForeground(Color.BLACK);
        //jButton54.setForeground(Color.BLACK);
        //jButton55.setForeground(Color.BLACK);
        jButton58.setForeground(Color.BLACK);
        jButton59.setForeground(Color.BLACK);
        jButton62.setForeground(Color.BLACK);

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

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        // Меняем иконку
        if( peri_ch == true )
        {
        }
        else if( peri_ch == false )
        {
            jLabel20.setText("Period");
            peri_ch = true;
            freq_ch = false;
            jToggleButton5.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\period_on.png"));
            jToggleButton23.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\frequency_off.png"));
        }
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton23ActionPerformed
        // Меняем иконку
        if( freq_ch == true )
        {
        }
        else if( freq_ch == false )
        {
            jLabel20.setText("Frequency");
            freq_ch = true;
            peri_ch = false;
            jToggleButton23.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\frequency_on.png"));
            jToggleButton5.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\period_off.png"));
        }
    }//GEN-LAST:event_jToggleButton23ActionPerformed

    private void jToggleButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton24ActionPerformed
        // Меняем иконку
        if( comp_ch == true )
        {
        }
        else if( comp_ch == false )
        {
            comp_ch = true;
            nrml_ch = false;
            jToggleButton24.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\complement_on.png"));
            jToggleButton6.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\normal_off.png"));
        }
    }//GEN-LAST:event_jToggleButton24ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        // Меняем иконку
        if( nrml_ch == true )
        {
        }
        else if( nrml_ch == false )
        {
            nrml_ch = true;
            comp_ch = false;
            jToggleButton6.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\normal_on.png"));
            jToggleButton24.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\complement_off.png"));
        }
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton25ActionPerformed
        // Меняем иконку
        if( ofst_ch == true )
        {
        }
        else if( ofst_ch == false )
        {
            ofst_ch = true;
            hilo_ch = false;
            stnd_ch = false;
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\offset_on.png"));
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\high-low_off.png"));
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\std_off.png"));
        }
    }//GEN-LAST:event_jToggleButton25ActionPerformed

    private void jToggleButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton11ActionPerformed
        // Меняем иконку
        if( hilo_ch == true )
        {
        }
        else if( hilo_ch == false )
        {
            hilo_ch = true;
            ofst_ch = false;
            stnd_ch = false;
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\high-low_on.png"));
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\offset_off.png"));
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\std_off.png"));
        }
    }//GEN-LAST:event_jToggleButton11ActionPerformed

    private void jToggleButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton26ActionPerformed
        // Меняем иконку
        if( stnd_ch == true )
        {
        }
        else if( stnd_ch == false )
        {
            stnd_ch = true;
            hilo_ch = false;
            ofst_ch = false;
            jToggleButton26.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\std_on.png"));
            jToggleButton11.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\high-low_off.png"));
            jToggleButton25.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\offset_off.png"));
        }
    }//GEN-LAST:event_jToggleButton26ActionPerformed

    private void jToggleButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton9ActionPerformed
        // Меняем иконку
        if( delay_ch == true )
        {
        }
        else if( delay_ch == false )
        {
            jLabel19.setText("Delay");
            delay_ch = true;
            phase_ch = false;
            jToggleButton9.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\delay_on.png"));
            jToggleButton27.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\phase_off.png"));
        }
    }//GEN-LAST:event_jToggleButton9ActionPerformed

    private void jToggleButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton27ActionPerformed
        // Меняем иконку
        if( phase_ch == true )
        {
        }
        else if( phase_ch == false )
        {
            jLabel19.setText("Phase");
            phase_ch = true;
            delay_ch = false;
            jToggleButton9.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\delay_off.png"));
            jToggleButton27.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\phase_on.png"));
        }
    }//GEN-LAST:event_jToggleButton27ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton66ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButton76ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton76ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton76ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jToggleButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton10ActionPerformed
        // Меняем иконку
        if( width_ch == true )
        {
        }
        else if( width_ch == false )
        {
            jLabel18.setText("Width");
            width_ch = true;
            dcycle_ch = false;
            jToggleButton10.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\width_on.png"));
            jToggleButton28.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\dcycle_off.png"));
        }
    }//GEN-LAST:event_jToggleButton10ActionPerformed

    private void jToggleButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton28ActionPerformed
        // Меняем иконку
        if( dcycle_ch == true )
        {
        }
        else if( dcycle_ch == false )
        {
            jLabel18.setText("Duty Cycle");
            dcycle_ch = true;
            width_ch = false;
            jToggleButton10.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\width_off.png"));
            jToggleButton28.setIcon(new ImageIcon(currentDir + "\\src\\fullbuttons\\dcycle_on.png"));
        }
    }//GEN-LAST:event_jToggleButton28ActionPerformed

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
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JToggleButton jToggleButton10;
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
    private javax.swing.JToggleButton jToggleButton27;
    private javax.swing.JToggleButton jToggleButton28;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    private javax.swing.JToggleButton jToggleButton9;
    // End of variables declaration//GEN-END:variables
}