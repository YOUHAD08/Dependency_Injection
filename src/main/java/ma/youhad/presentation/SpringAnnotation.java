package ma.youhad.presentation;

import ma.youhad.service.IService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAnnotation {
    public static void main(String[] args) {
        // search for the components inside classes in this package
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.youhad");
        IService service =  applicationContext.getBean(IService.class);
        System.out.println(service.calculate());

    }
}