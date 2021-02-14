/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package actions;    //  actions - пакет где выполняются все действия программы
import femtov.Interface;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Editability отвечает за все действия программы связанные с изменением редактируемости (Editable)
public class Editability {
    
    //  Функция для блокировки возможности редактирования текстовых полей

    /**
     * notEditableTextFields - Функция для блокировки возможности редактирования текстовых полей
     * @param editability - может быть либо true/false в зависимости от того разрешаем/запрещаем
     */
    public void notEditableTextFields(boolean editability)
    {
        //  Делаем невозможным редактирование текстовых полей
        Interface.tabLevels_LowLimitTextField.setEditable(editability);
        Interface.tabLevels_HighLimitTextField.setEditable(editability);
        Interface.tabLevels_LowLevelTextField.setEditable(editability);
        Interface.tabLevels_HighLevelTextField.setEditable(editability);
        Interface.tabTiming_PeriodTextField.setEditable(editability);
        Interface.tabTiming_DelayTextField.setEditable(editability);
        Interface.tabTiming_WidthTextField.setEditable(editability);
    }
}