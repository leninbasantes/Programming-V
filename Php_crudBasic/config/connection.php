<?php

class Connection
{
    var $DB_USER = 'root';
    var $DB_PASS = '12345678';
    var $DB_HOST = 'localhost';
    var $DB_NAME = 'vinylstilos';

    function get_dbuser()
    {
        return $this->DB_USER;
    }
    function get_dbpass()
    {
        return $this->DB_PASS;
    }
    function get_dbhost()
    {
        return $this->DB_HOST;
    }
    function get_dbname()
    {
        return $this->DB_NAME;
    }
}
