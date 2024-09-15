package pr2.interfaces.interfaces_e.impl;

import java.awt.Point;

import pr2.interfaces.interfaces_e.api.DigitalController;

/**
 * Implementierung eines digitalen Joysticks.
 */
public class DigitalControllerImpl implements DigitalController {

    private Point position = new Point(0, 0);

    /**
     * @see DigitalController#up()
     */
    @Override
    public void up() {
        position.translate(0, -1);
    }

    /**
     * @see DigitalController#down()
     */
    @Override
    public void down() {
        position.translate(0, 1);
    }

    /**
     * @see DigitalController#left()
     */
    @Override
    public void left() {
        position.translate(-1, 0);
    }

    /**
     * @see DigitalController#right()
     */
    @Override
    public void right() {
        position.translate(1, 0);
    }

    /**
     * @see DigitalController#getPosition()
     */
    @Override
    public Point getPosition() {
        return (Point) position.clone();
    }
}
