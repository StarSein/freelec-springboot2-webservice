package com.starsein.book.springboot.web;

import com.starsein.book.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam("name") String name, // 1
                                     @RequestParam("amount") int amount) {
        return new HelloResponseDto(name, amount);
    }
}
/*
* 1) @RestController
*   - 컨트롤러 --변환--> JSON을 반환하는 컨트롤러
* 2) @GetMapping
*   - Get의 요청을 받을 수 있는 API를 만들어 준다
* 3) @RequestParam
*   - 외부에서 API로 넘긴 파라미터를 가져온다
* */
