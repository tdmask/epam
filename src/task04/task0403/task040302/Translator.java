package task04.task0403.task040302;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

class Translator {

    private static final Map<String, String> dict = new HashMap<>();

    public String translate(String str) {
        return "DUMMY";
    }

    public static String translateWord(String word) {
        for (Map.Entry entry : dict.entrySet()) {
            if (entry.getKey().toString().equalsIgnoreCase(word)) {
                return entry.getValue().toString();
            }
        }
        return word;
    }

    public static String translatePhrase(String phrase) {
        StringBuilder sb = new StringBuilder();
        String[] result = phrase.split("\\s");
//        System.out.println(Arrays.toString(result));
        for (String s : result) {
            if (dict.containsKey(s)) {
                sb.append(dict.get(s));
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void addTranslation() throws IOException {
        dict.put(Text.inputString("Please input english word(s):"), Text.inputString("Please input russian word(s):"));
    }

    public static void printDictionary() {

        for (Map.Entry entry : dict.entrySet()) {
            System.out.printf("%20s %5s %20s\n",entry.getKey().toString(),"-",entry.getValue().toString());
        }
//        System.out.println(Arrays.asList(dict));
    }

    public static void initDictionaryForBeginners() {
        dict.put("hello", "здравствуйте");
        dict.put("hi", "привет");
        dict.put("how", "как");
        dict.put("business", "дела");
        dict.put("he", "он");
        dict.put("she", "она");
        dict.put("you", "ты");
        dict.put("your", "твой");
        dict.put("we", "мы");
        dict.put("where", "где");
        dict.put("exit", "выход");
        dict.put("go", "идем");
        dict.put("home", "домой");
        dict.put("want", "хочет");
        dict.put("here", "здесь");
        dict.put("please", "пожалуйста");
        dict.put("welcome", "добро пожаловать");
//        dict.put("", "");
    }


}
