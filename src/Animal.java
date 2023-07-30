public class Animal {
    public static void main(String[] args) {
        Inter inter = new Inter() {
            @Override
            public int sum(int a, int b) {
                return 0;
            }
        };
    }
}

    @FunctionalInterface
interface Inter{
    public int sum(int a,int b);
}
