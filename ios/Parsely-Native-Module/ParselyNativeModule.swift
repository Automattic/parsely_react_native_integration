import Foundation

@objc(ParselyNativeModule)
class ParselyNativeModule: NSObject {

  @objc(dummyPrint:)
  func dummyPrint(input: String) {
    print("Dummy print example \(input)–from Swift")
  }
}
