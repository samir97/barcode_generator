package com.samirthapa.barcode_generator

import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding

public class BarcodeGeneratorPlugin implements FlutterPlugin {
  override fun onAttachedToEngine(binding: FlutterPluginBinding) {
    binding
            .platformViewRegistry
            .registerViewFactory("ihx.flutter.io/barcode_view", BarcodeViewFactory(registrar.messenger()))
  }

  override fun onDetachedFromEngine(binding: FlutterPluginBinding) {}
}
