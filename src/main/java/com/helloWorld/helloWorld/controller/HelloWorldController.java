package com.helloWorld.helloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloWorld() {
		return "Hello World";
	}

	@GetMapping("/bsm")
	public List<String> bsmList() {
		return List.of("Comunicação", "Orientação ao futuro", "Trabalho em equipe", "Proatividade",
				"Atenção aos detalhes", "Comprometimento");

	}

	@GetMapping("/objetivos")
	public List<String> objetivosAprendizagem() {
		return List.of("Estudar mais sobre Spring Boot", "Praticar a criação de APIs REST", "Revisar conceitos de Java",
				"Resolver desafios de programação");
	}

}
