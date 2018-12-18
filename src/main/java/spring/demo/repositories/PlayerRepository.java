package spring.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.demo.entities.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

    Player findById(int playerId);

}