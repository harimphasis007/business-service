package com.business.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class ProjectLogpojo {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String worker;

    private String entryDetails;

    private LocalDate date;

    private Projectpojo project;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWorker() {
        return worker;
    }

    public ProjectLogpojo worker(String worker) {
        this.worker = worker;
        return this;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getEntryDetails() {
        return entryDetails;
    }

    public ProjectLogpojo entryDetails(String entryDetails) {
        this.entryDetails = entryDetails;
        return this;
    }

    public void setEntryDetails(String entryDetails) {
        this.entryDetails = entryDetails;
    }

    public LocalDate getDate() {
        return date;
    }

    public ProjectLogpojo date(LocalDate date) {
        this.date = date;
        return this;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Projectpojo getProjectpojo() {
        return project;
    }

    public ProjectLogpojo project(Projectpojo project) {
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
        if (!(o instanceof ProjectLogpojo)) {
            return false;
        }
        return id != null && id.equals(((ProjectLogpojo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "ProjectLogpojo{" +
            "id=" + getId() +
            ", worker='" + getWorker() + "'" +
            ", entryDetails='" + getEntryDetails() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
