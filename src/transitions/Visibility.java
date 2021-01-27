/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package transitions;    //  transitions - пакет где выполняются все перемещения элементов интерфейса програм
import femtov.Interface;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Visibility отвечает за видимсость (set visible) и скрытие элементов графического интерфейса (GUI).
public class Visibility {
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ МЕТОДЫ
    
    /**
     * timing_ChannelsVisibility - показывает или скрывает все элементы Timing
     * @param visibility - может быть либо true/false в зависимости от того показываем или скрываем
     */
    static public void timing_СhannelsVisibility(boolean visibility)
    {
        Interface.jLabel18.setVisible(visibility);
        Interface.jLabel19.setVisible(visibility);
        Interface.jLabel28.setVisible(visibility);
        Interface.jLabel29.setVisible(visibility);
        Interface.jButton27.setVisible(visibility);
        Interface.jButton28.setVisible(visibility);
        Interface.jButton29.setVisible(visibility);
        Interface.jButton30.setVisible(visibility);
        Interface.jButton31.setVisible(visibility);
        Interface.jButton32.setVisible(visibility);
        Interface.jButton33.setVisible(visibility);
        Interface.jButton34.setVisible(visibility);
        Interface.jButton35.setVisible(visibility);
        Interface.jButton36.setVisible(visibility);
        Interface.jTextField5.setVisible(visibility);
        Interface.jTextField6.setVisible(visibility);
        Interface.jToggleButton9.setVisible(visibility);
        Interface.jToggleButton10.setVisible(visibility);
        Interface.jToggleButton27.setVisible(visibility);
        Interface.jToggleButton28.setVisible(visibility);
    }
}