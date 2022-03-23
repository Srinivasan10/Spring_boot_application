package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Interface.Gadgets;
@RequestMapping("/gadgets")
@RestController

public class Controller {
//	@Qualifier("mobile_service")            ----- Autowired Using @Qualifier annotation
	
	
	private Gadgets g;
	
/*                                         ----------- Autowired Using Constructor Injection
	@Autowired
	public Controller(@Qualifier("tablet_service") Gadgets g) {
	this.g = g;
}

*/

	/*                                     ---------------Autowired Using setter Injection
	
    @Autowired
	public void setG(@Qualifier("laptop_service")Gadgets g) {
		this.g = g;
	}

*/                                     
	
	@GetMapping
	public String fetchdisplay() {
	return g.display();
	}
}
