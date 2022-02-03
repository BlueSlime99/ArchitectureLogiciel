package user.application.userApplication;

import kernel.Command;

import java.util.Scanner;

@SuppressWarnings("all")

public final class CreateUser implements Command {

     String lastname;
     String firstname;
     String email;


    public CreateUser(String lastname, String firstname, String email) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.email = email;
    }

    public CreateUser() {

    }

    public CreateUser sendUserInformation(Scanner input){

        CreateUser user = new CreateUser(lastname, firstname, email);
        System.out.println("enter lastname");
        String lastname = input.nextLine();
        System.out.println("enter first name");
        String firstname = input.nextLine();
        System.out.println("enter email");
        String email = input.nextLine();

        user.lastname = lastname;
        user.firstname = firstname;
        user.email = email;
        return user;
    }



    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getEmail() {
        return email;
    }

}