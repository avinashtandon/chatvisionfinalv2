package com.chatvisionfinal.controller;

import com.chatvisionfinal.entity.Client;
import com.chatvisionfinal.entity.EProformaInvoice;
import com.chatvisionfinal.entity.Factory;
import com.chatvisionfinal.entity.ProformaInvoice;
import com.chatvisionfinal.service.ClientService;
import com.chatvisionfinal.service.FactoryService;
import com.chatvisionfinal.service.ProformaInvoiceService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Tag(name = "ProformaInvoiceController", description = "To perform operation on ProformaInvoice")
@RequestMapping("api/proforma-invoice")
public class ProformaInvoiceController {
    @Autowired
    private ClientService clientService;  // Inject ClientService

    @Autowired
    private FactoryService factoryService;
    @Autowired
    private ProformaInvoiceService proformaInvoiceService;

    // Get all ProformaInvoices
    @Operation(
            summary = "GET operation on ProformaInvoice",
            description = "It is used to retrieve ProformaInvoice Object in database"
    )
    @GetMapping("/all")
    public ResponseEntity<List<ProformaInvoice>> getAllProformaInvoices() {
        List<ProformaInvoice> invoices = proformaInvoiceService.findByStage(EProformaInvoice.UNDER_PROCESS);
        return new ResponseEntity<>(invoices, HttpStatus.OK);

    }
    @Operation(
            summary = "Get operation on Clients",
            description = "It is used to retrieve client Object in database"
    )
    @GetMapping("/client")
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();  // Use instance method
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    // Endpoint to get all factories
    @Operation(
            summary = "Get operation on Factories",
            description = "It is used to retrieve factory Object in database"
    )
    @GetMapping("/factory")
    public ResponseEntity<List<Factory>> getAllFactory() {
        List<Factory> factories = factoryService.getAllFactory();
        return new ResponseEntity<>(factories, HttpStatus.OK);
    }

}
