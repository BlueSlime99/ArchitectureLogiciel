import user.application.userApplication.CreateUserHandler;
import user.domain.client.UserId;
import user.application.userApplication.CreateUser;
import user.domain.tradesman.EventHandler;
import user.infrastructure.InMemoryUserRepository;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        EventHandler eventPayment = new EventHandler();
        CreateUserHandler userCommandHandler = new CreateUserHandler(new InMemoryUserRepository());
        Scanner info = new Scanner(System.in);
        CreateUser createUser = new CreateUser();
        createUser = createUser.sendUserInformation(info);
        userCommandHandler.addPropertyChangeListener(eventPayment);
        final UserId userId = userCommandHandler.handle(createUser);

    }
}