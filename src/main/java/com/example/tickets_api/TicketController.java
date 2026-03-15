
package com.example.tickets_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tickets") 
public class TicketController {

    @Autowired
    private TicketRepository ticketRepository;

    @GetMapping
    public List<Ticket> obtenerTickets() {
        return ticketRepository.findAll();
    }

    @PostMapping
    public Ticket crearTicket(@RequestBody Ticket nuevoTicket) {
        nuevoTicket.setEstado("Abierto"); 
        return ticketRepository.save(nuevoTicket);
    }
    @PutMapping("/{id}/cerrar") 
    public Ticket cerrarTicket(@PathVariable Long id) {
        Optional<Ticket>ticket = ticketRepository.findById(id);
        if(ticket.isPresent()){
            Ticket ticketReal = ticket.get();
            ticketReal.setEstado("Cerrado");
            return ticketRepository.save(ticketReal);
        }
        return null;
    }
    
}
