package me.seguchi.santander_dev_week.repository;

import me.seguchi.santander_dev_week.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
