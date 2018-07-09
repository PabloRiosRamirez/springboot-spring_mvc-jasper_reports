/**
 * @author Pablo Ríos Ramírez
 * @Created 28-06-2018 2:43:46
 * @web http://www.pabloriosramirez.com
 *
 */

package com.pabloriosramirez.springboot.jasperreports.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {
    private Integer ID;
    private String  FIRSTNAME;
    private String  LASTNAME;
    private String  STREET;
    private String  CITY;
}
