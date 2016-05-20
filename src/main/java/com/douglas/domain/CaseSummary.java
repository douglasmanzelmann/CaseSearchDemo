package com.douglas.domain;

import javax.persistence.*;

/**
 * Created by Douglas Manzelmann on 5/18/2016.
 */

@Entity
public class CaseSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "case_summary_id")
    private Long id;

    private String caseNumber;
    private String name;
    private String dateOfBirth;
    private String partyType;
    private String court;
    private String caseType;
    private String filingDate;
    private String caseCaption;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "case_detail_id")
    private CaseDetail caseDetail;

    public CaseSummary() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPartyType() {
        return partyType;
    }

    public void setPartyType(String partyType) {
        this.partyType = partyType;
    }

    public String getCourt() {
        return court;
    }

    public void setCourt(String court) {
        this.court = court;
    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(String filingDate) {
        this.filingDate = filingDate;
    }

    public String getCaseCaption() {
        return caseCaption;
    }

    public void setCaseCaption(String caseCaption) {
        this.caseCaption = caseCaption;
    }

    public CaseDetail getCaseDetail() {
        return caseDetail;
    }

    public void setCaseDetail(CaseDetail caseDetail) {
        this.caseDetail = caseDetail;
    }
}
