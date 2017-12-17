import lib2017.integration.DAOService;

module integration {
    requires model;
    requires utils;
    requires org.osgi.core;
    exports lib2017.integration;
    uses DAOService;
}