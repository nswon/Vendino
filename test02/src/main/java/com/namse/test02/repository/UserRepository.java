package com.namse.test02.repository;

import com.namse.test02.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Query(value = "SELECT * FROM USER WHERE id like %:id% AND pw like %:pw%",nativeQuery = true)
    Optional<User> login(@Param("id")String id,@Param("pw")String pw);

    @Query(value = "SELECT * FROM USER WHERE name like %:name%",nativeQuery = true)
    Optional<User> searchUser(@Param("name")String name);

}
