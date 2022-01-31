package guru.springframework.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Connor Wheatley
 * @Date: 28/01/2022 13:07
 */
@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        Contact contact = new Contact();
        contact.setEmail("cwheatley@tier2consulting.com");
        contact.setName("Connor");
        contact.setUrl("example.com");

        return new OpenAPI()
                .info(new Info().title("RestAPI Demo")
                        .description("Demo of RESTful web servies with Spring")
                        .version("v0.0.1")
                        .termsOfService("some url here for ToS")
                        .contact(contact)
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                                .description("More about SpringDoc and OpenAPI 3")
                                .url("https://springdoc.org"));
    }
}