import static org.junit.Assert.*;

import autowire.CDPlayerConfig;
import autowire.CompactDisc;
import autowire.MediaPlayer;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * CDPlayerTest使用了Spring的SpringJUnit4ClassRunner
 * 以便在测试开始的时候自动创建spring的应用上下文
 * 注解@ContextConfiguration会告诉它需要在CDPlayerConfig中加载配置
 * 因为CDPlayer类中包含了@ComponentScan
 * 因此最终应用上下文中应该包含CompactDisc beam
 * <p>
 * 测试代码中有一个CompactDisc类型的属性
 * 并且这个属性带有@Autowired注解
 * 以便于将CompactDisc bean注入到测试代码之中
 * 最后会有一个简单的测试方法断言cd属性不为null
 * 如果不为null 则意味spring能够发现compactdisc类
 * 自动在spring上下文中将其创建为bean并将其注入到测试代码中
 */
//@ContextConfiguration("spring-autowire.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class AutowareTest {

    @Rule
    public final StandardOutputStreamLog log = new StandardOutputStreamLog();
    @Autowired
    private MediaPlayer player;
    @Autowired
    private CompactDisc cd;

    @Test
    public void CdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        assertEquals("Playing Sgt. Pepper",log.getLog());
    }
}
