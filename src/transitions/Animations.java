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
        Interface.jButton11.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));

        //  Анимация нажатия - Кнопка закрытия
        Interface.jButton60.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВЕРХНЕГО ПРАВОГО МЕНЮ
    public static void topRightButtonsAnimations(){
        //  Анимация нажатия - Кнопка закрытия
        Interface.jButton12.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\cancel_button_cl.png"));

        //  Анимация нажатия - Кнопка помощи
        Interface.jButton61.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\help_button_cl.png"));
    }
        
    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВЕРХНЕГО СРЕДНЕГО МЕНЮ
    public static void topMiddleButtonsAnimations(){
        //  Анимация нажатия - Кнопка Перехода Назад
        Interface.jButton6.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_left_cl.png"));
            
        //  Анимация нажатия - Кнопка Mannual Trig/Gate
        Interface.jButton7.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\ManualTrigGate_cl.png"));

        //  Анимация нажатия - Кнопка Перехода Вперед
        Interface.jButton8.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\back_right_cl.png"));

        //  Анимация нажатия - Кнопка Помощи
        Interface.jButton57.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\HelpButton_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВКЛАДКИ LEVELS
    public static void levelsTabAnimations(){
        //  Анимация нажатия кнопок - Маленького шага вниз
        Interface.jButton22.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.jButton56.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.jButton71.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));
        Interface.jButton72.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_down_cl.png"));

        //  Анимация нажатия кнопок - Маленького шага вверх
        Interface.jButton23.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.jButton63.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.jButton70.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));
        Interface.jButton73.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_up_cl.png"));

        //  Анимация нажатия кнопок - Ноль
        Interface.jButton24.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.jButton64.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.jButton69.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));
        Interface.jButton74.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_zero_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вниз
        Interface.jButton25.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.jButton65.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.jButton68.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));
        Interface.jButton75.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_down_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вверх
        Interface.jButton26.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.jButton66.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.jButton67.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
        Interface.jButton76.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_up_cl.png"));
    }

    //  ФУНКЦИЯ АНИМАЦИЙ КНОПОК ВКЛАДКИ TIMING
    public static void timingTabAnimations(){
        //  Анимация нажатия кнопок - Маленького шага влево
        Interface.jButton27.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        Interface.jButton32.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));
        Interface.jButton37.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_left_cl.png"));

        //  Анимация нажатия кнопок - Маленького шага вправо
        Interface.jButton28.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        Interface.jButton33.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));
        Interface.jButton38.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_small_right_cl.png"));

        //  Анимация нажатия кнопок - Дельта
        Interface.jButton29.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        Interface.jButton34.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));
        Interface.jButton39.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_mid_d_cl.png"));

        //  Анимация нажатия кнопок - Большого шага влево
        Interface.jButton30.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        Interface.jButton35.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));
        Interface.jButton40.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_left_cl.png"));

        //  Анимация нажатия кнопок - Большого шага вправо
        Interface.jButton31.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        Interface.jButton36.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
        Interface.jButton41.setPressedIcon(new ImageIcon(currentDir + "\\src\\images\\silver_icon_button_big_right_cl.png"));
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