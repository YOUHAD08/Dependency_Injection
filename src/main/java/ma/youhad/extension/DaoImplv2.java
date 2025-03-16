package ma.youhad.extension;

import ma.youhad.dao.IDao;
import org.springframework.stereotype.Repository;


@Repository("d2")
public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("sensors version");
        return 122;
    }
}
