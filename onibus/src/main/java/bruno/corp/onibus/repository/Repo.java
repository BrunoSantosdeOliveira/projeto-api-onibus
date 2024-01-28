package bruno.corp.onibus.repository;

import bruno.corp.onibus.model.OnibusModel;
import org.springframework.data.repository.CrudRepository;

public interface Repo  extends CrudRepository<OnibusModel,Integer> {

}
