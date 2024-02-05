package ca.josuelubaki.trackme.trackme.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Josue Lubaki
 * @version 1.0
 * @since 2024-02-05
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("hello")
    public ResponseEntity<Map<String, String>> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("username", "Josue_Lubaki");
        map.put("email", "josuelubaki@gmail.com");

        return ResponseEntity.of(Optional.of(map));
    }
}
