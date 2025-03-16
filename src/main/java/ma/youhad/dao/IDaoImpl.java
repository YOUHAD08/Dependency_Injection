package ma.youhad.dao;

public class IDaoImpl implements IDao {
    @Override
    public double getData() {
        System.out.println("DataBase version");
        return 23;
    }
}
