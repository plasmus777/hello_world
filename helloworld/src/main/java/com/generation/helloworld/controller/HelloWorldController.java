package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}

	@GetMapping("/bsms")
	public String[] mostraBSMs() {
		return new String[]{"Persistência",
			"Mentalidade de Crescimento",
			"Responsabilidade Pessoal",
			"Orientação ao Futuro",
			"Orientação ao Detalhe",
			"Trabalho em Equipe",
			"Comunicação",
			"Proatividade"};
	}

	@GetMapping("/objetivos")
	public String[] listaObjetivos() {
		return new String[] {"Entender como trabalhar com banco de dados",
				"Desenvolver parte do projeto integrador",
				"Aprender a trabalhar com SpringBoot",
				"Conseguir manter as tarefas em dia"};
	}
}