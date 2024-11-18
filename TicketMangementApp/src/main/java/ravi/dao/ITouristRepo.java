package ravi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ravi.model.Tourist;

public interface ITouristRepo extends JpaRepository<Tourist, Integer> {

}