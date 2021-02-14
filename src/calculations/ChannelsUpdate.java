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

//  Класс ChannelsUpdate отвечает за обновление каналов во время их переключения
public class ChannelsUpdate {
    //  ВЫЗОВ КЛАССОВ
    Calibrations    calibrations    = new Calibrations();
    
    /**
     * updateTimingChannels - функция обновления каналов вкладки Timing, которая выполняется при их переключении
     * @param width - переменная передачи состояния true/false чекера включения/выключения кнопки width
     * @param delay - переменная передачи состояния true/false чекера включения/выключения кнопки delay
     * @param ch1_onoff - переменная передачи состояния true/false чекера включения/выключения первого канала
     * @param ch2_onoff - переменная передачи состояния true/false чекера включения/выключения второго канала
     */
    public void updateTimingChannels(boolean width, boolean delay, boolean ch1_onoff, boolean ch2_onoff)
    {
        if      ( delay == true )
        {
            if      ( ch1_onoff == true && ch2_onoff == false )
            {
                Interface.tabTiming_DelayTextField.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( ch1_onoff == false && ch2_onoff == true )
            {
                Interface.tabTiming_DelayTextField.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch2 ] );
            }
        }
        else if ( delay == false )
        {
            if      ( ch1_onoff == true && ch2_onoff == false )
            {
                Interface.tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( ch1_onoff == false && ch2_onoff == true )
            {
                Interface.tabTiming_DelayTextField.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
        }
        
        if      ( width == true )
        {
            if      ( ch1_onoff == true && ch2_onoff == false )
            {
                Interface.tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
            }
            else if ( ch1_onoff == false && ch2_onoff == true )
            {
                Interface.tabTiming_WidthTextField.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
            }
        }
        else if ( width == false )
        {
            if      ( ch1_onoff == true && ch2_onoff == false )
            {
                //  Конвертируем переменную процентов int в String
                String s = Integer.toString(calibrations.dcycle_percent);

                //  Устанавливаем значение
                Interface.tabTiming_WidthTextField.setText(s + " %");
            }
            else if ( ch1_onoff == false && ch2_onoff == true )
            {
                //  Конвертируем переменную процентов int в String
                String s = Integer.toString(calibrations.dcycle_percent);

                //  Устанавливаем значение
                Interface.tabTiming_WidthTextField.setText(s + " %");
            }
        }
    }
    
    //  Основной метод Java - это точка входа в любую Java-программу
    public static void main(String[] args) {
    }
}