package com.taskify.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDTO {
    
    @NotNull
    private Long idUsuario;

    @NotBlank
    private String cep;

    private String numero;

    private String complemento;
}
