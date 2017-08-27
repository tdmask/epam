package temp.topic_Serilization.pack2;



import temp.topic_Serilization.pack1.TestSerial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainReadSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestSerial testSerial = (TestSerial) ois.readObject();
        System.out.println("version=" + testSerial.version);
        System.out.println(testSerial.toString());
    }
}
