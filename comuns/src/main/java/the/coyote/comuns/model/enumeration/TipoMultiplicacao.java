package the.coyote.comuns.model.enumeration;

import io.swagger.v3.oas.annotations.media.Schema;

public enum TipoMultiplicacao {

    	@Schema(description = "Não permite multiplicação no registro da mercadoria")
		NAO_PERMITE, 
		@Schema(description = "Permite multiplicação no registro da mercadoria")
		PERMITE,
		@Schema(description = "Permite multiplicação no registro da mercadoria mas será solicitada autorização")
		PERMITE_COM_AUTORIZACAO

}
