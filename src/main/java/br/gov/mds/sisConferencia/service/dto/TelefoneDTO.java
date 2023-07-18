package br.gov.mds.sisConferencia.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TelefoneDTO {

    private Long id;

    private String telefone;

    private Integer ddd;

    private TipoTelefoneDTO tipoTelefone;
}
