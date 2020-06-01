package designpattern.behavioral.template;

/**
 * 模板方法客户端
 *
 * @author yangll
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
