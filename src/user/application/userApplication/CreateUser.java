package user.application.userApplication;

import kernel.Command;

import java.util.Scanner;

/**
 * Command object
 */
@SuppressWarnings("all")

public final class CreateUser implements Command {

    private String lastname;
    private String firstname;
    private String email;


    public CreateUser() {
    }

    public CreateUser sendUserInformation(Scanner input){

        CreateUser user = new CreateUser();
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