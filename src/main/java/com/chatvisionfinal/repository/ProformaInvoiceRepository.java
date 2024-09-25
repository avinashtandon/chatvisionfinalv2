package com.chatvisionfinal.repository;

import com.chatvisionfinal.entity.EProformaInvoice;
import com.chatvisionfinal.entity.ProformaInvoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProformaInvoiceRepository extends JpaRepository<ProformaInvoice, String> {
   List<ProformaInvoice> findByStage(EProformaInvoice stage);
}
