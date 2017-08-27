package temp.topic_Serilization.pack1;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MainWriteSerial {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        TestSerial testSerial = new TestSerial();
        oos.writeObject(testSerial);
        oos.flush();
        oos.close();

    }
}
