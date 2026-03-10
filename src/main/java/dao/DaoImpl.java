package dao;
// message personnelle::0637
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
// message personnelle::0637
@Component("dao")
@Profile("prod")  // Ce bean sera actif uniquement avec le profil "prod"
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("Version de production");// message personnelle::0637
        return 100.0;
    }
}
