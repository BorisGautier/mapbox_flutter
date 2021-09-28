// Copyright 2021 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file

package cm.tbg.mapboxflutter.mapbox_flutter;

import com.mapbox.mapboxsdk.annotations.Marker;

public interface OnInfoWindowTappedListener {
  void onInfoWindowTapped(Marker marker);
}
