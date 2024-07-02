package com.example.user_service.ENTITY;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter@Setter@NoArgsConstructor@AllArgsConstructor@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;





    private String firstName;
    private String lastName;
    private String email;


    private Long departmentId;




    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
