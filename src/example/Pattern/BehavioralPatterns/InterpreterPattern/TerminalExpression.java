package example.Pattern.BehavioralPatterns.InterpreterPattern;


/**
 * 实现表达式接口
 */
public class TerminalExpression implements Expression {


    private String data;

    public TerminalExpression(String data) {
        this.data = data;

    }

    @Override
    public boolean interpret(String context) {

        return context.contains(data);
    }


}
