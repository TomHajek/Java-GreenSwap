package greenswap.auction.repositories;

import greenswap.auction.entities.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class CategoryRepositoryTest {

    @Autowired
    private CategoryRepository underTest;


    @BeforeEach
    void setUp() {
        // mocking data
        Category category = new Category(
                1,
                "Plants",
                "house plants",
                "image",
                null
        );

        underTest.save(category);
    }


    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }


    @Test
    void findByCategoryName() {
        //when
        Category category = underTest.findByCategoryName("Plants");

        //then
        assertEquals(category.getCategoryName(), "Plants");
    }

}