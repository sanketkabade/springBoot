package delarRegistraction;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DelarService {
	@Autowired
	public DelarRepo repo;
	
	public DelarRegistraction saveDelar(DelarRegistraction Dreg) {

		return repo.save(Dreg);
	}
	
	public DelarRegistraction updateDelar(DelarRegistraction Dreg) {

		return repo.save(Dreg);
	}
	
	public void deleteById(Integer id) {
		repo.deleteById(id);
	}

	public Optional<DelarRegistraction> getDelarById(Integer id) {
		return repo.findById(id);
	}

	public List<DelarRegistraction> getDelars() {
		return repo.findAll();
	}
	

}
