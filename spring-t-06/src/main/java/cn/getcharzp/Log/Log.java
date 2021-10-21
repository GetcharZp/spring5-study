package cn.getcharzp.Log;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Log {
    @Before("execution(* cn.getcharzp.controller.ApiController.*(..))")
    public void beforeLog() {
        System.out.println("Before LOG");
    }

    @After("execution(* cn.getcharzp.controller.ApiController.*(..))")
    public void afterLog() {
        System.out.println("After LOG");
    }

    @Around("execution(* cn.getcharzp.controller.ApiController.*(..))")
    public void aroundLog(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around Before LOG");
        joinPoint.proceed();
        System.out.println("Around After LOG");
    }
}
