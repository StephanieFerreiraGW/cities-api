package com.github.stephanieferreiragw.citiesapi.countries.repositories;

import com.github.stephanieferreiragw.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
