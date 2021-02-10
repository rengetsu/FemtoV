/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package calculations;   //  calculations - пакет где выполняются все вычисления программы

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс Calibrations отвечает за передачу значение (полей) регулировок (Adjustments)
public class Calibrations {
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ ПОЛЯ
    
    //  ПЕРЕМЕННЫЕ ДЛЯ ХРАНЕНИЯ ЗНАЧЕНИЙ МАЛЕНЬКОГО ШАГА
    
    //  Переменная для хранения значения регулировки Width для 1 канала
    public static int li_width_ch1      =   200;    //  Значение в пикосекундах
    
    //  Переменная для хранения значения регулировки Width для 2 канала
    public static int li_width_ch2      =   200;    //  Значение в пикосекундах
    
    //  Переменная для хранения значения регулировки High Level
    public static int cl_High_Level     =   100;    //  Значение в вольтах
    
    //  Переменная для хранения значения регулировки Low Level
    public static int cl_Low_Level      =   0;      //  Значение в вольтах
    
    //  Переменная для хранения значения регулировки DCycle
    public static int dcycle_percent    =   0;      //  Значение в процентах
    
    //  ПЕРЕМЕННЫЕ ДЛЯ НУМЕРАЦИИ ВЫВОДА ЗНАЧЕНИЙ БОЛЬШОГО ШАГА
    
    //  Переменная для нумерации вывода значений массива Period
    public static int per_mas_nmb       =   0;
    
    //  Переменная для нумерации вывода значений массива Frequency
    public static int freq_mas_nmb      =   0;
    
    //  Переменная для нумерации вывода значений массива Delay
    public static int del_mas_nmb_ch1   =   0;  //  Для 1 канала
    public static int del_mas_nmb_ch2   =   0;  //  Для 2 канала
    
    //  Переменная для нумерации вывода значений массива Phase
    public static int phas_mas_nmb_ch1  =   0;  //  Для 1 канала
    public static int phas_mas_nmb_ch2  =   0;  //  Для 2 канала
    
    //  Переменная для нумерация вывода значений массива Width
    public static int width_mas_nmb_ch1 =   0;  //  Для 1 канала
    public static int width_mas_nmb_ch2 =   0;  //  Для 2 канала
    
    //  МАССИВЫ ДЛЯ ХРАНЕНИЯ ЗНАЧЕНИЙ БОЛЬШОГО ШАГА
    
    //  Массив таблицы Period
    public static String[] per_mas =
    {
        "400 ps", "500 ps", "1 ns", "2 ns", "5 ns",
        "10 ns", "20 ns", "50 ns", "100 ns", "200 ns",
        "500 ns", "1 µs", "2 µs", "5 µs", "10 µs",
        "20 µs", "50 µs", "100 µs", "200 µs", "500 µs", "1 ms"
    };
    
    //  Массив таблицы Frequency
    public static String[] freq_mas =
    {
        "1 kHz", "2 kHz", "5 kHz", "10 kHz", "20 kHz",
        "50 kHz", "100 kHz", "200 kHz", "500 kHz", "1 MHz",
        "2 MHz", "5 MHz", "10 MHz", "50 MHz", "100 MHz",
        "200 MHz", "500 MHz", "1 GHz", "2 GHz", "2.5 GHz"
    };
    
    //  Массив таблицы Delay
    public static String[] del_mas =
    {
        "0 s", "200 s", "500 s", "1 ns", "2 ns",
        "5 ns", "10 ns", "20 ns", "50 ns", "100 ns",
        "200 ns", "500 ns", "1 µs", "2 µs", "5 µs",
        "10 µs", "20 µs", "50 µs", "100 µs", "200 µs",
        "500 µs", "1 ms"
    };
    
    //  Массив таблицы Phase
    public static String[] phas_mas =
    {
        "0 s", "200 s", "500 s", "1 ns", "2 ns",
        "5 ns", "10 ns", "20 ns", "50 ns", "100 ns",
        "200 ns", "500 ns", "1 µs", "2 µs", "5 µs",
        "10 µs", "20 µs", "50 µs", "100 µs", "200 µs",
        "500 µs", "1 ms"
    };
    
