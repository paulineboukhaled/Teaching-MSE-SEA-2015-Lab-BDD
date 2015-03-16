/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author paulineboukhaled
 */
public class Trumpet implements IInstrument {

    public String play() {
        return "pouet";    
    }

    public int getSoundVolume() {
        return 10;   
    }

    public String getColor() {
        return "golden";
    }


    
}
