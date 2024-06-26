package the.coyote.comuns.model.enumeration;

import lombok.Getter;

@Getter
public enum TipoLogradouro {

    Rua("Rua", "R."),
    Avenida("Avenida", "Av.");

    private final String nome;
    private final String abreviacao;

    private TipoLogradouro(String nome, String abreviacao) {
        this.nome = nome;
        this.abreviacao = abreviacao;
    }

    

}
