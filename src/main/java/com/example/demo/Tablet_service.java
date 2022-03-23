package com.example.demo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.Interface.Gadgets;

@Service
//@Primary ----- Autowired by @Primary
public class Tablet_service implements Gadgets {
	@Override
    public String display() {
		return "Tablet Screen size is Medium";
		
		
		
	}
	
}
