package com.capsule.vegedagger.di;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by hhly-pc on 2017/1/14.
 */
@Documented
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface DataScope {
}
