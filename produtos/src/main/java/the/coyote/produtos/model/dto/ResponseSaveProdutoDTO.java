package the.coyote.produtos.model.dto;

import java.time.LocalDateTime;

import lombok.*;
import the.coyote.produtos.model.entity.ProdutoEntity;
import the.coyote.produtos.model.enumeration.TipoMercadoria;
import the.coyote.produtos.model.enumeration.UnidadeMedida;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseSaveProdutoDTO {

    private Long id;
	private TipoMercadoria tipo;
	private String descricaoCompleta;
	private boolean ativa;
	private UnidadeMedida unidadeMedida;
    private Double qtdeEmbalagem;
    private String createdBy;
    private LocalDateTime createdDate;

    public ResponseSaveProdutoDTO(ProdutoEntity produto) {
        this.id = produto.getId();
        this.tipo = produto.getTipo();
        this.descricaoCompleta = produto.getDescricaoCompleta();
        this.ativa = produto.isAtiva();
        this.unidadeMedida = produto.getUnidadeMedida();
        this.qtdeEmbalagem = produto.getQtdeEmbalagem();
        this.createdBy = produto.getCreatedBy();
        this.createdDate = produto.getCreatedDate();
    }

}
