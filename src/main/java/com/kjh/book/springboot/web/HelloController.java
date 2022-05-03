<<<<<<< HEAD
package com.kjh.book.springboot.web;

import com.kjh.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name,
                                             @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}


=======
package com.kjh.book.springboot.web;

import com.kjh.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam("name") String name,
                                             @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}


>>>>>>> d4eae721eb68c6a6a619f05706b2ef09452c4f80
