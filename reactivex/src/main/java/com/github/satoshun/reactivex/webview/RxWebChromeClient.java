package com.github.satoshun.reactivex.webview;

import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.github.satoshun.reactivex.webview.data.RxWebChromeClientData;
import com.github.satoshun.reactivex.webview.internal.ObjectHelper;

import io.reactivex.Observable;

/**
 * static factory methods for creating {@linkplain io.reactivex.Completable} and {@linkplain io.reactivex.Observable}
 */
public class RxWebChromeClient {

  @CheckResult @NonNull
  public static Observable<RxWebChromeClientData> all(WebView webView, WebChromeClient client) {
    ObjectHelper.requireNonNull(webView, "webView is null");
    ObjectHelper.requireNonNull(client, "client is null");
    return Observable.create(new AllChromeOnSubscribe(webView, client));
  }
}
