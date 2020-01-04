package com.business.service.domain;

import java.util.HashSet;
import java.util.Set;

public class Projectpojo {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String projectNo;

    private String projectName;

    private String projectStatus;

    //    private Application application;
//
//    private InfoBeneficiaries infoBeneficiaries;
//
    private Commitment commitment;
//
//    private Assignment assignment;
//
//    private Member member;

    private Loanpool loanpool;

    private Set<Loan> loans = new HashSet<>();

    //    private Set<ProjectpojoLog> projectLogs = new HashSet<>();
//
//    private Set<NotificationHistory> notificationHistories = new HashSet<>();
//
//    private Program program;
    private Set<DrawdownHistory> drawdownHistories = new HashSet<>();

    public Set<DrawdownHistory> getDrawdownHistories() {
        return drawdownHistories;
    }

    public Projectpojo drawdownHistories(Set<DrawdownHistory> drawdownHistories) {
        this.drawdownHistories = drawdownHistories;
        return this;
    }

    public Projectpojo addDrawdownHistory(DrawdownHistory drawdownHistory) {
        this.drawdownHistories.add(drawdownHistory);
        drawdownHistory.setProjectpojo(this);
        return this;
    }

    public Projectpojo removeDrawdownHistory(DrawdownHistory drawdownHistory) {
        this.drawdownHistories.remove(drawdownHistory);
        drawdownHistory.setProjectpojo(null);
        return this;
    }

    public void setDrawdownHistories(Set<DrawdownHistory> drawdownHistories) {
        this.drawdownHistories = drawdownHistories;
    }

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProjectpojoNo() {
        return projectNo;
    }

    public Projectpojo projectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }

    public void setProjectpojoNo(String projectNo) {
        this.projectNo = projectNo;
    }

    public String getProjectpojoName() {
        return projectName;
    }

    public Projectpojo projectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public void setProjectpojoName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectpojoStatus() {
        return projectStatus;
    }

    public Projectpojo projectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }

    public void setProjectpojoStatus(String projectStatus) {
        this.projectStatus = projectStatus;
    }

    //    public Application getApplication() {
//        return application;
//    }
//
//    public Projectpojo application(Application application) {
//        this.application = application;
//        return this;
//    }
//
//    public void setApplication(Application application) {
//        this.application = application;
//    }
//
//    public InfoBeneficiaries getInfoBeneficiaries() {
//        return infoBeneficiaries;
//    }
//
//    public Projectpojo infoBeneficiaries(InfoBeneficiaries infoBeneficiaries) {
//        this.infoBeneficiaries = infoBeneficiaries;
//        return this;
//    }
//
//    public void setInfoBeneficiaries(InfoBeneficiaries infoBeneficiaries) {
//        this.infoBeneficiaries = infoBeneficiaries;
//    }
//
    public Commitment getCommitment() {
        return commitment;
    }

    public Projectpojo commitment(Commitment commitment) {
        this.commitment = commitment;
        return this;
    }

    public void setCommitment(Commitment commitment) {
        this.commitment = commitment;
    }
//
//    public Assignment getAssignment() {
//        return assignment;
//    }
//
//    public Projectpojo assignment(Assignment assignment) {
//        this.assignment = assignment;
//        return this;
//    }
//
//    public void setAssignment(Assignment assignment) {
//        this.assignment = assignment;
//    }
//
//    public Member getMember() {
//        return member;
//    }
//
//    public Projectpojo member(Member member) {
//        this.member = member;
//        return this;
//    }
//
//    public void setMember(Member member) {
//        this.member = member;
//    }

    public Loanpool getLoanpool() {
        return loanpool;
    }

    public Projectpojo loanpool(Loanpool loanpool) {
        this.loanpool = loanpool;
        return this;
    }

    public void setLoanpool(Loanpool loanpool) {
        this.loanpool = loanpool;
    }

    public Set<Loan> getLoans() {
        return loans;
    }

    public Projectpojo loans(Set<Loan> loans) {
        this.loans = loans;
        return this;
    }

    public Projectpojo addLoan(Loan loan) {
        this.loans.add(loan);
        loan.setProjectpojo(this);
        return this;
    }

    public Projectpojo removeLoan(Loan loan) {
        this.loans.remove(loan);
        loan.setProjectpojo(null);
        return this;
    }

    public void setLoans(Set<Loan> loans) {
        this.loans = loans;
    }

//    public Set<ProjectpojoLog> getProjectpojoLogs() {
//        return projectLogs;
//    }
//
//    public Projectpojo projectLogs(Set<ProjectpojoLog> projectLogs) {
//        this.projectLogs = projectLogs;
//        return this;
//    }
//
//    public Projectpojo addProjectpojoLog(ProjectpojoLog projectLog) {
//        this.projectLogs.add(projectLog);
//        projectLog.setProjectpojo(this);
//        return this;
//    }
//
//    public Projectpojo removeProjectpojoLog(ProjectpojoLog projectLog) {
//        this.projectLogs.remove(projectLog);
//        projectLog.setProjectpojo(null);
//        return this;
//    }
//
//    public void setProjectpojoLogs(Set<ProjectpojoLog> projectLogs) {
//        this.projectLogs = projectLogs;
//    }
//
//    public Set<NotificationHistory> getNotificationHistories() {
//        return notificationHistories;
//    }
//
//    public Projectpojo notificationHistories(Set<NotificationHistory> notificationHistories) {
//        this.notificationHistories = notificationHistories;
//        return this;
//    }
//
//    public Projectpojo addNotificationHistory(NotificationHistory notificationHistory) {
//        this.notificationHistories.add(notificationHistory);
//        notificationHistory.setProjectpojo(this);
//        return this;
//    }
//
//    public Projectpojo removeNotificationHistory(NotificationHistory notificationHistory) {
//        this.notificationHistories.remove(notificationHistory);
//        notificationHistory.setProjectpojo(null);
//        return this;
//    }
//
//    public void setNotificationHistories(Set<NotificationHistory> notificationHistories) {
//        this.notificationHistories = notificationHistories;
//    }
//
//    public Program getProgram() {
//        return program;
//    }
//
//    public Projectpojo program(Program program) {
//        this.program = program;
//        return this;
//    }
//
//    public void setProgram(Program program) {
//        this.program = program;
//    }
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Projectpojo)) {
            return false;
        }
        return id != null && id.equals(((Projectpojo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Projectpojo{" +
            "id=" + getId() +
            ", projectNo='" + getProjectpojoNo() + "'" +
            ", projectName='" + getProjectpojoName() + "'" +
            ", projectStatus='" + getProjectpojoStatus() + "'" +
            "}";
    }
}
