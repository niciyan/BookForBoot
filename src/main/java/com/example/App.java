package com.example;

import com.example.playData.Post;
import com.example.playData.PostRepository;
import com.example.playData.User;
import com.example.playData.UserReository;
import com.example.trybook.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(App.class);

    @Autowired
    ArgumentResolver argumentResolver;

    @Autowired
    Calculator calculator;

    @Autowired
    private UserReository userReository;

    @Autowired
    private PostRepository postRepository;

    public static void main(String[] args) {
        SpringApplication.run(App.class);

    }

    User user1 = new User("Ok");
    User user2 = new User("StartUser");
    User user3 = new User("Sample User");
    User fakeUser = new User("fake");

    Post post = new Post("body", user1);
    Post post1 = new Post("sss", user2);
    Post inValidPost = new Post("dummy");

    Date now = new Date(-1L);

    @Override
    public void run(String... args) throws Exception {
        List<User> users = Arrays.asList(
            user1,user2,user3
        );
//        log.info(user1.toString());
        userReository.save(new User("西山"));
        userReository.save(new User("すずき"));
        userReository.save(new User("GEORGE"));
        userReository.save(users);

        userReository.findByName("fake");

        postRepository.save(post);
        postRepository.save(post1);
//        postRepository.save(inValidPost);
        for (User user : userReository.findAll()) {
            log.info(user.toString());
        }

        for (Post post : userReository.findOne(1L).getPosts()) {
            log.info(post.toString());
        }

        for (Post post : postRepository.findAll()) {
            log.info(post.toString());
        }

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        log.info(df.format(now));

    }

    public void runCalcApp() {
        System.out.println("Enter 2 numbers like 'a b' : ");
        Argument argument = argumentResolver.resolve(System.in);
        int result = calculator.calc(argument.getA(), argument.getB());
        System.out.println("result = " + result);
    }
}
