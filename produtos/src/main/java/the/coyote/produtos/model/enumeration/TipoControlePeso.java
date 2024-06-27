package the.coyote.produtos.model.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

public enum TipoControlePeso {

    	@Schema(description = "É necessário colocar a mercadoria na balança")
		CONTROLA, 
        
        @Schema(description = "Não é necessário colocar a mercadoria")
		NAO_CONTROLA,

        @Schema(description = "Não há o controle de peso, mas solicita que a mercadoria seja colocada na balança")
		EXIGE_BALANCA,

        @Schema(description = "Não é necessário colocar a mercadoria na balança mas solicita autorização")
		SOLICITA_LIBERACAO

}
