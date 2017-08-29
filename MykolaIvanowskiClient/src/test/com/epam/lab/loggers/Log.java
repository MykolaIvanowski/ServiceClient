package com.epam.lab.loggers;

import org.apache.log4j.Logger;

public class Log {
    private static Logger LOG = Logger.getLogger(Log.class);

    public static void infoLog(String message){
        LOG.info(message);
    }

    public static  void errorLog(String message){
        LOG.error(message);
    }
}
