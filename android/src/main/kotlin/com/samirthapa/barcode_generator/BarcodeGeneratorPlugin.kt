package com.samirthapa.barcode_generator
import io.flutter.embedding.engine.plugins.FlutterPlugin
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding

class BarcodeGeneratorPlugin : FlutterPlugin {

  override fun onAttachedToEngine(binding: FlutterPluginBinding) {
    binding
            .platformViewRegistry
            .registerViewFactory("ihx.flutter.io/barcode_view", BarcodeViewFactory(binding.getBinaryMessenger()))
  }

  override fun onDetachedFromEngine(binding: FlutterPluginBinding) {}
}