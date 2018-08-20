/*
 *
 *  Certain versions of software and/or documents (“Material”) accessible here may contain branding from
 *  Hewlett-Packard Company (now HP Inc.) and Hewlett Packard Enterprise Company.  As of September 1, 2017,
 *  the Material is now offered by Micro Focus, a separately owned and operated company.  Any reference to the HP
 *  and Hewlett Packard Enterprise/HPE marks is historical in nature, and the HP and Hewlett Packard Enterprise/HPE
 *  marks are the property of their respective owners.
 * __________________________________________________________________
 * MIT License
 *
 * © Copyright 2012-2018 Micro Focus or one of its affiliates.
 *
 * The only warranties for products and services of Micro Focus and its affiliates
 * and licensors (“Micro Focus”) are set forth in the express warranty statements
 * accompanying such products and services. Nothing herein should be construed as
 * constituting an additional warranty. Micro Focus shall not be liable for technical
 * or editorial errors or omissions contained herein.
 * The information contained herein is subject to change without notice.
 * ___________________________________________________________________
 *
 */

package com.microfocus.application.automation.tools.results.parser.jenkinsjunit;
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.23 at 04:30:11 PM CST 
//




import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hp.alm.qc.qualitymanagement.entities.reportparsing.jenkinsjunitreport package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hp.alm.qc.qualitymanagement.entities.reportparsing.jenkinsjunitreport
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Result.Suites }
     * 
     */
    public Result.Suites createResultSuites() {
        return new Result.Suites();
    }

    /**
     * Create an instance of {@link Result.Suites.Suite }
     * 
     */
    public Result.Suites.Suite createResultSuitesSuite() {
        return new Result.Suites.Suite();
    }

    /**
     * Create an instance of {@link Result.Suites.Suite.Cases }
     * 
     */
    public Result.Suites.Suite.Cases createResultSuitesSuiteCases() {
        return new Result.Suites.Suite.Cases();
    }

    /**
     * Create an instance of {@link NewDataSet }
     * 
     */
    public NewDataSet createNewDataSet() {
        return new NewDataSet();
    }

    /**
     * Create an instance of {@link Result.Suites.Suite.Cases.Case }
     * 
     */
    public Result.Suites.Suite.Cases.Case createResultSuitesSuiteCasesCase() {
        return new Result.Suites.Suite.Cases.Case();
    }

}
