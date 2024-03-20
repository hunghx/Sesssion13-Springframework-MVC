package ra.session13springmvc.service;

import org.springframework.stereotype.Service;
import ra.session13springmvc.model.entity.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class DaoService {
    private List<Dao> daoList =  new ArrayList<>();
    public List<Dao> getAll(){
        return daoList;
    }
    public void save(Dao dao){
        if (findById(dao.getId())==null){
            daoList.add(dao);
        }else {
            daoList.set(daoList.indexOf(findById(dao.getId())),dao);
        }
    }

    public Dao findById(Integer id){
        for (Dao d : daoList){
            if (Objects.equals(d.getId(), id))
                return d;
        }
        return null;
    }
    public  void delete(Integer id){
        daoList.remove(findById(id));
    }
}
