package the.coyote.produtos.model.entity;

import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalDateTime;

import lombok.*;

@Getter
@Setter
@ToString
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BasicEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Schema(description = "Identificador único usado no controle interno.")
    private Long id;

    @CreatedBy
    @Schema(description = "Contém o nome do usuário do sistema que incluiu o registro.")
    private String createdBy;

    @CreatedDate
    @Schema(description = "Data em que o registro foi cadastrado.")
    private LocalDateTime createdDate;

    @LastModifiedBy 
    @Schema(description = "Último usuário que modificou o registro.")
    private String lastModifieldBy;

    @LastModifiedDate
    @Schema(description = "Data da última modificação.")
    private LocalDateTime lastModifieldDate;
        
}