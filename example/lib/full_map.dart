import 'package:flutter/material.dart';
import 'package:mapbox_flutter/mapbox_flutter.dart';

import 'main.dart';
import 'page.dart';

class FullMapPage extends ExamplePage {
  FullMapPage() : super(const Icon(Icons.map), 'Full screen map');

  @override
  Widget build(BuildContext context) {
    return const FullMap();
  }
}

class FullMap extends StatefulWidget {
  const FullMap();

  @override
  State createState() => FullMapState();
}

class FullMapState extends State<FullMap> {
  MapboxFlutterMapController? mapController;

  void _onMapCreated(MapboxFlutterMapController controller) {
    mapController = controller;
  }

  @override
  Widget build(BuildContext context) {
    return new Scaffold(
        body: MapboxFlutterMap(
      accessToken: MapsDemo.ACCESS_TOKEN,
      onMapCreated: _onMapCreated,
      initialCameraPosition: const CameraPosition(target: LatLng(0.0, 0.0)),
      onStyleLoadedCallback: onStyleLoadedCallback,
    ));
  }

  void onStyleLoadedCallback() {}
}
