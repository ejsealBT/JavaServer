package com.bottomline.javaserver.api.impl;

import com.bottomline.javaserver.api.*;
import com.bottomline.javaserver.model.Employee;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;


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
    public Employee getEmployeeDetails(Integer employeeId) {
        // TODO: Implement...
        
        return null;
    }
    
}

