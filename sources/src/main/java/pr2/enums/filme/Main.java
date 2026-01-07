package pr2.enums.filme;

public class Main {
    public static void main(String[] args) {
        for(LieblingsFilme film : LieblingsFilme.values()) {
            System.out.println(film);
            System.out.println("____________________");
        }
    }
}
