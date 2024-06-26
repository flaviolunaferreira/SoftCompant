package the.coyote.comuns.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public GroupedOpenApi produtoApi() {
        return GroupedOpenApi.builder()
                .group("produto-api")
                .pathsToMatch("/**")
                .build();
    }

}
