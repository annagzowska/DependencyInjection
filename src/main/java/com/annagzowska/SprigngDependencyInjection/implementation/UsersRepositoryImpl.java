package com.annagzowska.springtutorial.implementation;

import com.annagzowska.springtutorial.api.Logger;
import com.annagzowska.springtutorial.api.UsersRepository;
import com.annagzowska.springtutorial.domain.User;

/**
 * Created by gzowska on 2017-03-03.
 */
public class UsersRepositoryImpl implements UsersRepository {
        private Logger logger;

        public User createUser (String name) {
            logger.log("Tworzenie użytkownika " + name);
            return new User(name);
        }

        public void setLogger (Logger logger) {
            this.logger = logger;
        }
}
