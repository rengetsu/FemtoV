/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package transitions;    //  transitions - пакет где выполняются все перемещения элементов интерфейса програм
import femtov.Interface;
import java.awt.AWTEvent;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Tabs отвечает за открытие и закрытие вкладок (tabs). Вкладки это основные панели нижнего меню (down menu panels).
public class Tabs {
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ ПОЛЯ
    
    //  Чекеры для проверки нажатия левой и правой кнопки мыши
    boolean left_click = false;
    boolean right_click = false;
    
    //  Глобальные перменные которые можно использовать для записи текста
    public static String str_mouse_click;
    public static String str_mouse_left_right;
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ МЕТОДЫ

    //  clickMouse() - Функция обработки нажатия мыши при помощи интерфейса слушателя
    /**
     *
     * @return Возвращяем переменную в которую мы сохраним события действия интерфейса слушателя
     */
    public long clickMouse()
    {
        //  Переменная eventMask для сохранения значения событий мышки
        long eventMask;
        
        //  AWTEvent - Интерфейс слушателя для того, чтобы получить события действия
        //  Присваиваем переменной eventMask через интерфейс слушателя события действия мышки
        eventMask = AWTEvent.MOUSE_MOTION_EVENT_MASK + AWTEvent.MOUSE_EVENT_MASK;
        
        //  Получаем действия мышки в реальном времени
        Toolkit.getDefaultToolkit().addAWTEventListener(new AWTEventListener() {
            
            public void eventDispatched(AWTEvent e) {
                //  Следущая команда нужна для режима тестирования/отладки
                //  Она выводит в консоль все данные слушателя событий (если удалить комментарий)
                //System.out.println(e.paramString()+"-"+e.getSource());
                
                //  Присваиваем значение переменным при нажатии на кнопки мыши
                str_mouse_click         =   e.paramString().substring(0, 13);
                str_mouse_left_right    =   e.paramString().substring(46, 48);
                
                //  Если произошло нажатие мыши
                if( "MOUSE_CLICKED".equals(str_mouse_click) )
                {
                    //  Выводим в консоль какая была нажата
                    //System.out.println("MOUSE CLICKED");
                }
                
                //  Если нажата левая кнопка мыши
                if      ( "=1".equals(str_mouse_left_right) )
                {
                    left_click = true;
                    right_click = true;
                    //System.out.println("LEFT MOUSE");
                }
                //  Если нажата правая кнопка мыши
                else if ( "=3".equals(str_mouse_left_right) )
                {
                    right_click = true;
                    left_click = false;
                    //System.out.println("RIGHT MOUSE");
                }
                
                //  Обнуляем значение глобальных переменных для последующего вызова функции
                str_mouse_click         =   "";
                str_mouse_left_right    =   "";
            }
        }, eventMask);
        return eventMask;
    }
    
    //  closeTab    -   Close tab function
    /**
     *
     * @param tabName       The name of the tab we want to close 
     * @param left_right    Where it was opened, on the left tab or on the right tab
     */
    public void closeTab(String tabName, String left_right)
    {
        clickMouse();
        //  Вкладка "Levels"
        if          (   "Levels".equals(tabName)    )
        {
            //  Делаем невидимой вкладку "Levels" слева
            if      (   "left".equals(left_right)   )
            {
                Interface.panel_Tab_Levels.setVisible(false);
                Interface.panel_TopTab_Levels.setVisible(false);
            }
            //  Делаем невидимой вкладку "Levels" справа
            else if (   "right".equals(left_right)  )
            {
                Interface.panel_Tab_Levels.setVisible(false);
                Interface.panel_TopTab_Levels.setVisible(false);
            }
        }
        //  Вкладка "Timing"
        else if     (   "Timing".equals(tabName)    )
        {
            //  Делаем невидимой вкладку "Timing" слева
            if      (   "left".equals(left_right)   )
            {
                Interface.panel_TopTab_Timing.setVisible(false);
                Interface.panel_Tab_Timing.setVisible(false);
            }
            //  Делаем невидимой вкладку "Timing" справа
            else if (   "right".equals(left_right)  )
            {
                Interface.panel_TopTab_Timing.setVisible(false);
                Interface.panel_Tab_Timing.setVisible(false);
            }
        }
    }
    
    //  openTab     -   Open tab function
    /**
     *
     * @param tabName       The name of the tab we want to open
     * @param left_right    Where this tab should be open, on the left or on the right
     */
    public void openTab(String tabName, String left_right)
    {
        clickMouse();
        //  Вкладка "Levels"
        if          (   "Levels".equals(tabName)    )
        {
            //  Делаем видимой вкладку "Levels" слева
            if      (   "left".equals(left_right)   )
            {
                Interface.panel_Tab_Levels.setVisible(true);
                Interface.panel_TopTab_Levels.setVisible(true);
            }
            //  Делаем видимой вкладку "Levels" справа
            else if (   "right".equals(left_right)  )
            {
                
                Interface.panel_Tab_Levels.setVisible(true);
                Interface.panel_TopTab_Levels.setVisible(true);
            }
        }
        //  Вкладка "Timing"
        else if     (   "Timing".equals(tabName)    )
        {
            //  Делаем видимой вкладку "Timing" слева
            if      (   "left".equals(left_right)   )
            {
                Interface.panel_TopTab_Timing.setVisible(true);
                Interface.panel_Tab_Timing.setVisible(true);
            }
            //  Делаем видимой вкладку "Timing" справа
            else if (   "right".equals(left_right)  )
            {
                Interface.panel_TopTab_Timing.setVisible(true);
                Interface.panel_Tab_Timing.setVisible(true);
            }
        }
    }
}