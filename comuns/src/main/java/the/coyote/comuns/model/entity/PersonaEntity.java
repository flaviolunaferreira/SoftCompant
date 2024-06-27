package the.coyote.comuns.model.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import the.coyote.comuns.model.enumeration.TipoCadastro;
import the.coyote.comuns.model.enumeration.TipoPessoa;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class PersonaEntity extends BasicEntity {

    private String nomeRazaoSocial;
    private String apelidoNomeFantazia;
    private boolean ativo;
    private TipoPessoa tipoPessoa;
    private TipoCadastro tipocadastro;
    
}
