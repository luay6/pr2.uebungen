package pr2.enums.singleton;

public class SingletonBeweis {

    public static void main(String[] args) {
       MyEnum m = MyEnum.A;
       MyEnum n = MyEnum.values()[0];
       System.out.println(m == n);
    }
}
