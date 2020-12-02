# problem1
*@Component 已经可以支持声明一个 bean 了，为何还要再弄个 @Bean 出来？*

Ans：

@Component（以及@Service和@Repository）用于使用classpath扫描自动检测和自动配置Bean。带注解的类和bean之间有一个隐式的一对一映射（即每个
类有一个bean）。使用这种方法对装载的控制是相当有限的，因为它是纯声明式的。

@Bean用来显式声明一个bean，而不是像上面那样让Spring自动声明。它将bean的声明从类定义中解耦出来，让你可以完全按照自己的选择来创建和配置bean，
也方便对第三方库（因为无法对第三方代码添加component）。
