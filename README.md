# Hazelcast - Example

Example of [Hazelcast](https://hazelcast.com/) usage (distributed caching) with database, gateway service and discovery service.

Services were developed in [Spring Boot](https://projects.spring.io/spring-boot/).  
Zuul filter was used as a gateway, and Eureka was used as discovery service.  
Cloud config server stores configuration for services.  
Used [Docker](https://www.docker.com/) to containerize environment.  
[MongoDB](https://www.mongodb.com/) was used to store some example data for further caching.

## Diagram
![Hazelcast](https://user-images.githubusercontent.com/15820051/82255003-7c7cb080-9919-11ea-8fc7-18dc04a44314.png)

## Hazelcast
* There are some logs inserted to easly see if cached object was used or not
* By using port 0, discovery service and gateway service it is possible to run multple instances of that test service with distributed caching

## Gateway and service discovery
![Gateway and service discovery](https://user-images.githubusercontent.com/15820051/82367083-de501f80-99d8-11ea-9484-a304304d618e.png)

## Cloud Config server
* Stores configuration for all services
* It stores configuration for `dev` profile for each service in separate directory

## How to run the environment?

### Before you start
* Make sure you have `Docker` and `docker-compose` installed.

[Docker CE INSTALLATION](https://docs.docker.com/install/linux/docker-ce/ubuntu/)  
[Docker Compose INSTALLATION](https://docs.docker.com/compose/install/#prerequisites)

### Start the environment
1. Build services:
    `docker-compose build`
2. Run services:
    `docker-compose up`
3. Run multiple instances of test hazelcast service:
    `docker-compose scale hazelcast-test-service=2`

### Important endpoints:
* http://localhost:8080/api/hazelcast-test-service/pizzeria/dominos - Get data about dominos pizzeria using distributed caching
* http://localhost:8080/api/hazelcast-test-service/pizzeria/pizza%20hut - Get data about dominos pizzeria using distributed caching
* http://localhost:8080/api/hazelcast-test-service/pizzeria/Little%20Caesars - Get data about dominos pizzeria using distributed caching
* http://localhost:8761/ - Get info about running services from discovery service

