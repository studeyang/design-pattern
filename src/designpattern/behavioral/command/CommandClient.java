package designpattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个具体命令对象并设定它的接收者
 *
 * @author yangll
 */
public class CommandClient {

    public static void main(String[] args) {
        List<Reciever> recievers = new ArrayList<>();

        recievers.add(new RecieverA());
        recievers.add(new RecieverB());
        recievers.add(new RecieverC());

        Command command = new ConcreteCommand(recievers);
        Invoker invoker = new Invoker();

        invoker.setCommand(command);
        invoker.executeCommand();

    }

}
