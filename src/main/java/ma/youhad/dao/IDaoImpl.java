package ma.youhad.dao;

import org.springframework.stereotype.Repository;

@Repository("d")
public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("DataBase version");
        return 23;
    }
}
