/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.jdkdemo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author armena
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Person implements Serializable {

    private String name;
    private String lastname;
    private Integer age;

}
