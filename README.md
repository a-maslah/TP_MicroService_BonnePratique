# TP_MicroService_BonnePratique
## Mise en oeuvre des bonnes pratiques des architectures Micro-services

# Architecture du Projet

![architectureProjet](https://user-images.githubusercontent.com/62752474/139606564-1271af13-8c9c-437f-b6c5-0b10335e6605.PNG)
![architectureProjet1](https://user-images.githubusercontent.com/62752474/139606568-f1c6e08b-32e9-40e6-b5ad-e983bc837df1.PNG)

# Customer-Service
## Les dependences necessaires
* h2database
* lombok
* mapstruct
* springdoc-openapi-ui
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-cloud-starter-netflix-eureka-client
* spring-boot-starter-test
## La classe Customer
![classCustomer](https://user-images.githubusercontent.com/62752474/139606813-af87f388-f85e-4a7e-a3e1-c084768010d7.PNG)
## DTO
### CustomerRequestDTO
![CustomerRequDTO](https://user-images.githubusercontent.com/62752474/139606965-11c343a9-5c36-49e7-9691-1beaa4ea9a58.PNG)

### CustomerResponseDTO   
![CustomerRespDTO](https://user-images.githubusercontent.com/62752474/139606966-e5103e68-7650-46f2-ac1a-14f4c45c698b.PNG)

## DAO
## Interface CustomerRepository
![repositoryCustomer](https://user-images.githubusercontent.com/62752474/139606817-906ba7da-b157-43ea-a39b-f9b89894c97f.PNG)

### CustomerMapper
![mapperCustomer](https://user-images.githubusercontent.com/62752474/139606816-5895a379-38d8-4fdb-9361-eeac3adbeeaa.PNG)
      
## Services
### La classe CustomerServiceImpl
![serviceCustmerIpml](https://user-images.githubusercontent.com/62752474/139606819-2bbe7b1f-f672-4aeb-91a0-9df53e2d3176.PNG)

## Web
## La classe CustomerRestController 
![restCustomer](https://user-images.githubusercontent.com/62752474/139606818-6f969657-0347-4756-b316-e49a2a9dfd39.PNG)

