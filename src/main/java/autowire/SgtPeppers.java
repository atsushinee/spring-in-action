package autowire;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

//注解表明该类会作为组件类，并告知Spring要为这个类创建bean
//组件扫描默认是不启用的，需要显示配置Spring,
// 命令其去寻找带有@Component注解的类，并为其创建bean
// spring会根据类名为其默认制定一个id
// 也就是将类名的第一个字母变为小写
// 两种为bean命令方式
// 1.@Component('your name')
// 2.@Named('your name')
@Component("lonelyHeartsClub")
public class SgtPeppers implements CompactDisc {

    private String title = "Sgt.Pepper's Lonely Heart Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + "by" + artist);
    }
}
