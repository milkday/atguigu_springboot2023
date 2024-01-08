package com.zzf.test;

import com.zzf.ioc_03.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Created by zuozhongfei on 2024/1/8
 * ioc容器创建和读取组件的测试类
 */
public class springIoTest {
    public void createIoC(){
        //创建容器,选择合适的容器,实现即可
        //1:直接创建容器,并且指定配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");

    }

    @Test
    public void getBeanFromIoC(){
        //1:创建ioc容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-03.xml");

        //2:读取IOC容器内的组件
        //2.1直接根据beanID读取,返回值类型是object,需要强转
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");
        //2.2:根据beanID,同时指定bean的类型Class
        HappyComponent happyComponent1 = applicationContext.getBean("happyComponent", HappyComponent.class);
        //2.3:直接根据类型获取(同一个类型在IOC容器中,只能有一个bean才行)
        //      如果一个容器中出现多个同类型的bean,会报错:NoUniqueBeanDefinitionException
        HappyComponent happyComponent2 = applicationContext.getBean(HappyComponent.class);

        System.out.println(happyComponent1 == happyComponent);
        System.out.println(happyComponent1 == happyComponent2);

    }

}
