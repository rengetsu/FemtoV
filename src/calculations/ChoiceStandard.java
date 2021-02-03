/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов
package calculations;   //  calculations - пакет где выполняются все вычисления програм
import femtov.Interface;
import java.awt.Choice;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс ChoiceStandard отвечает за комбобокс для работы с таблицой стандартов и классом LevelStandard
public class ChoiceStandard {
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ ПОЛЯ
    
    //  Переменная количества элементов в массиве таблицы стандартов
    public static int fam_mas_qt  = 21;
        
    //  Массив таблицы стандартов
    public static String[] fam_mas =
    {
        "NECL", "5-V PECL", "3.3-V PECL", "2.5-V PECL", "1.8-V PECL",
        "5-V TTL", "3-V TTL", "2.5-V TTL", "LVDS", "CML",
        "3.3-V CML", "2.5-V CML", "1.8-V CML", "1.2-V CML",
        "5-V CMOS", "3.3-V CMOS", "2.5-V CMOS", "1.8-V CMOS",
        "1.5-V CMOS", "1.2-V CMOS", "0.8-V CMOS"
    };
    
    //  ДАЛЕЕ ИДУТ ГЛОБАЛЬНЫЕ МЕТОДЫ
    
    /**
     * Функция с циклом добавления элементов в кнопку выбора из масcива
     */
    public static void addingItems()
    {
        //  Кнопка выбора
        Choice chc1 = Interface.choice1;
        
        //  Цикл добавления элементов в кнопку выбора из масcива
        for (int i = 0; i < fam_mas_qt; i++)
        {
            chc1.add( fam_mas [ i ] );
        }
    }
    
    //  Функция для запуска Choice (комбабокса для выбора) в программе
    public static void runChoice()
    {
        //  Вызываем функцию добавления элементов
        addingItems();
    }
    
    //  Основной метод Java - это точка входа в любую Java-программу
    public static void main(String[] args) {
    }
}