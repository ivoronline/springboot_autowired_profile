package com.ivoronline.springboot_autowired_profile.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"Profile2","Profile3"})
public class MyServiceImplementation2 implements MyServiceInterface {

  public String sayHello() {
    return "Hello World";
  }

}
