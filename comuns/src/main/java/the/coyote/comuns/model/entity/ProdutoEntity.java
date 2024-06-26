package the.coyote.comuns.model.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;

import lombok.*;
import the.coyote.comuns.model.InfoSchemas;
import the.coyote.comuns.model.enumeration.TipoControlePeso;
import the.coyote.comuns.model.enumeration.TipoMercadoria;
import the.coyote.comuns.model.enumeration.TipoMultiplicacao;
import the.coyote.comuns.model.enumeration.UnidadeMedida;


@Setter
@Getter
@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoEntity extends BasicEntity {

	@Schema (description = "Código de registro da mercadoria, geralmente o GTIN, se a mercadoria não tiver GTIN, mandar o código da mercadoria", title =  "Código de Integração")
	private String integracao;

	@Schema(description = "Se é mercadoria, serviço, etc.")
	private TipoMercadoria tipo;

	@Schema(description = "Descrição completa da mercadoria", title = InfoSchemas.TITLE_T_120, maxLength = 120)
	private String descricaoCompleta;

	@Schema(description = "Descrição resumida da mercadoria, esta será utilizada na impressão do cupom fiscal", title = InfoSchemas.TITLE_T_50, maxLength = 50)
	private String descricaoReduzida;

	@Schema(description = "Indica se a mercadoria está ativa, se não será bloqueada a venda da mesma", title = InfoSchemas.TITLE_L)
	private boolean ativa;

	@Schema(description = "Sigla fiscal da unidade de medida", title = InfoSchemas.TITLE_T_10, maxLength = 10)
	private UnidadeMedida unidadeMedida;

	@Schema(description = "Origem da mercadoria conforme regulamento do ICMS", title = InfoSchemas.TITLE_N_1, example = InfoSchemas.EXAMPLE_INT, minimum = InfoSchemas.MIN_ONE)
	private int origem;

	@Schema(description = "Nomenclatura comum do mercosul", title = InfoSchemas.TITLE_T_8, maxLength = 8)
	private String ncm;

	@Schema(description = "Exceção do IPI da tabela TIPI", title = InfoSchemas.TITLE_T_3, maxLength = 3)
	private String extipi;

	@Schema(description = "não implementado", title = InfoSchemas.TITLE_T_512, maxLength = 512)
	private String imagem;

	@Schema(description = "Mercadoria que será registrada junto com esta mercadoria, geralmente utilizada para vasilhame", title = InfoSchemas.TITLE_T_60, maxLength = 60)
	private String codigoMercadoriaAssociada;

	@Schema(description = "Iindicador de mercadoria destinada a maiores de 18 anos, quando esta mercadoria for registrada no PDV será solicitada data de nascimento e RG", title = InfoSchemas.TITLE_L)
	private boolean destinadoConsumidorMaior;

	@Schema(description = "Indica que é uma mercadoria que pode ser registrada utilizando a balança ligada ao PDV", title = InfoSchemas.TITLE_L)
	private boolean deBalanca;

	@Schema(description = "Indica que a mercadoria pode ser registrada com quantidade fracionada", title = InfoSchemas.TITLE_L)
	private boolean fracionada;

	@Schema(description = "Quantidade máxima permitida em todo cupom para a mercadoria, se atributo não informado (null) não ocorrerá o bloqueio, se informar zero será utilizada a quantidade configurada no PDV para todas mercadorias", title = InfoSchemas.TITLE_N_12_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double qtdeMaximaNaVenda;

	@Schema(description = "Comportamento da multiplicação")
	private TipoMultiplicacao permissaoMultiplicacao;

	@Schema(description = "Quantidade máxima permitida na multiplicação para o registro do item, sendo 1 significa que não pode ser utilizada a função de multiplicação de item", title = InfoSchemas.TITLE_N_12_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double qtdeMaximaMultiplicacao;

	@Schema(description = "Atributo só é utilizado quando a configuração do PDV “Faz o registro da caixa em unidades” estiver ativa, neste caso quando ocorrer o registro da caixa será feita a conversão automática para unidade, tanto da quantidade como do preço", title = InfoSchemas.TITLE_N_12_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double qtdeEmbalagem;

	@Schema(description = "Somente para Sef Checkout")
	private TipoControlePeso tipoControlaPesoSelf;

	@Schema(description = "Somente para Self Checkout, peso bruto esperado da mercadoria", title = InfoSchemas.TITLE_N_15_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double pesoConferencia;

	@Schema(description = "Somente para Self Checkout, margem de erro do peso em percentual permitido para a mercadoria", title = InfoSchemas.TITLE_N_4_2, example = InfoSchemas.EXAMPLE_DOUBLE)
	private Double margemPesoConferencia;

	@Schema(description = "Somente para Self Checkout, valor da tara mínima da mercadoria, é utilizado para mercadoria de balança quando a mesma é embalada dentro da loja", title = InfoSchemas.TITLE_N_5_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double taraMinimaConferencia;

	@Schema(description = "Somente para Self Checkout, valor da tara máxima da mercadoria, é utilizado para mercadoria de balança quando a mesma é embalada dentro da loja", title = InfoSchemas.TITLE_N_5_3, example = InfoSchemas.EXAMPLE_DOUBLE_3)
	private Double taraMaximaConferencia;

    
}