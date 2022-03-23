package com.example.demo;
import org.springframework.stereotype.Service;

import com.example.Interface.Gadgets;
@Service
public class Mobile_service implements Gadgets {
	
	@Override
	public String display() {
	      return "Mobile - Screen is Small";
}
}