    //  Массив таблицы Width
    public static String[] width_mas =
    {
        "200 ps", "500 ps", "1 ns", "2 ns", "5 ns",
        "10 ns", "20 ns", "50 ns", "100 ns", "200 ns",
        "500 ns", "1 µs", "2 µs", "5 µs", "10 µs",
        "20 µs", "50 µs", "100 µs", "200 µs", "500 µs", "1 ms"
    };
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ МЕТОДЫ
    
    /**
     * VDF - Value Determination Function (Функция Определения Значения)
     * @param calib     - переменная куда отправляется номер используемой вкладки
     * @param nmbr      - переменная номера масива таблицы значений
     * @param ch_nmbr   - переменная которая показывает номер канала который сейчас выбран
     */
    public static void VDF(int calib, int nmbr, int ch_nmbr)
    {
        //  calib   =   6   -   Width
        if( calib   ==  6   )
        {
            if( ch_nmbr == 1 )
            {
                switch (nmbr) {
                //  200 ps
                    case 0:
                        li_width_ch1    =   200;
                        break;
                //  500 ps
                    case 1:
                        li_width_ch1    =   500;
                        break;
                //  1 ns
                    case 2:
                        li_width_ch1    =   1000;
                        break;
                //  2 ns
                    case 3:
                        li_width_ch1    =   2000;
                        break;
                //  5 ns
                    case 4:
                        li_width_ch1    =   5000;
                        break;
                //  10 ns
                    case 5:
                        li_width_ch1    =   10000;
                        break;
                //  20 ns
                    case 6:
                        li_width_ch1    =   20000;
                        break;
                //  50 ns
                    case 7:
                        li_width_ch1    =   50000;
                        break;
                //  100 ns
                    case 8:
                        li_width_ch1    =   100000;
                        break;
                //  200 ns
                    case 9:
                        li_width_ch1    =   200000;
                        break;
                //  500 ns
                    case 10:
                        li_width_ch1    =   500000;
                        break;
                //  1 µs
                    case 11:
                        li_width_ch1    =   1000000;
                        break;
                //  2 µs
                    case 12:
                        li_width_ch1    =   2000000;
                        break;
                //  5 µs
                    case 13:
                        li_width_ch1    =   5000000;
                        break;
                //  10 µs
                    case 14:
                        li_width_ch1    =   10000000;
                        break;
                //  20 µs
                    case 15:
                        li_width_ch1    =   20000000;
                        break;
                //  50 µs
                    case 16:
                        li_width_ch1    =   50000000;
                        break;
                //  100 µs
                    case 17:
                        li_width_ch1    =   100000000;
                        break;
                //  200 µs
                    case 18:
                        li_width_ch1    =   200000000;
                        break;
                //  500 µs
                    case 19:
                        li_width_ch1    =   500000000;
                        break;
                //  1 ms
                    case 20:
                        li_width_ch1    =   1000000000;
                        break;
                    default:
                        break;
                }
            }
            else if( ch_nmbr == 2 )
            {
                switch (nmbr) {
                //  200 ps
                    case 0:
                        li_width_ch2    =   200;
                        break;
                //  500 ps
                    case 1:
                        li_width_ch2    =   500;
                        break;
                //  1 ns
                    case 2:
                        li_width_ch2    =   1000;
                        break;
                //  2 ns
                    case 3:
                        li_width_ch2    =   2000;
                        break;
                //  5 ns
                    case 4:
                        li_width_ch2    =   5000;
                        break;
                //  10 ns
                    case 5:
                        li_width_ch2    =   10000;
                        break;
                //  20 ns
                    case 6:
                        li_width_ch2    =   20000;
                        break;
                //  50 ns
                    case 7:
                        li_width_ch2    =   50000;
                        break;
                //  100 ns
                    case 8:
                        li_width_ch2    =   100000;
                        break;
                //  200 ns
                    case 9:
                        li_width_ch2    =   200000;
                        break;
                //  500 ns
                    case 10:
                        li_width_ch2    =   500000;
                        break;
                //  1 µs
                    case 11:
                        li_width_ch2    =   1000000;
                        break;
                //  2 µs
                    case 12:
                        li_width_ch2    =   2000000;
                        break;
                //  5 µs
                    case 13:
                        li_width_ch2    =   5000000;
                        break;
                //  10 µs
                    case 14:
                        li_width_ch2    =   10000000;
                        break;
                //  20 µs
                    case 15:
                        li_width_ch2    =   20000000;
                        break;
                //  50 µs
                    case 16:
                        li_width_ch2    =   50000000;
                        break;
                //  100 µs
                    case 17:
                        li_width_ch2    =   100000000;
                        break;
                //  200 µs
                    case 18:
                        li_width_ch2    =   200000000;
                        break;
                //  500 µs
                    case 19:
                        li_width_ch2    =   500000000;
                        break;
                //  1 ms
                    case 20:
                        li_width_ch2    =   1000000000;
                        break;
                    default:
                        break;
                }
            }
        }
    }
    
