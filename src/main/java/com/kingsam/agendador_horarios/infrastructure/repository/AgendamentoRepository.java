package com.kingsam.agendador_horarios.infrastructure.repository;

import com.kingsam.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface AgendamentoRepository extends JpaRepository<AgendamentoEntity, Long> {

    static AgendamentoEntity findByClienteAndDataHoraAgendamentoCliente(LocalDateTime dataHoraAgentamento, String cliente) {
        return null;
    }

    AgendamentoEntity findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFinal);

    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    AgendamentoEntity findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);

    AgendamentoEntity findByClienteAndDataHoraAgendamento(String cliente, LocalDateTime dataHoraAgendamento);
}