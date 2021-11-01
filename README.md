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

## Test Service
### recuperer tous les clients
![customersApi](https://user-images.githubusercontent.com/62752474/139607103-73998957-7349-478c-ac5c-73b14706d506.PNG)

### docs-api Customer
![docs-api](https://user-images.githubusercontent.com/62752474/139607105-86d6b072-5ae0-4504-9886-1f9cd2d24756.PNG)

### Swagger
![swaggerHtml](https://user-images.githubusercontent.com/62752474/139607107-89353b89-def4-4031-a0f4-e470e646a131.PNG)


# Billing-Service
## Les dependences necessaires
* spring-boot-starter-data-jpa
* spring-boot-starter-web
* spring-cloud-starter-netflix-eureka-client
* spring-cloud-starter-openfeign
* spring-boot-starter-test
* h2database
* lombok
* mapstruct
* springdoc-openapi-ui
## La classe Invoice
## DTO
### InvoiceRequestDTO
![RequestDTOInvoice](https://user-images.githubusercontent.com/62752474/139607304-d305c6b3-9614-4553-b943-d7e7f3a152d0.PNG)

### InvoiceResponseDTO   
![responddtoInvoice](https://user-images.githubusercontent.com/62752474/139607307-b5f992b6-959f-49ae-98be-de0c88ded7d8.PNG)

## DAO
## Interface InvoiceRepository
![respoInvoice](https://user-images.githubusercontent.com/62752474/139607305-4bf5b5d7-d129-4ed4-81f9-14e014fc0d93.PNG)

### MapperInvoice
![mapperInvoice](https://user-images.githubusercontent.com/62752474/139607303-f1632e0b-2d57-4e51-a489-87a78d96045e.PNG)
      
## Services
### La classe InvoiceServiceImpl
![invoiceserviceImpl](https://user-images.githubusercontent.com/62752474/139607300-a3838944-4cab-448d-90c3-b8fa4837d96a.PNG)
> OpenFeign 
## CustomerRestClient
![CustomerRestClient](https://user-images.githubusercontent.com/62752474/139607297-5e85712d-04ef-492c-9297-43d4230446b2.PNG)

## Web
## La classe InvoiceRestAPI 
![invoiceRestAPI](https://user-images.githubusercontent.com/62752474/139607298-01de78b2-2dba-47d8-a3ff-944f654348b0.PNG)

## Test Service
![invoicesByCustomers](https://user-images.githubusercontent.com/62752474/139607460-82589d0e-338f-4f04-a263-bf8ce6bc49b8.PNG)

![listfacturewithclient](https://user-images.githubusercontent.com/62752474/139607462-7945a68e-3d4e-44bf-aebf-f8421b908e9c.PNG)




