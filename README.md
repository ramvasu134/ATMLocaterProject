# ATMLocaterProject
Atm locator project

Download the project in to STS - springtool suite

select Existing Maven project when loading in STS

Right click on the project and select Run as SpringBootApplication

Open Postman
 create a new Request with GET http method shown in the postman_full response.jpg
  screenshot
  trigger : GET method
  without filter
  http://localhost:8080/atmlocator/atm
 
 with filter
  http://localhost:8080/atmlocator/atm?city=Rijswijk (NB)
  
  you can see the response with all the fields
  

