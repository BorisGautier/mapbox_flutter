package cm.tbg.mapboxflutter.mapbox_flutter;

import android.content.Context;

import com.mapbox.mapboxsdk.camera.CameraPosition;

import java.util.List;
import java.util.Map;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

public class MapboxFlutterMapFactory extends PlatformViewFactory {
    private final BinaryMessenger messenger;
    private final MapboxFlutterPlugin.LifecycleProvider lifecycleProvider;

    public MapboxFlutterMapFactory(BinaryMessenger messenger, MapboxFlutterPlugin.LifecycleProvider lifecycleProvider) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = messenger;
        this.lifecycleProvider = lifecycleProvider;
    }

    @Override
    public PlatformView create(Context context, int id, Object args) {
        Map<String, Object> params = (Map<String, Object>) args;
        final MapboxFlutterMapBuilder builder = new MapboxFlutterMapBuilder();

        Convert.interpretMapboxMapOptions(params.get("options"), builder);
        if (params.containsKey("initialCameraPosition")) {
            CameraPosition position = Convert.toCameraPosition(params.get("initialCameraPosition"));
            builder.setInitialCameraPosition(position);
        }
        if (params.containsKey("annotationOrder")) {
            List<String> annotations = Convert.toAnnotationOrder(params.get("annotationOrder"));
            builder.setAnnotationOrder(annotations);
        }
        if (params.containsKey("annotationConsumeTapEvents")) {
            List<String> annotations = Convert.toAnnotationConsumeTapEvents(params.get("annotationConsumeTapEvents"));
            builder.setAnnotationConsumeTapEvents(annotations);
        }
        return builder.build(id, context, messenger, lifecycleProvider, (String) params.get("accessToken"));
    }
}
