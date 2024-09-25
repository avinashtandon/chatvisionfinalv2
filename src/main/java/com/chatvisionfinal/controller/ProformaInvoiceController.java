package com.chatvisionfinal.controller;

import com.chatvisionfinal.entity.EProformaInvoice;
import com.chatvisionfinal.entity.ProformaInvoice;
import com.chatvisionfinal.service.ProformaInvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/proforma-invoice")
public class ProformaInvoiceController {
    @Autowired
    private ProformaInvoiceService proformaInvoiceService;

    // Get all ProformaInvoices
    @GetMapping("/all")
    public ResponseEntity<List<ProformaInvoice>> getAllProformaInvoices() {
        List<ProformaInvoice> invoices = proformaInvoiceService.findByStage(EProformaInvoice.UNDER_PROCESS);
        return new ResponseEntity<>(invoices, HttpStatus.OK);

    }
}
