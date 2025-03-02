package ma.projet.dao;

public interface IDao {
import java.util.List;

public interface IDao<T> {
    boolean create(T obj);
    boolean delete(T obj);
    boolean update(T obj);
    T getById(int id);
    List<T> getAll();
}
}
