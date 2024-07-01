package com.example.demo.SERVICES;

import com.example.demo.REPOS.PingRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.demo.ENTITIES.Ping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PingService {

    private final PingRepository pingRepository;



    public List<Ping> getPreviousPings(){
        return pingRepository.findAll();
    }







    @PostConstruct
    public void init(){
        System.out.println("PingService created");


        for (int i = 0; i < 10; i++) {
            Ping ping = new Ping();

            pingRepository.save(ping);
        }




    }


}
