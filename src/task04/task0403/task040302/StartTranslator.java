package task04.task0403.task040302;


import java.io.IOException;

public class StartTranslator {
    public static void main(String[] args) throws IOException {
        System.out.println("-- Starting translation --");
        TranslatorController translate = new TranslatorController();
        translate.start();
    }
}
