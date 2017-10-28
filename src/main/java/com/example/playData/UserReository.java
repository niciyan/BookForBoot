package com.example.playData;

import com.example.playData.User;
import org.springframework.data.repository.CrudRepository;

public interface UserReository extends CrudRepository<User, Long> {

    User findByName(String name);
}
