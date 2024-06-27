package the.coyote.produtos.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import the.coyote.comuns.model.InfoSchemas;
import the.coyote.produtos.model.entity.ProdutoEntity;
import the.coyote.produtos.model.enumeration.TipoMercadoria;
import the.coyote.produtos.model.enumeration.UnidadeMedida;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "retorna uma lista de produtos Simplificada. (Resposta)", title = "Lista simplificada de produtos.")
public class ListaSimplesDeProdutosDTO {

    @Schema (description = "Código interno de controle da entidade", title =  "Id")
    private Long codigoInterno;

	@Schema(description = "Se é mercadoria, serviço, etc.")
	private TipoMercadoria tipo;

	@Schema(description = "Descrição completa da mercadoria", title = InfoSchemas.TITLE_T_120, maxLength = 120)
	private String descricaoCompleta;

	@Schema(description = "Indica se a mercadoria está ativa, se não será bloqueada a venda da mesma", title = InfoSchemas.TITLE_L)
	private boolean ativa;

	@Schema(description = "Sigla fiscal da unidade de medida", title = InfoSchemas.TITLE_T_10, maxLength = 10)
	private UnidadeMedida unidadeMedida;

    public ListaSimplesDeProdutosDTO(ProdutoEntity produto) {
        this.codigoInterno = produto.getId();
        this.tipo = produto.getTipo();
        this.descricaoCompleta = produto.getDescricaoCompleta();
        this.ativa = produto.isAtiva();
        this.unidadeMedida = produto.getUnidadeMedida();
    }
}
