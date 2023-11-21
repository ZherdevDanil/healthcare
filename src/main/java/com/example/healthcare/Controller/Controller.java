package com.example.healthcare.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

@RestController
public class Controller {

    @GetMapping("/healthcare")
    public Map<String, Object> healthcare(){
        Map<String,Object> response = new HashMap<>();
        response.put("date:", LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        response.put("status:",HttpStatus.OK.value());

        return response;
    }
}
