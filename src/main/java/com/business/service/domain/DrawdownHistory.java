package com.business.service.domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A DrawdownHistory.
 */

public class DrawdownHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private LocalDate date;

    private String note;

    private String status;

    private String amount;

    private String term;

    private String rate;

    private LocalDate maturityDate;

    private String intSubsidyAl;

    private String intSubsidyCr;

    private Projectpojo project;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public DrawdownHistory date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public DrawdownHistory note(String note) {
        this.note = note;
        return this;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getStatus() {
        return status;
    }

    public DrawdownHistory status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAmount() {
        return amount;
    }

    public DrawdownHistory amount(String amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTerm() {
        return term;
    }

    public DrawdownHistory term(String term) {
        this.term = term;
        return this;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getRate() {
        return rate;
    }

    public DrawdownHistory rate(String rate) {
        this.rate = rate;
        return this;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public DrawdownHistory maturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
        return this;
    }

    public void setMaturityDate(LocalDate maturityDate) {
        this.maturityDate = maturityDate;
    }

    public String getIntSubsidyAl() {
        return intSubsidyAl;
    }

    public DrawdownHistory intSubsidyAl(String intSubsidyAl) {
        this.intSubsidyAl = intSubsidyAl;
        return this;
    }

    public void setIntSubsidyAl(String intSubsidyAl) {
        this.intSubsidyAl = intSubsidyAl;
    }

    public String getIntSubsidyCr() {
        return intSubsidyCr;
    }

    public DrawdownHistory intSubsidyCr(String intSubsidyCr) {
        this.intSubsidyCr = intSubsidyCr;
        return this;
    }

    public void setIntSubsidyCr(String intSubsidyCr) {
        this.intSubsidyCr = intSubsidyCr;
    }

    public Projectpojo getProjectpojo() {
        return project;
    }

    public DrawdownHistory project(Projectpojo project) {
        this.project = project;
        return this;
    }

    public void setProjectpojo(Projectpojo project) {
        this.project = project;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DrawdownHistory)) {
            return false;
        }
        return id != null && id.equals(((DrawdownHistory) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "DrawdownHistory{" +
            "id=" + getId() +
            ", date='" + getDate() + "'" +
            ", note='" + getNote() + "'" +
            ", status='" + getStatus() + "'" +
            ", amount='" + getAmount() + "'" +
            ", term='" + getTerm() + "'" +
            ", rate='" + getRate() + "'" +
            ", maturityDate='" + getMaturityDate() + "'" +
            ", intSubsidyAl='" + getIntSubsidyAl() + "'" +
            ", intSubsidyCr='" + getIntSubsidyCr() + "'" +
            "}";
    }
}
