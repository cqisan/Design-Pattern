package example.Pattern.BehavioralPatterns.IteratorPattern;

public class IteratorPatternDemo {


    private static class IteratorHolder {
        private static final IteratorPatternDemo instance = new IteratorPatternDemo();

    }

    private IteratorPatternDemo() {
    }

    public static IteratorPatternDemo getInstance() {

        return IteratorHolder.instance;

    }

    public void show() {

        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {

            String name = (String) iter.next();
            System.out.println("Name : " + name);

        }

    }
}
