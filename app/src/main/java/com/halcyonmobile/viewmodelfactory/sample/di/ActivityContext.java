package com.halcyonmobile.viewmodelfactory.sample.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;


@Qualifier
@Retention(RetentionPolicy.SOURCE)
@interface ActivityContext {
}
