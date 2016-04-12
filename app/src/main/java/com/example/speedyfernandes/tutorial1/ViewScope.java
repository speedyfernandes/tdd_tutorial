package com.example.speedyfernandes.tutorial1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by speedyfernandes on 11/04/16.
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ViewScope {
}