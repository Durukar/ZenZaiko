package com.ZenZaiko.ZenZaiko.services;

import com.ZenZaiko.ZenZaiko.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;


}
