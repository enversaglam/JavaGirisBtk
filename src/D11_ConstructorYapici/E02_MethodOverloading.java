package D11_ConstructorYapici;

public class E02_MethodOverloading {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        System.out.println("2 sayinin toplami : " +dortIslem.Topla(3, 4));
        System.out.println("3 sayinin toplami : " +dortIslem.Topla(4, 7, 8));
    }
}
