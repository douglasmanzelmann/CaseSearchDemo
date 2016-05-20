package com.douglas.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Douglas Manzelmann on 5/18/2016.
 */

@Entity
public class CaseDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "case_detail_id")
    private Long id;

    private String plaintiff;
    private String defendant;
    private String relatedPerson;
    //private List<String> documentTracking;

    public CaseDetail() { }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlaintiff() {
        return plaintiff;
    }

    public void setPlaintiff(String plaintiff) {
        this.plaintiff = plaintiff;
    }

    public String getDefendant() {
        return defendant;
    }

    public void setDefendant(String defendant) {
        this.defendant = defendant;
    }

    public String getRelatedPerson() {
        return relatedPerson;
    }

    public void setRelatedPerson(String relatedPerson) {
        this.relatedPerson = relatedPerson;
    }

/*    public List<String> getDocumentTracking() {
        return documentTracking;
    }

    public void setDocumentTracking(List<String> documentTracking) {
        this.documentTracking = documentTracking;
    }*/
}
