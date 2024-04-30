package com.github.mauricioaniche.ck;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Map;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class RFCTest extends BaseTest {

    @BeforeAll
    public void setUp() {
        report = run(fixturesDir() + "/rfc");
    }

    @Test
    public void countMethodInvocations() {
        CKClassResult a = report.get("rfc.GO");
        Assertions.assertEquals(3, a.getRfc());
    }

    @Test
    public void countSuperInvocations() {
        CKClassResult a = report.get("rfc.GO3");
        Assertions.assertEquals(2, a.getRfc());
    }

    @Test
    public void notPossibleToDifferentiateTypesWithStaticAnalysis() {
        CKClassResult a = report.get("rfc.RFC3");
        Assertions.assertEquals(1, a.getRfc());
    }

    @Test
    public void doesNotCountConstructorInvocations() {
        CKClassResult a = report.get("rfc.RFC2");
        Assertions.assertEquals(0, a.getRfc());
    }

    @Test
    public void methodLevel() {
        CKClassResult a = report.get("rfc.GO");
        Assertions.assertEquals(2, a.getMethod("m1/0").get().getRfc());
        Assertions.assertEquals(0, a.getMethod("m2/1[int]").get().getRfc());
        Assertions.assertEquals(1, a.getMethod("m3/0").get().getRfc());
    }

    @Test
    public void noMethodInvocation() {
        CKClassResult a = report.get("rfc.RFC4");
        Assertions.assertEquals(0, a.getRfc());
    }

    @Test
    public void functionalInterface() {
        CKClassResult a = report.get("rfc.RFC5");
        Assertions.assertEquals(3, a.getRfc());
    }

    // Novos casos de teste adicionados abaixo

    @Test
    public void multipleMethodInvocations() {
        CKClassResult a = report.get("rfc.RFC6");
        Assertions.assertEquals(3, a.getRfc());
    }

    @Test
    public void nestedMethodInvocations() {
        CKClassResult a = report.get("rfc.RFC7");
        Assertions.assertEquals(4, a.getRfc());
    }

    @Test
    public void methodInvocationsInDifferentScopes() {
        CKClassResult a = report.get("rfc.RFC8");
        Assertions.assertEquals(2, a.getRfc());
    }

    @Test
    public void methodInvocationsInLambdaExpressions() {
        CKClassResult a = report.get("rfc.RFC9");
        Assertions.assertEquals(3, a.getRfc());
    }

    @Test
    public void overloadedMethodInvocations() {
        CKClassResult a = report.get("rfc.RFC10");
        Assertions.assertEquals(3, a.getRfc());
    }
}