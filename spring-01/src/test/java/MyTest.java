import cn.getcharzp.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void T() {
        User user = new User();
        user.setName("name1");
        user.setPassword("password1");
        System.out.println(user);

        User user1 = new User("name2", "password2");
        System.out.println(user1);
    }

    @Test
    public void T1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void T2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
    }

    @Test
    public void T3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user3 = context.getBean("user3", User.class);
        System.out.println(user3);
    }

    @Test
    public void T4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user4 = context.getBean("user4", User.class);
        System.out.println(user4);
    }
}
