package uk.ac.ebi.subs.upload.aap.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import uk.ac.ebi.tsc.aap.client.security.TokenHandler;

/**
 * Created by rolando on 31/05/2017.
 */

@Configuration
public class AuthConfig {

    @Bean
    public TokenHandler tokenHandler() {
        return new TokenHandler();
    }
}
