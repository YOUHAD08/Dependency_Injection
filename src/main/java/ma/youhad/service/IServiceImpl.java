package ma.youhad.service;

import ma.youhad.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Component("d2") this component is general component
// if we want specific component for specific packages Spring hase them
// for instance , Service Package we use

@Service("service")
public class IServiceImpl implements IService {

    // Injection happens here
    // @Autowired is used to initialise dao with setDao if we want to use constructor
    // we omit @Autowired, but spring advice to keep one constructor
    //@Autowired
    //@Qualifier("d2")
    // loose coupling.
    private IDao dao ;

    public IServiceImpl(@Qualifier("d2") IDao dao) {
        this.dao = dao;
    }

    //public IServiceImpl() {
    //}

    @Override
    public double calculate() {
        return dao.getData() * 12;
    }

    // setDao and constructor  allow us to inject in the attribute dao an objet of type IDao
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

