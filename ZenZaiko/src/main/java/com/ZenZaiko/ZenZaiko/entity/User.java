package com.ZenZaiko.ZenZaiko.entity;
//#region User Imports
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
//#endregion

@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    //#region User Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    private String name;

    private String email;

    private String username;

    @Column(name = "created_at", nullable = true)
    private LocalDateTime createdAt;

    //#endregion

    //#region User Methods

    @PrePersist
    public void prePersist() {
        this.createdAt = LocalDateTime.now();
    }
    //#endregion User Methods
}
