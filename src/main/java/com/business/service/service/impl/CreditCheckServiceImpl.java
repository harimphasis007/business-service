package com.business.service.service.impl;

import com.business.service.service.CreditCheckService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class CreditCheckServiceImpl implements CreditCheckService {
    private final Logger log = LoggerFactory.getLogger(CreditCheckServiceImpl.class);

    public boolean isSatisfyingAllCreditChecksConditions(final String projectNo) {
        if ("5000".equals(projectNo) || "4999".equals(projectNo)) {
            return false;
        }
        return true;
    }
}
