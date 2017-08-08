package task03.task0301;

import java.io.IOException;

public class StartBusiness {
    public static void main(String[] args) throws IOException {
        System.out.println("-- Starting your own Shop Business --");
        ShopController main1 = new ShopController();
        main1.start();
    }
}
