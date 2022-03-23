package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.Interface.Gadgets;
@Primary
@Service
public class Laptop_service implements Gadgets{

	@Override
	public String display() {
		// TODO Auto-generated method stub
		return "Laptop Screen is Large";
	}

}
