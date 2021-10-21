import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnoLog {
    @Before("execution(* service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("-- Annotation Before --");
    }

    @After("execution(* service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("-- Annotation After --");
    }

    @Around("execution(* service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("== Annotation Around Before ==");
        joinPoint.proceed(); // 用来分割执行前后的方法
        System.out.println("== Annotation Around After ==");

        // 通过getSignature可以获取当前执行的函数
        System.out.println(joinPoint.getSignature()); // 签名
    }
}
