#import "BarcodeGeneratorPlugin.h"
#if __has_include(<barcode_generator/barcode_generator-Swift.h>)
#import <barcode_generator/barcode_generator-Swift.h>
#else
// Support project import fallback if the generated compatibility header
// is not copied when this plugin is created as a library.
// https://forums.swift.org/t/swift-static-libraries-dont-copy-generated-objective-c-header/19816
#import "barcode_generator-Swift.h"
#endif

@implementation BarcodeGeneratorPlugin
+ (void)registerWithRegistrar:(NSObject<FlutterPluginRegistrar>*)registrar {
  [SwiftBarcodeGeneratorPlugin registerWithRegistrar:registrar];
}
@end
