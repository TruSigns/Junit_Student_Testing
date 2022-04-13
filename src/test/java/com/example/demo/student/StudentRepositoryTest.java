package com.example.demo.student;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void ItShouldCheckExistsEmail() {
        //given
        String email = "Megaman@gmail.com";
        Student student = new Student("Maurice",
                email,
                Gender.MALE);

        underTest.save(student);

        //when
         boolean exists = underTest.selectExistsEmail(email);
        //then
        assertThat(exists).isTrue();
    }


    @Test
    void checkIfItDoesntExist() {
        //given
        String email = "Megaman@gmail.com";

        //when
        boolean exists = underTest.selectExistsEmail(email);




        //then
        assertThat(exists).isFalse();
    }
}