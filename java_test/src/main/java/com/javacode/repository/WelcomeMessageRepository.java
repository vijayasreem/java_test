import org.springframework.data.jpa.repository.JpaRepository;

public interface WelcomeMessageRepository extends JpaRepository<WelcomeMessage, Integer>{
    
    WelcomeMessage findByWelcomeMessage();
    
    void save(WelcomeMessage welcomeMessage);
    
    void delete(WelcomeMessage welcomeMessage);
    
    void update(WelcomeMessage welcomeMessage);
}