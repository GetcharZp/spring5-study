import cn.getcharzp.controller.ApiController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApiController apiController = context.getBean("apiController", ApiController.class);
        apiController.add();
    }
}
