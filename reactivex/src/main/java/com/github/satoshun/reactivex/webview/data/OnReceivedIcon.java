package com.github.satoshun.reactivex.webview.data;

import android.graphics.Bitmap;

public class OnReceivedIcon implements RxWebChromeClientData {

  private final Bitmap icon;

  public OnReceivedIcon(Bitmap icon) {
    this.icon = icon;
  }

  public Bitmap getIcon() {
    return icon;
  }
}
