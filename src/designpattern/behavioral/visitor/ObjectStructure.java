package designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 提供一个高层的接口以允许访问者访问它的元素
 *
 * @author <a href="https://github.com/studeyang">studeyang</a>
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
