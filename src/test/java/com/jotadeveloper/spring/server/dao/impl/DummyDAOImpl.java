package com.jotadeveloper.spring.server.dao.impl;

import org.springframework.stereotype.Repository;

import com.jotadeveloper.spring.server.dao.DummyDAO;
import com.jotadeveloper.spring.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.jotadeveloper.spring.server.dao.impl.GenericHibernateDAOImpl} methods
 */
@Repository
public class DummyDAOImpl extends GenericHibernateDAOImpl<DummyEntity, Long> implements DummyDAO {
    
}
