package com.business.service.web.rest.controller;

import com.business.service.service.CreditCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/credit")
@CrossOrigin(origins = "*")
public class CreditCheckController {
    // Logger instance
    private static final Logger logger = LoggerFactory.getLogger(CreditCheckController.class);

    @Autowired
    private CreditCheckService creditCheckService;

    @RequestMapping(value = "/check", method = RequestMethod.GET)
    public boolean getProjectInfoBeneficiaries(@RequestParam String projectNo) {
        boolean response = creditCheckService.isSatisfyingAllCreditChecksConditions(projectNo);

        if (logger.isDebugEnabled()) {
            logger.debug("result: '" + response + "'");
            logger.debug("End getSomething");
        }
        return response;
    }

}
