package com.project.makemytrip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.makemytrip.request.Passenger;
@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Integer>{

}
