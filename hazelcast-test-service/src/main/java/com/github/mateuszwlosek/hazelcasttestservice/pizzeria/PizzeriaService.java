package com.github.mateuszwlosek.hazelcasttestservice.pizzeria;

import com.github.mateuszwlosek.hazelcasttestservice.config.HazelcastConfig;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CacheConfig(cacheNames = HazelcastConfig.CONFIGURATION_NAME)
public class PizzeriaService {

	private final PizzeriaInfoRepository repository;

	@Cacheable
	public PizzeriaInfoDto getPizzeriaDetailedInfo(final String pizzeriaName) {
		log.info("Fetching data of pizzeria: {} from database", pizzeriaName);
		return repository.findByNameIgnoreCase(pizzeriaName)
			.map(PizzeriaInfoDto::fromEntity)
			.orElseThrow(() -> new PizzeriaNotFoundException(pizzeriaName));
	}
}
