package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.Employee;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Swagger Employee Demo
 *
 * <p>Sample Swagger Demo
 *
 */
public class EmployeeApiServiceImpl implements EmployeeApi {
    /**
     * Find employee by ID
     *
     * Returns a single Employee
     *
     */
    public Employee getEmployeeDetails(Long employeeId) {
        // TODO: Implement...
        
        return null;
    }
    
}

