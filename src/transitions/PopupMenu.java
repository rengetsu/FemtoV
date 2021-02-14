/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package transitions;    //  transitions - пакет где выполняются все перемещения элементов интерфейса програм
import femtov.Calculator_Widget;
import femtov.Interface;
import java.awt.Font;
import javax.swing.JMenuItem;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс PopupMenu отвечает за появление и использование выпадающего поп-ап меню и его пунктов.
public class PopupMenu {
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ ПОЛЯ
    
    //  Чекер для проверки добавления пунктов в попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
    public boolean popupmenu1_ch = false;
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ МЕТОДЫ
    
    //  Функция для отображения попап-меню для регулировок с Калькулятором и Минимумом, Среднего значения и Максимумом
    //  adjNmbr - номер регулировки где должен быть отображен элемент
    public void showAdjPopupMenu(int adjNmbr)
    {
        if( popupmenu1_ch == false )
        {
            //  Меняем значение чекера чтобы не функция добавляла элементы по второму разу
            popupmenu1_ch = true;
            
            //  Show jPopup Menu  
            JMenuItem calc = new JMenuItem("Calculator");           //  Создаем пункт меню Калькулятор (Calc)
            JMenuItem max = new JMenuItem("Max");                   //  Создаем пункт меню Максимум (Max)
            JMenuItem mid = new JMenuItem("Mid");                   //  Создаем пункт меню Среднего значения (Mid)
            JMenuItem min = new JMenuItem("Min");                   //  Создаем пункт меню Минимума (Min)
            
            //  Установка шрифтов, стилей и размеров для пунктов меню
            calc.setFont(   new Font("Arial", Font.BOLD, 12));      //  Установка шрифта, стиля и размеров для пункта меню Калькулятора (Calc)
            max.setFont(    new Font("Arial", Font.PLAIN, 12));     //  Установка шрифта, стиля и размеров для пункта меню Максимум (Max)
            mid.setFont(    new Font("Arial", Font.PLAIN, 12));     //  Установка шрифта, стиля и размеров для пункта меню Среднего значения (Mid)
            min.setFont(    new Font("Arial", Font.PLAIN, 12));     //  Установка шрифта, стиля и размеров для пункта меню Минимума (Min)

            //  Добавляем пункты меню
            Interface.jPopupMenu1.add(calc);                        //  Добавляем пункт Калькулятора (Calc)
            Interface.jPopupMenu1.addSeparator();                   //  Добавляем Разделитель
            Interface.jPopupMenu1.add(max);                         //  Добавляем пункт Максимум (Max)
            Interface.jPopupMenu1.add(mid);                         //  Добавляем пункт Среднего значения (Mid)
            Interface.jPopupMenu1.add(min);                         //  Добавляем пункт Минимума (Min)
            
            //  Пока временно калькулятор отображается так
            Calculator_Widget CW = new Calculator_Widget();
            CW.setVisible(true);
        }
        
        //  Выбор места для отображения попап-меню
        switch (adjNmbr) {
        //  Если выбран компонент jTextField1
            case 1:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Levels , Interface.tabLevels_LowLimitTextField.getX(), Interface.tabLevels_LowLimitTextField.getY());
                break;
        //  Если выбран компонент JTextField2
            case 2:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Levels, Interface.tabLevels_HighLimitTextField.getX(), Interface.tabLevels_HighLimitTextField.getY());
                break;
        //  Если выбран компонент JTextField3
            case 3:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Levels, Interface.tabLevels_LowLevelTextField.getX(), Interface.tabLevels_LowLevelTextField.getY());
                break;
        //  Если выбран компонент JTextField4
            case 4:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Levels, Interface.tabLevels_HighLevelTextField.getX(), Interface.tabLevels_HighLevelTextField.getY());
                break;
        //  Если выбран компонент JTextField5
            case 5:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Timing, Interface.tabTiming_WidthTextField.getX(), Interface.tabTiming_WidthTextField.getY());
                break;
        //  Если выбран компонент JTextField6
            case 6:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Timing, Interface.tabTiming_DelayTextField.getX(), Interface.tabTiming_DelayTextField.getY());
                break;
        //  Если выбран компонент JTextField7
            case 7:
                Interface.jPopupMenu1.show(Interface.panel_Tab_Timing, Interface.tabTiming_PeriodTextField.getX(), Interface.tabTiming_PeriodTextField.getY());
                break;
            default:
                break;
        }
    }
}