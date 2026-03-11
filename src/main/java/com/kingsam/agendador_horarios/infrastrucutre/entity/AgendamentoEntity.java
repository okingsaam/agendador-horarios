package com.kingsam.agendador_horarios.infrastrucutre.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "agendamento")
public class AgendamentoEntity {


    public String getServicohoraAgendamento;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String servico;
    private String profissional;
    private LocalDateTime dataHoraAgendamento;
    private String cliente;
    private String telefoneCliente;
    private LocalDateTime dataInsercao = LocalDateTime.now();

    public void setid(Long id) {
        this.id = id;
    }
    }

