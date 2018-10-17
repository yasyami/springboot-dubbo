import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.SayHelloService;

public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"META-INF/spring/consumer.xml"});
        context.start();
        SayHelloService demoService = (SayHelloService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
