package designpattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 * 构建表示该文法定义的语言中一个特定的句子的抽象语法树，调用解释操作
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class InterpreterClient {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();

        list.add(new TerminalExpression());
        list.add(new NonTerminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression expression : list) {
            expression.interpret(context);
        }

    }

}
