package ma.youhad.presentation;

import ma.youhad.dao.IDao;
import ma.youhad.service.IService;
import java.io.File;
import java.util.Scanner;

public class DynamicInstantiation {
    //Dynamic initialisation
    public static void main(String[] args) throws Exception {
        // Exception Refers to FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException
        Scanner sc = new Scanner(new File("config.txt"));
        // Read the first line
        String daoClassName = sc.nextLine();
        System.out.println(daoClassName);
        //instantiation dynamic
        // this line upload the class of name daoClassName as an object of type Class
        Class cDAO = Class.forName(daoClassName);
        // to create an instance "Object" we use
        // Constructor without parameters
        // casting
        IDao dao = (IDao) cDAO.newInstance();
        System.out.println(dao.getData());

        String serviceClassName = sc.nextLine();
        System.out.println(serviceClassName);
        Class cService = Class.forName(serviceClassName);
        // Constructor with parameters
        IService service = (IService) cService.getConstructor(IDao.class).newInstance(dao);
        // Constructor without  parameters and using set method to do the injection
        // IService service = (IService) cService.newInstance();
        //Method setDaoMethod = cService.getMethod("setDao", IDao.class);
        //setDaoMethod.invoke(service, dao);
        System.out.println("Result : "+ service.calculate() );

    }
}
