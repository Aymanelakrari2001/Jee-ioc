package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double geData() {
        System.out.println("version Capteurs");
        double temp =1000;
        return temp;
    }
}
