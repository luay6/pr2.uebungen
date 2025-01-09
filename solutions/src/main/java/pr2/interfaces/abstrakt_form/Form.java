package pr2.interfaces.abstrakt_form;

public abstract class Form {

    protected double x;
    protected double y;

    public Form(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double flaeche();

    public abstract double umfang();
}
