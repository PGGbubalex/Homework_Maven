package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String mainPage() {

        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String info() {

        return "Имя ученика: Игорь" + "Название проекта: HW_Spring" + "Дата создания проекта: 24.01.2023" + "Описание проекта: Тестовый проект для домашнего задания";
    }
}
