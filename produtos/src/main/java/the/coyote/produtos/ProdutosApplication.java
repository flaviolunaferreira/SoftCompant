package the.coyote.produtos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "the.coyote.comuns.model.entity") 			// Ajuste para o pacote correto das suas entidades
@EnableJpaRepositories(basePackages = "the.coyote.comuns.repository") 	// Ajuste para o pacote correto dos seus repositórios
public class ProdutosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosApplication.class, args);
	}

}
