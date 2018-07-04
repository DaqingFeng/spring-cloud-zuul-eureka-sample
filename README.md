# Spring Cloud  Eureka Zuul and Hystrix Example
SBA 2.0.1   +  SB 2.0.1 + Spring cloud  
===============================

## Components
- `techprimers-admin` -  The spring boot admin 2.x.
- `techprimers-service` -The Eureka service which is the Service Registry
- `techprimers-server` - The Service which is going to give data to the Client.
- `techprimers-client` - The Service which is going to get data from Server via the Discovery Service from the Service Registry (`techprimers-service`).
- `techprimers-zuul` - The Service which is going to get data from Eureka Service  Discovery (`techprimers-client`).  


## Getting Started

- `Reference Guide `
[Version 2.0.1](http://codecentric.github.io/spring-boot-admin/2.0.1/)


MicroServcie working princple 
![Screenshot application list](/picture/Java-microservices.jpg)


## Screenshots 

 Project Strucure
![Screenshot application list](/picture/projectStructure.png)
 
 
Spring boot admin 2.x 
![Screenshot application list](/picture/metric.png)

  zuul proxy
 ![Screenshot application list](/picture/zuulproxy.png)

 
 eureka service 
 ![Screenshot application list](/picture/eureka.png)


 
## Run project 
 1. Start Spring cloud service (Eureka) ---- techprimers-service
 2. Start cloud server  ---techprimers-server
 3. Start Spring boot admin  ---techprimers-admin
 4. Start Spring eureka client  ---techprimers-client
 5. Start Zuul proxy  ---techprimers-zuul
