package com.experiment.resource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;

@Configuration
public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

    private String clientId;

    private String clientSecret;

    public ResourceServerConfig( @Value("${security.oauth2.github.clientId}") String clientId,
                                 @Value("${security.oauth2.github.clientSecret}") String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.oauth2Login();
        http.authorizeRequests().anyRequest().authenticated();
    }

    @Bean
    public ClientRegistrationRepository clientRegistrationRepository() {
        return new InMemoryClientRegistrationRepository(gitHubClient());
    }

    private ClientRegistration gitHubClient() {
        System.out.println(clientId);
        return CommonOAuth2Provider.GITHUB.getBuilder("github")
                .clientId(clientId)
                .clientSecret(clientSecret)
                .build();
    }

}
