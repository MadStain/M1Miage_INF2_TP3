package DAOBean;



import java.util.List;

/**
 *
 * @author eddebbima
 */
public interface DAO<T> {
    
    public void create(T obj);
    
    public T findById(int id);
    
    public void update(T obj);
    
    public void delete(T obj);
    
    public List<T> findAll();
}
