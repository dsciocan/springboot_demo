package com.northcoders.demospringbootapp.controller;

import com.northcoders.demospringbootapp.model.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
public class DemoController {

//    @GetMapping("/hello")
//    public String getHello() {
//        return "Hello there!";
//    }
//
//    @GetMapping("/person")
//    public List<Person> getPerson() {
//        List<Person> personList = new ArrayList<>();
//        personList.add(new Person("John", 30, "john@gmail.com", "London", "Fish and chips"));
//        personList.add(new Person("James", 40, "james@gmail.com", "London", "Fish and chips"));
//
//        return personList;
//    }
//}
//    @GetMapping("/london")
//    public ResponseEntity<Data> getCoordinates(@RequestBody Data data) {
//        Coordinates coordinates = new Coordinates("https://geocoding-api.open-meteo.com/v1/search?name=London&count=1&language=en&format=json");
//        Data newData = coordinates.getData().block();
//        return new ResponseEntity<>(newData, HttpStatus.CREATED);
//    }

    @GetMapping("/london")
    public ResponseEntity<Data> getCoordinates() {
        Coordinates coordinates = new Coordinates("https://geocoding-api.open-meteo.com/v1/search?name=London&count=1&language=en&format=json");
        return new ResponseEntity<>(coordinates.getData(), HttpStatus.CREATED);
    }
}