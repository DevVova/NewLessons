import java.io.IOException;

public class Hello {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World! I'm Vova. I am a trader.");
        System.out.println("Нажми Enter для выхода...");//Это для того чтобы консоль сразу не закрывалась.
        System.in.read(); // ждёт нажатия Enter
    }
}
