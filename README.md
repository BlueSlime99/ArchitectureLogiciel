# ArchitectureLogiciel
Model :
The project have a Domain package that include the Client and Tradesman class 
the Package Infrastructure include the Repository Structure of the PaymentProcess Informations and The Registration User
The Exception UnValideEmail throw an exception when the email is unvailid 
verification of the email sent a validation to start the payment process
The payment process in this pproject is not yet verified 

Architecture:
For the project i used the pattern repository to abstract the access to the data project.
For the Pattern Observer i used it to track the registration of the user when it verified and send the notification,
To The payment Handler and lunch the payment process 
