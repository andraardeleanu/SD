package spring.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import spring.demo.entities.Player;
import spring.demo.errorhandler.ResourceNotFoundException;
import spring.demo.repositories.PlayerRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository lectureRepository;

    public Player findPlayerById(int playerId) {
        Player player = lectureRepository.findById(playerId);
        System.out.println(player.toString());
        if (player == null) {
            throw new ResourceNotFoundException(Player.class.getSimpleName());
        }

        return player;
    }
}
