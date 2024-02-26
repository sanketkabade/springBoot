package com.seed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AddControlar {
@GetMapping("/add")

public String add() {
	System.out.println(" form add methode");
	return "wellcom.jsp";
}
}
