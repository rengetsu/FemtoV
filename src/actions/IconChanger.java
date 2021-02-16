/*
 * "Femto V" - application for Pulse Pattern Generator. 
 * This is a program designed to work with the device FemtoScope (9511/9512 models).
 * FemtoScope - is a pulse pattern generator released by "Eltesta".
 */

//  Пакеты Java используемые для группировки связанных классов 
package actions;    //  actions - пакет где выполняются все действия програм
import femtov.Interface;
import java.nio.file.Path;
import javax.swing.ImageIcon;

/**
 *
 * @author PAVEL TROSTIANKO
 */

//  Класс IconChanger используется для работы со сменой иконок на объектах программы
public class IconChanger {

    /**
     * changeDownMenuButtonIcon - функция для смены иконок на кнопках нижнего меню
     * @param currentDir
     * @param buttonName
     * @param iconName
     */
    public void changeDownMenuButtonIcon(Path currentDir, String buttonName, String iconName)
    {
        if      (   "Mode".equals(buttonName)       ){
            Interface.downMenu_ModeButton.setIcon(          new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Pattern".equals(buttonName)    ){
            Interface.downMenu_PatternButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Display".equals(buttonName)    ){
            Interface.downMenu_DisplayButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Trigger".equals(buttonName)    ){
            Interface.downMenu_TriggerButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Inputs".equals(buttonName)    ){
            Interface.downMenu_InputsButton.setIcon(        new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Calibration".equals(buttonName)    ){
            Interface.downMenu_CalibrationButton.setIcon(   new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Timing".equals(buttonName)    ){
            Interface.downMenu_TimingButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Levels".equals(buttonName)    ){
            Interface.downMenu_LevelsButton.setIcon(        new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Outputs".equals(buttonName)    ){
            Interface.downMenu_OutputsButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
        else if (   "Utility".equals(buttonName)    ){
            Interface.downMenu_UtilityButton.setIcon(       new ImageIcon(currentDir + "\\src\\images\\" + iconName));
        }
    }
}
