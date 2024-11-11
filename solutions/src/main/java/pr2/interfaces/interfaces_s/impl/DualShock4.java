package pr2.interfaces.interfaces_s.impl;

import pr2.interfaces.interfaces_s.api.AnalogController;
import pr2.interfaces.interfaces_s.api.DigitalController;

import java.awt.Point;

/**
 * Linke Seite eines DualShock 4 Controllers.
 */
public class DualShock4 implements AnalogController, DigitalController {

    private final AnalogController analogStick = new AnalogControllerImpl();

    private final DigitalController digitalStick = new DigitalControllerImpl();

    /**
     * @see DigitalController#up()
     */
    @Override
    public void up() {
        digitalStick.up();
    }

    /**
     * @see DigitalController#down()
     */
    @Override
    public void down() {
        digitalStick.down();
    }

    /**
     * @see DigitalController#left()
     */
    @Override
    public void left() {
        digitalStick.left();
    }

    /**
     * @see DigitalController#right()
     */
    @Override
    public void right() {
        digitalStick.right();
    }

    /**
     * @see AnalogController#up(double)
     */
    @Override
    public void up(double percentage) {
        analogStick.up(percentage);
    }

    /**
     * @see AnalogController#down(double)
     */
    @Override
    public void down(double percentage) {
        analogStick.down(percentage);
    }

    /**
     * @see AnalogController#left(double)
     */
    @Override
    public void left(double percentage) {
        analogStick.left(percentage);
    }

    /**
     * @see AnalogController#right(double)
     */
    @Override
    public void right(double percentage) {
        analogStick.right(percentage);
    }

    /**
     * @see AnalogController#getPosition()
     */
    @Override
    public Point getPosition() {
        Point resultAnalog = analogStick.getPosition();
        Point resultDigital = digitalStick.getPosition();
        Point result = new Point();

        result.x = resultAnalog.x + resultDigital.x;
        result.y = resultAnalog.y + resultDigital.y;

        return result;
    }
}
