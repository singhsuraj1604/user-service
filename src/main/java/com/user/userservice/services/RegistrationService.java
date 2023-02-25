package com.user.userservice.services;

import com.user.userservice.dto.RegistrationDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RegistrationService {
    private static List<RegistrationDto> list=new ArrayList<>();
    static  {
        list.add(new RegistrationDto("Suraj","1283"));
        list.add(new RegistrationDto("Amit","26388"));
    }

    public List<RegistrationDto> getRegistrationDto()
    {
        return list;
    }

    public RegistrationDto addRegistration(RegistrationDto b)
    {
        list.add(b);
        return b;
    }

}
