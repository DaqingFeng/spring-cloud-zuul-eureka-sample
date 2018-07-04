# Spring Cloud  Eureka Zuul and Hystrix Example

## Components
- `techprimers-admin` -  The spring boot admin 2.x.
- `techprimers-service` -The Eureka service which is the Service Registry
- `techprimers-server` - The Service which is going to give data to the Client.
- `techprimers-client` - The Service which is going to get data from Server via the Discovery Service from the Service Registry (`techprimers-service`).
- `techprimers-zuul` - The Service which is going to get data from Eureka Service  Discovery (`techprimers-client`).  

#Reference tutorial spring boot admin 2.x  document  'http://codecentric.github.io/spring-boot-admin/2.0.1/


1  MicroServcie working princple 
<img src="https://github.com/DaqingFeng/spring-colud-zuul-eureka-sample/blob/master/picture/Java-microservices.jpg">




2  Project Strucure
<img  src="https://github.com/DaqingFeng/spring-colud-zuul-eureka-sample/blob/master/picture/projectStructure.png" />




3 Spring boot admin 2.x 
<img  src="https://raw.githubusercontent.com/DaqingFeng/spring-cloud-zuul-eureka-sample/master/picture/metric.png" >





 
 
4  zuul proxy
<img  src="https://raw.githubusercontent.com/DaqingFeng/spring-colud-zuul-eureka-sample/master/picture/zuulproxy.png" />





5  eureka service 
<img  src="https://raw.githubusercontent.com/DaqingFeng/spring-colud-zuul-eureka-sample/master/picture/eureka.png" />

