package com.business.service.domain;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * A Commitment.
 */
public class Commitment implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String commitmentStatus;

    private String commitmentBal;

    private LocalDate commitmentExpiration;

    private LocalDate commenceDate;

    private String avaiableBal;

    private String totalDrawdowns;

    private String recentDrawdown;

    private String amountExpiring;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCommitmentStatus() {
        return commitmentStatus;
    }

    public Commitment commitmentStatus(String commitmentStatus) {
        this.commitmentStatus = commitmentStatus;
        return this;
    }

    public void setCommitmentStatus(String commitmentStatus) {
        this.commitmentStatus = commitmentStatus;
    }

    public String getCommitmentBal() {
        return commitmentBal;
    }

    public Commitment commitmentBal(String commitmentBal) {
        this.commitmentBal = commitmentBal;
        return this;
    }

    public void setCommitmentBal(String commitmentBal) {
        this.commitmentBal = commitmentBal;
    }

    public LocalDate getCommitmentExpiration() {
        return commitmentExpiration;
    }

    public Commitment commitmentExpiration(LocalDate commitmentExpiration) {
        this.commitmentExpiration = commitmentExpiration;
        return this;
    }

    public void setCommitmentExpiration(LocalDate commitmentExpiration) {
        this.commitmentExpiration = commitmentExpiration;
    }

    public LocalDate getCommenceDate() {
        return commenceDate;
    }

    public Commitment commenceDate(LocalDate commenceDate) {
        this.commenceDate = commenceDate;
        return this;
    }

    public void setCommenceDate(LocalDate commenceDate) {
        this.commenceDate = commenceDate;
    }

    public String getAvaiableBal() {
        return avaiableBal;
    }

    public Commitment avaiableBal(String avaiableBal) {
        this.avaiableBal = avaiableBal;
        return this;
    }

    public void setAvaiableBal(String avaiableBal) {
        this.avaiableBal = avaiableBal;
    }

    public String getTotalDrawdowns() {
        return totalDrawdowns;
    }

    public Commitment totalDrawdowns(String totalDrawdowns) {
        this.totalDrawdowns = totalDrawdowns;
        return this;
    }

    public void setTotalDrawdowns(String totalDrawdowns) {
        this.totalDrawdowns = totalDrawdowns;
    }

    public String getRecentDrawdown() {
        return recentDrawdown;
    }

    public Commitment recentDrawdown(String recentDrawdown) {
        this.recentDrawdown = recentDrawdown;
        return this;
    }

    public void setRecentDrawdown(String recentDrawdown) {
        this.recentDrawdown = recentDrawdown;
    }

    public String getAmountExpiring() {
        return amountExpiring;
    }

    public Commitment amountExpiring(String amountExpiring) {
        this.amountExpiring = amountExpiring;
        return this;
    }

    public void setAmountExpiring(String amountExpiring) {
        this.amountExpiring = amountExpiring;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Commitment)) {
            return false;
        }
        return id != null && id.equals(((Commitment) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Commitment{" +
            "id=" + getId() +
            ", commitmentStatus='" + getCommitmentStatus() + "'" +
            ", commitmentBal='" + getCommitmentBal() + "'" +
            ", commitmentExpiration='" + getCommitmentExpiration() + "'" +
            ", commenceDate='" + getCommenceDate() + "'" +
            ", avaiableBal='" + getAvaiableBal() + "'" +
            ", totalDrawdowns='" + getTotalDrawdowns() + "'" +
            ", recentDrawdown='" + getRecentDrawdown() + "'" +
            ", amountExpiring='" + getAmountExpiring() + "'" +
            "}";
    }
}
