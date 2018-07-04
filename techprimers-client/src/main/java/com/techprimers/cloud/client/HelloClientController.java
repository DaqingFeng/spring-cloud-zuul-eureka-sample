package com.techprimers.cloud.client;

import com.techprimers.cloud.model.StudentResponse;
import com.techprimers.cloud.model.StudentRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Arrays;

@RestController
@RequestMapping("/helloClient")
class HelloClientController {

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    @Autowired
    HelloClientFeign helloClientFeign;

    @Autowired
    private LoadBalancerClient loadBalancer;

    @GetMapping(value = "/helloRestTemplate")
    public String helloRestTemplate() {
        String url = "http://HELLO-SERVER/helloServer";
        return restTemplate.getForObject(url, String.class);
    }

    @GetMapping(value = "/helloRestFeign")
    public String helloRestFeign() {
        return helloClientFeign.hello();
    }

    @GetMapping(value = "/helloLoadClient")
    public String helloLoadClient() {
        ServiceInstance serviceInstance = loadBalancer.choose("HELLO-SERVER");
        String baseUri = String.format("%s/helloServer", serviceInstance.getUri());
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUri)
                .queryParam("name", "balance");
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.TEXT_PLAIN));
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        ResponseEntity<String> response = restTemplate.exchange(builder.toUriString(), HttpMethod.GET, entity, String.class);
        return response.getBody();
    }

    @GetMapping(value = "/GetStudentInfo")
    public StudentResponse GetStudentInfo(StudentRequest req) {
        return helloClientFeign.GetStudentInfo(req.getName(), req.getJobTitle());
    }
}
