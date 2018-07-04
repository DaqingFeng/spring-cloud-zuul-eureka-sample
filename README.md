Spring boot 2.x + Spring cloud + Spring boot admin  2.x 
===============================

## Components
- `techprimers-admin` -  The spring boot admin 2.x.
- `techprimers-service` -The Eureka service which is the Service Registry
- `techprimers-server` - The Service which is going to give data to the Client.
- `techprimers-client` - The Service which is going to get data from Server via the Discovery Service from the Service Registry (`techprimers-service`).
- `techprimers-zuul` - The Service which is going to get data from Eureka Service  Discovery (`techprimers-client`).  


## Getting Started

- `spring-boot-admin Reference Guide `
[Version 2.0.1](http://codecentric.github.io/spring-boot-admin/2.0.1/)



*MicroServcie working princple*
![Screenshot application list](/picture/Java-microservices.jpg)


## Screenshots 


 *Project Strucure*
![Screenshot application list](/picture/projectStructure.png)
 
 
*Spring boot admin 2.x*
![Screenshot application list](/picture/metric.png)

 *zuul proxy*
 ![Screenshot application list](/picture/zuulproxy.png)

 
*eureka service*
 ![Screenshot application list](/picture/eureka.png)

 
## Run project 

-  Start Spring cloud service (Eureka) ---- techprimers-service
- Start cloud server  ---techprimers-server
- Start Spring boot admin  ---techprimers-admin
-  Start Spring eureka client  ---techprimers-client
-  Start Zuul proxy  ---techprimers-zuul
