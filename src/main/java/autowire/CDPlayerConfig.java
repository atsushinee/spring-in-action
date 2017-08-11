package autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@ComponentScan能够在Spring中启用组件扫描，如果没有其他配置，默认会扫描与配置类相同的包以及这个包下的所有自爆
//查找带有@Component注解的类。这样就能发现CompactDisc 并且会在spring中自动为创建一个bean
@Configuration
@ComponentScan
public class CDPlayerConfig {
}
