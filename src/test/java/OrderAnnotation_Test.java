 import org.junit.jupiter.api.MethodOrderer;
 import org.junit.jupiter.api.Order;
 import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderAnnotation_Test {
    @Test
    @Order(1)
    void setup_test(){
        System.out.println("Setup test");
    }

    @Test
    @Order(2)
    void register_test(){
        System.out.println("Register test");
    }

    @Test
    @Order(3)
    void login_test(){
        System.out.println("Login test");
    }

    @Test
    @Order(4)
    void action_test(){
        System.out.println("Action test");
    }

    @Test
    @Order(5)
    void logout_test(){
        System.out.println("logout test");
    }

}
