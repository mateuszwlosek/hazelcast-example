package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PizzeriaInfoRepository extends MongoRepository<PizzeriaInfoEntity, String> {

	Optional<PizzeriaInfoEntity> findByNameIgnoreCase(String name);
}
