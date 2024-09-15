package UserService;

import Singleton.ClassSingleton;
import Singleton.EnumSingleton;

//The Service Facade design pattern is a structural pattern that provides a simplified interface to a complex subsystem or a set of interfaces and
// It acts as a front-facing interface that hides the complexities of the underlying system, making it easier for clients to interact with the system without needing to understand its intricacies
public class ServiceFacadeApplication {
    public static void main(String[] args) {
        UserFacade userFacade = new UserFacade();
        // Register a new user
        userFacade.registerUser("john_doe");
        // Remove a user
        userFacade.removeUser("john_doe");
    }
}



