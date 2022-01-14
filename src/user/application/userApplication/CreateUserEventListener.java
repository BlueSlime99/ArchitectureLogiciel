package user.application.userApplication;

import kernel.EventListener;
import user.application.userApplication.CreateUserEvent;

public class CreateUserEventListener implements EventListener<CreateUserEvent> {
    @Override
    public void listenTo(CreateUserEvent event) {
        System.out.println("listening CreateUserEvent.");
    }
}


