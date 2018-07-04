# Spring Cloud  Eureka Zuul and Hystrix Example
Spring boot admin 2.0.1   +  Spring boot 2.0.1 Release + Spring cloud  
===============================

## Components
- `techprimers-admin` -  The spring boot admin 2.x.
- `techprimers-service` -The Eureka service which is the Service Registry
- `techprimers-server` - The Service which is going to give data to the Client.
- `techprimers-client` - The Service which is going to get data from Server via the Discovery Service from the Service Registry (`techprimers-service`).
- `techprimers-zuul` - The Service which is going to get data from Eureka Service  Discovery (`techprimers-client`).  



## Getting Started
 1. Start Spring cloud service (Eureka) ---- techprimers-service
 2. Start cloud server  ---techprimers-server
 3. Start Spring boot admin  ---techprimers-admin
 4. Start Spring eureka client  ---techprimers-client
 5. Start Zuul proxy  ---techprimers-zuul
## Reference Guide
[Version 2.0.1](http://codecentric.github.io/spring-boot-admin/2.0.1/)


![Screenshot application list](/picture/Java-microservices.jpg)
MicroServcie working princple 

## Screenshots 

 Project Strucure
![Screenshot application list](/picture/projectStructure.png)
 

![Screenshot application list](/picture/metric.png)
Spring boot admin 2.x 
 
 ![Screenshot application list](/picture/zuulproxy.png)
 zuul proxy
 

 ![Screenshot application list](/picture/eureka.png)
 eureka service 




