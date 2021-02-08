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
    
    public void updateChannels()
    {
        if      ( Interface.delay_ch == true )
        {
            if      ( Interface.on_off_ch1_r == true && Interface.on_off_ch2_r == false )
            {
                Interface.jTextField6.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch1 ] );
            }
            else if ( Interface.on_off_ch1_r == false && Interface.on_off_ch2_r == true )
            {
                Interface.jTextField6.setText( calibrations.del_mas [ calibrations.del_mas_nmb_ch2 ] );
            }
        }
        else if ( Interface.delay_ch == false )
        {
            if      ( Interface.on_off_ch1_r == true && Interface.on_off_ch2_r == false )
            {
                Interface.jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch1 ] );
            }
            else if ( Interface.on_off_ch1_r == false && Interface.on_off_ch2_r == true )
            {
                Interface.jTextField6.setText( calibrations.phas_mas[ calibrations.phas_mas_nmb_ch2 ] );
            }
        }
        
        if      ( Interface.width_ch == true )
        {
            if      ( Interface.on_off_ch1_r == true && Interface.on_off_ch2_r == false )
            {
                Interface.jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch1 ] );
            }
            else if ( Interface.on_off_ch1_r == false && Interface.on_off_ch2_r == true )
            {
                Interface.jTextField5.setText( calibrations.width_mas [ calibrations.width_mas_nmb_ch2 ] );
            }
        }
        else if ( Interface.width_ch == false )
        {
            if      ( Interface.on_off_ch1_r == true && Interface.on_off_ch2_r == false  )
            {
                //  Конвертируем переменную процентов int в String
                String s = Integer.toString(calibrations.dcycle_percent);

                //  Устанавливаем значение
                Interface.jTextField5.setText(s + " %");
            }
            else if ( Interface.on_off_ch1_r == false && Interface.on_off_ch2_r == true )
            {
                //  Конвертируем переменную процентов int в String
                String s = Integer.toString(calibrations.dcycle_percent);

                //  Устанавливаем значение
                Interface.jTextField5.setText(s + " %");
            }
        }
    }
    
    //  Основной метод Java - это точка входа в любую Java-программу
    public static void main(String[] args) {
    }
}