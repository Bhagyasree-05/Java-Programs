class A {
    void show(){
        System.out.println("Parent class");
    }
}

class B extends A {
}

public class Inheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
