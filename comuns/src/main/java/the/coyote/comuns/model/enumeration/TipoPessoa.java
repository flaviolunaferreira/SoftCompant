package the.coyote.comuns.model.enumeration;

import lombok.Getter;

@Getter
public enum TipoPessoa {

F("Física", "F"),
J("Jurídica", "J");

private final String descricao;
private final String abreviacao;

private TipoPessoa(String descricao, String abreviacao ){
    this.descricao = descricao;
    this.abreviacao = abreviacao;
}

}
