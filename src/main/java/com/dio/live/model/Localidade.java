package com.dio.live.model;

import lombok.*;

import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class Localidade {
    private long id;
    private String descricao;

    @OneToMany //uma localIdade pode ter varios niveis de acesso
    private NivelAcesso nivelAcesso;
}
