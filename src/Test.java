interface Cat{
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat() {
            @Override
            public void eat() {
                System.out.println("Interface");
            }
        };
        cat.eat();
    }
}
