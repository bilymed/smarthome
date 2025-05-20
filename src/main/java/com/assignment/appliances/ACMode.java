package com.assignment.appliances;

/**
 * Enumeration of air conditioner modes.
 */
public enum ACMode {
    OFF("Off"),
    COOL("Cool"),
    HEAT("Heat");

    private final String displayName;

    ACMode(String name) {
        this.displayName = name;
    }

    public static ACMode valueOfModeName(String modeName) {
        if (modeName == null || modeName.trim().isEmpty()) {
            throw new IllegalArgumentException("Mode name cannot be null or empty.");
        }
        for (ACMode mode : values()) {
            if (mode.name().equalsIgnoreCase(modeName) || mode.displayName.equalsIgnoreCase(modeName)) {
                return mode;
            }
        }
        throw new IllegalArgumentException("Unknown mode name: " + modeName);
    }

    public String getDisplayName() {
        return displayName;
    }
}
