package user.application.userApplication;

import kernel.UnvalidEmailException;
import user.domain.client.User;
import user.domain.client.UserId;
import user.domain.client.UserRepository;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public final class CreateUserHandler implements RegistrationHandlerService<CreateUser, UserId> {

    private final UserRepository userRepository;

    EmailValidationService validateUserEmail ;
    private PropertyChangeSupport support;

    public CreateUserHandler(UserRepository userRepository) {
        support = new PropertyChangeSupport(this);
        this.userRepository = userRepository;

    }

    public UserId handle(CreateUser createUser) {
        final UserId currentUserId = userRepository.currentId();
        final UserId userId = userRepository.nextIdentity();
        User user = new User(userId, createUser.getLastname(), createUser.getFirstname(), createUser.getEmail());

        if(validateUserEmail.isValid(user.getEmail())) {
            support.firePropertyChange("ValidateUserRegistration", currentUserId,userId);
            userRepository.add(user);
        }else{
            throw UnvalidEmailException.withEmail(user);
        }
        return userId;
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }



}