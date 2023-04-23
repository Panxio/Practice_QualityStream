import org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.MethodName.class)
public class ByName_Order {
    @Test
    void setup_test(){
        System.out.println("Setup test");
    }

    @Test
    void register_test(){
        System.out.println("Register test");
    }

    @Test
    void login_test(){
        System.out.println("Login test");
    }

    @Test
    void action_test(){
        System.out.println("Action test");
    }

    @Test
    void logout_test(){
        System.out.println("logout test");
    }

}
