package fr.spring.quest01.doctor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {

    @GetMapping("/doctor/1")
    @ResponseBody
    public String firstDoctor() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String tenDoctor() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String thirteenDoctor(){
        return "Jodie Whittaker";
    }


}