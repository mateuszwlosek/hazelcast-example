package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class PizzeriaInfoDto implements Serializable {

	private final String name;
	private final String dateOfCreation;
	private final String headquarters;

	public static PizzeriaInfoDto fromEntity(final PizzeriaInfoEntity entity) {
		return builder()
			.name(entity.getName())
			.dateOfCreation(entity.getDateOfCreation())
			.headquarters(entity.getHeadquarters())
			.build();
	}
}
