package com.github.stephanieferreiragw.citiesapi.states.repositories;

import com.github.stephanieferreiragw.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
