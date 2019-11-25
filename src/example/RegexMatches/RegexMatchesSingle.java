package example.RegexMatches;

public class RegexMatchesSingle {


    private static class SingletonHolder {
        private static final RegexMatchesSingle INSTANCE = new RegexMatchesSingle();
    }


    private RegexMatchesSingle() {

    }

    public static final RegexMatchesSingle getInstance() {

        return SingletonHolder.INSTANCE;
    }


    public void findStr(String motherStr, String subStr) {
        // 按指定模式在字符串查找
        String line = "This order was placed for QT3000! OK?";
        String pattern = "(.*)(\\d+)(.*)";

    }


}
