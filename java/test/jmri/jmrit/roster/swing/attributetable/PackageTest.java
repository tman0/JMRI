// PackageTest.java

package jmri.jmrit.roster.swing.attributetable;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Tests for the jmrit.roster.swing.attributetable package 
 * @author	Bob Jacobsen     Copyright (C) 2001, 2002, 2012
 * @version     $Revision$
 */
public class PackageTest extends TestCase {


    // from here down is testing infrastructure

    public PackageTest(String s) {
        super(s);
    }

    // Main entry point
    static public void main(String[] args) {
        String[] testCaseName = {"-noloading", PackageTest.class.getName()};
        junit.swingui.TestRunner.main(testCaseName);
    }

    // test suite from all defined tests
    public static Test suite() {
        TestSuite suite = new TestSuite("jmri.jmrit.roster.swing.attributetable.PackageTest");

        suite.addTest(AttributeTableModelTest.suite());
        
        return suite;
    }

    // The minimal setup for log4J
    protected void setUp() { apps.tests.Log4JFixture.setUp(); }
    protected void tearDown() { apps.tests.Log4JFixture.tearDown(); }

}
