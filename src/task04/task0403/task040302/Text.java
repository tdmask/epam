package task04.task0403.task040302;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Text {

    public static String inputString(String message) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(message);
        return (reader.readLine());
    }

}
