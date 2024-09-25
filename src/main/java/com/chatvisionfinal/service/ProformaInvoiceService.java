package com.chatvisionfinal.service;

import com.chatvisionfinal.entity.EProformaInvoice;
import com.chatvisionfinal.entity.ProformaInvoice;

import java.util.List;

public interface ProformaInvoiceService  {
    List<ProformaInvoice> findByStage(EProformaInvoice stage);


}
