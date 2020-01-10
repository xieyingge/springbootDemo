package com.example.demo.controller;


import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

//@RestController
public class HelloController {

//    @Autowired
//    private DiscoveryClient client;
//
//
//    @RequestMapping(value = "/hello")
//    public String index() throws InterruptedException {
//        List<String> services = client.getServices();
//        List<ServiceInstance> instances = client.getInstances("hello-service");
//        ServiceInstance serviceInstance = instances.get(0);
//        System.out.println("port: " + serviceInstance.getPort());
//        System.out.println("serviceId: " + serviceInstance.getServiceId());
//        System.out.println("instanceId: " + serviceInstance.getInstanceId());
//        System.out.println("uri: " + serviceInstance.getUri());
//        System.out.println("scheme: " + serviceInstance.getScheme());
//        System.out.println("metaData: " + serviceInstance.getMetadata());
////        int sleep_time = new Random().nextInt(3000);
////        System.out.println("sleep time : " + sleep_time);
////        Thread.sleep(sleep_time);
//        return "Hello World";
//    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello(@RequestParam String name) {
        return "hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        return new User(1L, name, age, "email");
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello(@RequestBody User user) {
        return "hello ," + user.getName() + ", " + user.getAge();
    }

}
