package com.annagzowska.SprigngDependencyInjection;

import com.annagzowska.springtutorial.api.Logger;
import com.annagzowska.springtutorial.api.UsersRepository;
import com.annagzowska.springtutorial.domain.User;
import com.annagzowska.springtutorial.implementation.LoggerImpl;
import com.annagzowska.springtutorial.implementation.UsersRepositoryImpl;

/**
 * Created by gzowska on 2017-03-06.
 */
public class Main {
    public static void main(String[] args) {
        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();
        usersRepository.setLogger(logger);

        User user = usersRepository.createUser("ania");
    }

}
