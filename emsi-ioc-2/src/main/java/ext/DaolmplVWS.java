package ext;

import dao.IDao;

public class DaolmplVWS implements IDao {
    @Override
    public double geData() {
        System.out.println("version web service");
        return 90;
    }
}
