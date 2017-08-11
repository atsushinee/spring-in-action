
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.Knight;


public class Junit {
    @Test
    public void doIt(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("spring-config.xml");
        Knight knight = (Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
