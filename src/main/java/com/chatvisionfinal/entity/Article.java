package com.chatvisionfinal.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientStyleName;
    private String upperMaterial;
    private String insoleMaterial;
    private String liningMaterial;
    private String outsoleMaterial;
    private String upperColor;
    private String pi_price;
    private String po_price;
    private Long totalQty;
    private String imgPath;
    private String pi_no;
    private String po_no;
    private String price;
    private String category;
    private String subCategory;
    private Boolean split;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "po_no", insertable = false, updatable = false)
    private PurchaseOrder purchaseOrder;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pi_no", insertable = false, updatable = false)
    private ProformaInvoice proformaInvoice;
    public Article(){

    }

    public Article(Long id, String clientStyleName, String upperMaterial, String insoleMaterial, String liningMaterial, String outsoleMaterial, String upperColor, String pi_price, String po_price, Long totalQty, String imgPath, String pi_no, String po_no, String price, String category, String subCategory, Boolean split) {
        this.id = id;
        this.clientStyleName = clientStyleName;
        this.upperMaterial = upperMaterial;
        this.insoleMaterial = insoleMaterial;
        this.liningMaterial = liningMaterial;
        this.outsoleMaterial = outsoleMaterial;
        this.upperColor = upperColor;
        this.pi_price = pi_price;
        this.po_price = po_price;
        this.totalQty = totalQty;
        this.imgPath = imgPath;
        this.pi_no = pi_no;
        this.po_no = po_no;
        this.price = price;
        this.category = category;
        this.subCategory = subCategory;
        this.split = split;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClientStyleName() {
        return clientStyleName;
    }

    public void setClientStyleName(String clientStyleName) {
        this.clientStyleName = clientStyleName;
    }

    public String getUpperMaterial() {
        return upperMaterial;
    }

    public void setUpperMaterial(String upperMaterial) {
        this.upperMaterial = upperMaterial;
    }

    public String getInsoleMaterial() {
        return insoleMaterial;
    }

    public void setInsoleMaterial(String insoleMaterial) {
        this.insoleMaterial = insoleMaterial;
    }

    public String getLiningMaterial() {
        return liningMaterial;
    }

    public void setLiningMaterial(String liningMaterial) {
        this.liningMaterial = liningMaterial;
    }

    public String getOutsoleMaterial() {
        return outsoleMaterial;
    }

    public void setOutsoleMaterial(String outsoleMaterial) {
        this.outsoleMaterial = outsoleMaterial;
    }

    public String getUpperColor() {
        return upperColor;
    }

    public void setUpperColor(String upperColor) {
        this.upperColor = upperColor;
    }

    public String getPi_price() {
        return pi_price;
    }

    public void setPi_price(String pi_price) {
        this.pi_price = pi_price;
    }

    public String getPo_price() {
        return po_price;
    }

    public void setPo_price(String po_price) {
        this.po_price = po_price;
    }

    public Long getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(Long totalQty) {
        this.totalQty = totalQty;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public String getPi_no() {
        return pi_no;
    }

    public void setPi_no(String pi_no) {
        this.pi_no = pi_no;
    }

    public String getPo_no() {
        return po_no;
    }

    public void setPo_no(String po_no) {
        this.po_no = po_no;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public Boolean getSplit() {
        return split;
    }

    public void setSplit(Boolean split) {
        this.split = split;
    }

    public PurchaseOrder getPurchaseOrder() {
        return purchaseOrder;
    }

    public void setPurchaseOrder(PurchaseOrder purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public ProformaInvoice getProformaInvoice() {
        return proformaInvoice;
    }

    public void setProformaInvoice(ProformaInvoice proformaInvoice) {
        this.proformaInvoice = proformaInvoice;
    }
}

