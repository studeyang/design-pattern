# UML类图和类之间的关系

## 一、UML 类图

1. 类

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062250334.png)

类图分三层：

- 第一层显示类的名称，如果是抽象类，则就用斜体显示。
- 第二层是类的特性，通常就是字段和属性。
- 第三层是类的操作，通常是方法或行为。注意前面的符号，‘+’表示public，‘-’表示private，‘#’表示protected.

2. 接口类

矩形表示法，顶端有`<<interface>>`

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062255890.png)

第一行是接口名称。第二行是接口方法。

## 二、类之间的关系

### 继承类

继承关系用空心三角形 + 实线来表示。

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062258987.png)

### 实现接口类

实现接口用空心三角形 + 虚线来表示。

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062300409.png)

### 关联关系

关联关系用实际箭头来表示。

![image-20230506230226208](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062302264.png)

```java
public class Penguin extends Bird {
    private Climate climate;
}
```

看企鹅和气候两个类，企鹅是很特别的鸟，会游不会飞。更重要的是，它与气候有很大的关联。当一个类知道另一个类时，可以用关联（association）。

### 聚合关系

聚合关系用空心的菱形 + 实绩箭头来表示。

我们再来看大雁与雁群这两个类。

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062305023.png)

```java
public class WideGooseAggregate {
    private WideGoose[] arrayWideGoose;
}
```

### 组合关系

用实心的菱形 + 实心箭头来表示。

组合关系是一种强的拥有关系，体现了严格的部分和整体的关系，部分和整体的生命周期一样。

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062307472.png)

在这里鸟和其翅膀就是组合关系，因为它们是部分和整体的关系，并且翅膀和鸟的生命周期是相同的。

另外，你会注意到合成关系的连线两端还有一个数字‘1’和数字‘2’，这被称为基数。

表明这一端的类可以有几个实例，很显然，一个鸟应该有两只翅膀。

如果一个类可能有无数个实例，则就用‘n’来表示。

### 依赖关系

动物几大特征，比如有新陈代谢，能繁殖。而动物要有生命力，需要氧气、水以及食物等。

也就是说，动物依赖于氧气和水。它们之间是依赖关系（Dependency），用虚线箭头来表示。

![](https://technotes.oss-cn-shenzhen.aliyuncs.com/2023/202305062309323.png)

```java
public abstract class Animal {
    public Metabolism(Oxygen oxygen, Water water) {
    }
}
```

