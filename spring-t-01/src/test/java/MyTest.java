import cn.getcharzp.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void TestNormal() {
        User user = new User();
        user.setName("name");
        user.setPassword("password");
        System.out.println(user);

        User user1 = new User("name1", "password1");
        System.out.println(user1);
    }

    @Test
    public void TestBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    @Test
    public void TestBean2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user2", User.class);
        System.out.println(user);
    }

    @Test
    public void TestBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user3", User.class);
        System.out.println(user);
    }

    @Test
    public void TestBean4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user4", User.class);
        System.out.println(user);
    }
}
