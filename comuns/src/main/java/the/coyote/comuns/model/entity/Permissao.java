package the.coyote.comuns.model.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Permissao extends BasicEntity {

        private String name;

    @ManyToMany(mappedBy = "permissao")
    private Set<Role> roles;

}
