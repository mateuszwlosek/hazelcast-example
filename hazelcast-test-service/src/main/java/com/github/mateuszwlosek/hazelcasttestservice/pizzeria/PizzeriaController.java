package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("pizzeria")
public class PizzeriaController {

	private final PizzeriaService service;

	@GetMapping(value = "/{pizzeriaName}", produces = "application/json")
	public ResponseEntity<PizzeriaInfoDto> getPizzeriaDetailedInfo(@PathVariable final String pizzeriaName) {
		log.info("User asked for detailed data about pizzeria: {}", pizzeriaName);
		return ResponseEntity.ok(service.getPizzeriaDetailedInfo(pizzeriaName));
	}
}
