package greenswap.auction.repositories;

import greenswap.auction.entities.User;
import greenswap.auction.enums.Role;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;


    @BeforeEach
    void setUp() {
        // mocking data
        User user = new User(
                1,
                "Boba",
                "Fett",
                "Bobik",
                "boba@guild.com",
                "slave1",
                "picture",
                Role.USER,
                LocalDateTime.now(),
                null,
                null,
                null
        );

        underTest.save(user);
    }


    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }


    @Test
    void findByEmail() {
        //when
        User user = underTest.findByEmail("boba@guild.com");

        //then
        assertEquals(user.getUsername(), "Bobik");
    }


    @Test
    void findByUsername() {
        //when
        User user = underTest.findByUsername("Bobik");

        //then
        assertEquals(user.getFirstName(), "Boba");
    }

}