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
        Interface.tabTiming_PeriodLabel.setVisible(visibility);
        Interface.tabTiming_PeriodMapLabel.setVisible(visibility);        
        Interface.tabTiming_UpLineLabel.setVisible(visibility);
        Interface.tabTiming_DownLineLabel.setVisible(visibility);
        Interface.tabTiming_DelayLabel.setVisible(visibility);
        Interface.tabTiming_DelayMapLabel.setVisible(visibility);
        Interface.tabTiming_WidthLabel.setVisible(visibility);
        Interface.tabTiming_WidthMapLabel.setVisible(visibility);
        Interface.tabTiming_smallLeftButton_WidthDCycle.setVisible(visibility);
        Interface.tabTiming_smallRightButton_WidthDCycle.setVisible(visibility);
        Interface.tabTiming_delayButton_WidthDCycle.setVisible(visibility);
        Interface.tabTiming_bigLeftButton_WidthDCycle.setVisible(visibility);
        Interface.tabTiming_bigRightButton_WidthDCycle.setVisible(visibility);
        Interface.tabTiming_smallLeftButton_DelayPhase.setVisible(visibility);
        Interface.tabTiming_smallRightButton_DelayPhase.setVisible(visibility);
        Interface.tabTiming_delayButton_DelayPhase.setVisible(visibility);
        Interface.tabTiming_bigLeftButton_DelayPhase.setVisible(visibility);
        Interface.tabTiming_bigRightButton_DelayPhase.setVisible(visibility);
        Interface.tabTiming_Delay_ToggleButton.setVisible(visibility);
        Interface.tabTiming_Width_ToggleButton.setVisible(visibility);
        Interface.tabTiming_Phase_ToggleButton.setVisible(visibility);
        Interface.tabTiming_DCycle_ToggleButton.setVisible(visibility);
    }
    
    /**
     * levelsTab_HighLowLevelsVisibility - показывает или скрывает все элементы вкладки Levels - High/Low Level
     * @param visibility - может быть либо true/false в зависимости от того показываем или скрываем
     */
    static public void levelsTab_HighLowLevelsVisibility(boolean visibility)
    {
        //  Меняем видимость кнопок и шкал относящихся к этой секции
        Interface.tabLevels_LowLevelMapLabel.setVisible(visibility);
        Interface.tabLevels_HighLevelMapLabel.setVisible(visibility);
        Interface.tabLevels_bigUpButton_LowLevel.setVisible(visibility);
        Interface.tabLevels_bigDownButton_LowLevel.setVisible(visibility);
        Interface.tabLevels_zeroButton_LowLevel.setVisible(visibility);
        Interface.tabLevels_smallUpButton_LowLevel.setVisible(visibility);
        Interface.tabLevels_smallDownButton_LowLevel.setVisible(visibility);
        Interface.tabLevels_smallDownButton_HighLevel.setVisible(visibility);
        Interface.tabLevels_smallUpButton_HighLevel.setVisible(visibility);
        Interface.tabLevels_zeroButton_HighLevel.setVisible(visibility);
        Interface.tabLevels_bigDownButton_HighLevel.setVisible(visibility);
        Interface.tabLevels_bigUpButton_HighLevel.setVisible(visibility);
    }
    
    /**
     * levelsTab_HighLowLimitsVisibility - показывает или скрывает все элементы вкладки Levels - High/Low Limits
     * @param visibility - может быть либо true/false в зависимости от того показываем или скрываем
     */
    static public void levelsTab_HighLowLimitsVisibility(boolean visibility)
    {
        //  Делаем невидимыми кнопки и шкалы (High/Low Limit) относящиеся к этой секции
        Interface.tabLevels_LowLimitMapLabel.setVisible(visibility);
        Interface.tabLevels_HighLimitLabel.setVisible(visibility);
        Interface.tabLevels_LowLimitLabel.setVisible(visibility);
        Interface.tabLevels_HighLimitMapLabel.setVisible(visibility);
        Interface.tabLevels_LowLimitTextField.setVisible(visibility);
        Interface.tabLevels_HighLimitTextField.setVisible(visibility);
        Interface.tabLevels_smallDownButton_LowLimit.setVisible(visibility);
        Interface.tabLevels_smallUpButton_LowLimit.setVisible(visibility);
        Interface.tabLevels_zeroButton_LowLimit.setVisible(visibility);
        Interface.tabLevels_bigDownButton_LowLimit.setVisible(visibility);
        Interface.tabLevels_bigUpButton_LowLimit.setVisible(visibility);
        Interface.tabLevels_smallDownButton_HighLimit.setVisible(visibility);
        Interface.tabLevels_smallUpButton_HighLimit.setVisible(visibility);
        Interface.tabLevels_zeroButton_HighLimit.setVisible(visibility);
        Interface.tabLevels_bigDownButton_HighLimit.setVisible(visibility);
        Interface.tabLevels_bigUpButton_HighLimit.setVisible(visibility);
    }
}