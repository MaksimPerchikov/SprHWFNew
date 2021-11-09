package ru.ibs.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import javax.annotation.PostConstruct;

@EnableAspectJAutoProxy
@Aspect
@Service
public class AspException {
    @Pointcut("@annotation(ru.ibs.spring.AnnotFuelExceptionHandle)")
    public void callAtBusinessMethod(){}

    @Around(value = "callAtBusinessMethod()")
    public Object check(ProceedingJoinPoint pjp) throws Throwable {
        try{
           return pjp.proceed();
        }catch (Exception e){
            return "error";
        }

    }
}