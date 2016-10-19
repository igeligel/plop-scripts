package {{packageName}};

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class {{className}}Service {
  @PersistenceContext
  protected EntityManager entityManager;

  public {{className}}Service() {
  }

  public void persist({{className}} {{camelCase className}}) {
    entityManager.persist({{camelCase className}});
  }

  public {{className}} findById(int id) {
    return entityManager.find({{className}}.class, id);
  }

  @SuppressWarnings("unchecked")
  public List<{{className}}> findAll() {
    String sqlQuery = "SELECT e FROM {{className}} e";
    List<{{className}}> allEntities = entityManager.createQuery(sqlQuery).getResultList();
    return allEntities;
  }

  public {{className}} delete(int id) {
    {{className}} entityToBeRemoved = findById(id);
    entityManager.remove(entityToBeRemoved);
    return entityToBeRemoved;
  }
}
