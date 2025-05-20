package com.assignment.appliances;

/**
 * Enumeration, represents the speeds of a Fan.
 */
public enum FanSpeed {
    OFF(0, "off"),
    LOW(1, "low speed"),
    HIGH(2, "High speed");

    private final int numericValue;
    private final String description;

    FanSpeed(int numericValue, String description) {
        this.numericValue = numericValue;
        this.description = description;
    }

    /**
     * Converts a numeric speed value to a FanSpeed enum.
     * @param speedNumericValue (0, 1, 2)
     * @return The FanSpeed enum.
     */
    public static FanSpeed fromNumericValue(int speedNumericValue){
        for (FanSpeed speed: values()){
            if (speed.getNumericValue() == speedNumericValue){
                return speed;
            }
        }
        throw new IllegalArgumentException("Invalid Numeric Speed Value: " + speedNumericValue);
    }

    public int getNumericValue() {
        return numericValue;
    }

    public String getDescription() {
        return description;
    }
}
