package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Builder
@Document("pizzeriaInfo")
public class PizzeriaInfoEntity implements Serializable {

	@Id
	private String id;

	private String name;
	private String dateOfCreation;
	private String headquarters;
}
