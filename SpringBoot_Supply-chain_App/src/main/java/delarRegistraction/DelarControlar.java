package delarRegistraction;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DelarControlar {
	
	@Autowired
	DelarService deservice;
	
	@PostMapping("/addDelar")
	public DelarRegistraction saveEmployee(@RequestBody DelarRegistraction DelRegister) {
		return deservice.saveDelar(DelRegister);
	}

	@PutMapping("/updateDelar")
	public DelarRegistraction UpdateEmployee(@RequestBody DelarRegistraction DelRegister) {
		return deservice.saveDelar(DelRegister);
	}
	
	@DeleteMapping("/deleteDelar/{id}")

	public void deleteDelarById(@PathVariable Integer id) {
		deservice.deleteById(id);
	}

	@GetMapping("/selectById/{id}")
	public Optional<DelarRegistraction> getDelarById(@PathVariable Integer prodId) {
		return deservice.getDelarById(prodId);
	}

	@GetMapping("/allDelar")
	public List<DelarRegistraction> getDelar() {
		return deservice.getDelars();
	
	}
	

}
