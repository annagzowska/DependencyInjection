package com.annagzowska.SprigngDependencyInjection.api;
import com.annagzowska.SprigngDependencyInjection.domain.User;
/**
 * Created by gzowska on 2017-03-03.
 */
public interface UsersRepository {
    User createUser(String name);
    void setLogger (Logger logger);
}
