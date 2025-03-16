package ma.youhad.presentation;

import ma.youhad.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        // getBEAN with id
        //IService service = (IService) springContext.getBean("service");
        // here if we have two implementation of IService we will get an exception
        IService service = springContext.getBean(IService.class);
        System.out.println("Result : " + service.calculate());
    }
}
