/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов
package calculations;   //  calculations - пакет где выполняются все вычисления программ
import femtov.Interface;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс LevelStandard отвечает за присвоение стандартных значений при выборе пункта "Standard"
public class LevelStandard {

    /**
     * Функция изменения значений High/Low Level
     * @param choiceSelectedItem - получает выбранный параметр в элементе выбора (choice)
     */
    public static void changeLevelValues(String choiceSelectedItem)
    {
        //  При нажатии фиксированное значение зависит от выбранного стандарта
        if( null != Interface.tabLevels_Choice.getSelectedItem() )
        //  Switch при выборе фиксированного значения и изменения параметров High/Low
        switch (choiceSelectedItem) {
            case "NECL":
                Interface.tabLevels_HighLevelTextField.setText("-0.8 V");   //  High
                Interface.tabLevels_LowLevelTextField.setText("-1.8 V");    //  Low
                break;
            case "5-V PECL":
                Interface.tabLevels_HighLevelTextField.setText("4.2 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("3.4 V");     //  Low
                break;
            case "3.3-V PECL":
                Interface.tabLevels_HighLevelTextField.setText("2.4 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("1.6 V");     //  Low
                break;
            case "2.5-V PECL":
                Interface.tabLevels_HighLevelTextField.setText("1.7 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.7 V");     //  Low
                break;
            case "1.8-V PECL":
                Interface.tabLevels_HighLevelTextField.setText("0.0 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.0 V");     //  Low
                break;
            case "5-V TTL":
                Interface.tabLevels_HighLevelTextField.setText("2.4 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "3.3-V TTL":
                Interface.tabLevels_HighLevelTextField.setText("2.4 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "2.5-V TTL":
                Interface.tabLevels_HighLevelTextField.setText("1.9 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "LVDS":
                Interface.tabLevels_HighLevelTextField.setText("1.4 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("1.0 V");     //  Low
                break;
            case "CML":
                Interface.tabLevels_HighLevelTextField.setText("0.0 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("-0.6 V");    //  Low
                break;
            case "3.3-V CML":
                Interface.tabLevels_HighLevelTextField.setText("3.3 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("2.7 V");     //  Low
                break;
            case "2.5-V CML":
                Interface.tabLevels_HighLevelTextField.setText("2.5 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("1.9 V");     //  Low
                break;
            case "1.8-V CML":
                Interface.tabLevels_HighLevelTextField.setText("1.8 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("1.2 V");     //  Low
                break;
            case "1.2-V CML":
                Interface.tabLevels_HighLevelTextField.setText("1.2 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.6 V");     //  Low
                break;
            case "5-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("4.5 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.5 V");     //  Low
                break;
            case "3.3-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("2.8 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "2.5-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("2.0 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "1.8-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("1.4 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.4 V");     //  Low
                break;
            case "1.5-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("1.2 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.3 V");     //  Low
                break;
            case "1.2-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("0.9 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.3 V");     //  Low
                break;
            case "0.8-V CMOS":
                Interface.tabLevels_HighLevelTextField.setText("0.8 V");    //  High
                Interface.tabLevels_LowLevelTextField.setText("0.2 V");     //  Low
                break;
            default:
                break;
        }
    }
    
    //  Основной метод Java - это точка входа в любую Java-программу
    public static void main(String[] args) {
    }
}