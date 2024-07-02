package com.docteurqui.Who.DoctorController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @GetMapping("/doctor/1")
    public String doctor1() {
        return "William Hartnell";
    }

    @GetMapping("/doctor/10")
    public String doctor10() {
        return "David Tennant";
    }

    @GetMapping("/doctor/13")
    public String doctor13() {
        return "Jodie Whittaker";
    }
}
