package spring.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.demo.entities.Player;
import spring.demo.services.PlayerService;


import java.util.List;


@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/player")
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @RequestMapping(value = "/details/{id}", method = RequestMethod.GET)
    public Player getPlayerById(@PathVariable("id") int id) {
        return playerService.findPlayerById(id);
    }

/*    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Player> getAllLectures() {
        return playerService.findAll();
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public int insertLecture(@RequestBody Player lecture) {
        return playerService.create(lecture);
    }

    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public int deleteLecture(@PathVariable("id") int id) {
        return playerService.delete(id);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public Player updateLecture(@RequestBody Player lecture, @PathVariable("id") int id) {
        return playerService.update(lecture, id);
    }
}*/
}