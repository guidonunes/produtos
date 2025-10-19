package br.com.fiap.produtos.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorldController {
    @GetMapping
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/fiap")
    public String fiap() {
        return "Hello galera da Fiap!";
    }
}
