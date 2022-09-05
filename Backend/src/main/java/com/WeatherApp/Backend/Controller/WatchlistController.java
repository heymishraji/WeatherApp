package com.WeatherApp.Backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/api")
public class WatchlistController {


	public class TutorialController {
	  @Autowired
	  WatchlistRepository WatchlistRepository;
	  @GetMapping("/watchlist")
	  public ResponseEntity<List<watchlist>> getAllTutorials(@RequestParam(required = false) String title) {
	    ...
	  }
	  @GetMapping("/tutorials/{id}")
	  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
	    ...
	  }
	  @PostMapping("/tutorials")
	  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
	    ...
	  }
	  @PutMapping("/tutorials/{id}")
	  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
	    ...
	  }
	  @DeleteMapping("/tutorials/{id}")
	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	    ...
	  }
	  @DeleteMapping("/tutorials")
	  public ResponseEntity<HttpStatus> deleteAllTutorials() {
	    ...
	  }
	  @GetMapping("/tutorials/published")
	  public ResponseEntity<List<Tutorial>> findByPublished() {
	    ...
	  }
	}
}
