package task04.task0403.task040302;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

class TranslatorController {

    private final MenuHeader menuMain = new MenuHeader(menuListForShop);
    private static final ArrayList<String> menuListForShop = new ArrayList<>(
            Arrays.asList("Store menu for Translator: ",
                    "\n[1] - init small Vocabulary",
                    "\t[2] - printValue Dict         ",
                    "\t[3] - add translation    ",
                    "\n[4] - translate WORD     ",
                    "\t[5] - translate PHRASE   ",
                    "\n[0] - Exit"
            ));

    public void start() throws IOException {

        while (true) {
            int choice = menuMain.userChoice();
            switch (choice) {
                case 1:
                    Translator.initDictionaryForBeginners();
                    break;
                case 2:
                    Translator.printDictionary();
                    break;
                case 3:
                    Translator.addTranslation();
                    break;
                case 4:
                    System.out.println(Translator.translateWord(Text.inputString(
                            "Please input english word to translate:")));
                    break;
                case 5:
                    System.out.println(Translator.translatePhrase(Text.inputString(
                            "Please input english word to translate:")));
                    break;
                case 0:
                    System.out.println("-- Exit --");
                    System.exit(0);
            }
        }
    }
}
