package metier;
// message personnelle::0637
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
// message personnelle::0637
@Component("metier")
public class MetierImpl implements IMetier {
// message personnelle::0637
    @Autowired
    @Qualifier("dao2")  // Spécifie quelle implémentation de IDao utiliser
    private IDao dao;
// message personnelle::0637
    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
// message personnelle::0637
    public void setDao(IDao dao) {
        this.dao = dao;
    }// message personnelle::0637
}// message personnelle::0637
