package spring.mvc.root.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.mvc.root.entity.Name;
import spring.mvc.root.storage.EntityStorage;

import java.util.List;

@Service
public class NameService {

    private final EntityStorage entityStorage;

    @Autowired
    public NameService(EntityStorage entityStorage) {
        this.entityStorage = entityStorage;
    }

    public void save(String name) {
        entityStorage.getNames().add(new Name(entityStorage.getNames().size(), name));
    }

    public List<Name> getAllNames() {
        return entityStorage.getNames();
    }

    public Name getNameById(int id) {
       return entityStorage.getNames().get(id);
    }
}
