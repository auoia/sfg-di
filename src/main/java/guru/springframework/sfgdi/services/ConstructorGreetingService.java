package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

// @Service annotation tells Spring that this is a Spring managed component
// and so it should be brought into the Spring context
@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World - Constructor";
    }
}
