package com.ivoronline.springboot_autowired_profile.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("Profile1")
public class MyServiceImplementation1 implements MyServiceInterface {

  public String sayHello() {
    return "Hello";
  }

}


