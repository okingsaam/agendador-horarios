package com.kingsam.agendador_horarios.service;

import com.kingsam.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import com.kingsam.agendador_horarios.infrastructure.repository.AgendamentoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AgendamentoService {

    private final AgendamentoRepository agendamentoRepository;

    public AgendamentoEntity salvarAgendamento(AgendamentoEntity agendamento) {

        LocalDateTime horaAgendamento = agendamento.getDataHoraAgendamento();
        LocalDateTime horaFim = horaAgendamento.plusHours(1);

        AgendamentoEntity agendados =
                agendamentoRepository.findByServicoAndDataHoraAgendamentoBetween(
                        agendamento.getServico(),
                        horaAgendamento,
                        horaFim
                );

        if (Objects.nonNull(agendados)) {
            throw new RuntimeException("Já existe um agendamento para esse serviço nesse horário.");
        }

        return agendamentoRepository.save(agendamento);
    }

    public void deletarAgendamento(LocalDateTime DataHoraAgentamento, String cliente) {
        agendamentoRepository.deleteByDataHoraAgendamentoAndCliente(DataHoraAgentamento, cliente);
    }

    public AgendamentoEntity buscarAgentamentoDia(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal) {
        return agendamentoRepository.findByDataHoraAgendamentoBetween(dataHoraInicial, dataHoraFinal);
    }

    public AgendamentoEntity alterarAgendamento(AgendamentoEntity agendamento, String cliente, LocalDateTime dataHoraAgentamento) {

        AgendamentoEntity agenda =
                agendamentoRepository.findByClienteAndDataHoraAgendamento(cliente, dataHoraAgentamento);

        if (Objects.nonNull(agenda)) {
            throw new RuntimeException("Horario não está preenchido");
        }

        agendamento.setId(agenda.getId());

        return agendamentoRepository.save(agendamento);
    }
}