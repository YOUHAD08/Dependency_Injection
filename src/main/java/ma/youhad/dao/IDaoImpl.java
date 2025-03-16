package ma.youhad.dao;

import org.springframework.stereotype.Repository;

//@Component("d") this component is general component
// if we want specific component for specific packages Spring hase them
// for instance , DAO Package we use Repository("d")
// if we didn't specify "d" the component take the same name as the class ,
// in this case -- > ma.youhad.dao.DaoImp

@Repository("d")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("DataBase version");
        return 23;
    }
}
