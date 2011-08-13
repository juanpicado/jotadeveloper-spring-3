package com.jotadeveloper.spring.server.dao;

import com.jotadeveloper.spring.server.entity.DummyEntity;

/**
 * Plain DAO which provides only {@link com.jotadeveloper.spring.server.dao.impl.GenericHibernateDAOImpl} methods
 */
public interface DummyDAO extends GenericDAO<DummyEntity, Long> {
}
