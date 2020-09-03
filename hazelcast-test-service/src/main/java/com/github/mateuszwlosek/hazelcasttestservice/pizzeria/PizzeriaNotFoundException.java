package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PizzeriaNotFoundException extends RuntimeException {

	private static final String MESSAGE = "Pizzeria with name: %s was not found";

	public PizzeriaNotFoundException(final String pizzeriaName) {
		super(String.format(MESSAGE, pizzeriaName));
	}
}
