package com.chatvisionfinal.service;

import com.chatvisionfinal.entity.EProformaInvoice;
import com.chatvisionfinal.entity.ProformaInvoice;
import com.chatvisionfinal.repository.ProformaInvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProformaInvoiceServiceImpl implements ProformaInvoiceService{
    @Autowired
    ProformaInvoiceRepository proformaInvoiceRepository;
    @Override
    public List<ProformaInvoice> findByStage(EProformaInvoice stage) {
        return proformaInvoiceRepository.findByStage(stage);
    }
}
