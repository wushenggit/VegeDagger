package com.capsule.vegedagger.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by hhly-pc on 2016/12/21.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ContextScope {
}
