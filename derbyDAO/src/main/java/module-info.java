import lib2017.integration.DAOService;

module derbyDAO {
    requires java.sql;
    requires integration;
    requires model;
    requires utils;
    requires org.osgi.core;
    requires derby;
    provides DAOService with lib2017.derbyDAO.impl.DerbyDAOService;

}