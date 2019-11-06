package com.example.demo.entity.ifelse;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class SpringBeanInitDestroyMethodTest implements InitializingBean {

    public SpringBeanInitDestroyMethodTest() {
        System.out.println("SpringBeanInitDestroyMethodTest 构造方法执行...");
    }

    /**
     * @PostConstruct
     * 是在对象构造完成后调用init-method之前执行的,你在xml中default-lazy-init="true"申明了延迟初始化,意味着容器刚启动,
     * 如果这个bean没有被调用,是不会初始化的,自然也就不会调用@PostConstruct的方法
     *
     * 在Bean初始化之后（构造方法和@Autowired之后）执行指定操作。经常用在将构造方法中的动作延迟。
     * Bean初始化时候的执行顺序： 构造方法 -> @Autowired -> @PostConstruct
     */
    @PostConstruct
    public void postConstrust(){
        System.out.println("@PostConstruct 注解方法执行...");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("@PreDestroy 注解方法执行...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean 的 afterPropertiesSet 方法执行...");
    }
}
