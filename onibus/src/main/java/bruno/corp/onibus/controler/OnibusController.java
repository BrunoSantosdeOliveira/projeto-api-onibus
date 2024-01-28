package bruno.corp.onibus.controler;

import bruno.corp.onibus.model.OnibusModel;
import bruno.corp.onibus.repository.Repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OnibusController {
@Autowired
private Repo repo;

@GetMapping("/rodoviario")
public List<OnibusModel> recuperarTudo(){
    return (List<OnibusModel>) repo.findAll();
}

}
