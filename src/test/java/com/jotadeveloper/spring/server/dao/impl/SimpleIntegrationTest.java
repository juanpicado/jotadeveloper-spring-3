package com.jotadeveloper.spring.server.dao.impl;

import javax.annotation.Resource;

import org.junit.Test;

import com.jotadeveloper.spring.ApplicationContextAwareTest;
import com.jotadeveloper.spring.server.dao.DummyDAO;
import com.jotadeveloper.spring.server.entity.DummyEntity;

import static org.junit.Assert.assertEquals;

/**
 * 
 */
public class SimpleIntegrationTest extends ApplicationContextAwareTest {

    @Resource
    private DummyDAO dummyDAO;

    /**
     * Tries to store {@link com.jotadeveloper.spring.server.entity.DummyEntity}.
     */
    @Test
    public void testPersistTestEntity() {
        int countBefore = dummyDAO.findAll().size();
        DummyEntity dummyEntity = new DummyEntity();
        dummyDAO.makePersistent(dummyEntity);

        int countAfter = dummyDAO.findAll().size();
        assertEquals(countBefore + 1, countAfter);
    }
}
