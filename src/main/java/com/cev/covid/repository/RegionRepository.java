package com.cev.covid.repository;

import com.cev.covid.domain.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long> {
	Optional<Region> findByName(String name);

}
