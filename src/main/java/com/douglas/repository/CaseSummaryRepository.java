package com.douglas.repository;

import com.douglas.domain.CaseSummary;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Douglas Manzelmann on 5/18/2016.
 */
public interface CaseSummaryRepository extends CrudRepository<CaseSummary, Long> {

    CaseSummary findById(Long id);
}
