interface MyInterface {
    void show();
}

public class LambdaExample {
    public static void main(String[] args) {
        MyInterface i = () -> System.out.println("Lambda working");
        i.show();
    }
}
