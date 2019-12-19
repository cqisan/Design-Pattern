package example.Pattern.BehavioralPatterns.InterpreterPattern;

/**
 * 表达式接口
 */
public interface Expression {

    public boolean interpret(String context);
}
