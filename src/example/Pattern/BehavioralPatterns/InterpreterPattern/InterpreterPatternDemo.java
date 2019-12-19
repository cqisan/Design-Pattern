package example.Pattern.BehavioralPatterns.InterpreterPattern;

public enum InterpreterPatternDemo {

    Instance;

    private InterpreterPatternDemo() {
    }

    public Expression getMaleExpression() {
//规则：Robert 和 John 是男性
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");

        return new OrExpression(robert, john);

    }


    //规则：Julie 是一个已婚的女性
    public Expression getMarriedWomanExpression() {

        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);

    }


    public void say() {

        Expression isMale = getMaleExpression();
        Expression isMarriesWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a  married woman? " + isMarriesWoman.interpret("Married Julie"));


    }


}
