package spring.mvc.root.storage;

import org.springframework.stereotype.Service;
import spring.mvc.root.entity.Name;

import java.util.ArrayList;
import java.util.List;

@Service
public class EntityStorage {

    private List<Name> names = new ArrayList<>();

    public List<Name> getNames() {
        return names;
    }
}
