package lessons.lesson11;

public class E {

    public E() {
        System.out.println("Метод построение без параметров");
    }

    public E(int value) {
        System.out.println("Метод построения Е с параметром" + value);
    }
}

class J extends E {
    public J() {
        System.out.println("");
    }
}
