package de.alpharogroup.basentcore.jpa.repository;

import de.alpharogroup.basentcore.jpa.entity.Surnames;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurnamesRepository extends JpaRepository<Surnames, Integer>
{
}