package designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义有枝节点行为，用来存储子部件
 *
 * @author yangll
 */
public class Composite extends Component {
    private List<Component> children = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component component) {
        children.add(component);
    }

    @Override
    public void remove(Component component) {
        children.remove(component);
    }

    @Override
    public void display(int depth) {
        // 显示其枝节点名称，并对其下级进行遍历
        System.out.println(repeatableLayer(depth) + this.name);

        for (Component component : children) {
            component.display(depth + 2);
        }
    }

}
