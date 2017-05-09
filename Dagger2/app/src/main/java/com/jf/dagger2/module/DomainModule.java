package com.jf.dagger2.module;

import android.content.Context;

import com.jf.dagger2.analytics.AnalyticsManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin on 2017/5/8.
 */
@Module
public class DomainModule {

    @Provides
    @Singleton
    public AnalyticsManager provideAnalyticsManager(Context context) {
        return new AnalyticsManager(context);
    }
}
