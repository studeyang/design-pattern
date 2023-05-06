package designpattern.behavioral.command;

/**
 * 要求该命令执行这个请求
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class Invoker {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
