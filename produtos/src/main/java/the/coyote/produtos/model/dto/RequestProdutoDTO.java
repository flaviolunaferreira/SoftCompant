package the.coyote.produtos.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import the.coyote.comuns.model.InfoSchemas;
import the.coyote.produtos.model.entity.ProdutoEntity;
import the.coyote.produtos.model.enumeration.TipoMercadoria;
import the.coyote.produtos.model.enumeration.UnidadeMedida;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestProdutoDTO {

	@Schema(description = "Se é mercadoria, serviço, etc.")
	private TipoMercadoria tipo;

	@Schema(description = "Descrição completa da mercadoria", title = InfoSchemas.TITLE_T_120, maxLength = 120)
	private String descricaoCompleta;

	@Schema(description = "Indica se a mercadoria está ativa, se não será bloqueada a venda da mesma", title = InfoSchemas.TITLE_L)
	private boolean ativa;

	@Schema(description = "Sigla fiscal da unidade de medida", title = InfoSchemas.TITLE_T_10, maxLength = 10)
	private UnidadeMedida unidadeMedida;

	@Schema(description = "Atributo só é utilizado quando a configuração do PDV “Faz o registro da caixa em unidades” estiver ativa, neste caso quando ocorrer o registro da caixa será feita a conversão automática para unidade, tanto da quantidade como do preço", title = InfoSchemas.TITLE_N_12_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double qtdeEmbalagem;

	public ProdutoEntity newRequestProdutoDTO() {
		System.out.println(new ProdutoEntity(tipo, descricaoCompleta, ativa, unidadeMedida, qtdeEmbalagem));
		return new ProdutoEntity(tipo, descricaoCompleta, ativa, unidadeMedida, qtdeEmbalagem);
	}

}
