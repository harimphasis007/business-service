package com.business.service.domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Loan.
 */
public class Loan implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;

    private String loanid;

    private LocalDate settelmentDate;


    private String amount;

    private String term;

    private String propertyAddress;

    private String mbsPoolId;

    private String mbsQualifies;

    private String qualificationMethod;

    private String decision;

    private String rejectionReason;

    private Projectpojo project;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoanid() {
        return loanid;
    }

    public Loan loanid(String loanid) {
        this.loanid = loanid;
        return this;
    }

    public void setLoanid(String loanid) {
        this.loanid = loanid;
    }

    public LocalDate getSettelmentDate() {
        return settelmentDate;
    }

    public Loan settelmentDate(LocalDate settelmentDate) {
        this.settelmentDate = settelmentDate;
        return this;
    }

    public void setSettelmentDate(LocalDate settelmentDate) {
        this.settelmentDate = settelmentDate;
    }

    public String getAmount() {
        return amount;
    }

    public Loan amount(String amount) {
        this.amount = amount;
        return this;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getTerm() {
        return term;
    }

    public Loan term(String term) {
        this.term = term;
        return this;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getPropertyAddress() {
        return propertyAddress;
    }

    public Loan propertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
        return this;
    }

    public void setPropertyAddress(String propertyAddress) {
        this.propertyAddress = propertyAddress;
    }

    public String getMbsPoolId() {
        return mbsPoolId;
    }

    public Loan mbsPoolId(String mbsPoolId) {
        this.mbsPoolId = mbsPoolId;
        return this;
    }

    public void setMbsPoolId(String mbsPoolId) {
        this.mbsPoolId = mbsPoolId;
    }

    public String getMbsQualifies() {
        return mbsQualifies;
    }

    public Loan mbsQualifies(String mbsQualifies) {
        this.mbsQualifies = mbsQualifies;
        return this;
    }

    public void setMbsQualifies(String mbsQualifies) {
        this.mbsQualifies = mbsQualifies;
    }

    public String getQualificationMethod() {
        return qualificationMethod;
    }

    public Loan qualificationMethod(String qualificationMethod) {
        this.qualificationMethod = qualificationMethod;
        return this;
    }

    public void setQualificationMethod(String qualificationMethod) {
        this.qualificationMethod = qualificationMethod;
    }

    public String getDecision() {
        return decision;
    }

    public Loan decision(String decision) {
        this.decision = decision;
        return this;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getRejectionReason() {
        return rejectionReason;
    }

    public Loan rejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
        return this;
    }

    public void setRejectionReason(String rejectionReason) {
        this.rejectionReason = rejectionReason;
    }

    public Projectpojo getProjectpojo() {
        return project;
    }

    public Loan project(Projectpojo project) {
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
        if (!(o instanceof Loan)) {
            return false;
        }
        return id != null && id.equals(((Loan) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Loan{" +
            "id=" + getId() +
            ", loanid='" + getLoanid() + "'" +
            ", settelmentDate='" + getSettelmentDate() + "'" +
            ", amount='" + getAmount() + "'" +
            ", term='" + getTerm() + "'" +
            ", propertyAddress='" + getPropertyAddress() + "'" +
            ", mbsPoolId='" + getMbsPoolId() + "'" +
            ", mbsQualifies='" + getMbsQualifies() + "'" +
            ", qualificationMethod='" + getQualificationMethod() + "'" +
            ", decision='" + getDecision() + "'" +
            ", rejectionReason='" + getRejectionReason() + "'" +
            "}";
    }
}
