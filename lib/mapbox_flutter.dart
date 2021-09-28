
import 'dart:async';

import 'package:flutter/services.dart';

class MapboxFlutter {
  static const MethodChannel _channel = MethodChannel('mapbox_flutter');

  static Future<String?> get platformVersion async {
    final String? version = await _channel.invokeMethod('getPlatformVersion');
    return version;
  }
}