    /**
     * VDDF - Value Display Definition Function (Функция определения отображения значения)
     * @param calib     - переменная куда отправляется номер используемой вкладки
     * @param nmbr      - переменная номера масива таблицы значений
     * @param plus      - переменная которая определяет будет ли прибавление или убавление
     * @param ch_nmbr   - переменная которая показывает номер канала который сейчас выбран
     * @return
     */
    public static String VDDF(int calib, float nmbr, boolean plus, int ch_nmbr)
    {
        //  Создаем переменную которую будем возвращять
        String rez = "";
        
        //  calib   =   6   -   Width
        if( calib   ==  6   )
        {
            if( plus == true )      //  Прибавляем
            {
                if          ( ch_nmbr == 1 )    //  Если выбран 1 канал
                {
                    if      ( li_width_ch1  <   500       ){li_width_ch1  +=  2;          nmbr += 2;      }   //  200 ps - 500 ps
                    else if ( li_width_ch1  <   1000      ){li_width_ch1  +=  5;          nmbr += 5;      }   //  500 ps - 1 ns
                    else if ( li_width_ch1  <   2000      ){li_width_ch1  +=  10;         nmbr+= 10;      }   //  1 ns - 2 ns
                    else if ( li_width_ch1  <   5000      ){li_width_ch1  +=  20;         nmbr+= 20;      }   //  2 ns - 5 ns
                    else if ( li_width_ch1  <   10000     ){li_width_ch1  +=  50;         nmbr+= 50;      }   //  5 ns - 10 ns
                    else if ( li_width_ch1  <   20000     ){li_width_ch1  +=  100;        nmbr+= 100;     }   //  10 ns - 20 ns
                    else if ( li_width_ch1  <   50000     ){li_width_ch1  +=  200;        nmbr+= 200;     }   //  20 ns - 50 ns
                    else if ( li_width_ch1  <   100000    ){li_width_ch1  +=  500;        nmbr+= 200;     }   //  50 ns - 100 ns
                    else if ( li_width_ch1  <   200000    ){li_width_ch1  +=  1000;       nmbr+= 200;     }   //  100 ns - 200 ns
                    else if ( li_width_ch1  <   500000    ){li_width_ch1  +=  2000;       nmbr+= 200;     }   //  200 ns - 500 ns
                    else if ( li_width_ch1  <   1000000   ){li_width_ch1  +=  5000;       nmbr+= 200;     }   //  500 ns - 1 µs
                    else if ( li_width_ch1  <   2000000   ){li_width_ch1  +=  10000;      nmbr+= 200;     }   //  1 µs - 2 µs
                    else if ( li_width_ch1  <   5000000   ){li_width_ch1  +=  20000;      nmbr+= 200;     }   //  2 µs - 5 µs
                    else if ( li_width_ch1  <   10000000  ){li_width_ch1  +=  50000;      nmbr+= 200;     }   //  5 µs - 10 µs
                    else if ( li_width_ch1  <   50000000  ){li_width_ch1  +=  100000;     nmbr+= 200;     }   //  10 µs - 50 µs
                    else if ( li_width_ch1  <   100000000 ){li_width_ch1  +=  500000;     nmbr+= 200;     }   //  50 µs - 100 µs
                    else if ( li_width_ch1  <   200000000 ){li_width_ch1  +=  1000000;    nmbr+= 200;     }   //  100 µs - 200 µs
                    else if ( li_width_ch1  <   500000000 ){li_width_ch1  +=  2000000;    nmbr+= 200;     }   //  200 µs - 500 µs
                    else if ( li_width_ch1  <   1000000000){li_width_ch1  +=  5000000;    nmbr+= 200;     }   //  500 µs - 1 ms
                    else if ( li_width_ch1  >=  1000000000){li_width_ch1  =   1000000000;                 }   //  MAX
                }
                else if     ( ch_nmbr == 2 )    //  Если выбран 2 канал
                {
                    if      ( li_width_ch2  <   500       ){li_width_ch2  +=  2;          nmbr += 2;      }   //  200 ps - 500 ps
                    else if ( li_width_ch2  <   1000      ){li_width_ch2  +=  5;          nmbr += 5;      }   //  500 ps - 1 ns
                    else if ( li_width_ch2  <   2000      ){li_width_ch2  +=  10;         nmbr+= 10;      }   //  1 ns - 2 ns
                    else if ( li_width_ch2  <   5000      ){li_width_ch2  +=  20;         nmbr+= 20;      }   //  2 ns - 5 ns
                    else if ( li_width_ch2  <   10000     ){li_width_ch2  +=  50;         nmbr+= 50;      }   //  5 ns - 10 ns
                    else if ( li_width_ch2  <   20000     ){li_width_ch2  +=  100;        nmbr+= 100;     }   //  10 ns - 20 ns
                    else if ( li_width_ch2  <   50000     ){li_width_ch2  +=  200;        nmbr+= 200;     }   //  20 ns - 50 ns
                    else if ( li_width_ch2  <   100000    ){li_width_ch2  +=  500;        nmbr+= 200;     }   //  50 ns - 100 ns
                    else if ( li_width_ch2  <   200000    ){li_width_ch2  +=  1000;       nmbr+= 200;     }   //  100 ns - 200 ns
                    else if ( li_width_ch2  <   500000    ){li_width_ch2  +=  2000;       nmbr+= 200;     }   //  200 ns - 500 ns
                    else if ( li_width_ch2  <   1000000   ){li_width_ch2  +=  5000;       nmbr+= 200;     }   //  500 ns - 1 µs
                    else if ( li_width_ch2  <   2000000   ){li_width_ch2  +=  10000;      nmbr+= 200;     }   //  1 µs - 2 µs
                    else if ( li_width_ch2  <   5000000   ){li_width_ch2  +=  20000;      nmbr+= 200;     }   //  2 µs - 5 µs
                    else if ( li_width_ch2  <   10000000  ){li_width_ch2  +=  50000;      nmbr+= 200;     }   //  5 µs - 10 µs
                    else if ( li_width_ch2  <   50000000  ){li_width_ch2  +=  100000;     nmbr+= 200;     }   //  10 µs - 50 µs
                    else if ( li_width_ch2  <   100000000 ){li_width_ch2  +=  500000;     nmbr+= 200;     }   //  50 µs - 100 µs
                    else if ( li_width_ch2  <   200000000 ){li_width_ch2  +=  1000000;    nmbr+= 200;     }   //  100 µs - 200 µs
                    else if ( li_width_ch2  <   500000000 ){li_width_ch2  +=  2000000;    nmbr+= 200;     }   //  200 µs - 500 µs
                    else if ( li_width_ch2  <   1000000000){li_width_ch2  +=  5000000;    nmbr+= 200;     }   //  500 µs - 1 ms
                    else if ( li_width_ch2  >=  1000000000){li_width_ch2  =   1000000000;                 }   //  MAX
                }
            }
            else if( plus == false )    //  Отнимаем
            {
                if          ( ch_nmbr == 1 )    //  Если выбран 1 канал
                {
                    if      ( li_width_ch1  <=  200       ){li_width_ch1  =   200;                        }   //  MIN
                    else if ( li_width_ch1  <   500       ){li_width_ch1  -=  2;          nmbr += 2;      }   //  200 ps - 500 ps
                    else if ( li_width_ch1  <   1000      ){li_width_ch1  -=  5;          nmbr += 5;      }   //  500 ps - 1 ns
                    else if ( li_width_ch1  <   2000      ){li_width_ch1  -=  10;         nmbr += 10;     }   //  1 ns - 2 ns
                    else if ( li_width_ch1  <   5000      ){li_width_ch1  -=  20;         nmbr += 20;     }   //  2 ns - 5 ns
                    else if ( li_width_ch1  <   10000     ){li_width_ch1  -=  50;         nmbr += 50;     }   //  5 ns - 10 ns
                    else if ( li_width_ch1  <   20000     ){li_width_ch1  -=  100;        nmbr += 100;    }   //  10 ns - 20 ns
                    else if ( li_width_ch1  <   50000     ){li_width_ch1  -=  200;        nmbr += 200;    }   //  20 ns - 50 ns
                    else if ( li_width_ch1  <   100000    ){li_width_ch1  -=  500;        nmbr += 500;    }   //  50 ns - 100 ns
                    else if ( li_width_ch1  <   200000    ){li_width_ch1  -=  1000;       nmbr += 1000;   }   //  100 ns - 200 ns
                    else if ( li_width_ch1  <   500000    ){li_width_ch1  -=  2000;       nmbr += 2000;   }   //  200 ns - 500 ns
                    else if ( li_width_ch1  <   1000000   ){li_width_ch1  -=  5000;       nmbr += 5000;   }   //  500 ns - 1 µs
                    else if ( li_width_ch1  <   2000000   ){li_width_ch1  -=  10000;      nmbr += 10000;  }   //  1 µs - 2 µs
                    else if ( li_width_ch1  <   5000000   ){li_width_ch1  -=  20000;      nmbr += 20000;  }   //  2 µs - 5 µs
                    else if ( li_width_ch1  <   10000000  ){li_width_ch1  -=  50000;      nmbr += 50000;  }   //  5 µs - 10 µs
                    else if ( li_width_ch1  <   50000000  ){li_width_ch1  -=  100000;     nmbr += 100000; }   //  10 µs - 50 µs
                    else if ( li_width_ch1  <   100000000 ){li_width_ch1  -=  500000;     nmbr += 500000; }   //  50 µs - 100 µs
                    else if ( li_width_ch1  <   200000000 ){li_width_ch1  -=  1000000;    nmbr += 1000000;}   //  100 µs - 200 µs
                    else if ( li_width_ch1  <   500000000 ){li_width_ch1  -=  2000000;    nmbr += 2000000;}   //  200 µs - 500 µs
                    else if ( li_width_ch1  <   1000000000){li_width_ch1  -=  5000000;    nmbr += 5000000;}   //  500 µs - 1 ms
                    else if ( li_width_ch1  ==  1000000000){li_width_ch1  -=  5000000;                    }   //  500 µs - 1 ms
                }
                else if     ( ch_nmbr == 2 )    //  Если выбран 2 канал
                {
                    if      ( li_width_ch2  <=  200       ){li_width_ch2  =   200;                        }   //  MIN
                    else if ( li_width_ch2  <   500       ){li_width_ch2  -=  2;          nmbr += 2;      }   //  200 ps - 500 ps
                    else if ( li_width_ch2  <   1000      ){li_width_ch2  -=  5;          nmbr += 5;      }   //  500 ps - 1 ns
                    else if ( li_width_ch2  <   2000      ){li_width_ch2  -=  10;         nmbr += 10;     }   //  1 ns - 2 ns
                    else if ( li_width_ch2  <   5000      ){li_width_ch2  -=  20;         nmbr += 20;     }   //  2 ns - 5 ns
                    else if ( li_width_ch2  <   10000     ){li_width_ch2  -=  50;         nmbr += 50;     }   //  5 ns - 10 ns
                    else if ( li_width_ch2  <   20000     ){li_width_ch2  -=  100;        nmbr += 100;    }   //  10 ns - 20 ns
                    else if ( li_width_ch2  <   50000     ){li_width_ch2  -=  200;        nmbr += 200;    }   //  20 ns - 50 ns
                    else if ( li_width_ch2  <   100000    ){li_width_ch2  -=  500;        nmbr += 500;    }   //  50 ns - 100 ns
                    else if ( li_width_ch2  <   200000    ){li_width_ch2  -=  1000;       nmbr += 1000;   }   //  100 ns - 200 ns
                    else if ( li_width_ch2  <   500000    ){li_width_ch2  -=  2000;       nmbr += 2000;   }   //  200 ns - 500 ns
                    else if ( li_width_ch2  <   1000000   ){li_width_ch2  -=  5000;       nmbr += 5000;   }   //  500 ns - 1 µs
                    else if ( li_width_ch2  <   2000000   ){li_width_ch2  -=  10000;      nmbr += 10000;  }   //  1 µs - 2 µs
                    else if ( li_width_ch2  <   5000000   ){li_width_ch2  -=  20000;      nmbr += 20000;  }   //  2 µs - 5 µs
                    else if ( li_width_ch2  <   10000000  ){li_width_ch2  -=  50000;      nmbr += 50000;  }   //  5 µs - 10 µs
                    else if ( li_width_ch2  <   50000000  ){li_width_ch2  -=  100000;     nmbr += 100000; }   //  10 µs - 50 µs
                    else if ( li_width_ch2  <   100000000 ){li_width_ch2  -=  500000;     nmbr += 500000; }   //  50 µs - 100 µs
                    else if ( li_width_ch2  <   200000000 ){li_width_ch2  -=  1000000;    nmbr += 1000000;}   //  100 µs - 200 µs
                    else if ( li_width_ch2  <   500000000 ){li_width_ch2  -=  2000000;    nmbr += 2000000;}   //  200 µs - 500 µs
                    else if ( li_width_ch2  <   1000000000){li_width_ch2  -=  5000000;    nmbr += 5000000;}   //  500 µs - 1 ms
                    else if ( li_width_ch2  ==  1000000000){li_width_ch2  -=  5000000;                    }   //  500 µs - 1 ms
                
                }
            }
            //  Возвращение результата в виде переменной String
            if          ( ch_nmbr == 1 )    //  Если выбран 1 канал
            {
                if      ( li_width_ch1  <   500       ){rez   =   li_width_ch1  + " ps";    }   //  200 ps - 500 ps
                else if ( li_width_ch1  <   1000      ){rez   =   li_width_ch1  + " ps";    }   //  500 ps - 1 ns
                else if ( li_width_ch1  <   2000      ){rez   =   (nmbr/1000)   + " ns";    }   //  1 ns - 2 ns
                else if ( li_width_ch1  <   5000      ){rez   =   (nmbr/1000)   + " ns";    }   //  2 ns - 5 ns
                else if ( li_width_ch1  <   10000     ){rez   =   (nmbr/1000)   + " ns";    }   //  5 ns - 10 ns
                else if ( li_width_ch1  <   20000     ){rez   =   (nmbr/1000)   + " ns";    }   //  10 ns - 20 ns
                else if ( li_width_ch1  <   50000     ){rez   =   (nmbr/1000)   + " ns";    }   //  20 ns - 50 ns
                else if ( li_width_ch1  <   100000    ){rez   =   (nmbr/1000)   + " ns";    }   //  50 ns - 100 ns
                else if ( li_width_ch1  <   200000    ){rez   =   (nmbr/1000)   + " ns";    }   //  100 ns - 200 ns
                else if ( li_width_ch1  <   500000    ){rez   =   (nmbr/1000)   + " ns";    }   //  200 ns - 500 ns
                else if ( li_width_ch1  <   1000000   ){rez   =   (nmbr/1000)   + " ns";    }   //  500 ns - 1 µs
                else if ( li_width_ch1  <   2000000   ){rez   =   (nmbr/1000000)+ " µs";    }   //  1 µs - 2 µs
                else if ( li_width_ch1  <   5000000   ){rez   =   (nmbr/1000000)+ " µs";    }   //  2 µs - 5 µs
                else if ( li_width_ch1  <   10000000  ){rez   =   (nmbr/1000000)+ " µs";    }   //  5 µs - 10 µs
                else if ( li_width_ch1  <   50000000  ){rez   =   (nmbr/1000000)+ " µs";    }   //  10 µs - 50 µs
                else if ( li_width_ch1  <   100000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  50 µs - 100 µs
                else if ( li_width_ch1  <   200000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  100 µs - 200 µs
                else if ( li_width_ch1  <   500000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  200 µs - 500 µs
                else if ( li_width_ch1  <   1000000000){rez   =   (nmbr/1000000)+ " µs";    }   //  500 µs - 1 ms
                else if ( li_width_ch1  >=  1000000000){rez  =    "1 ms";                   }   //  MAX
            }
            else if     ( ch_nmbr == 2 )    //  Если выбран 2 канал
            {
                if      ( li_width_ch2  <   500       ){rez   =   li_width_ch2  + " ps";    }   //  200 ps - 500 ps
                else if ( li_width_ch2  <   1000      ){rez   =   li_width_ch2  + " ps";    }   //  500 ps - 1 ns
                else if ( li_width_ch2  <   2000      ){rez   =   (nmbr/1000)   + " ns";    }   //  1 ns - 2 ns
                else if ( li_width_ch2  <   5000      ){rez   =   (nmbr/1000)   + " ns";    }   //  2 ns - 5 ns
                else if ( li_width_ch2  <   10000     ){rez   =   (nmbr/1000)   + " ns";    }   //  5 ns - 10 ns
                else if ( li_width_ch2  <   20000     ){rez   =   (nmbr/1000)   + " ns";    }   //  10 ns - 20 ns
                else if ( li_width_ch2  <   50000     ){rez   =   (nmbr/1000)   + " ns";    }   //  20 ns - 50 ns
                else if ( li_width_ch2  <   100000    ){rez   =   (nmbr/1000)   + " ns";    }   //  50 ns - 100 ns
                else if ( li_width_ch2  <   200000    ){rez   =   (nmbr/1000)   + " ns";    }   //  100 ns - 200 ns
                else if ( li_width_ch2  <   500000    ){rez   =   (nmbr/1000)   + " ns";    }   //  200 ns - 500 ns
                else if ( li_width_ch2  <   1000000   ){rez   =   (nmbr/1000)   + " ns";    }   //  500 ns - 1 µs
                else if ( li_width_ch2  <   2000000   ){rez   =   (nmbr/1000000)+ " µs";    }   //  1 µs - 2 µs
                else if ( li_width_ch2  <   5000000   ){rez   =   (nmbr/1000000)+ " µs";    }   //  2 µs - 5 µs
                else if ( li_width_ch2  <   10000000  ){rez   =   (nmbr/1000000)+ " µs";    }   //  5 µs - 10 µs
                else if ( li_width_ch2  <   50000000  ){rez   =   (nmbr/1000000)+ " µs";    }   //  10 µs - 50 µs
                else if ( li_width_ch2  <   100000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  50 µs - 100 µs
                else if ( li_width_ch2  <   200000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  100 µs - 200 µs
                else if ( li_width_ch2  <   500000000 ){rez   =   (nmbr/1000000)+ " µs";    }   //  200 µs - 500 µs
                else if ( li_width_ch2  <   1000000000){rez   =   (nmbr/1000000)+ " µs";    }   //  500 µs - 1 ms
                else if ( li_width_ch2  >=  1000000000){rez  =    "1 ms";                   }   //  MAX
            }
        }
        return rez;
    }
    
    //  Основной метод Java - это точка входа в любую Java-программу
    public static void main(String[] args) {
        //  ДАЛЕЕ ИДУТ ВЫЗОВЫ ИСПОЛЬЗУЕМЫХ КЛАССОВ
        
        //  Вызываем класc Delay для 1 и 2 канала
        Delay delay_ch1 = new Delay();
        Delay delay_ch2 = new Delay();
        
        //  ДАЛЕЕ ИДУТ ПОЛЯ КЛАССА CALIBRATIONS
        
        //  Присваиваем значения переменной Delay для 1 и 2 канала
        delay_ch1.delay_value = 0;
        delay_ch2.delay_value = 0;
    }
}

//  ДАЛЕЕ ИДУТ КЛАССЫ ОТНОСЯЩИЕСЯ К ЗНАЧЕНИЮ РЕГУЛИРОВОК (ADJUSTMENTS VALUE)

//  Класс Delay - отвечает за значение регулировки Delay
class Delay{
    //  delay_value_ch - переменная для значения Delay для 1 иди 2 канала
    float delay_value;
    
    //  ДАЛЕЕ ИДУТ МЕТОДЫ КЛАССА DELAY
}