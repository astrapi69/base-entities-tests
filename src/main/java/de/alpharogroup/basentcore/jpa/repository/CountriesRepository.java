package de.alpharogroup.basentcore.jpa.repository;

import de.alpharogroup.basentcore.jpa.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Integer>
{
}