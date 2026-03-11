package controller;

import com.kingsam.agendador_horarios.infrastructure.entity.AgendamentoEntity;
import com.kingsam.agendador_horarios.service.AgendamentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor

public class AgendamentoController {
    private final AgendamentoService agendamentoService;

    @PostMapping
    public ResponseEntity<AgendamentoEntity> salvarAgedanebti(@RequestBody AgendamentoEntity agendamento) {
        return ResponseEntity.ok().body(agendamentoService.salvarAgendamento(agendamento));
    }

    @DeleteMapping
    public ResponseEntity<Void> deletarAgendamento(@RequestBody AgendamentoEntity agendamento) {
        agendamentoService.deletarAgendamento(agendamento.getDataHoraAgendamento(), agendamento.getCliente());
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<AgendamentoEntity> buscarAgendamentoDia(@RequestBody AgendamentoEntity agendamento) {
        return ResponseEntity.ok().body(agendamentoService.buscarAgentamentoDia(agendamento.getDataHoraAgendamento(), agendamento.getDataHoraAgendamento()));
    }

    @PutMapping
    public ResponseEntity<AgendamentoEntity> alterarAgendamento(@RequestBody AgendamentoEntity agendamento)  {
        return ResponseEntity.ok().body(agendamentoService.alterarAgendamento(agendamento, agendamento.getCliente(), agendamento.getDataHoraAgendamento()));
    }
}


