/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package actions;    //  actions - пакет где выполняются все действия програм
import femtov.Interface;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Switches отвечает за все действия программы связанные с чекерами (переключателями)
public class Switches {
    
    //  Функция для смены значения чекеров для проверки нажатия кнопок нижнего меню
    //  c1  ... c10     - переменные которые показывают стоит или нет менять значение данного чекера
    //  ch1 ... ch10    - пеоеменные которые показывают на что именно надо менять значение чекера 
    public void chChanger_DownMenu(
            boolean c1, boolean ch1, boolean c2, boolean ch2, boolean c3, boolean ch3,
            boolean c4, boolean ch4, boolean c5, boolean ch5, boolean c6, boolean ch6,
            boolean c7, boolean ch7, boolean c8, boolean ch8, boolean c9, boolean ch9,
            boolean c10, boolean ch10)
    {
        if ( c1   == true ){ Interface.ch1  =   ch1;    }
        if ( c2   == true ){ Interface.ch2  =   ch2;    }
        if ( c3   == true ){ Interface.ch3  =   ch3;    }
        if ( c4   == true ){ Interface.ch4  =   ch4;    }
        if ( c5   == true ){ Interface.ch5  =   ch5;    }
        if ( c6   == true ){ Interface.ch6  =   ch6;    }
        if ( c7   == true ){ Interface.ch7  =   ch7;    }
        if ( c8   == true ){ Interface.ch8  =   ch8;    }
        if ( c9   == true ){ Interface.ch9  =   ch9;    }
        if ( c10  == true ){ Interface.ch10 =   ch10;   }
    }
}