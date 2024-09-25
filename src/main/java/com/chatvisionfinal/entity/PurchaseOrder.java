package com.chatvisionfinal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "purchase_order")
public class PurchaseOrder {
    @Id
    @Column(name = "po_no" ,nullable = false)
    private String poNo;
    private Date poDate;
    private Long factory_id;
    private String pi_no;
    private Long team_quality_control_id;
    private Date exFactoryDate;
    private Date secondExFactoryDate;
    private String gender;
    private EPurchaseOrder stage;
    private Date initialExFactoryDate;
    private Date timeStamp;
    private Date dispatchDate;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pi_no", insertable = false, updatable = false)
    private ProformaInvoice proformaInvoice;
    @OneToMany(mappedBy = "purchaseOrder")
    private Set<Article> articles;
    public PurchaseOrder(){

    }

    public PurchaseOrder(String poNo, Date poDate, Long factory_id, String pi_no, Long team_quality_control_id, Date exFactoryDate, Date secondExFactoryDate, String gender, EPurchaseOrder stage, Date initialExFactoryDate, Date timeStamp, Date dispatchDate) {
        this.poNo = poNo;
        this.poDate = poDate;
        this.factory_id = factory_id;
        this.pi_no = pi_no;
        this.team_quality_control_id = team_quality_control_id;
        this.exFactoryDate = exFactoryDate;
        this.secondExFactoryDate = secondExFactoryDate;
        this.gender = gender;
        this.stage = stage;
        this.initialExFactoryDate = initialExFactoryDate;
        this.timeStamp = timeStamp;
        this.dispatchDate = dispatchDate;
    }

    public String getPoNo() {
        return poNo;
    }

    public void setPoNo(String poNo) {
        this.poNo = poNo;
    }

    public Date getPoDate() {
        return poDate;
    }

    public void setPoDate(Date poDate) {
        this.poDate = poDate;
    }

    public Long getFactory_id() {
        return factory_id;
    }

    public void setFactory_id(Long factory_id) {
        this.factory_id = factory_id;
    }

    public String getPi_no() {
        return pi_no;
    }

    public void setPi_no(String pi_no) {
        this.pi_no = pi_no;
    }

    public Long getTeam_quality_control_id() {
        return team_quality_control_id;
    }

    public void setTeam_quality_control_id(Long team_quality_control_id) {
        this.team_quality_control_id = team_quality_control_id;
    }

    public Date getExFactoryDate() {
        return exFactoryDate;
    }

    public void setExFactoryDate(Date exFactoryDate) {
        this.exFactoryDate = exFactoryDate;
    }

    public Date getSecondExFactoryDate() {
        return secondExFactoryDate;
    }

    public void setSecondExFactoryDate(Date secondExFactoryDate) {
        this.secondExFactoryDate = secondExFactoryDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public EPurchaseOrder getStage() {
        return stage;
    }

    public void setStage(EPurchaseOrder stage) {
        this.stage = stage;
    }

    public Date getInitialExFactoryDate() {
        return initialExFactoryDate;
    }

    public void setInitialExFactoryDate(Date initialExFactoryDate) {
        this.initialExFactoryDate = initialExFactoryDate;
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

    public ProformaInvoice getProformaInvoice() {
        return proformaInvoice;
    }

    public void setProformaInvoice(ProformaInvoice proformaInvoice) {
        this.proformaInvoice = proformaInvoice;
    }

    public Set<Article> getArticles() {
        return articles;
    }

    public void setArticles(Set<Article> articles) {
        this.articles = articles;
    }
}
