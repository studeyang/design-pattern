package designpattern.behavioral.template;

/**
 * 模板方法客户端
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class TemplateClient {
    public static void main(String[] args) {
        AbstractTemplate abstractTemplate;

        abstractTemplate = new ConcreteClassA();
        abstractTemplate.templateMethod();

        abstractTemplate = new ConcreteClassB();
        abstractTemplate.templateMethod();

    }
}
