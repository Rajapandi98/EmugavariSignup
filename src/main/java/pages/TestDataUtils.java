package pages;

public class TestDataUtils {
    public static String getRandomEmail() {
        return "user" + System.currentTimeMillis() + "@example.com";
    }

    public static String getRandomMobile() {
        return "98" + (int)(Math.random() * 100000000);
    }
}
