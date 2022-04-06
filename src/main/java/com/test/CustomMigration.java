package com.test;

import liquibase.change.custom.CustomTaskChange;
import liquibase.database.Database;
import liquibase.exception.CustomChangeException;
import liquibase.exception.SetupException;
import liquibase.exception.ValidationErrors;
import liquibase.resource.ResourceAccessor;

public class CustomMigration implements CustomTaskChange {
    @Override
    public void execute(Database database) throws CustomChangeException {
        System.out.println("Executing");
    }

    @Override
    public String getConfirmationMessage() {
        return "test";
    }

    @Override
    public void setUp() throws SetupException {

    }

    @Override
    public void setFileOpener(ResourceAccessor resourceAccessor) {

    }

    @Override
    public ValidationErrors validate(Database database) {
        return new ValidationErrors();
    }
}
