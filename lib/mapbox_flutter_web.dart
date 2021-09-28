library mapbox_flutter;

import 'dart:async';
// FIXED HERE: https://github.com/dart-lang/linter/pull/1985
// ignore_for_file: avoid_web_libraries_in_flutter
import 'dart:html';
import 'dart:js';
import 'dart:math';
import 'dart:typed_data';
import 'dart:ui' as ui;

import 'package:flutter/foundation.dart';
import 'package:flutter/gestures.dart';
import 'package:flutter/material.dart';

import 'package:flutter_web_plugins/flutter_web_plugins.dart';
import 'package:mapbox_flutter/mapbox_flutter.dart';
import 'package:mapbox_gl_dart/mapbox_gl_dart.dart' hide Point;
import 'package:mapbox_gl_dart/mapbox_gl_dart.dart' as mapbox show Point;
import 'package:image/image.dart' hide Point;

part 'web_src/convert.dart';
part 'web_src/mapbox_flutter_plugin.dart';
part 'web_src/options_sink.dart';
part 'web_src/feature_manager/feature_manager.dart';
part 'web_src/feature_manager/symbol_manager.dart';
part 'web_src/feature_manager/line_manager.dart';
part 'web_src/feature_manager/circle_manager.dart';
part 'web_src/feature_manager/fill_manager.dart';
part 'web_src/mapbox_flutter_map_controller.dart';
part 'src/mapbox_flutter_platform_interface.dart';
