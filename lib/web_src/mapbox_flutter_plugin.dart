part of mapbox_flutter;

class MapboxFlutterPlugin {
  /// Registers this class as the default instance of [MapboxFlutterPlatfom].
  static void registerWith(Registrar registrar) {
    MapboxFlutterPlatfom.createInstance = () => MapboxFlutterMapController();
  }
}
