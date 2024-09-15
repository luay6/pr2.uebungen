package pr2.interfaces.interfaces_e.api;

import java.awt.Point;

/**
 * Ein digitaler Joystick.
 */
public interface DigitalController {

    /**
     * Nach oben bewegen.
     */
    void up();
    
    /**
     * Nach unten bewegen.
     */
    void down();
    
    /**
     * Nach links bewegen.
     */
    void left();
    
    /**
     * Nach rechts bewegen.
     */
    void right();
    
    /**
     * Liefert die aktuelle Position zurück.
     * 
     * @return Die Position.
     */
    Point getPosition();
}
