/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
 *
 */

package com.pabloriosramirez.springboot.jasperreports.service;

import com.pabloriosramirez.springboot.jasperreports.model.Customer;
import java.util.List;

public interface ICustomerService {

    List<Customer> findAll();
}
