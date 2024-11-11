package pr2.enums.singleton;

public class SingletonBeweis {

    public static void main(String[] args) {
        MyEnum e1 = MyEnum.A;
        MyEnum e2 = MyEnum.valueOf("A");
        MyEnum e3 = MyEnum.values()[0];

        System.out.println(e1 == e2);
        System.out.println(e2 == e3);
        System.out.println(e1 == e3);
    }
}
