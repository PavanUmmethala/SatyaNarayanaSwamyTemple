package com.satyanarayanaswamytemple;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pooja")

public class PoojaController {
	@Autowired
	private PoojaRepository poojaRepository;
	
	@PostMapping(value = { "/save", "/{id}" })
	public ResponseEntity<?>  saveAndUpdatePooja(@RequestBody Pooja pooja,@PathVariable Optional<Long> id) {
		if (id.isPresent()) {
			Pooja poojaNew = new Pooja();
			poojaNew.setId(id.get());
			poojaNew.setKathalu(pooja.getKathalu());
			poojaNew.setPadhatulu(pooja.getPadhatulu());
			poojaNew.setPoojaDravyalu(pooja.getPoojaDravyalu());
			poojaNew.setPoojaName(pooja.getPoojaName());
			poojaNew.setPoojaVidhanam(pooja.getPoojaVidhanam());
			poojaNew.setSamayamu(pooja.getSamayamu());
			poojaNew.setVidhiVidhanalu(pooja.getVidhiVidhanalu());
			return new ResponseEntity<>(poojaRepository.save(poojaNew), HttpStatus.OK);		
		}else {
			 return new ResponseEntity<>(poojaRepository.save(pooja), HttpStatus.OK);	
		}					
	}
	@GetMapping("/getBy/{poojaName}")
	public ResponseEntity<?> getPoojaByPoojaName(@PathVariable("poojaName") String poojaName) {
		
		return new ResponseEntity<>(poojaRepository.findByName(poojaName), HttpStatus.OK);	
	}
	
	@GetMapping("/getBy/{id}")
	public ResponseEntity<?> getPoojaById(@PathVariable("id") Long id) {
		
		return new ResponseEntity<>(poojaRepository.findById(id), HttpStatus.OK);	
	}
	
	@DeleteMapping("/deleteBy/{id}")
	public ResponseEntity<?> deletePoojaById(@PathVariable("id") Long id) {
		poojaRepository.deleteById(id);
		Map<String,String> m = new HashMap<>();
		m.put("pooja", "Deleted");
		return new ResponseEntity<>(m, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteBy/{poojaName}")
	public ResponseEntity<?> deletePoojaByPoojaName(@PathVariable("poojaName") String poojaName) {
		poojaRepository.deleteByPoojaName(poojaName);
		Map<String,String> m = new HashMap<>();
		m.put("pooja", "Deleted");
		return new ResponseEntity<>(m, HttpStatus.OK);
	}
}
