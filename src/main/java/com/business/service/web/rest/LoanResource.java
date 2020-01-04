package com.business.service.web.rest;

import com.business.service.domain.Loan;
import com.business.service.domain.Loanpool;
import com.business.service.domain.Projectpojo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;


@RestController
@CrossOrigin(origins = "*")
public class LoanResource {

    private final Logger log = LoggerFactory.getLogger(LoanResource.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${dataserviceuri}")
    String uri;

    /**
     * {@code GET  /loansbyproject/projectId } : get all the loans by projectId.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of loans in body.
     */
    @GetMapping("/loansbyproject/{projectId}")
    public List<Loan> getAllLoansByProjectpojo(@PathVariable String projectId) {
        Projectpojo project = getProjectpojo(projectId);


        ResponseEntity<Loan[]> responseEntity =
            restTemplate.getForEntity(uri + "loansbyproject/" + project.getId(), Loan[].class);
        return Arrays.asList(responseEntity.getBody());
    }

    /**
     * {@code GET  /loanspoolbyproject/projectId } : get all the loans pools by projectId.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of loans in body.
     */

    @GetMapping("/loanspoolbyproject/{projectId}")
    public Loanpool getLoansPoolByProjectpojo(@PathVariable String projectId) {
        Projectpojo project = getProjectpojo(projectId);
        return project.getLoanpool();
    }


    private Projectpojo getProjectpojo(@PathVariable String projectId) {
        log.debug("REST request to get Loan : {}", projectId);
        return restTemplate.getForObject(
            uri + "projectsbyprojectid/" + projectId, Projectpojo.class);
    }

}
