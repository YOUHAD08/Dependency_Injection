package ma.youhad.presentation;

import ma.youhad.extension.DaoImplv2;
import ma.youhad.service.IServiceImpl;

public class StaticInstantiation {
    public static void main(String[] args) {
        //Static initialisation
        //DaoImpl dao = new DaoImpl();
        DaoImplv2 dao = new DaoImplv2();
        // Injection via constructor
        IServiceImpl service = new IServiceImpl(dao);
        //service.setDao(dao); Injection via setter
        System.out.println("Result : " + service.calculate());
    }
}
