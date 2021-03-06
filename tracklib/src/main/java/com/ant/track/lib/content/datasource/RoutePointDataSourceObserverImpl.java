package com.ant.track.lib.content.datasource;

import android.os.Handler;

import com.ant.track.lib.content.publisher.RouteDataSourceListener;

/**
 * DataSourceManager for route points.
 */
public class RoutePointDataSourceObserverImpl extends AbstractDataSourceObserverImpl {

    public RoutePointDataSourceObserverImpl(Handler handler, RouteDataSourceListener routeDataListener) {
        super(handler, routeDataListener);
    }

    @Override
    protected void notifyUpdate() {
        getListener().notifyRoutePointsUpdate();
    }
}
