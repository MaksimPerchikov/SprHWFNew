package ru.ibs.spring;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@EnableAspectJAutoProxy
@Aspect
@Service
public class AspException {
    @Pointcut("@annotation(ru.ibs.spring.AnnotFuelExceptionHandle)")
    public void callAtBusinessMethod(){}

    @AfterThrowing(value = "callAtBusinessMethod()")
    public String check() throws Throwable {

        return "error";
    }
}