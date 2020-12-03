package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController implements ApplicationContextAware {

    private GreetingService greetingService;

    private ApplicationContext applicationContext;

    // @Autowired
    // public GreetingController(GreetingService greetingService) {
    //     this.greetingService = greetingService;
    // }

    @GetMapping("/greet")
    public String greet() {
        greetingService = applicationContext.getBean(GreetingService.class);
        return greetingService.sayHi();
    }

    public void setApplicationContext(ApplicationContext applicationContext) {
      this.applicationContext = applicationContext;
    }

}
