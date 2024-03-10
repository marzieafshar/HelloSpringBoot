package com.example.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calc")
public class CalculationController {

    @GetMapping("/sum/{firstOperand}/{secondOperand}")
    public static String Add(@PathVariable int firstOperand, @PathVariable int secondOperand) {
        return firstOperand + " + " + secondOperand + " = " + (firstOperand + secondOperand);
    }

    @GetMapping("/subtract/{firstOperand}/{secondOperand}")
    public static String Sub(@PathVariable int firstOperand, @PathVariable int secondOperand) {
        return firstOperand + " - " + secondOperand + " = " + (firstOperand - secondOperand);
    }

    @GetMapping("/mult/{firstOperand}/{secondOperand}")
    public static String Mul(@PathVariable int firstOperand, @PathVariable int secondOperand) {
        return firstOperand + " * " + secondOperand + " = " + (firstOperand * secondOperand);
    }

    @GetMapping("/div/{firstOperand}/{secondOperand}")
    public static String Div(@PathVariable int firstOperand, @PathVariable int secondOperand) {
        return firstOperand + " / " + secondOperand + " = " + (firstOperand / secondOperand);
    }
}