package com.mycompany.myapp.web.rest;

import java.util.List;

import javax.inject.Inject;

import org.joda.time.LocalDateTime;
import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.http.MediaType;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.myapp.service.AuditEventService;
import com.mycompany.myapp.web.propertyeditors.LocaleDateTimeEditor;

/**
 * REST controller for getting the audit events.
 */
@RestController
@RequestMapping("/api")
public class AuditResource {

    @Inject
    private AuditEventService auditEventService;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(LocalDateTime.class, new LocaleDateTimeEditor("yyyy-MM-dd", false));
    }

    @RequestMapping(value = "/audits/all",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AuditEvent> findAll() {
        return auditEventService.findAll();
    }

    @RequestMapping(value = "/audits/byDates",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<AuditEvent> findByDates(@RequestParam(value = "fromDate") LocalDateTime fromDate,
                                    @RequestParam(value = "toDate") LocalDateTime toDate) {
        return auditEventService.findByDates(fromDate, toDate);
    }
}
