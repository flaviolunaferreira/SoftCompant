package the.coyote.comuns.model.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;


public enum TipoMercadoria {

    @Schema(description = "Mercadoria padrão")
    MERCADORIA, 
    @Schema(description = "Indica que o item é um serviço")
    SERVICO, 
    @Schema(description = "Quando marcada como composição deverá ser enviado também os itens que a compõe")
    COMPOSICAO, 
    @Schema(description = "Indica que esta mercadoria é um vasilhame")
    VASILHAME

}
