package com.business.service.web.rest;

import com.business.service.domain.Commitment;
import com.business.service.domain.DrawdownHistory;
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
public class CommitmentResource {

    private final Logger log = LoggerFactory.getLogger(CommitmentResource.class);

    @Autowired
    RestTemplate restTemplate;

    @Value("${dataserviceuri}")
    String uri;


    /**
     * {@code GET  /commitmentsbyproject/:projectId} : get the "id" commitment.
     *
     * @param projectId the id of the commitment to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the commitment, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/commitmentsbyproject/{projectId}")
    public Commitment getCommitment(@PathVariable String projectId) {
        log.debug("REST request to get Commitment : {}", projectId);
        Projectpojo project = getProjectpojo(projectId);

        return project.getCommitment();

    }

    /**
     * {@code GET  /drawdownhistoriesbyproject/projectId } : get all the loans pools by projectId.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of loans in body.
     */

    @GetMapping("/drawdownhistoriesbyproject/{projectId}")
    public List<DrawdownHistory> getDrawdownHistory(@PathVariable String projectId) {
        log.debug("REST request to get DrawdownHistory : {}", projectId);
        Projectpojo project = getProjectpojo(projectId);

        ResponseEntity<DrawdownHistory[]> responseEntity =
            restTemplate.getForEntity(uri + "drawdownhistoriesbyproject/" + project.getId(), DrawdownHistory[].class);
        return Arrays.asList(responseEntity.getBody());
    }

    private Projectpojo getProjectpojo(@PathVariable String projectId) {
        log.debug("REST request to get commitment : {}", projectId);
        return restTemplate.getForObject(
            uri + "projectsbyprojectid/" + projectId, Projectpojo.class);
    }

}
