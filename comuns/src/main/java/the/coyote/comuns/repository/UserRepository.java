package the.coyote.comuns.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import the.coyote.comuns.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByNome(String nome);
}
