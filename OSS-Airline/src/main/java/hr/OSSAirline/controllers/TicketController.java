package hr.OSSAirline.controllers;

import hr.OSSAirline.repositories.TicketRepository;
import hr.OSSAirline.services.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class TicketController {

    private final TicketService ticketService;
}
