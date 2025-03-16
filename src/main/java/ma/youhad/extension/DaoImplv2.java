package ma.youhad.extension;

import ma.youhad.dao.IDao;

public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("sensors version");
        return 122;
    }
}
