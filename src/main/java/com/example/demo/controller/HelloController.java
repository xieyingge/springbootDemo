package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    private DiscoveryClient client;


    @RequestMapping(value = "/hello")
    public String index(){
        List<String> services = client.getServices();
        List<ServiceInstance> instances = client.getInstances("hello-service");
        ServiceInstance serviceInstance = instances.get(0);
        System.out.println("port: " + serviceInstance.getPort());
        System.out.println("serviceId: " + serviceInstance.getServiceId());
        System.out.println("instanceId: " + serviceInstance.getInstanceId());
        System.out.println("uri: " + serviceInstance.getUri());
        System.out.println("scheme: " + serviceInstance.getScheme());
        System.out.println("metaData: " + serviceInstance.getMetadata());
        return "Hello World";
    }

}
