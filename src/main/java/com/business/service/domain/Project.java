package com.business.service.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Project {

    private String id;
	private String projectNo;
	private String projName;
	private String program;
	private String member;
	private String projectStatus;
	private String commitmentStatus;
	private double commitmentBalance;
	private String commitmentExpiration;
	private String cisProgramType;
	private String projEffDate;
	private String custNo;
	private String custContactId;
    private String infoBeneficiariesId;
    private Application application;
    private String assignmentId;
    private String currentAssign;
    private String currentAssStDate;
    private Set<String> analystsAssigned;
    private Set<String> managersAssigned;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProjName() {
		return projName;
	}
	public void setProjName(String projName) {
		this.projName = projName;
	}
	public String getProjectNo() {
		return projectNo;
	}
	public void setProjectNo(String projectNo) {
		this.projectNo = projectNo;
	}
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getProjectStatus() {
		return projectStatus;
	}
	public void setProjectStatus(String projectStatus) {
		this.projectStatus = projectStatus;
	}
	public String getCommitmentStatus() {
		return commitmentStatus;
	}
	public void setCommitmentStatus(String commitmentStatus) {
		this.commitmentStatus = commitmentStatus;
	}
	public double getCommitmentBalance() {
		return commitmentBalance;
	}
	public void setCommitmentBalance(double commitmentBalance) {
		this.commitmentBalance = commitmentBalance;
	}
	public String getCommitmentExpiration() {
		return commitmentExpiration;
	}
	public void setCommitmentExpiration(String commitmentExpiration) {
		this.commitmentExpiration = commitmentExpiration;
	}
	public String getCisProgramType() {
		return cisProgramType;
	}
	public void setCisProgramType(String cisProgramType) {
		this.cisProgramType = cisProgramType;
	}
	public String getProjEffDate() {
		return projEffDate;
	}
	public void setProjEffDate(String projEffDate) {
		this.projEffDate = projEffDate;
	}
	public String getCustNo() {
		return custNo;
	}
	public void setCustNo(String custNo) {
		this.custNo = custNo;
	}
	public String getCustContactId() {
		return custContactId;
	}
	public void setCustContactId(String custContactId) {
		this.custContactId = custContactId;
	}

    private Commitment commitment;
//
//    private Assignment assignment;
//
//    private Member member;

    private Loanpool loanpool;

    private Set<Loan> loans = new HashSet<>();

    //    private Set<ProjectLog> projectLogs = new HashSet<>();
//
//    private Set<NotificationHistory> notificationHistories = new HashSet<>();
//
//    private Program program;
    private Set<DrawdownHistory> drawdownHistories = new HashSet<>();

    public Set<DrawdownHistory> getDrawdownHistories() {
        return drawdownHistories;
    }

    public Project drawdownHistories(Set<DrawdownHistory> drawdownHistories) {
        this.drawdownHistories = drawdownHistories;
        return this;
    }

//    public Project addDrawdownHistory(DrawdownHistory drawdownHistory) {
//        this.drawdownHistories.add(drawdownHistory);
//        drawdownHistory.setProject(this);
//        return this;
//    }
//
//    public Project removeDrawdownHistory(DrawdownHistory drawdownHistory) {
//        this.drawdownHistories.remove(drawdownHistory);
//        drawdownHistory.setProject(null);
//        return this;
//    }
//
//    public void setDrawdownHistories(Set<DrawdownHistory> drawdownHistories) {
//        this.drawdownHistories = drawdownHistories;
//    }


    public Project projectNo(String projectNo) {
        this.projectNo = projectNo;
        return this;
    }


    //    public Application getApplication() {
//        return application;
//    }
//
//    public Project application(Application application) {
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
//    public Project infoBeneficiaries(InfoBeneficiaries infoBeneficiaries) {
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

    public Project commitment(Commitment commitment) {
        this.commitment = commitment;
        return this;
    }

    public void setCommitment(Commitment commitment) {
        this.commitment = commitment;
    }

    public String getAssignmentId() {
        return assignmentId;
    }

    public void setAssignmentId(String assignmentId) {
        this.assignmentId = assignmentId;
    }

    public String getInfoBeneficiariesId() {
        return infoBeneficiariesId;
    }

    public void setInfoBeneficiariesId(String infoBeneficiariesId) {
        this.infoBeneficiariesId = infoBeneficiariesId;
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public String getCurrentAssign() {
        return currentAssign;
    }

    public void setCurrentAssign(String currentAssign) {
        this.currentAssign = currentAssign;
    }

    public String getCurrentAssStDate() {
        return currentAssStDate;
    }

    public void setCurrentAssStDate(String currentAssStDate) {
        this.currentAssStDate = currentAssStDate;
    }

    public Set<String> getAnalystsAssigned() {
        return analystsAssigned;
    }

    public void setAnalystsAssigned(Set<String> analystsAssigned) {
        this.analystsAssigned = analystsAssigned;
    }

    public Set<String> getManagersAssigned() {
        return managersAssigned;
    }

    public void setManagersAssigned(Set<String> managersAssigned) {
        this.managersAssigned = managersAssigned;
    }

    //
//    public Assignment getAssignment() {
//        return assignment;
//    }
//
//    public Project assignment(Assignment assignment) {
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
//    public Project member(Member member) {
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

    public Project loanpool(Loanpool loanpool) {
        this.loanpool = loanpool;
        return this;
    }

    public void setLoanpool(Loanpool loanpool) {
        this.loanpool = loanpool;
    }

    public Set<Loan> getLoans() {
        return loans;
    }

    public Project loans(Set<Loan> loans) {
        this.loans = loans;
        return this;
    }

//    public Project addLoan(Loan loan) {
//        this.loans.add(loan);
//        loan.setProject(this);
//        return this;
//    }
//
//    public Project removeLoan(Loan loan) {
//        this.loans.remove(loan);
//        loan.setProject(null);
//        return this;
//    }
//
//    public void setLoans(Set<Loan> loans) {
//        this.loans = loans;
//    }

//    public Set<ProjectLog> getProjectLogs() {
//        return projectLogs;
//    }
//
//    public Project projectLogs(Set<ProjectLog> projectLogs) {
//        this.projectLogs = projectLogs;
//        return this;
//    }
//
//    public Project addProjectLog(ProjectLog projectLog) {
//        this.projectLogs.add(projectLog);
//        projectLog.setProject(this);
//        return this;
//    }
//
//    public Project removeProjectLog(ProjectLog projectLog) {
//        this.projectLogs.remove(projectLog);
//        projectLog.setProject(null);
//        return this;
//    }
//
//    public void setProjectLogs(Set<ProjectLog> projectLogs) {
//        this.projectLogs = projectLogs;
//    }
//
//    public Set<NotificationHistory> getNotificationHistories() {
//        return notificationHistories;
//    }
//
//    public Project notificationHistories(Set<NotificationHistory> notificationHistories) {
//        this.notificationHistories = notificationHistories;
//        return this;
//    }
//
//    public Project addNotificationHistory(NotificationHistory notificationHistory) {
//        this.notificationHistories.add(notificationHistory);
//        notificationHistory.setProject(this);
//        return this;
//    }
//
//    public Project removeNotificationHistory(NotificationHistory notificationHistory) {
//        this.notificationHistories.remove(notificationHistory);
//        notificationHistory.setProject(null);
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
//    public Project program(Program program) {
//        this.program = program;
//        return this;
//    }
//
//    public void setProgram(Program program) {
//        this.program = program;
//    }
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove


}
