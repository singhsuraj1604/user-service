package com.user.userservice.controller;

import com.user.userservice.dto.RegistrationDto;
import com.user.userservice.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService registrationService;

    public RegistrationController(RegistrationService registrationService) {
        this.registrationService=registrationService;
    }
    @GetMapping("/registration")
    public List<RegistrationDto> getRegistrations(){
        return this.registrationService.getRegistrationDto();
    }
    @PostMapping("/registration")
    public RegistrationDto addRegistrations(@RequestBody RegistrationDto registration)
    {
        RegistrationDto b = this.registrationService.addRegistration(registration);
        return b;
    }

}
