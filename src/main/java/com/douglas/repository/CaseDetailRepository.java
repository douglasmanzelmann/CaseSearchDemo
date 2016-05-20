package com.douglas.repository;

import com.douglas.domain.CaseDetail;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Douglas Manzelmann on 5/18/2016.
 */
public interface CaseDetailRepository extends CrudRepository<CaseDetail, Long> {

    CaseDetail findById(Long id);
}
