package pr2.interfaces.interfaces_s.impl;

import pr2.interfaces.interfaces_s.api.AnalogController;

import java.awt.Point;

/**
 * Analoger Joystick.
 */
public class AnalogControllerImpl implements AnalogController {

    /**
     * Auslenkung in X-Richtung.
     */
    private double deltaX;

    /**
     * Auslenkung in Y-Richtung.
     */
    private double deltaY;

    /**
     * @see AnalogController#up(double)
     */
    @Override
    public void up(double percentage) {
        deltaY -= percentage;
    }

    /**
     * @see AnalogController#down(double)
     */
    @Override
    public void down(double percentage) {
        deltaY += percentage;
    }

    /**
     * @see AnalogController#left(double)
     */
    @Override
    public void left(double percentage) {
        deltaX -= percentage;
    }

    /**
     * @see AnalogController#right(double)
     */
    @Override
    public void right(double percentage) {
        deltaX += percentage;
    }

    /**
     * @see AnalogController#getPosition()
     */
    @Override
    public Point getPosition() {
        return new Point((int) deltaX, (int) deltaY);
    }
}
