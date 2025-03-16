package ma.youhad.service;


import ma.youhad.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("service")
public class IServiceImpl implements IService {

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


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

