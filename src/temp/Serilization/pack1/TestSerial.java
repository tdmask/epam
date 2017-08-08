package temp.Serilization.pack1;

import java.io.Serializable;

public class TestSerial implements Serializable {
    public byte version = 100;
    private byte count = 0;
    public int a;

    @Override
    public String toString() {
        return "TestSerial {" +
                " version=" + version +
                ", count=" + count +
                ", a=" + a +
                " }";
    }
}

