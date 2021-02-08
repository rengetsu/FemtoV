/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package actions;    //  actions - пакет где выполняются все действия прогр
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
        Interface.jTextField1.setEditable(editability);
        Interface.jTextField2.setEditable(editability);
        Interface.jTextField3.setEditable(editability);
        Interface.jTextField4.setEditable(editability);
        Interface.jTextField5.setEditable(editability);
        Interface.jTextField6.setEditable(editability);
        Interface.jTextField7.setEditable(editability);
    }
}