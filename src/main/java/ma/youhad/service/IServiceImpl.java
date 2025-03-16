package ma.youhad.service;


import ma.youhad.dao.IDao;

public class IServiceImpl implements IService {

    // loose coupling.
    private IDao dao ;

    public IServiceImpl(IDao dao) {
        this.dao = dao;
    }

    public IServiceImpl() {
    }

    @Override
    public double calculate() {
        return dao.getData() * 12;
    }


    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

