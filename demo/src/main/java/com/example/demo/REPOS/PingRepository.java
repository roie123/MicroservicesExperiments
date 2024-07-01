package com.example.demo.REPOS;

import com.example.demo.ENTITIES.Ping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PingRepository extends JpaRepository<Ping, Long> {





}
