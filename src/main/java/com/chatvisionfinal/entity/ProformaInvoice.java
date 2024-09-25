package com.chatvisionfinal.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name= "proforma_invoice")

public class ProformaInvoice {
    @Id
    @Column(name = "pi_no" ,nullable = false)
    private String piNo;
    private Date shipmentDate;
    private Long client_id;
    private Long brand_id;
    private Long team_merchandiser_id;
    private String currency;
    private EProformaInvoice stage;
    private Long commission;
    private Long packing_manual_id;
    private Long trademark_id;
    private Date initial_shipment_date;
    private Date timeStamp;
    private Date dispatchDate;
    @OneToMany(mappedBy = "proformaInvoice")
    private Set<PurchaseOrder> purchaseOrders;
    public ProformaInvoice(){

    }

    public ProformaInvoice(String piNo, Date shipmentDate, Long client_id, Long brand_id, Long team_merchandiser_id, String currency, EProformaInvoice stage, Long commission, Long packing_manual_id, Long trademark_id, Date initial_shipment_date, Date timeStamp, Date dispatchDate) {
        this.piNo = piNo;
        this.shipmentDate = shipmentDate;
        this.client_id = client_id;
        this.brand_id = brand_id;
        this.team_merchandiser_id = team_merchandiser_id;
        this.currency = currency;
        this.stage = stage;
        this.commission = commission;
        this.packing_manual_id = packing_manual_id;
        this.trademark_id = trademark_id;
        this.initial_shipment_date = initial_shipment_date;
        this.timeStamp = timeStamp;
        this.dispatchDate = dispatchDate;
    }

    public String getPiNo() {
        return piNo;
    }

    public void setPiNo(String piNo) {
        this.piNo = piNo;
    }

    public Date getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(Date shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public Long getClient_id() {
        return client_id;
    }

    public void setClient_id(Long client_id) {
        this.client_id = client_id;
    }

    public Long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Long brand_id) {
        this.brand_id = brand_id;
    }

    public Long getTeam_merchandiser_id() {
        return team_merchandiser_id;
    }

    public void setTeam_merchandiser_id(Long team_merchandiser_id) {
        this.team_merchandiser_id = team_merchandiser_id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public EProformaInvoice getStage() {
        return stage;
    }

    public void setStage(EProformaInvoice stage) {
        this.stage = stage;
    }

    public Long getCommission() {
        return commission;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public Long getPacking_manual_id() {
        return packing_manual_id;
    }

    public void setPacking_manual_id(Long packing_manual_id) {
        this.packing_manual_id = packing_manual_id;
    }

    public Long getTrademark_id() {
        return trademark_id;
    }

    public void setTrademark_id(Long trademark_id) {
        this.trademark_id = trademark_id;
    }

    public Date getInitial_shipment_date() {
        return initial_shipment_date;
    }

    public void setInitial_shipment_date(Date initial_shipment_date) {
        this.initial_shipment_date = initial_shipment_date;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Date getDispatchDate() {
        return dispatchDate;
    }

    public void setDispatchDate(Date dispatchDate) {
        this.dispatchDate = dispatchDate;
    }

    public Set<PurchaseOrder> getPurchaseOrders() {
        return purchaseOrders;
    }

    public void setPurchaseOrders(Set<PurchaseOrder> purchaseOrders) {
        this.purchaseOrders = purchaseOrders;
    }
}

