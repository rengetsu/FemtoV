/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package transitions;    //  transitions - пакет где выполняются все перемещения элементов интерфейса прогр
import femtov.Interface;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.ImageIcon;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Amimations отвечает за все анимации в программе
public class Animations {
    //  Переменная для сохранения определения пути к директории с проектом
    public static Path currentDir = Paths.get(".");

    //  ФУНКЦИИ АНИМАЦИЙ ПРИ НАЖАТИИ НА КНОПКИ
    
    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВЕРХНЕГО ЛЕВОГО МЕНЮ
    public static void topLeftButtonsAnimations(){
        //  Анимация нажатия - Кнопка помощи
        Interface.topTab_Levels_HelpButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));

        //  Анимация нажатия - Кнопка закрытия
        Interface.topTab_Levels_CancelButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВЕРХНЕГО ПРАВОГО МЕНЮ
    public static void topRightButtonsAnimations(){
        //  Анимация нажатия - Кнопка закрытия
        Interface.topTab_Timing_CancelButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));

        //  Анимация нажатия - Кнопка помощи
        Interface.topTab_Timing_HelpButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));
    }
        
    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВЕРХНЕГО СРЕДНЕГО МЕНЮ
    public static void topMiddleButtonsAnimations(){
        //  Анимация нажатия - Кнопка Перехода Назад
        Interface.topMenu_BackLeftButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_left_cl.png"));
            
        //  Анимация нажатия - Кнопка Mannual Trig/Gate
        Interface.topMenu_ManualTrigGateButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\ManualTrigGate_cl.png"));

        //  Анимация нажатия - Кнопка Перехода Вперед
        Interface.topMenu_BackRightButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_right_cl.png"));

        //  Анимация нажатия - Кнопка Помощи
        Interface.topMenu_HelpButton.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\HelpButton_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВКЛАДКИ LEVELS
    public static void levelsTabAnimations(){
        //  Анимация нажатия кнопок - Маленького шага вниз
        Interface.tabLevels_smallDownButton_LowLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.tabLevels_smallDownButton_HighLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.tabLevels_smallDownButton_LowLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.tabLevels_smallDownButton_HighLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));

        //  Анимация нажатия кнопок - Маленького шага вверх
        Interface.tabLevels_smallUpButton_LowLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.tabLevels_smallUpButton_HighLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.tabLevels_smallUpButton_LowLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.tabLevels_smallUpButton_HighLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));

        //  Анимация нажатия кнопок - Ноль
        Interface.tabLevels_zeroButton_LowLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.tabLevels_zeroButton_HighLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.tabLevels_zeroButton_LowLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.tabLevels_zeroButton_HighLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вниз
        Interface.tabLevels_bigDownButton_LowLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.tabLevels_bigDownButton_HighLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.tabLevels_bigDownButton_LowLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.tabLevels_bigDownButton_HighLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вверх
        Interface.tabLevels_bigUpButton_LowLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.tabLevels_bigUpButton_HighLimit.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.tabLevels_bigUpButton_LowLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.tabLevels_bigUpButton_HighLevel.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВКЛАДКИ TIMING
    public static void timingTabAnimations(){
        //  Анимация нажатия кнопок - Маленького шага влево
        Interface.tabTiming_smallLeftButton_WidthDCycle.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        Interface.tabTiming_smallLeftButton_DelayPhase.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        Interface.tabTiming_smallLeftButton_PeriodFreq.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));

        //  Анимация нажатия кнопок - Маленького шага вправо
        Interface.tabTiming_smallRightButton_WidthDCycle.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        Interface.tabTiming_smallRightButton_DelayPhase.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        Interface.tabTiming_smallRightButton_PeriodFreq.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));

        //  Анимация нажатия кнопок - Дельта
        Interface.tabTiming_delayButton_WidthDCycle.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        Interface.tabTiming_delayButton_DelayPhase.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        Interface.tabTiming_delayButton_PeriodFreq.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));

        //  Анимация нажатия кнопок - Большого шага влево
        Interface.tabTiming_bigLeftButton_WidthDCycle.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        Interface.tabTiming_bigLeftButton_DelayPhase.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        Interface.tabTiming_bigLeftButton_PeriodFreq.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вправо
        Interface.tabTiming_bigRightButton_WidthDCycle.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        Interface.tabTiming_bigRightButton_DelayPhase.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        Interface.tabTiming_bigRightButton_PeriodFreq.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
    }

    //  ГЛАВНАЯ ФУНКЦИЯ ЗАПУСКА ВСЕХ АНИМАЦИЙ В ПРОГРАММЕ
    public static void startAnimations()
    {
        topLeftButtonsAnimations();         //  Запускаем анимацию кнопок верхнего левого меню
        topRightButtonsAnimations();        //  Запускаем анимацию кнопок верхнего правого меню
        topMiddleButtonsAnimations();       //  Запускаем анимацию кнопок среднего меню
        levelsTabAnimations();              //  Запускаем анимацию вкладки Levels
        timingTabAnimations();              //  Запускаем анимацию вкладки Timing
    }
}