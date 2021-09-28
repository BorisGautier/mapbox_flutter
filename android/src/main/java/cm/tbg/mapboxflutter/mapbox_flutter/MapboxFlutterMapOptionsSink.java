package cm.tbg.mapboxflutter.mapbox_flutter;

import com.mapbox.mapboxsdk.geometry.LatLngBounds;

/**
 * Receiver of MapboxMap configuration options.
 */
interface MapboxFlutterMapOptionsSink {
    void setCameraTargetBounds(LatLngBounds bounds); //todo: dddd replace with CameraPosition.Builder target

    void setCompassEnabled(boolean compassEnabled);

    // TODO: styleString is not actually a part of options. consider moving
    void setStyleString(String styleString);

    void setMinMaxZoomPreference(Float min, Float max);

    void setRotateGesturesEnabled(boolean rotateGesturesEnabled);

    void setScrollGesturesEnabled(boolean scrollGesturesEnabled);

    void setTiltGesturesEnabled(boolean tiltGesturesEnabled);

    void setTrackCameraPosition(boolean trackCameraPosition);

    void setZoomGesturesEnabled(boolean zoomGesturesEnabled);

    void setMyLocationEnabled(boolean myLocationEnabled);

    void setMyLocationTrackingMode(int myLocationTrackingMode);

    void setMyLocationRenderMode(int myLocationRenderMode);

    void setLogoViewMargins(int x, int y);

    void setCompassGravity(int gravity);

    void setCompassViewMargins(int x, int y);

    void setAttributionButtonMargins(int x, int y);
}
