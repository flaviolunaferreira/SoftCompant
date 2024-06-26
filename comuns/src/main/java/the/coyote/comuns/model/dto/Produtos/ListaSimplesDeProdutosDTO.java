package the.coyote.comuns.model.dto.Produtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import the.coyote.comuns.model.InfoSchemas;
import the.coyote.comuns.model.entity.ProdutoEntity;
import the.coyote.comuns.model.enumeration.UnidadeMedida;
import the.coyote.comuns.model.enumeration.TipoMercadoria;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Schema(description = "retorna uma lista de produtos Simplificada. (Resposta)", title = "Lista simplificada de produtos.")
public class ListaSimplesDeProdutosDTO {

    @Schema (description = "Código interno de controle da entidade", title =  "Id")
    private Long codigoInterno;

    @Schema (description = "Código de registro da mercadoria, geralmente o GTIN, se a mercadoria não tiver GTIN, mandar o código da mercadoria", title =  "Código de Integração")
	private String integracao;

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
        this.integracao = produto.getIntegracao();
        this.tipo = produto.getTipo();
        this.descricaoCompleta = produto.getDescricaoCompleta();
        this.ativa = produto.isAtiva();
        this.unidadeMedida = produto.getUnidadeMedida();
    }
}
