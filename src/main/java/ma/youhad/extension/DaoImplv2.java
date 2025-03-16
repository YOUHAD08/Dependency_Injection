package ma.youhad.extension;

import ma.youhad.dao.IDao;
import org.springframework.stereotype.Repository;

//@Component("d2") this component is general component
// if we want specific component for specific packages Spring hase them
// for instance , DAO Package we use

@Repository("d2")
public class DaoImplv2 implements IDao {
    @Override
    public double getData() {
        System.out.println("sensors version");
        return 122;
    }
}
