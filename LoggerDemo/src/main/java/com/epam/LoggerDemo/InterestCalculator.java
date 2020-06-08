package com.epam.LoggerDemo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class InterestCalculator {
	private static final Logger LOGGER = LogManager.getLogger(CostCalculator.class);
    public void simpleInterest(double p,double n,double r) {
        LOGGER.error((p*n*r)/100.0);
    }

    public void compoundInterest(double p,double n,double r) {
        LOGGER.error(p*(Math.pow((1+(r/ 100.0)),n)));
    }
}