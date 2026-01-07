package pr2.interfaces.abstrakt_form;

public abstract class Form {
    protected int x;
    protected int y;
    protected Form(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract double flaeche();
    public abstract double umfang();
    
}
